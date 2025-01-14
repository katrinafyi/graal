/*
 * Copyright (c) 2011, 2020, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package org.graalvm.compiler.nodes.java;

import org.graalvm.compiler.core.common.memory.MemoryOrderMode;
import org.graalvm.compiler.core.common.type.StampFactory;
import org.graalvm.compiler.graph.NodeClass;
import org.graalvm.compiler.nodeinfo.NodeInfo;
import org.graalvm.compiler.nodes.ConstantNode;
import org.graalvm.compiler.nodes.LogicNode;
import org.graalvm.compiler.nodes.NodeView;
import org.graalvm.compiler.nodes.ValueNode;
import org.graalvm.compiler.nodes.calc.ConditionalNode;
import org.graalvm.compiler.nodes.spi.VirtualizerTool;
import org.graalvm.word.LocationIdentity;

import jdk.vm.ci.meta.JavaKind;

/**
 * Represents an atomic compare-and-swap operation. The result is a boolean that contains whether
 * the value matched the expected value.
 */
@NodeInfo
public final class UnsafeCompareAndSwapNode extends AbstractUnsafeCompareAndSwapNode {

    public static final NodeClass<UnsafeCompareAndSwapNode> TYPE = NodeClass.create(UnsafeCompareAndSwapNode.class);

    public UnsafeCompareAndSwapNode(ValueNode object, ValueNode offset, ValueNode expected, ValueNode newValue, JavaKind valueKind, LocationIdentity locationIdentity, MemoryOrderMode memoryOrder) {
        super(TYPE, StampFactory.forKind(JavaKind.Boolean), object, offset, expected, newValue, valueKind, locationIdentity, memoryOrder);
        assert expected.stamp(NodeView.DEFAULT).isCompatible(newValue.stamp(NodeView.DEFAULT));
    }

    @Override
    protected void finishVirtualize(VirtualizerTool tool, LogicNode equalsNode, ValueNode currentValue) {
        ValueNode result = ConditionalNode.create(equalsNode, ConstantNode.forBoolean(true, graph()), ConstantNode.forBoolean(false, graph()), NodeView.DEFAULT);
        tool.ensureAdded(result);
        tool.replaceWith(result);
    }
}
