package micro.benchmarks;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.IntUnaryOperator;

@State(Scope.Thread)
public class BigBenchmark extends BenchmarkBase {
private int[] a0;
private int[] a1;
private int[] a10;
private int[] a100;
private int[] a101;
private int[] a102;
private int[] a103;
private int[] a104;
private int[] a105;
private int[] a106;
private int[] a107;
private int[] a108;
private int[] a109;
private int[] a11;
private int[] a110;
private int[] a111;
private int[] a112;
private int[] a113;
private int[] a114;
private int[] a115;
private int[] a116;
private int[] a117;
private int[] a118;
private int[] a119;
private int[] a12;
private int[] a120;
private int[] a121;
private int[] a122;
private int[] a123;
private int[] a124;
private int[] a125;
private int[] a126;
private int[] a127;
private int[] a128;
private int[] a129;
private int[] a13;
private int[] a130;
private int[] a131;
private int[] a132;
private int[] a133;
private int[] a134;
private int[] a135;
private int[] a136;
private int[] a137;
private int[] a138;
private int[] a139;
private int[] a14;
private int[] a140;
private int[] a141;
private int[] a142;
private int[] a143;
private int[] a144;
private int[] a145;
private int[] a146;
private int[] a147;
private int[] a148;
private int[] a149;
private int[] a15;
private int[] a150;
private int[] a151;
private int[] a152;
private int[] a153;
private int[] a154;
private int[] a155;
private int[] a156;
private int[] a157;
private int[] a158;
private int[] a159;
private int[] a16;
private int[] a160;
private int[] a161;
private int[] a162;
private int[] a163;
private int[] a164;
private int[] a165;
private int[] a166;
private int[] a167;
private int[] a168;
private int[] a169;
private int[] a17;
private int[] a170;
private int[] a171;
private int[] a172;
private int[] a173;
private int[] a174;
private int[] a175;
private int[] a176;
private int[] a177;
private int[] a178;
private int[] a179;
private int[] a18;
private int[] a180;
private int[] a181;
private int[] a182;
private int[] a183;
private int[] a184;
private int[] a185;
private int[] a186;
private int[] a187;
private int[] a188;
private int[] a189;
private int[] a19;
private int[] a190;
private int[] a191;
private int[] a192;
private int[] a193;
private int[] a194;
private int[] a195;
private int[] a196;
private int[] a197;
private int[] a198;
private int[] a199;
private int[] a2;
private int[] a20;
private int[] a21;
private int[] a22;
private int[] a23;
private int[] a24;
private int[] a25;
private int[] a26;
private int[] a27;
private int[] a28;
private int[] a29;
private int[] a3;
private int[] a30;
private int[] a31;
private int[] a32;
private int[] a33;
private int[] a34;
private int[] a35;
private int[] a36;
private int[] a37;
private int[] a38;
private int[] a39;
private int[] a4;
private int[] a40;
private int[] a41;
private int[] a42;
private int[] a43;
private int[] a44;
private int[] a45;
private int[] a46;
private int[] a47;
private int[] a48;
private int[] a49;
private int[] a5;
private int[] a50;
private int[] a51;
private int[] a52;
private int[] a53;
private int[] a54;
private int[] a55;
private int[] a56;
private int[] a57;
private int[] a58;
private int[] a59;
private int[] a6;
private int[] a60;
private int[] a61;
private int[] a62;
private int[] a63;
private int[] a64;
private int[] a65;
private int[] a66;
private int[] a67;
private int[] a68;
private int[] a69;
private int[] a7;
private int[] a70;
private int[] a71;
private int[] a72;
private int[] a73;
private int[] a74;
private int[] a75;
private int[] a76;
private int[] a77;
private int[] a78;
private int[] a79;
private int[] a8;
private int[] a80;
private int[] a81;
private int[] a82;
private int[] a83;
private int[] a84;
private int[] a85;
private int[] a86;
private int[] a87;
private int[] a88;
private int[] a89;
private int[] a9;
private int[] a90;
private int[] a91;
private int[] a92;
private int[] a93;
private int[] a94;
private int[] a95;
private int[] a96;
private int[] a97;
private int[] a98;
private int[] a99;
private int[] trans0;
private int[] trans1;
private int[] trans10;
private int[] trans100;
private int[] trans101;
private int[] trans102;
private int[] trans103;
private int[] trans104;
private int[] trans105;
private int[] trans106;
private int[] trans107;
private int[] trans108;
private int[] trans109;
private int[] trans11;
private int[] trans110;
private int[] trans111;
private int[] trans112;
private int[] trans113;
private int[] trans114;
private int[] trans115;
private int[] trans116;
private int[] trans117;
private int[] trans118;
private int[] trans119;
private int[] trans12;
private int[] trans120;
private int[] trans121;
private int[] trans122;
private int[] trans123;
private int[] trans124;
private int[] trans125;
private int[] trans126;
private int[] trans127;
private int[] trans128;
private int[] trans129;
private int[] trans13;
private int[] trans130;
private int[] trans131;
private int[] trans132;
private int[] trans133;
private int[] trans134;
private int[] trans135;
private int[] trans136;
private int[] trans137;
private int[] trans138;
private int[] trans139;
private int[] trans14;
private int[] trans140;
private int[] trans141;
private int[] trans142;
private int[] trans143;
private int[] trans144;
private int[] trans145;
private int[] trans146;
private int[] trans147;
private int[] trans148;
private int[] trans149;
private int[] trans15;
private int[] trans150;
private int[] trans151;
private int[] trans152;
private int[] trans153;
private int[] trans154;
private int[] trans155;
private int[] trans156;
private int[] trans157;
private int[] trans158;
private int[] trans159;
private int[] trans16;
private int[] trans160;
private int[] trans161;
private int[] trans162;
private int[] trans163;
private int[] trans164;
private int[] trans165;
private int[] trans166;
private int[] trans167;
private int[] trans168;
private int[] trans169;
private int[] trans17;
private int[] trans170;
private int[] trans171;
private int[] trans172;
private int[] trans173;
private int[] trans174;
private int[] trans175;
private int[] trans176;
private int[] trans177;
private int[] trans178;
private int[] trans179;
private int[] trans18;
private int[] trans180;
private int[] trans181;
private int[] trans182;
private int[] trans183;
private int[] trans184;
private int[] trans185;
private int[] trans186;
private int[] trans187;
private int[] trans188;
private int[] trans189;
private int[] trans19;
private int[] trans190;
private int[] trans191;
private int[] trans192;
private int[] trans193;
private int[] trans194;
private int[] trans195;
private int[] trans196;
private int[] trans197;
private int[] trans198;
private int[] trans199;
private int[] trans2;
private int[] trans20;
private int[] trans21;
private int[] trans22;
private int[] trans23;
private int[] trans24;
private int[] trans25;
private int[] trans26;
private int[] trans27;
private int[] trans28;
private int[] trans29;
private int[] trans3;
private int[] trans30;
private int[] trans31;
private int[] trans32;
private int[] trans33;
private int[] trans34;
private int[] trans35;
private int[] trans36;
private int[] trans37;
private int[] trans38;
private int[] trans39;
private int[] trans4;
private int[] trans40;
private int[] trans41;
private int[] trans42;
private int[] trans43;
private int[] trans44;
private int[] trans45;
private int[] trans46;
private int[] trans47;
private int[] trans48;
private int[] trans49;
private int[] trans5;
private int[] trans50;
private int[] trans51;
private int[] trans52;
private int[] trans53;
private int[] trans54;
private int[] trans55;
private int[] trans56;
private int[] trans57;
private int[] trans58;
private int[] trans59;
private int[] trans6;
private int[] trans60;
private int[] trans61;
private int[] trans62;
private int[] trans63;
private int[] trans64;
private int[] trans65;
private int[] trans66;
private int[] trans67;
private int[] trans68;
private int[] trans69;
private int[] trans7;
private int[] trans70;
private int[] trans71;
private int[] trans72;
private int[] trans73;
private int[] trans74;
private int[] trans75;
private int[] trans76;
private int[] trans77;
private int[] trans78;
private int[] trans79;
private int[] trans8;
private int[] trans80;
private int[] trans81;
private int[] trans82;
private int[] trans83;
private int[] trans84;
private int[] trans85;
private int[] trans86;
private int[] trans87;
private int[] trans88;
private int[] trans89;
private int[] trans9;
private int[] trans90;
private int[] trans91;
private int[] trans92;
private int[] trans93;
private int[] trans94;
private int[] trans95;
private int[] trans96;
private int[] trans97;
private int[] trans98;
private int[] trans99;

@Setup public void setup() throws Exception {
int N = 10000;
var random = ThreadLocalRandom.current();
IntUnaryOperator fill = i -> random.nextInt();
IntUnaryOperator fillTrans = i -> (int)(i / N + 1);
a0 = new int[N];
Arrays.setAll(a0, fill);
a1 = new int[N];
Arrays.setAll(a1, fill);
a10 = new int[N];
Arrays.setAll(a10, fill);
a100 = new int[N];
Arrays.setAll(a100, fill);
a101 = new int[N];
Arrays.setAll(a101, fill);
a102 = new int[N];
Arrays.setAll(a102, fill);
a103 = new int[N];
Arrays.setAll(a103, fill);
a104 = new int[N];
Arrays.setAll(a104, fill);
a105 = new int[N];
Arrays.setAll(a105, fill);
a106 = new int[N];
Arrays.setAll(a106, fill);
a107 = new int[N];
Arrays.setAll(a107, fill);
a108 = new int[N];
Arrays.setAll(a108, fill);
a109 = new int[N];
Arrays.setAll(a109, fill);
a11 = new int[N];
Arrays.setAll(a11, fill);
a110 = new int[N];
Arrays.setAll(a110, fill);
a111 = new int[N];
Arrays.setAll(a111, fill);
a112 = new int[N];
Arrays.setAll(a112, fill);
a113 = new int[N];
Arrays.setAll(a113, fill);
a114 = new int[N];
Arrays.setAll(a114, fill);
a115 = new int[N];
Arrays.setAll(a115, fill);
a116 = new int[N];
Arrays.setAll(a116, fill);
a117 = new int[N];
Arrays.setAll(a117, fill);
a118 = new int[N];
Arrays.setAll(a118, fill);
a119 = new int[N];
Arrays.setAll(a119, fill);
a12 = new int[N];
Arrays.setAll(a12, fill);
a120 = new int[N];
Arrays.setAll(a120, fill);
a121 = new int[N];
Arrays.setAll(a121, fill);
a122 = new int[N];
Arrays.setAll(a122, fill);
a123 = new int[N];
Arrays.setAll(a123, fill);
a124 = new int[N];
Arrays.setAll(a124, fill);
a125 = new int[N];
Arrays.setAll(a125, fill);
a126 = new int[N];
Arrays.setAll(a126, fill);
a127 = new int[N];
Arrays.setAll(a127, fill);
a128 = new int[N];
Arrays.setAll(a128, fill);
a129 = new int[N];
Arrays.setAll(a129, fill);
a13 = new int[N];
Arrays.setAll(a13, fill);
a130 = new int[N];
Arrays.setAll(a130, fill);
a131 = new int[N];
Arrays.setAll(a131, fill);
a132 = new int[N];
Arrays.setAll(a132, fill);
a133 = new int[N];
Arrays.setAll(a133, fill);
a134 = new int[N];
Arrays.setAll(a134, fill);
a135 = new int[N];
Arrays.setAll(a135, fill);
a136 = new int[N];
Arrays.setAll(a136, fill);
a137 = new int[N];
Arrays.setAll(a137, fill);
a138 = new int[N];
Arrays.setAll(a138, fill);
a139 = new int[N];
Arrays.setAll(a139, fill);
a14 = new int[N];
Arrays.setAll(a14, fill);
a140 = new int[N];
Arrays.setAll(a140, fill);
a141 = new int[N];
Arrays.setAll(a141, fill);
a142 = new int[N];
Arrays.setAll(a142, fill);
a143 = new int[N];
Arrays.setAll(a143, fill);
a144 = new int[N];
Arrays.setAll(a144, fill);
a145 = new int[N];
Arrays.setAll(a145, fill);
a146 = new int[N];
Arrays.setAll(a146, fill);
a147 = new int[N];
Arrays.setAll(a147, fill);
a148 = new int[N];
Arrays.setAll(a148, fill);
a149 = new int[N];
Arrays.setAll(a149, fill);
a15 = new int[N];
Arrays.setAll(a15, fill);
a150 = new int[N];
Arrays.setAll(a150, fill);
a151 = new int[N];
Arrays.setAll(a151, fill);
a152 = new int[N];
Arrays.setAll(a152, fill);
a153 = new int[N];
Arrays.setAll(a153, fill);
a154 = new int[N];
Arrays.setAll(a154, fill);
a155 = new int[N];
Arrays.setAll(a155, fill);
a156 = new int[N];
Arrays.setAll(a156, fill);
a157 = new int[N];
Arrays.setAll(a157, fill);
a158 = new int[N];
Arrays.setAll(a158, fill);
a159 = new int[N];
Arrays.setAll(a159, fill);
a16 = new int[N];
Arrays.setAll(a16, fill);
a160 = new int[N];
Arrays.setAll(a160, fill);
a161 = new int[N];
Arrays.setAll(a161, fill);
a162 = new int[N];
Arrays.setAll(a162, fill);
a163 = new int[N];
Arrays.setAll(a163, fill);
a164 = new int[N];
Arrays.setAll(a164, fill);
a165 = new int[N];
Arrays.setAll(a165, fill);
a166 = new int[N];
Arrays.setAll(a166, fill);
a167 = new int[N];
Arrays.setAll(a167, fill);
a168 = new int[N];
Arrays.setAll(a168, fill);
a169 = new int[N];
Arrays.setAll(a169, fill);
a17 = new int[N];
Arrays.setAll(a17, fill);
a170 = new int[N];
Arrays.setAll(a170, fill);
a171 = new int[N];
Arrays.setAll(a171, fill);
a172 = new int[N];
Arrays.setAll(a172, fill);
a173 = new int[N];
Arrays.setAll(a173, fill);
a174 = new int[N];
Arrays.setAll(a174, fill);
a175 = new int[N];
Arrays.setAll(a175, fill);
a176 = new int[N];
Arrays.setAll(a176, fill);
a177 = new int[N];
Arrays.setAll(a177, fill);
a178 = new int[N];
Arrays.setAll(a178, fill);
a179 = new int[N];
Arrays.setAll(a179, fill);
a18 = new int[N];
Arrays.setAll(a18, fill);
a180 = new int[N];
Arrays.setAll(a180, fill);
a181 = new int[N];
Arrays.setAll(a181, fill);
a182 = new int[N];
Arrays.setAll(a182, fill);
a183 = new int[N];
Arrays.setAll(a183, fill);
a184 = new int[N];
Arrays.setAll(a184, fill);
a185 = new int[N];
Arrays.setAll(a185, fill);
a186 = new int[N];
Arrays.setAll(a186, fill);
a187 = new int[N];
Arrays.setAll(a187, fill);
a188 = new int[N];
Arrays.setAll(a188, fill);
a189 = new int[N];
Arrays.setAll(a189, fill);
a19 = new int[N];
Arrays.setAll(a19, fill);
a190 = new int[N];
Arrays.setAll(a190, fill);
a191 = new int[N];
Arrays.setAll(a191, fill);
a192 = new int[N];
Arrays.setAll(a192, fill);
a193 = new int[N];
Arrays.setAll(a193, fill);
a194 = new int[N];
Arrays.setAll(a194, fill);
a195 = new int[N];
Arrays.setAll(a195, fill);
a196 = new int[N];
Arrays.setAll(a196, fill);
a197 = new int[N];
Arrays.setAll(a197, fill);
a198 = new int[N];
Arrays.setAll(a198, fill);
a199 = new int[N];
Arrays.setAll(a199, fill);
a2 = new int[N];
Arrays.setAll(a2, fill);
a20 = new int[N];
Arrays.setAll(a20, fill);
a21 = new int[N];
Arrays.setAll(a21, fill);
a22 = new int[N];
Arrays.setAll(a22, fill);
a23 = new int[N];
Arrays.setAll(a23, fill);
a24 = new int[N];
Arrays.setAll(a24, fill);
a25 = new int[N];
Arrays.setAll(a25, fill);
a26 = new int[N];
Arrays.setAll(a26, fill);
a27 = new int[N];
Arrays.setAll(a27, fill);
a28 = new int[N];
Arrays.setAll(a28, fill);
a29 = new int[N];
Arrays.setAll(a29, fill);
a3 = new int[N];
Arrays.setAll(a3, fill);
a30 = new int[N];
Arrays.setAll(a30, fill);
a31 = new int[N];
Arrays.setAll(a31, fill);
a32 = new int[N];
Arrays.setAll(a32, fill);
a33 = new int[N];
Arrays.setAll(a33, fill);
a34 = new int[N];
Arrays.setAll(a34, fill);
a35 = new int[N];
Arrays.setAll(a35, fill);
a36 = new int[N];
Arrays.setAll(a36, fill);
a37 = new int[N];
Arrays.setAll(a37, fill);
a38 = new int[N];
Arrays.setAll(a38, fill);
a39 = new int[N];
Arrays.setAll(a39, fill);
a4 = new int[N];
Arrays.setAll(a4, fill);
a40 = new int[N];
Arrays.setAll(a40, fill);
a41 = new int[N];
Arrays.setAll(a41, fill);
a42 = new int[N];
Arrays.setAll(a42, fill);
a43 = new int[N];
Arrays.setAll(a43, fill);
a44 = new int[N];
Arrays.setAll(a44, fill);
a45 = new int[N];
Arrays.setAll(a45, fill);
a46 = new int[N];
Arrays.setAll(a46, fill);
a47 = new int[N];
Arrays.setAll(a47, fill);
a48 = new int[N];
Arrays.setAll(a48, fill);
a49 = new int[N];
Arrays.setAll(a49, fill);
a5 = new int[N];
Arrays.setAll(a5, fill);
a50 = new int[N];
Arrays.setAll(a50, fill);
a51 = new int[N];
Arrays.setAll(a51, fill);
a52 = new int[N];
Arrays.setAll(a52, fill);
a53 = new int[N];
Arrays.setAll(a53, fill);
a54 = new int[N];
Arrays.setAll(a54, fill);
a55 = new int[N];
Arrays.setAll(a55, fill);
a56 = new int[N];
Arrays.setAll(a56, fill);
a57 = new int[N];
Arrays.setAll(a57, fill);
a58 = new int[N];
Arrays.setAll(a58, fill);
a59 = new int[N];
Arrays.setAll(a59, fill);
a6 = new int[N];
Arrays.setAll(a6, fill);
a60 = new int[N];
Arrays.setAll(a60, fill);
a61 = new int[N];
Arrays.setAll(a61, fill);
a62 = new int[N];
Arrays.setAll(a62, fill);
a63 = new int[N];
Arrays.setAll(a63, fill);
a64 = new int[N];
Arrays.setAll(a64, fill);
a65 = new int[N];
Arrays.setAll(a65, fill);
a66 = new int[N];
Arrays.setAll(a66, fill);
a67 = new int[N];
Arrays.setAll(a67, fill);
a68 = new int[N];
Arrays.setAll(a68, fill);
a69 = new int[N];
Arrays.setAll(a69, fill);
a7 = new int[N];
Arrays.setAll(a7, fill);
a70 = new int[N];
Arrays.setAll(a70, fill);
a71 = new int[N];
Arrays.setAll(a71, fill);
a72 = new int[N];
Arrays.setAll(a72, fill);
a73 = new int[N];
Arrays.setAll(a73, fill);
a74 = new int[N];
Arrays.setAll(a74, fill);
a75 = new int[N];
Arrays.setAll(a75, fill);
a76 = new int[N];
Arrays.setAll(a76, fill);
a77 = new int[N];
Arrays.setAll(a77, fill);
a78 = new int[N];
Arrays.setAll(a78, fill);
a79 = new int[N];
Arrays.setAll(a79, fill);
a8 = new int[N];
Arrays.setAll(a8, fill);
a80 = new int[N];
Arrays.setAll(a80, fill);
a81 = new int[N];
Arrays.setAll(a81, fill);
a82 = new int[N];
Arrays.setAll(a82, fill);
a83 = new int[N];
Arrays.setAll(a83, fill);
a84 = new int[N];
Arrays.setAll(a84, fill);
a85 = new int[N];
Arrays.setAll(a85, fill);
a86 = new int[N];
Arrays.setAll(a86, fill);
a87 = new int[N];
Arrays.setAll(a87, fill);
a88 = new int[N];
Arrays.setAll(a88, fill);
a89 = new int[N];
Arrays.setAll(a89, fill);
a9 = new int[N];
Arrays.setAll(a9, fill);
a90 = new int[N];
Arrays.setAll(a90, fill);
a91 = new int[N];
Arrays.setAll(a91, fill);
a92 = new int[N];
Arrays.setAll(a92, fill);
a93 = new int[N];
Arrays.setAll(a93, fill);
a94 = new int[N];
Arrays.setAll(a94, fill);
a95 = new int[N];
Arrays.setAll(a95, fill);
a96 = new int[N];
Arrays.setAll(a96, fill);
a97 = new int[N];
Arrays.setAll(a97, fill);
a98 = new int[N];
Arrays.setAll(a98, fill);
a99 = new int[N];
Arrays.setAll(a99, fill);
trans0 = new int[N];
Arrays.setAll(trans0, fillTrans);
trans1 = new int[N];
Arrays.setAll(trans1, fillTrans);
trans10 = new int[N];
Arrays.setAll(trans10, fillTrans);
trans100 = new int[N];
Arrays.setAll(trans100, fillTrans);
trans101 = new int[N];
Arrays.setAll(trans101, fillTrans);
trans102 = new int[N];
Arrays.setAll(trans102, fillTrans);
trans103 = new int[N];
Arrays.setAll(trans103, fillTrans);
trans104 = new int[N];
Arrays.setAll(trans104, fillTrans);
trans105 = new int[N];
Arrays.setAll(trans105, fillTrans);
trans106 = new int[N];
Arrays.setAll(trans106, fillTrans);
trans107 = new int[N];
Arrays.setAll(trans107, fillTrans);
trans108 = new int[N];
Arrays.setAll(trans108, fillTrans);
trans109 = new int[N];
Arrays.setAll(trans109, fillTrans);
trans11 = new int[N];
Arrays.setAll(trans11, fillTrans);
trans110 = new int[N];
Arrays.setAll(trans110, fillTrans);
trans111 = new int[N];
Arrays.setAll(trans111, fillTrans);
trans112 = new int[N];
Arrays.setAll(trans112, fillTrans);
trans113 = new int[N];
Arrays.setAll(trans113, fillTrans);
trans114 = new int[N];
Arrays.setAll(trans114, fillTrans);
trans115 = new int[N];
Arrays.setAll(trans115, fillTrans);
trans116 = new int[N];
Arrays.setAll(trans116, fillTrans);
trans117 = new int[N];
Arrays.setAll(trans117, fillTrans);
trans118 = new int[N];
Arrays.setAll(trans118, fillTrans);
trans119 = new int[N];
Arrays.setAll(trans119, fillTrans);
trans12 = new int[N];
Arrays.setAll(trans12, fillTrans);
trans120 = new int[N];
Arrays.setAll(trans120, fillTrans);
trans121 = new int[N];
Arrays.setAll(trans121, fillTrans);
trans122 = new int[N];
Arrays.setAll(trans122, fillTrans);
trans123 = new int[N];
Arrays.setAll(trans123, fillTrans);
trans124 = new int[N];
Arrays.setAll(trans124, fillTrans);
trans125 = new int[N];
Arrays.setAll(trans125, fillTrans);
trans126 = new int[N];
Arrays.setAll(trans126, fillTrans);
trans127 = new int[N];
Arrays.setAll(trans127, fillTrans);
trans128 = new int[N];
Arrays.setAll(trans128, fillTrans);
trans129 = new int[N];
Arrays.setAll(trans129, fillTrans);
trans13 = new int[N];
Arrays.setAll(trans13, fillTrans);
trans130 = new int[N];
Arrays.setAll(trans130, fillTrans);
trans131 = new int[N];
Arrays.setAll(trans131, fillTrans);
trans132 = new int[N];
Arrays.setAll(trans132, fillTrans);
trans133 = new int[N];
Arrays.setAll(trans133, fillTrans);
trans134 = new int[N];
Arrays.setAll(trans134, fillTrans);
trans135 = new int[N];
Arrays.setAll(trans135, fillTrans);
trans136 = new int[N];
Arrays.setAll(trans136, fillTrans);
trans137 = new int[N];
Arrays.setAll(trans137, fillTrans);
trans138 = new int[N];
Arrays.setAll(trans138, fillTrans);
trans139 = new int[N];
Arrays.setAll(trans139, fillTrans);
trans14 = new int[N];
Arrays.setAll(trans14, fillTrans);
trans140 = new int[N];
Arrays.setAll(trans140, fillTrans);
trans141 = new int[N];
Arrays.setAll(trans141, fillTrans);
trans142 = new int[N];
Arrays.setAll(trans142, fillTrans);
trans143 = new int[N];
Arrays.setAll(trans143, fillTrans);
trans144 = new int[N];
Arrays.setAll(trans144, fillTrans);
trans145 = new int[N];
Arrays.setAll(trans145, fillTrans);
trans146 = new int[N];
Arrays.setAll(trans146, fillTrans);
trans147 = new int[N];
Arrays.setAll(trans147, fillTrans);
trans148 = new int[N];
Arrays.setAll(trans148, fillTrans);
trans149 = new int[N];
Arrays.setAll(trans149, fillTrans);
trans15 = new int[N];
Arrays.setAll(trans15, fillTrans);
trans150 = new int[N];
Arrays.setAll(trans150, fillTrans);
trans151 = new int[N];
Arrays.setAll(trans151, fillTrans);
trans152 = new int[N];
Arrays.setAll(trans152, fillTrans);
trans153 = new int[N];
Arrays.setAll(trans153, fillTrans);
trans154 = new int[N];
Arrays.setAll(trans154, fillTrans);
trans155 = new int[N];
Arrays.setAll(trans155, fillTrans);
trans156 = new int[N];
Arrays.setAll(trans156, fillTrans);
trans157 = new int[N];
Arrays.setAll(trans157, fillTrans);
trans158 = new int[N];
Arrays.setAll(trans158, fillTrans);
trans159 = new int[N];
Arrays.setAll(trans159, fillTrans);
trans16 = new int[N];
Arrays.setAll(trans16, fillTrans);
trans160 = new int[N];
Arrays.setAll(trans160, fillTrans);
trans161 = new int[N];
Arrays.setAll(trans161, fillTrans);
trans162 = new int[N];
Arrays.setAll(trans162, fillTrans);
trans163 = new int[N];
Arrays.setAll(trans163, fillTrans);
trans164 = new int[N];
Arrays.setAll(trans164, fillTrans);
trans165 = new int[N];
Arrays.setAll(trans165, fillTrans);
trans166 = new int[N];
Arrays.setAll(trans166, fillTrans);
trans167 = new int[N];
Arrays.setAll(trans167, fillTrans);
trans168 = new int[N];
Arrays.setAll(trans168, fillTrans);
trans169 = new int[N];
Arrays.setAll(trans169, fillTrans);
trans17 = new int[N];
Arrays.setAll(trans17, fillTrans);
trans170 = new int[N];
Arrays.setAll(trans170, fillTrans);
trans171 = new int[N];
Arrays.setAll(trans171, fillTrans);
trans172 = new int[N];
Arrays.setAll(trans172, fillTrans);
trans173 = new int[N];
Arrays.setAll(trans173, fillTrans);
trans174 = new int[N];
Arrays.setAll(trans174, fillTrans);
trans175 = new int[N];
Arrays.setAll(trans175, fillTrans);
trans176 = new int[N];
Arrays.setAll(trans176, fillTrans);
trans177 = new int[N];
Arrays.setAll(trans177, fillTrans);
trans178 = new int[N];
Arrays.setAll(trans178, fillTrans);
trans179 = new int[N];
Arrays.setAll(trans179, fillTrans);
trans18 = new int[N];
Arrays.setAll(trans18, fillTrans);
trans180 = new int[N];
Arrays.setAll(trans180, fillTrans);
trans181 = new int[N];
Arrays.setAll(trans181, fillTrans);
trans182 = new int[N];
Arrays.setAll(trans182, fillTrans);
trans183 = new int[N];
Arrays.setAll(trans183, fillTrans);
trans184 = new int[N];
Arrays.setAll(trans184, fillTrans);
trans185 = new int[N];
Arrays.setAll(trans185, fillTrans);
trans186 = new int[N];
Arrays.setAll(trans186, fillTrans);
trans187 = new int[N];
Arrays.setAll(trans187, fillTrans);
trans188 = new int[N];
Arrays.setAll(trans188, fillTrans);
trans189 = new int[N];
Arrays.setAll(trans189, fillTrans);
trans19 = new int[N];
Arrays.setAll(trans19, fillTrans);
trans190 = new int[N];
Arrays.setAll(trans190, fillTrans);
trans191 = new int[N];
Arrays.setAll(trans191, fillTrans);
trans192 = new int[N];
Arrays.setAll(trans192, fillTrans);
trans193 = new int[N];
Arrays.setAll(trans193, fillTrans);
trans194 = new int[N];
Arrays.setAll(trans194, fillTrans);
trans195 = new int[N];
Arrays.setAll(trans195, fillTrans);
trans196 = new int[N];
Arrays.setAll(trans196, fillTrans);
trans197 = new int[N];
Arrays.setAll(trans197, fillTrans);
trans198 = new int[N];
Arrays.setAll(trans198, fillTrans);
trans199 = new int[N];
Arrays.setAll(trans199, fillTrans);
trans2 = new int[N];
Arrays.setAll(trans2, fillTrans);
trans20 = new int[N];
Arrays.setAll(trans20, fillTrans);
trans21 = new int[N];
Arrays.setAll(trans21, fillTrans);
trans22 = new int[N];
Arrays.setAll(trans22, fillTrans);
trans23 = new int[N];
Arrays.setAll(trans23, fillTrans);
trans24 = new int[N];
Arrays.setAll(trans24, fillTrans);
trans25 = new int[N];
Arrays.setAll(trans25, fillTrans);
trans26 = new int[N];
Arrays.setAll(trans26, fillTrans);
trans27 = new int[N];
Arrays.setAll(trans27, fillTrans);
trans28 = new int[N];
Arrays.setAll(trans28, fillTrans);
trans29 = new int[N];
Arrays.setAll(trans29, fillTrans);
trans3 = new int[N];
Arrays.setAll(trans3, fillTrans);
trans30 = new int[N];
Arrays.setAll(trans30, fillTrans);
trans31 = new int[N];
Arrays.setAll(trans31, fillTrans);
trans32 = new int[N];
Arrays.setAll(trans32, fillTrans);
trans33 = new int[N];
Arrays.setAll(trans33, fillTrans);
trans34 = new int[N];
Arrays.setAll(trans34, fillTrans);
trans35 = new int[N];
Arrays.setAll(trans35, fillTrans);
trans36 = new int[N];
Arrays.setAll(trans36, fillTrans);
trans37 = new int[N];
Arrays.setAll(trans37, fillTrans);
trans38 = new int[N];
Arrays.setAll(trans38, fillTrans);
trans39 = new int[N];
Arrays.setAll(trans39, fillTrans);
trans4 = new int[N];
Arrays.setAll(trans4, fillTrans);
trans40 = new int[N];
Arrays.setAll(trans40, fillTrans);
trans41 = new int[N];
Arrays.setAll(trans41, fillTrans);
trans42 = new int[N];
Arrays.setAll(trans42, fillTrans);
trans43 = new int[N];
Arrays.setAll(trans43, fillTrans);
trans44 = new int[N];
Arrays.setAll(trans44, fillTrans);
trans45 = new int[N];
Arrays.setAll(trans45, fillTrans);
trans46 = new int[N];
Arrays.setAll(trans46, fillTrans);
trans47 = new int[N];
Arrays.setAll(trans47, fillTrans);
trans48 = new int[N];
Arrays.setAll(trans48, fillTrans);
trans49 = new int[N];
Arrays.setAll(trans49, fillTrans);
trans5 = new int[N];
Arrays.setAll(trans5, fillTrans);
trans50 = new int[N];
Arrays.setAll(trans50, fillTrans);
trans51 = new int[N];
Arrays.setAll(trans51, fillTrans);
trans52 = new int[N];
Arrays.setAll(trans52, fillTrans);
trans53 = new int[N];
Arrays.setAll(trans53, fillTrans);
trans54 = new int[N];
Arrays.setAll(trans54, fillTrans);
trans55 = new int[N];
Arrays.setAll(trans55, fillTrans);
trans56 = new int[N];
Arrays.setAll(trans56, fillTrans);
trans57 = new int[N];
Arrays.setAll(trans57, fillTrans);
trans58 = new int[N];
Arrays.setAll(trans58, fillTrans);
trans59 = new int[N];
Arrays.setAll(trans59, fillTrans);
trans6 = new int[N];
Arrays.setAll(trans6, fillTrans);
trans60 = new int[N];
Arrays.setAll(trans60, fillTrans);
trans61 = new int[N];
Arrays.setAll(trans61, fillTrans);
trans62 = new int[N];
Arrays.setAll(trans62, fillTrans);
trans63 = new int[N];
Arrays.setAll(trans63, fillTrans);
trans64 = new int[N];
Arrays.setAll(trans64, fillTrans);
trans65 = new int[N];
Arrays.setAll(trans65, fillTrans);
trans66 = new int[N];
Arrays.setAll(trans66, fillTrans);
trans67 = new int[N];
Arrays.setAll(trans67, fillTrans);
trans68 = new int[N];
Arrays.setAll(trans68, fillTrans);
trans69 = new int[N];
Arrays.setAll(trans69, fillTrans);
trans7 = new int[N];
Arrays.setAll(trans7, fillTrans);
trans70 = new int[N];
Arrays.setAll(trans70, fillTrans);
trans71 = new int[N];
Arrays.setAll(trans71, fillTrans);
trans72 = new int[N];
Arrays.setAll(trans72, fillTrans);
trans73 = new int[N];
Arrays.setAll(trans73, fillTrans);
trans74 = new int[N];
Arrays.setAll(trans74, fillTrans);
trans75 = new int[N];
Arrays.setAll(trans75, fillTrans);
trans76 = new int[N];
Arrays.setAll(trans76, fillTrans);
trans77 = new int[N];
Arrays.setAll(trans77, fillTrans);
trans78 = new int[N];
Arrays.setAll(trans78, fillTrans);
trans79 = new int[N];
Arrays.setAll(trans79, fillTrans);
trans8 = new int[N];
Arrays.setAll(trans8, fillTrans);
trans80 = new int[N];
Arrays.setAll(trans80, fillTrans);
trans81 = new int[N];
Arrays.setAll(trans81, fillTrans);
trans82 = new int[N];
Arrays.setAll(trans82, fillTrans);
trans83 = new int[N];
Arrays.setAll(trans83, fillTrans);
trans84 = new int[N];
Arrays.setAll(trans84, fillTrans);
trans85 = new int[N];
Arrays.setAll(trans85, fillTrans);
trans86 = new int[N];
Arrays.setAll(trans86, fillTrans);
trans87 = new int[N];
Arrays.setAll(trans87, fillTrans);
trans88 = new int[N];
Arrays.setAll(trans88, fillTrans);
trans89 = new int[N];
Arrays.setAll(trans89, fillTrans);
trans9 = new int[N];
Arrays.setAll(trans9, fillTrans);
trans90 = new int[N];
Arrays.setAll(trans90, fillTrans);
trans91 = new int[N];
Arrays.setAll(trans91, fillTrans);
trans92 = new int[N];
Arrays.setAll(trans92, fillTrans);
trans93 = new int[N];
Arrays.setAll(trans93, fillTrans);
trans94 = new int[N];
Arrays.setAll(trans94, fillTrans);
trans95 = new int[N];
Arrays.setAll(trans95, fillTrans);
trans96 = new int[N];
Arrays.setAll(trans96, fillTrans);
trans97 = new int[N];
Arrays.setAll(trans97, fillTrans);
trans98 = new int[N];
Arrays.setAll(trans98, fillTrans);
trans99 = new int[N];
Arrays.setAll(trans99, fillTrans);
}

int big_n10_multipleTrue_trans0_transrandomTrue() {
int s = 0;
if (!(trans0.length >= 0)) return -1;
if (!(trans1.length >= 0)) return -1;
if (!(trans2.length >= 0)) return -1;
if (!(trans3.length >= 0)) return -1;
if (!(trans4.length >= 0)) return -1;
if (!(trans5.length >= 0)) return -1;
if (!(trans6.length >= 0)) return -1;
if (!(trans7.length >= 0)) return -1;
if (!(trans8.length >= 0)) return -1;
if (!(trans9.length >= 0)) return -1;
for (int i0 = 0; i0 < 1 && i0 < a0.length; i0++) {
for (int i1 = 0; i1 < 1 && i1 < a1.length; i1++) {
for (int i2 = 0; i2 < 1 && i2 < a2.length; i2++) {
for (int i3 = 0; i3 < 1 && i3 < a3.length; i3++) {
for (int i4 = 0; i4 < 1 && i4 < a4.length; i4++) {
for (int i5 = 0; i5 < 1 && i5 < a5.length; i5++) {
for (int i6 = 0; i6 < 1 && i6 < a6.length; i6++) {
for (int i7 = 0; i7 < 1 && i7 < a7.length; i7++) {
for (int i8 = 0; i8 < 1 && i8 < a8.length; i8++) {
for (int i9 = 0; i9 < 1 && i9 < a9.length; i9++) {
s += a0[i0];
s += a1[i1];
s += a2[i2];
s += a3[i3];
s += a4[i4];
s += a5[i5];
s += a6[i6];
s += a7[i7];
s += a8[i8];
s += a9[i9];
}
}
}
}
}
}
}
}
}
}
return s; }

@Benchmark public int bench_big_n10_multipleTrue_trans0_transrandomTrue() {
return big_n10_multipleTrue_trans0_transrandomTrue();
}

int big_n20_multipleTrue_trans0_transrandomTrue() {
int s = 0;
if (!(trans0.length >= 0)) return -1;
if (!(trans1.length >= 0)) return -1;
if (!(trans2.length >= 0)) return -1;
if (!(trans3.length >= 0)) return -1;
if (!(trans4.length >= 0)) return -1;
if (!(trans5.length >= 0)) return -1;
if (!(trans6.length >= 0)) return -1;
if (!(trans7.length >= 0)) return -1;
if (!(trans8.length >= 0)) return -1;
if (!(trans9.length >= 0)) return -1;
if (!(trans10.length >= 0)) return -1;
if (!(trans11.length >= 0)) return -1;
if (!(trans12.length >= 0)) return -1;
if (!(trans13.length >= 0)) return -1;
if (!(trans14.length >= 0)) return -1;
if (!(trans15.length >= 0)) return -1;
if (!(trans16.length >= 0)) return -1;
if (!(trans17.length >= 0)) return -1;
if (!(trans18.length >= 0)) return -1;
if (!(trans19.length >= 0)) return -1;
for (int i0 = 0; i0 < 1 && i0 < a0.length; i0++) {
for (int i1 = 0; i1 < 1 && i1 < a1.length; i1++) {
for (int i2 = 0; i2 < 1 && i2 < a2.length; i2++) {
for (int i3 = 0; i3 < 1 && i3 < a3.length; i3++) {
for (int i4 = 0; i4 < 1 && i4 < a4.length; i4++) {
for (int i5 = 0; i5 < 1 && i5 < a5.length; i5++) {
for (int i6 = 0; i6 < 1 && i6 < a6.length; i6++) {
for (int i7 = 0; i7 < 1 && i7 < a7.length; i7++) {
for (int i8 = 0; i8 < 1 && i8 < a8.length; i8++) {
for (int i9 = 0; i9 < 1 && i9 < a9.length; i9++) {
for (int i10 = 0; i10 < 1 && i10 < a10.length; i10++) {
for (int i11 = 0; i11 < 1 && i11 < a11.length; i11++) {
for (int i12 = 0; i12 < 1 && i12 < a12.length; i12++) {
for (int i13 = 0; i13 < 1 && i13 < a13.length; i13++) {
for (int i14 = 0; i14 < 1 && i14 < a14.length; i14++) {
for (int i15 = 0; i15 < 1 && i15 < a15.length; i15++) {
for (int i16 = 0; i16 < 1 && i16 < a16.length; i16++) {
for (int i17 = 0; i17 < 1 && i17 < a17.length; i17++) {
for (int i18 = 0; i18 < 1 && i18 < a18.length; i18++) {
for (int i19 = 0; i19 < 1 && i19 < a19.length; i19++) {
s += a0[i0];
s += a1[i1];
s += a2[i2];
s += a3[i3];
s += a4[i4];
s += a5[i5];
s += a6[i6];
s += a7[i7];
s += a8[i8];
s += a9[i9];
s += a10[i10];
s += a11[i11];
s += a12[i12];
s += a13[i13];
s += a14[i14];
s += a15[i15];
s += a16[i16];
s += a17[i17];
s += a18[i18];
s += a19[i19];
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
return s; }

@Benchmark public int bench_big_n20_multipleTrue_trans0_transrandomTrue() {
return big_n20_multipleTrue_trans0_transrandomTrue();
}

int big_n50_multipleTrue_trans0_transrandomTrue() {
int s = 0;
if (!(trans0.length >= 0)) return -1;
if (!(trans1.length >= 0)) return -1;
if (!(trans2.length >= 0)) return -1;
if (!(trans3.length >= 0)) return -1;
if (!(trans4.length >= 0)) return -1;
if (!(trans5.length >= 0)) return -1;
if (!(trans6.length >= 0)) return -1;
if (!(trans7.length >= 0)) return -1;
if (!(trans8.length >= 0)) return -1;
if (!(trans9.length >= 0)) return -1;
if (!(trans10.length >= 0)) return -1;
if (!(trans11.length >= 0)) return -1;
if (!(trans12.length >= 0)) return -1;
if (!(trans13.length >= 0)) return -1;
if (!(trans14.length >= 0)) return -1;
if (!(trans15.length >= 0)) return -1;
if (!(trans16.length >= 0)) return -1;
if (!(trans17.length >= 0)) return -1;
if (!(trans18.length >= 0)) return -1;
if (!(trans19.length >= 0)) return -1;
if (!(trans20.length >= 0)) return -1;
if (!(trans21.length >= 0)) return -1;
if (!(trans22.length >= 0)) return -1;
if (!(trans23.length >= 0)) return -1;
if (!(trans24.length >= 0)) return -1;
if (!(trans25.length >= 0)) return -1;
if (!(trans26.length >= 0)) return -1;
if (!(trans27.length >= 0)) return -1;
if (!(trans28.length >= 0)) return -1;
if (!(trans29.length >= 0)) return -1;
if (!(trans30.length >= 0)) return -1;
if (!(trans31.length >= 0)) return -1;
if (!(trans32.length >= 0)) return -1;
if (!(trans33.length >= 0)) return -1;
if (!(trans34.length >= 0)) return -1;
if (!(trans35.length >= 0)) return -1;
if (!(trans36.length >= 0)) return -1;
if (!(trans37.length >= 0)) return -1;
if (!(trans38.length >= 0)) return -1;
if (!(trans39.length >= 0)) return -1;
if (!(trans40.length >= 0)) return -1;
if (!(trans41.length >= 0)) return -1;
if (!(trans42.length >= 0)) return -1;
if (!(trans43.length >= 0)) return -1;
if (!(trans44.length >= 0)) return -1;
if (!(trans45.length >= 0)) return -1;
if (!(trans46.length >= 0)) return -1;
if (!(trans47.length >= 0)) return -1;
if (!(trans48.length >= 0)) return -1;
if (!(trans49.length >= 0)) return -1;
for (int i0 = 0; i0 < 1 && i0 < a0.length; i0++) {
for (int i1 = 0; i1 < 1 && i1 < a1.length; i1++) {
for (int i2 = 0; i2 < 1 && i2 < a2.length; i2++) {
for (int i3 = 0; i3 < 1 && i3 < a3.length; i3++) {
for (int i4 = 0; i4 < 1 && i4 < a4.length; i4++) {
for (int i5 = 0; i5 < 1 && i5 < a5.length; i5++) {
for (int i6 = 0; i6 < 1 && i6 < a6.length; i6++) {
for (int i7 = 0; i7 < 1 && i7 < a7.length; i7++) {
for (int i8 = 0; i8 < 1 && i8 < a8.length; i8++) {
for (int i9 = 0; i9 < 1 && i9 < a9.length; i9++) {
for (int i10 = 0; i10 < 1 && i10 < a10.length; i10++) {
for (int i11 = 0; i11 < 1 && i11 < a11.length; i11++) {
for (int i12 = 0; i12 < 1 && i12 < a12.length; i12++) {
for (int i13 = 0; i13 < 1 && i13 < a13.length; i13++) {
for (int i14 = 0; i14 < 1 && i14 < a14.length; i14++) {
for (int i15 = 0; i15 < 1 && i15 < a15.length; i15++) {
for (int i16 = 0; i16 < 1 && i16 < a16.length; i16++) {
for (int i17 = 0; i17 < 1 && i17 < a17.length; i17++) {
for (int i18 = 0; i18 < 1 && i18 < a18.length; i18++) {
for (int i19 = 0; i19 < 1 && i19 < a19.length; i19++) {
for (int i20 = 0; i20 < 1 && i20 < a20.length; i20++) {
for (int i21 = 0; i21 < 1 && i21 < a21.length; i21++) {
for (int i22 = 0; i22 < 1 && i22 < a22.length; i22++) {
for (int i23 = 0; i23 < 1 && i23 < a23.length; i23++) {
for (int i24 = 0; i24 < 1 && i24 < a24.length; i24++) {
for (int i25 = 0; i25 < 1 && i25 < a25.length; i25++) {
for (int i26 = 0; i26 < 1 && i26 < a26.length; i26++) {
for (int i27 = 0; i27 < 1 && i27 < a27.length; i27++) {
for (int i28 = 0; i28 < 1 && i28 < a28.length; i28++) {
for (int i29 = 0; i29 < 1 && i29 < a29.length; i29++) {
for (int i30 = 0; i30 < 1 && i30 < a30.length; i30++) {
for (int i31 = 0; i31 < 1 && i31 < a31.length; i31++) {
for (int i32 = 0; i32 < 1 && i32 < a32.length; i32++) {
for (int i33 = 0; i33 < 1 && i33 < a33.length; i33++) {
for (int i34 = 0; i34 < 1 && i34 < a34.length; i34++) {
for (int i35 = 0; i35 < 1 && i35 < a35.length; i35++) {
for (int i36 = 0; i36 < 1 && i36 < a36.length; i36++) {
for (int i37 = 0; i37 < 1 && i37 < a37.length; i37++) {
for (int i38 = 0; i38 < 1 && i38 < a38.length; i38++) {
for (int i39 = 0; i39 < 1 && i39 < a39.length; i39++) {
for (int i40 = 0; i40 < 1 && i40 < a40.length; i40++) {
for (int i41 = 0; i41 < 1 && i41 < a41.length; i41++) {
for (int i42 = 0; i42 < 1 && i42 < a42.length; i42++) {
for (int i43 = 0; i43 < 1 && i43 < a43.length; i43++) {
for (int i44 = 0; i44 < 1 && i44 < a44.length; i44++) {
for (int i45 = 0; i45 < 1 && i45 < a45.length; i45++) {
for (int i46 = 0; i46 < 1 && i46 < a46.length; i46++) {
for (int i47 = 0; i47 < 1 && i47 < a47.length; i47++) {
for (int i48 = 0; i48 < 1 && i48 < a48.length; i48++) {
for (int i49 = 0; i49 < 1 && i49 < a49.length; i49++) {
s += a0[i0];
s += a1[i1];
s += a2[i2];
s += a3[i3];
s += a4[i4];
s += a5[i5];
s += a6[i6];
s += a7[i7];
s += a8[i8];
s += a9[i9];
s += a10[i10];
s += a11[i11];
s += a12[i12];
s += a13[i13];
s += a14[i14];
s += a15[i15];
s += a16[i16];
s += a17[i17];
s += a18[i18];
s += a19[i19];
s += a20[i20];
s += a21[i21];
s += a22[i22];
s += a23[i23];
s += a24[i24];
s += a25[i25];
s += a26[i26];
s += a27[i27];
s += a28[i28];
s += a29[i29];
s += a30[i30];
s += a31[i31];
s += a32[i32];
s += a33[i33];
s += a34[i34];
s += a35[i35];
s += a36[i36];
s += a37[i37];
s += a38[i38];
s += a39[i39];
s += a40[i40];
s += a41[i41];
s += a42[i42];
s += a43[i43];
s += a44[i44];
s += a45[i45];
s += a46[i46];
s += a47[i47];
s += a48[i48];
s += a49[i49];
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
return s; }

@Benchmark public int bench_big_n50_multipleTrue_trans0_transrandomTrue() {
return big_n50_multipleTrue_trans0_transrandomTrue();
}

int big_n100_multipleTrue_trans0_transrandomTrue() {
int s = 0;
if (!(trans0.length >= 0)) return -1;
if (!(trans1.length >= 0)) return -1;
if (!(trans2.length >= 0)) return -1;
if (!(trans3.length >= 0)) return -1;
if (!(trans4.length >= 0)) return -1;
if (!(trans5.length >= 0)) return -1;
if (!(trans6.length >= 0)) return -1;
if (!(trans7.length >= 0)) return -1;
if (!(trans8.length >= 0)) return -1;
if (!(trans9.length >= 0)) return -1;
if (!(trans10.length >= 0)) return -1;
if (!(trans11.length >= 0)) return -1;
if (!(trans12.length >= 0)) return -1;
if (!(trans13.length >= 0)) return -1;
if (!(trans14.length >= 0)) return -1;
if (!(trans15.length >= 0)) return -1;
if (!(trans16.length >= 0)) return -1;
if (!(trans17.length >= 0)) return -1;
if (!(trans18.length >= 0)) return -1;
if (!(trans19.length >= 0)) return -1;
if (!(trans20.length >= 0)) return -1;
if (!(trans21.length >= 0)) return -1;
if (!(trans22.length >= 0)) return -1;
if (!(trans23.length >= 0)) return -1;
if (!(trans24.length >= 0)) return -1;
if (!(trans25.length >= 0)) return -1;
if (!(trans26.length >= 0)) return -1;
if (!(trans27.length >= 0)) return -1;
if (!(trans28.length >= 0)) return -1;
if (!(trans29.length >= 0)) return -1;
if (!(trans30.length >= 0)) return -1;
if (!(trans31.length >= 0)) return -1;
if (!(trans32.length >= 0)) return -1;
if (!(trans33.length >= 0)) return -1;
if (!(trans34.length >= 0)) return -1;
if (!(trans35.length >= 0)) return -1;
if (!(trans36.length >= 0)) return -1;
if (!(trans37.length >= 0)) return -1;
if (!(trans38.length >= 0)) return -1;
if (!(trans39.length >= 0)) return -1;
if (!(trans40.length >= 0)) return -1;
if (!(trans41.length >= 0)) return -1;
if (!(trans42.length >= 0)) return -1;
if (!(trans43.length >= 0)) return -1;
if (!(trans44.length >= 0)) return -1;
if (!(trans45.length >= 0)) return -1;
if (!(trans46.length >= 0)) return -1;
if (!(trans47.length >= 0)) return -1;
if (!(trans48.length >= 0)) return -1;
if (!(trans49.length >= 0)) return -1;
if (!(trans50.length >= 0)) return -1;
if (!(trans51.length >= 0)) return -1;
if (!(trans52.length >= 0)) return -1;
if (!(trans53.length >= 0)) return -1;
if (!(trans54.length >= 0)) return -1;
if (!(trans55.length >= 0)) return -1;
if (!(trans56.length >= 0)) return -1;
if (!(trans57.length >= 0)) return -1;
if (!(trans58.length >= 0)) return -1;
if (!(trans59.length >= 0)) return -1;
if (!(trans60.length >= 0)) return -1;
if (!(trans61.length >= 0)) return -1;
if (!(trans62.length >= 0)) return -1;
if (!(trans63.length >= 0)) return -1;
if (!(trans64.length >= 0)) return -1;
if (!(trans65.length >= 0)) return -1;
if (!(trans66.length >= 0)) return -1;
if (!(trans67.length >= 0)) return -1;
if (!(trans68.length >= 0)) return -1;
if (!(trans69.length >= 0)) return -1;
if (!(trans70.length >= 0)) return -1;
if (!(trans71.length >= 0)) return -1;
if (!(trans72.length >= 0)) return -1;
if (!(trans73.length >= 0)) return -1;
if (!(trans74.length >= 0)) return -1;
if (!(trans75.length >= 0)) return -1;
if (!(trans76.length >= 0)) return -1;
if (!(trans77.length >= 0)) return -1;
if (!(trans78.length >= 0)) return -1;
if (!(trans79.length >= 0)) return -1;
if (!(trans80.length >= 0)) return -1;
if (!(trans81.length >= 0)) return -1;
if (!(trans82.length >= 0)) return -1;
if (!(trans83.length >= 0)) return -1;
if (!(trans84.length >= 0)) return -1;
if (!(trans85.length >= 0)) return -1;
if (!(trans86.length >= 0)) return -1;
if (!(trans87.length >= 0)) return -1;
if (!(trans88.length >= 0)) return -1;
if (!(trans89.length >= 0)) return -1;
if (!(trans90.length >= 0)) return -1;
if (!(trans91.length >= 0)) return -1;
if (!(trans92.length >= 0)) return -1;
if (!(trans93.length >= 0)) return -1;
if (!(trans94.length >= 0)) return -1;
if (!(trans95.length >= 0)) return -1;
if (!(trans96.length >= 0)) return -1;
if (!(trans97.length >= 0)) return -1;
if (!(trans98.length >= 0)) return -1;
if (!(trans99.length >= 0)) return -1;
for (int i0 = 0; i0 < 1 && i0 < a0.length; i0++) {
for (int i1 = 0; i1 < 1 && i1 < a1.length; i1++) {
for (int i2 = 0; i2 < 1 && i2 < a2.length; i2++) {
for (int i3 = 0; i3 < 1 && i3 < a3.length; i3++) {
for (int i4 = 0; i4 < 1 && i4 < a4.length; i4++) {
for (int i5 = 0; i5 < 1 && i5 < a5.length; i5++) {
for (int i6 = 0; i6 < 1 && i6 < a6.length; i6++) {
for (int i7 = 0; i7 < 1 && i7 < a7.length; i7++) {
for (int i8 = 0; i8 < 1 && i8 < a8.length; i8++) {
for (int i9 = 0; i9 < 1 && i9 < a9.length; i9++) {
for (int i10 = 0; i10 < 1 && i10 < a10.length; i10++) {
for (int i11 = 0; i11 < 1 && i11 < a11.length; i11++) {
for (int i12 = 0; i12 < 1 && i12 < a12.length; i12++) {
for (int i13 = 0; i13 < 1 && i13 < a13.length; i13++) {
for (int i14 = 0; i14 < 1 && i14 < a14.length; i14++) {
for (int i15 = 0; i15 < 1 && i15 < a15.length; i15++) {
for (int i16 = 0; i16 < 1 && i16 < a16.length; i16++) {
for (int i17 = 0; i17 < 1 && i17 < a17.length; i17++) {
for (int i18 = 0; i18 < 1 && i18 < a18.length; i18++) {
for (int i19 = 0; i19 < 1 && i19 < a19.length; i19++) {
for (int i20 = 0; i20 < 1 && i20 < a20.length; i20++) {
for (int i21 = 0; i21 < 1 && i21 < a21.length; i21++) {
for (int i22 = 0; i22 < 1 && i22 < a22.length; i22++) {
for (int i23 = 0; i23 < 1 && i23 < a23.length; i23++) {
for (int i24 = 0; i24 < 1 && i24 < a24.length; i24++) {
for (int i25 = 0; i25 < 1 && i25 < a25.length; i25++) {
for (int i26 = 0; i26 < 1 && i26 < a26.length; i26++) {
for (int i27 = 0; i27 < 1 && i27 < a27.length; i27++) {
for (int i28 = 0; i28 < 1 && i28 < a28.length; i28++) {
for (int i29 = 0; i29 < 1 && i29 < a29.length; i29++) {
for (int i30 = 0; i30 < 1 && i30 < a30.length; i30++) {
for (int i31 = 0; i31 < 1 && i31 < a31.length; i31++) {
for (int i32 = 0; i32 < 1 && i32 < a32.length; i32++) {
for (int i33 = 0; i33 < 1 && i33 < a33.length; i33++) {
for (int i34 = 0; i34 < 1 && i34 < a34.length; i34++) {
for (int i35 = 0; i35 < 1 && i35 < a35.length; i35++) {
for (int i36 = 0; i36 < 1 && i36 < a36.length; i36++) {
for (int i37 = 0; i37 < 1 && i37 < a37.length; i37++) {
for (int i38 = 0; i38 < 1 && i38 < a38.length; i38++) {
for (int i39 = 0; i39 < 1 && i39 < a39.length; i39++) {
for (int i40 = 0; i40 < 1 && i40 < a40.length; i40++) {
for (int i41 = 0; i41 < 1 && i41 < a41.length; i41++) {
for (int i42 = 0; i42 < 1 && i42 < a42.length; i42++) {
for (int i43 = 0; i43 < 1 && i43 < a43.length; i43++) {
for (int i44 = 0; i44 < 1 && i44 < a44.length; i44++) {
for (int i45 = 0; i45 < 1 && i45 < a45.length; i45++) {
for (int i46 = 0; i46 < 1 && i46 < a46.length; i46++) {
for (int i47 = 0; i47 < 1 && i47 < a47.length; i47++) {
for (int i48 = 0; i48 < 1 && i48 < a48.length; i48++) {
for (int i49 = 0; i49 < 1 && i49 < a49.length; i49++) {
for (int i50 = 0; i50 < 1 && i50 < a50.length; i50++) {
for (int i51 = 0; i51 < 1 && i51 < a51.length; i51++) {
for (int i52 = 0; i52 < 1 && i52 < a52.length; i52++) {
for (int i53 = 0; i53 < 1 && i53 < a53.length; i53++) {
for (int i54 = 0; i54 < 1 && i54 < a54.length; i54++) {
for (int i55 = 0; i55 < 1 && i55 < a55.length; i55++) {
for (int i56 = 0; i56 < 1 && i56 < a56.length; i56++) {
for (int i57 = 0; i57 < 1 && i57 < a57.length; i57++) {
for (int i58 = 0; i58 < 1 && i58 < a58.length; i58++) {
for (int i59 = 0; i59 < 1 && i59 < a59.length; i59++) {
for (int i60 = 0; i60 < 1 && i60 < a60.length; i60++) {
for (int i61 = 0; i61 < 1 && i61 < a61.length; i61++) {
for (int i62 = 0; i62 < 1 && i62 < a62.length; i62++) {
for (int i63 = 0; i63 < 1 && i63 < a63.length; i63++) {
for (int i64 = 0; i64 < 1 && i64 < a64.length; i64++) {
for (int i65 = 0; i65 < 1 && i65 < a65.length; i65++) {
for (int i66 = 0; i66 < 1 && i66 < a66.length; i66++) {
for (int i67 = 0; i67 < 1 && i67 < a67.length; i67++) {
for (int i68 = 0; i68 < 1 && i68 < a68.length; i68++) {
for (int i69 = 0; i69 < 1 && i69 < a69.length; i69++) {
for (int i70 = 0; i70 < 1 && i70 < a70.length; i70++) {
for (int i71 = 0; i71 < 1 && i71 < a71.length; i71++) {
for (int i72 = 0; i72 < 1 && i72 < a72.length; i72++) {
for (int i73 = 0; i73 < 1 && i73 < a73.length; i73++) {
for (int i74 = 0; i74 < 1 && i74 < a74.length; i74++) {
for (int i75 = 0; i75 < 1 && i75 < a75.length; i75++) {
for (int i76 = 0; i76 < 1 && i76 < a76.length; i76++) {
for (int i77 = 0; i77 < 1 && i77 < a77.length; i77++) {
for (int i78 = 0; i78 < 1 && i78 < a78.length; i78++) {
for (int i79 = 0; i79 < 1 && i79 < a79.length; i79++) {
for (int i80 = 0; i80 < 1 && i80 < a80.length; i80++) {
for (int i81 = 0; i81 < 1 && i81 < a81.length; i81++) {
for (int i82 = 0; i82 < 1 && i82 < a82.length; i82++) {
for (int i83 = 0; i83 < 1 && i83 < a83.length; i83++) {
for (int i84 = 0; i84 < 1 && i84 < a84.length; i84++) {
for (int i85 = 0; i85 < 1 && i85 < a85.length; i85++) {
for (int i86 = 0; i86 < 1 && i86 < a86.length; i86++) {
for (int i87 = 0; i87 < 1 && i87 < a87.length; i87++) {
for (int i88 = 0; i88 < 1 && i88 < a88.length; i88++) {
for (int i89 = 0; i89 < 1 && i89 < a89.length; i89++) {
for (int i90 = 0; i90 < 1 && i90 < a90.length; i90++) {
for (int i91 = 0; i91 < 1 && i91 < a91.length; i91++) {
for (int i92 = 0; i92 < 1 && i92 < a92.length; i92++) {
for (int i93 = 0; i93 < 1 && i93 < a93.length; i93++) {
for (int i94 = 0; i94 < 1 && i94 < a94.length; i94++) {
for (int i95 = 0; i95 < 1 && i95 < a95.length; i95++) {
for (int i96 = 0; i96 < 1 && i96 < a96.length; i96++) {
for (int i97 = 0; i97 < 1 && i97 < a97.length; i97++) {
for (int i98 = 0; i98 < 1 && i98 < a98.length; i98++) {
for (int i99 = 0; i99 < 1 && i99 < a99.length; i99++) {
s += a0[i0];
s += a1[i1];
s += a2[i2];
s += a3[i3];
s += a4[i4];
s += a5[i5];
s += a6[i6];
s += a7[i7];
s += a8[i8];
s += a9[i9];
s += a10[i10];
s += a11[i11];
s += a12[i12];
s += a13[i13];
s += a14[i14];
s += a15[i15];
s += a16[i16];
s += a17[i17];
s += a18[i18];
s += a19[i19];
s += a20[i20];
s += a21[i21];
s += a22[i22];
s += a23[i23];
s += a24[i24];
s += a25[i25];
s += a26[i26];
s += a27[i27];
s += a28[i28];
s += a29[i29];
s += a30[i30];
s += a31[i31];
s += a32[i32];
s += a33[i33];
s += a34[i34];
s += a35[i35];
s += a36[i36];
s += a37[i37];
s += a38[i38];
s += a39[i39];
s += a40[i40];
s += a41[i41];
s += a42[i42];
s += a43[i43];
s += a44[i44];
s += a45[i45];
s += a46[i46];
s += a47[i47];
s += a48[i48];
s += a49[i49];
s += a50[i50];
s += a51[i51];
s += a52[i52];
s += a53[i53];
s += a54[i54];
s += a55[i55];
s += a56[i56];
s += a57[i57];
s += a58[i58];
s += a59[i59];
s += a60[i60];
s += a61[i61];
s += a62[i62];
s += a63[i63];
s += a64[i64];
s += a65[i65];
s += a66[i66];
s += a67[i67];
s += a68[i68];
s += a69[i69];
s += a70[i70];
s += a71[i71];
s += a72[i72];
s += a73[i73];
s += a74[i74];
s += a75[i75];
s += a76[i76];
s += a77[i77];
s += a78[i78];
s += a79[i79];
s += a80[i80];
s += a81[i81];
s += a82[i82];
s += a83[i83];
s += a84[i84];
s += a85[i85];
s += a86[i86];
s += a87[i87];
s += a88[i88];
s += a89[i89];
s += a90[i90];
s += a91[i91];
s += a92[i92];
s += a93[i93];
s += a94[i94];
s += a95[i95];
s += a96[i96];
s += a97[i97];
s += a98[i98];
s += a99[i99];
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
return s; }

@Benchmark public int bench_big_n100_multipleTrue_trans0_transrandomTrue() {
return big_n100_multipleTrue_trans0_transrandomTrue();
}

int big_n200_multipleTrue_trans0_transrandomTrue() {
int s = 0;
if (!(trans0.length >= 0)) return -1;
if (!(trans1.length >= 0)) return -1;
if (!(trans2.length >= 0)) return -1;
if (!(trans3.length >= 0)) return -1;
if (!(trans4.length >= 0)) return -1;
if (!(trans5.length >= 0)) return -1;
if (!(trans6.length >= 0)) return -1;
if (!(trans7.length >= 0)) return -1;
if (!(trans8.length >= 0)) return -1;
if (!(trans9.length >= 0)) return -1;
if (!(trans10.length >= 0)) return -1;
if (!(trans11.length >= 0)) return -1;
if (!(trans12.length >= 0)) return -1;
if (!(trans13.length >= 0)) return -1;
if (!(trans14.length >= 0)) return -1;
if (!(trans15.length >= 0)) return -1;
if (!(trans16.length >= 0)) return -1;
if (!(trans17.length >= 0)) return -1;
if (!(trans18.length >= 0)) return -1;
if (!(trans19.length >= 0)) return -1;
if (!(trans20.length >= 0)) return -1;
if (!(trans21.length >= 0)) return -1;
if (!(trans22.length >= 0)) return -1;
if (!(trans23.length >= 0)) return -1;
if (!(trans24.length >= 0)) return -1;
if (!(trans25.length >= 0)) return -1;
if (!(trans26.length >= 0)) return -1;
if (!(trans27.length >= 0)) return -1;
if (!(trans28.length >= 0)) return -1;
if (!(trans29.length >= 0)) return -1;
if (!(trans30.length >= 0)) return -1;
if (!(trans31.length >= 0)) return -1;
if (!(trans32.length >= 0)) return -1;
if (!(trans33.length >= 0)) return -1;
if (!(trans34.length >= 0)) return -1;
if (!(trans35.length >= 0)) return -1;
if (!(trans36.length >= 0)) return -1;
if (!(trans37.length >= 0)) return -1;
if (!(trans38.length >= 0)) return -1;
if (!(trans39.length >= 0)) return -1;
if (!(trans40.length >= 0)) return -1;
if (!(trans41.length >= 0)) return -1;
if (!(trans42.length >= 0)) return -1;
if (!(trans43.length >= 0)) return -1;
if (!(trans44.length >= 0)) return -1;
if (!(trans45.length >= 0)) return -1;
if (!(trans46.length >= 0)) return -1;
if (!(trans47.length >= 0)) return -1;
if (!(trans48.length >= 0)) return -1;
if (!(trans49.length >= 0)) return -1;
if (!(trans50.length >= 0)) return -1;
if (!(trans51.length >= 0)) return -1;
if (!(trans52.length >= 0)) return -1;
if (!(trans53.length >= 0)) return -1;
if (!(trans54.length >= 0)) return -1;
if (!(trans55.length >= 0)) return -1;
if (!(trans56.length >= 0)) return -1;
if (!(trans57.length >= 0)) return -1;
if (!(trans58.length >= 0)) return -1;
if (!(trans59.length >= 0)) return -1;
if (!(trans60.length >= 0)) return -1;
if (!(trans61.length >= 0)) return -1;
if (!(trans62.length >= 0)) return -1;
if (!(trans63.length >= 0)) return -1;
if (!(trans64.length >= 0)) return -1;
if (!(trans65.length >= 0)) return -1;
if (!(trans66.length >= 0)) return -1;
if (!(trans67.length >= 0)) return -1;
if (!(trans68.length >= 0)) return -1;
if (!(trans69.length >= 0)) return -1;
if (!(trans70.length >= 0)) return -1;
if (!(trans71.length >= 0)) return -1;
if (!(trans72.length >= 0)) return -1;
if (!(trans73.length >= 0)) return -1;
if (!(trans74.length >= 0)) return -1;
if (!(trans75.length >= 0)) return -1;
if (!(trans76.length >= 0)) return -1;
if (!(trans77.length >= 0)) return -1;
if (!(trans78.length >= 0)) return -1;
if (!(trans79.length >= 0)) return -1;
if (!(trans80.length >= 0)) return -1;
if (!(trans81.length >= 0)) return -1;
if (!(trans82.length >= 0)) return -1;
if (!(trans83.length >= 0)) return -1;
if (!(trans84.length >= 0)) return -1;
if (!(trans85.length >= 0)) return -1;
if (!(trans86.length >= 0)) return -1;
if (!(trans87.length >= 0)) return -1;
if (!(trans88.length >= 0)) return -1;
if (!(trans89.length >= 0)) return -1;
if (!(trans90.length >= 0)) return -1;
if (!(trans91.length >= 0)) return -1;
if (!(trans92.length >= 0)) return -1;
if (!(trans93.length >= 0)) return -1;
if (!(trans94.length >= 0)) return -1;
if (!(trans95.length >= 0)) return -1;
if (!(trans96.length >= 0)) return -1;
if (!(trans97.length >= 0)) return -1;
if (!(trans98.length >= 0)) return -1;
if (!(trans99.length >= 0)) return -1;
if (!(trans100.length >= 0)) return -1;
if (!(trans101.length >= 0)) return -1;
if (!(trans102.length >= 0)) return -1;
if (!(trans103.length >= 0)) return -1;
if (!(trans104.length >= 0)) return -1;
if (!(trans105.length >= 0)) return -1;
if (!(trans106.length >= 0)) return -1;
if (!(trans107.length >= 0)) return -1;
if (!(trans108.length >= 0)) return -1;
if (!(trans109.length >= 0)) return -1;
if (!(trans110.length >= 0)) return -1;
if (!(trans111.length >= 0)) return -1;
if (!(trans112.length >= 0)) return -1;
if (!(trans113.length >= 0)) return -1;
if (!(trans114.length >= 0)) return -1;
if (!(trans115.length >= 0)) return -1;
if (!(trans116.length >= 0)) return -1;
if (!(trans117.length >= 0)) return -1;
if (!(trans118.length >= 0)) return -1;
if (!(trans119.length >= 0)) return -1;
if (!(trans120.length >= 0)) return -1;
if (!(trans121.length >= 0)) return -1;
if (!(trans122.length >= 0)) return -1;
if (!(trans123.length >= 0)) return -1;
if (!(trans124.length >= 0)) return -1;
if (!(trans125.length >= 0)) return -1;
if (!(trans126.length >= 0)) return -1;
if (!(trans127.length >= 0)) return -1;
if (!(trans128.length >= 0)) return -1;
if (!(trans129.length >= 0)) return -1;
if (!(trans130.length >= 0)) return -1;
if (!(trans131.length >= 0)) return -1;
if (!(trans132.length >= 0)) return -1;
if (!(trans133.length >= 0)) return -1;
if (!(trans134.length >= 0)) return -1;
if (!(trans135.length >= 0)) return -1;
if (!(trans136.length >= 0)) return -1;
if (!(trans137.length >= 0)) return -1;
if (!(trans138.length >= 0)) return -1;
if (!(trans139.length >= 0)) return -1;
if (!(trans140.length >= 0)) return -1;
if (!(trans141.length >= 0)) return -1;
if (!(trans142.length >= 0)) return -1;
if (!(trans143.length >= 0)) return -1;
if (!(trans144.length >= 0)) return -1;
if (!(trans145.length >= 0)) return -1;
if (!(trans146.length >= 0)) return -1;
if (!(trans147.length >= 0)) return -1;
if (!(trans148.length >= 0)) return -1;
if (!(trans149.length >= 0)) return -1;
if (!(trans150.length >= 0)) return -1;
if (!(trans151.length >= 0)) return -1;
if (!(trans152.length >= 0)) return -1;
if (!(trans153.length >= 0)) return -1;
if (!(trans154.length >= 0)) return -1;
if (!(trans155.length >= 0)) return -1;
if (!(trans156.length >= 0)) return -1;
if (!(trans157.length >= 0)) return -1;
if (!(trans158.length >= 0)) return -1;
if (!(trans159.length >= 0)) return -1;
if (!(trans160.length >= 0)) return -1;
if (!(trans161.length >= 0)) return -1;
if (!(trans162.length >= 0)) return -1;
if (!(trans163.length >= 0)) return -1;
if (!(trans164.length >= 0)) return -1;
if (!(trans165.length >= 0)) return -1;
if (!(trans166.length >= 0)) return -1;
if (!(trans167.length >= 0)) return -1;
if (!(trans168.length >= 0)) return -1;
if (!(trans169.length >= 0)) return -1;
if (!(trans170.length >= 0)) return -1;
if (!(trans171.length >= 0)) return -1;
if (!(trans172.length >= 0)) return -1;
if (!(trans173.length >= 0)) return -1;
if (!(trans174.length >= 0)) return -1;
if (!(trans175.length >= 0)) return -1;
if (!(trans176.length >= 0)) return -1;
if (!(trans177.length >= 0)) return -1;
if (!(trans178.length >= 0)) return -1;
if (!(trans179.length >= 0)) return -1;
if (!(trans180.length >= 0)) return -1;
if (!(trans181.length >= 0)) return -1;
if (!(trans182.length >= 0)) return -1;
if (!(trans183.length >= 0)) return -1;
if (!(trans184.length >= 0)) return -1;
if (!(trans185.length >= 0)) return -1;
if (!(trans186.length >= 0)) return -1;
if (!(trans187.length >= 0)) return -1;
if (!(trans188.length >= 0)) return -1;
if (!(trans189.length >= 0)) return -1;
if (!(trans190.length >= 0)) return -1;
if (!(trans191.length >= 0)) return -1;
if (!(trans192.length >= 0)) return -1;
if (!(trans193.length >= 0)) return -1;
if (!(trans194.length >= 0)) return -1;
if (!(trans195.length >= 0)) return -1;
if (!(trans196.length >= 0)) return -1;
if (!(trans197.length >= 0)) return -1;
if (!(trans198.length >= 0)) return -1;
if (!(trans199.length >= 0)) return -1;
for (int i0 = 0; i0 < 1 && i0 < a0.length; i0++) {
for (int i1 = 0; i1 < 1 && i1 < a1.length; i1++) {
for (int i2 = 0; i2 < 1 && i2 < a2.length; i2++) {
for (int i3 = 0; i3 < 1 && i3 < a3.length; i3++) {
for (int i4 = 0; i4 < 1 && i4 < a4.length; i4++) {
for (int i5 = 0; i5 < 1 && i5 < a5.length; i5++) {
for (int i6 = 0; i6 < 1 && i6 < a6.length; i6++) {
for (int i7 = 0; i7 < 1 && i7 < a7.length; i7++) {
for (int i8 = 0; i8 < 1 && i8 < a8.length; i8++) {
for (int i9 = 0; i9 < 1 && i9 < a9.length; i9++) {
for (int i10 = 0; i10 < 1 && i10 < a10.length; i10++) {
for (int i11 = 0; i11 < 1 && i11 < a11.length; i11++) {
for (int i12 = 0; i12 < 1 && i12 < a12.length; i12++) {
for (int i13 = 0; i13 < 1 && i13 < a13.length; i13++) {
for (int i14 = 0; i14 < 1 && i14 < a14.length; i14++) {
for (int i15 = 0; i15 < 1 && i15 < a15.length; i15++) {
for (int i16 = 0; i16 < 1 && i16 < a16.length; i16++) {
for (int i17 = 0; i17 < 1 && i17 < a17.length; i17++) {
for (int i18 = 0; i18 < 1 && i18 < a18.length; i18++) {
for (int i19 = 0; i19 < 1 && i19 < a19.length; i19++) {
for (int i20 = 0; i20 < 1 && i20 < a20.length; i20++) {
for (int i21 = 0; i21 < 1 && i21 < a21.length; i21++) {
for (int i22 = 0; i22 < 1 && i22 < a22.length; i22++) {
for (int i23 = 0; i23 < 1 && i23 < a23.length; i23++) {
for (int i24 = 0; i24 < 1 && i24 < a24.length; i24++) {
for (int i25 = 0; i25 < 1 && i25 < a25.length; i25++) {
for (int i26 = 0; i26 < 1 && i26 < a26.length; i26++) {
for (int i27 = 0; i27 < 1 && i27 < a27.length; i27++) {
for (int i28 = 0; i28 < 1 && i28 < a28.length; i28++) {
for (int i29 = 0; i29 < 1 && i29 < a29.length; i29++) {
for (int i30 = 0; i30 < 1 && i30 < a30.length; i30++) {
for (int i31 = 0; i31 < 1 && i31 < a31.length; i31++) {
for (int i32 = 0; i32 < 1 && i32 < a32.length; i32++) {
for (int i33 = 0; i33 < 1 && i33 < a33.length; i33++) {
for (int i34 = 0; i34 < 1 && i34 < a34.length; i34++) {
for (int i35 = 0; i35 < 1 && i35 < a35.length; i35++) {
for (int i36 = 0; i36 < 1 && i36 < a36.length; i36++) {
for (int i37 = 0; i37 < 1 && i37 < a37.length; i37++) {
for (int i38 = 0; i38 < 1 && i38 < a38.length; i38++) {
for (int i39 = 0; i39 < 1 && i39 < a39.length; i39++) {
for (int i40 = 0; i40 < 1 && i40 < a40.length; i40++) {
for (int i41 = 0; i41 < 1 && i41 < a41.length; i41++) {
for (int i42 = 0; i42 < 1 && i42 < a42.length; i42++) {
for (int i43 = 0; i43 < 1 && i43 < a43.length; i43++) {
for (int i44 = 0; i44 < 1 && i44 < a44.length; i44++) {
for (int i45 = 0; i45 < 1 && i45 < a45.length; i45++) {
for (int i46 = 0; i46 < 1 && i46 < a46.length; i46++) {
for (int i47 = 0; i47 < 1 && i47 < a47.length; i47++) {
for (int i48 = 0; i48 < 1 && i48 < a48.length; i48++) {
for (int i49 = 0; i49 < 1 && i49 < a49.length; i49++) {
for (int i50 = 0; i50 < 1 && i50 < a50.length; i50++) {
for (int i51 = 0; i51 < 1 && i51 < a51.length; i51++) {
for (int i52 = 0; i52 < 1 && i52 < a52.length; i52++) {
for (int i53 = 0; i53 < 1 && i53 < a53.length; i53++) {
for (int i54 = 0; i54 < 1 && i54 < a54.length; i54++) {
for (int i55 = 0; i55 < 1 && i55 < a55.length; i55++) {
for (int i56 = 0; i56 < 1 && i56 < a56.length; i56++) {
for (int i57 = 0; i57 < 1 && i57 < a57.length; i57++) {
for (int i58 = 0; i58 < 1 && i58 < a58.length; i58++) {
for (int i59 = 0; i59 < 1 && i59 < a59.length; i59++) {
for (int i60 = 0; i60 < 1 && i60 < a60.length; i60++) {
for (int i61 = 0; i61 < 1 && i61 < a61.length; i61++) {
for (int i62 = 0; i62 < 1 && i62 < a62.length; i62++) {
for (int i63 = 0; i63 < 1 && i63 < a63.length; i63++) {
for (int i64 = 0; i64 < 1 && i64 < a64.length; i64++) {
for (int i65 = 0; i65 < 1 && i65 < a65.length; i65++) {
for (int i66 = 0; i66 < 1 && i66 < a66.length; i66++) {
for (int i67 = 0; i67 < 1 && i67 < a67.length; i67++) {
for (int i68 = 0; i68 < 1 && i68 < a68.length; i68++) {
for (int i69 = 0; i69 < 1 && i69 < a69.length; i69++) {
for (int i70 = 0; i70 < 1 && i70 < a70.length; i70++) {
for (int i71 = 0; i71 < 1 && i71 < a71.length; i71++) {
for (int i72 = 0; i72 < 1 && i72 < a72.length; i72++) {
for (int i73 = 0; i73 < 1 && i73 < a73.length; i73++) {
for (int i74 = 0; i74 < 1 && i74 < a74.length; i74++) {
for (int i75 = 0; i75 < 1 && i75 < a75.length; i75++) {
for (int i76 = 0; i76 < 1 && i76 < a76.length; i76++) {
for (int i77 = 0; i77 < 1 && i77 < a77.length; i77++) {
for (int i78 = 0; i78 < 1 && i78 < a78.length; i78++) {
for (int i79 = 0; i79 < 1 && i79 < a79.length; i79++) {
for (int i80 = 0; i80 < 1 && i80 < a80.length; i80++) {
for (int i81 = 0; i81 < 1 && i81 < a81.length; i81++) {
for (int i82 = 0; i82 < 1 && i82 < a82.length; i82++) {
for (int i83 = 0; i83 < 1 && i83 < a83.length; i83++) {
for (int i84 = 0; i84 < 1 && i84 < a84.length; i84++) {
for (int i85 = 0; i85 < 1 && i85 < a85.length; i85++) {
for (int i86 = 0; i86 < 1 && i86 < a86.length; i86++) {
for (int i87 = 0; i87 < 1 && i87 < a87.length; i87++) {
for (int i88 = 0; i88 < 1 && i88 < a88.length; i88++) {
for (int i89 = 0; i89 < 1 && i89 < a89.length; i89++) {
for (int i90 = 0; i90 < 1 && i90 < a90.length; i90++) {
for (int i91 = 0; i91 < 1 && i91 < a91.length; i91++) {
for (int i92 = 0; i92 < 1 && i92 < a92.length; i92++) {
for (int i93 = 0; i93 < 1 && i93 < a93.length; i93++) {
for (int i94 = 0; i94 < 1 && i94 < a94.length; i94++) {
for (int i95 = 0; i95 < 1 && i95 < a95.length; i95++) {
for (int i96 = 0; i96 < 1 && i96 < a96.length; i96++) {
for (int i97 = 0; i97 < 1 && i97 < a97.length; i97++) {
for (int i98 = 0; i98 < 1 && i98 < a98.length; i98++) {
for (int i99 = 0; i99 < 1 && i99 < a99.length; i99++) {
for (int i100 = 0; i100 < 1 && i100 < a100.length; i100++) {
for (int i101 = 0; i101 < 1 && i101 < a101.length; i101++) {
for (int i102 = 0; i102 < 1 && i102 < a102.length; i102++) {
for (int i103 = 0; i103 < 1 && i103 < a103.length; i103++) {
for (int i104 = 0; i104 < 1 && i104 < a104.length; i104++) {
for (int i105 = 0; i105 < 1 && i105 < a105.length; i105++) {
for (int i106 = 0; i106 < 1 && i106 < a106.length; i106++) {
for (int i107 = 0; i107 < 1 && i107 < a107.length; i107++) {
for (int i108 = 0; i108 < 1 && i108 < a108.length; i108++) {
for (int i109 = 0; i109 < 1 && i109 < a109.length; i109++) {
for (int i110 = 0; i110 < 1 && i110 < a110.length; i110++) {
for (int i111 = 0; i111 < 1 && i111 < a111.length; i111++) {
for (int i112 = 0; i112 < 1 && i112 < a112.length; i112++) {
for (int i113 = 0; i113 < 1 && i113 < a113.length; i113++) {
for (int i114 = 0; i114 < 1 && i114 < a114.length; i114++) {
for (int i115 = 0; i115 < 1 && i115 < a115.length; i115++) {
for (int i116 = 0; i116 < 1 && i116 < a116.length; i116++) {
for (int i117 = 0; i117 < 1 && i117 < a117.length; i117++) {
for (int i118 = 0; i118 < 1 && i118 < a118.length; i118++) {
for (int i119 = 0; i119 < 1 && i119 < a119.length; i119++) {
for (int i120 = 0; i120 < 1 && i120 < a120.length; i120++) {
for (int i121 = 0; i121 < 1 && i121 < a121.length; i121++) {
for (int i122 = 0; i122 < 1 && i122 < a122.length; i122++) {
for (int i123 = 0; i123 < 1 && i123 < a123.length; i123++) {
for (int i124 = 0; i124 < 1 && i124 < a124.length; i124++) {
for (int i125 = 0; i125 < 1 && i125 < a125.length; i125++) {
for (int i126 = 0; i126 < 1 && i126 < a126.length; i126++) {
for (int i127 = 0; i127 < 1 && i127 < a127.length; i127++) {
for (int i128 = 0; i128 < 1 && i128 < a128.length; i128++) {
for (int i129 = 0; i129 < 1 && i129 < a129.length; i129++) {
for (int i130 = 0; i130 < 1 && i130 < a130.length; i130++) {
for (int i131 = 0; i131 < 1 && i131 < a131.length; i131++) {
for (int i132 = 0; i132 < 1 && i132 < a132.length; i132++) {
for (int i133 = 0; i133 < 1 && i133 < a133.length; i133++) {
for (int i134 = 0; i134 < 1 && i134 < a134.length; i134++) {
for (int i135 = 0; i135 < 1 && i135 < a135.length; i135++) {
for (int i136 = 0; i136 < 1 && i136 < a136.length; i136++) {
for (int i137 = 0; i137 < 1 && i137 < a137.length; i137++) {
for (int i138 = 0; i138 < 1 && i138 < a138.length; i138++) {
for (int i139 = 0; i139 < 1 && i139 < a139.length; i139++) {
for (int i140 = 0; i140 < 1 && i140 < a140.length; i140++) {
for (int i141 = 0; i141 < 1 && i141 < a141.length; i141++) {
for (int i142 = 0; i142 < 1 && i142 < a142.length; i142++) {
for (int i143 = 0; i143 < 1 && i143 < a143.length; i143++) {
for (int i144 = 0; i144 < 1 && i144 < a144.length; i144++) {
for (int i145 = 0; i145 < 1 && i145 < a145.length; i145++) {
for (int i146 = 0; i146 < 1 && i146 < a146.length; i146++) {
for (int i147 = 0; i147 < 1 && i147 < a147.length; i147++) {
for (int i148 = 0; i148 < 1 && i148 < a148.length; i148++) {
for (int i149 = 0; i149 < 1 && i149 < a149.length; i149++) {
for (int i150 = 0; i150 < 1 && i150 < a150.length; i150++) {
for (int i151 = 0; i151 < 1 && i151 < a151.length; i151++) {
for (int i152 = 0; i152 < 1 && i152 < a152.length; i152++) {
for (int i153 = 0; i153 < 1 && i153 < a153.length; i153++) {
for (int i154 = 0; i154 < 1 && i154 < a154.length; i154++) {
for (int i155 = 0; i155 < 1 && i155 < a155.length; i155++) {
for (int i156 = 0; i156 < 1 && i156 < a156.length; i156++) {
for (int i157 = 0; i157 < 1 && i157 < a157.length; i157++) {
for (int i158 = 0; i158 < 1 && i158 < a158.length; i158++) {
for (int i159 = 0; i159 < 1 && i159 < a159.length; i159++) {
for (int i160 = 0; i160 < 1 && i160 < a160.length; i160++) {
for (int i161 = 0; i161 < 1 && i161 < a161.length; i161++) {
for (int i162 = 0; i162 < 1 && i162 < a162.length; i162++) {
for (int i163 = 0; i163 < 1 && i163 < a163.length; i163++) {
for (int i164 = 0; i164 < 1 && i164 < a164.length; i164++) {
for (int i165 = 0; i165 < 1 && i165 < a165.length; i165++) {
for (int i166 = 0; i166 < 1 && i166 < a166.length; i166++) {
for (int i167 = 0; i167 < 1 && i167 < a167.length; i167++) {
for (int i168 = 0; i168 < 1 && i168 < a168.length; i168++) {
for (int i169 = 0; i169 < 1 && i169 < a169.length; i169++) {
for (int i170 = 0; i170 < 1 && i170 < a170.length; i170++) {
for (int i171 = 0; i171 < 1 && i171 < a171.length; i171++) {
for (int i172 = 0; i172 < 1 && i172 < a172.length; i172++) {
for (int i173 = 0; i173 < 1 && i173 < a173.length; i173++) {
for (int i174 = 0; i174 < 1 && i174 < a174.length; i174++) {
for (int i175 = 0; i175 < 1 && i175 < a175.length; i175++) {
for (int i176 = 0; i176 < 1 && i176 < a176.length; i176++) {
for (int i177 = 0; i177 < 1 && i177 < a177.length; i177++) {
for (int i178 = 0; i178 < 1 && i178 < a178.length; i178++) {
for (int i179 = 0; i179 < 1 && i179 < a179.length; i179++) {
for (int i180 = 0; i180 < 1 && i180 < a180.length; i180++) {
for (int i181 = 0; i181 < 1 && i181 < a181.length; i181++) {
for (int i182 = 0; i182 < 1 && i182 < a182.length; i182++) {
for (int i183 = 0; i183 < 1 && i183 < a183.length; i183++) {
for (int i184 = 0; i184 < 1 && i184 < a184.length; i184++) {
for (int i185 = 0; i185 < 1 && i185 < a185.length; i185++) {
for (int i186 = 0; i186 < 1 && i186 < a186.length; i186++) {
for (int i187 = 0; i187 < 1 && i187 < a187.length; i187++) {
for (int i188 = 0; i188 < 1 && i188 < a188.length; i188++) {
for (int i189 = 0; i189 < 1 && i189 < a189.length; i189++) {
for (int i190 = 0; i190 < 1 && i190 < a190.length; i190++) {
for (int i191 = 0; i191 < 1 && i191 < a191.length; i191++) {
for (int i192 = 0; i192 < 1 && i192 < a192.length; i192++) {
for (int i193 = 0; i193 < 1 && i193 < a193.length; i193++) {
for (int i194 = 0; i194 < 1 && i194 < a194.length; i194++) {
for (int i195 = 0; i195 < 1 && i195 < a195.length; i195++) {
for (int i196 = 0; i196 < 1 && i196 < a196.length; i196++) {
for (int i197 = 0; i197 < 1 && i197 < a197.length; i197++) {
for (int i198 = 0; i198 < 1 && i198 < a198.length; i198++) {
for (int i199 = 0; i199 < 1 && i199 < a199.length; i199++) {
s += a0[i0];
s += a1[i1];
s += a2[i2];
s += a3[i3];
s += a4[i4];
s += a5[i5];
s += a6[i6];
s += a7[i7];
s += a8[i8];
s += a9[i9];
s += a10[i10];
s += a11[i11];
s += a12[i12];
s += a13[i13];
s += a14[i14];
s += a15[i15];
s += a16[i16];
s += a17[i17];
s += a18[i18];
s += a19[i19];
s += a20[i20];
s += a21[i21];
s += a22[i22];
s += a23[i23];
s += a24[i24];
s += a25[i25];
s += a26[i26];
s += a27[i27];
s += a28[i28];
s += a29[i29];
s += a30[i30];
s += a31[i31];
s += a32[i32];
s += a33[i33];
s += a34[i34];
s += a35[i35];
s += a36[i36];
s += a37[i37];
s += a38[i38];
s += a39[i39];
s += a40[i40];
s += a41[i41];
s += a42[i42];
s += a43[i43];
s += a44[i44];
s += a45[i45];
s += a46[i46];
s += a47[i47];
s += a48[i48];
s += a49[i49];
s += a50[i50];
s += a51[i51];
s += a52[i52];
s += a53[i53];
s += a54[i54];
s += a55[i55];
s += a56[i56];
s += a57[i57];
s += a58[i58];
s += a59[i59];
s += a60[i60];
s += a61[i61];
s += a62[i62];
s += a63[i63];
s += a64[i64];
s += a65[i65];
s += a66[i66];
s += a67[i67];
s += a68[i68];
s += a69[i69];
s += a70[i70];
s += a71[i71];
s += a72[i72];
s += a73[i73];
s += a74[i74];
s += a75[i75];
s += a76[i76];
s += a77[i77];
s += a78[i78];
s += a79[i79];
s += a80[i80];
s += a81[i81];
s += a82[i82];
s += a83[i83];
s += a84[i84];
s += a85[i85];
s += a86[i86];
s += a87[i87];
s += a88[i88];
s += a89[i89];
s += a90[i90];
s += a91[i91];
s += a92[i92];
s += a93[i93];
s += a94[i94];
s += a95[i95];
s += a96[i96];
s += a97[i97];
s += a98[i98];
s += a99[i99];
s += a100[i100];
s += a101[i101];
s += a102[i102];
s += a103[i103];
s += a104[i104];
s += a105[i105];
s += a106[i106];
s += a107[i107];
s += a108[i108];
s += a109[i109];
s += a110[i110];
s += a111[i111];
s += a112[i112];
s += a113[i113];
s += a114[i114];
s += a115[i115];
s += a116[i116];
s += a117[i117];
s += a118[i118];
s += a119[i119];
s += a120[i120];
s += a121[i121];
s += a122[i122];
s += a123[i123];
s += a124[i124];
s += a125[i125];
s += a126[i126];
s += a127[i127];
s += a128[i128];
s += a129[i129];
s += a130[i130];
s += a131[i131];
s += a132[i132];
s += a133[i133];
s += a134[i134];
s += a135[i135];
s += a136[i136];
s += a137[i137];
s += a138[i138];
s += a139[i139];
s += a140[i140];
s += a141[i141];
s += a142[i142];
s += a143[i143];
s += a144[i144];
s += a145[i145];
s += a146[i146];
s += a147[i147];
s += a148[i148];
s += a149[i149];
s += a150[i150];
s += a151[i151];
s += a152[i152];
s += a153[i153];
s += a154[i154];
s += a155[i155];
s += a156[i156];
s += a157[i157];
s += a158[i158];
s += a159[i159];
s += a160[i160];
s += a161[i161];
s += a162[i162];
s += a163[i163];
s += a164[i164];
s += a165[i165];
s += a166[i166];
s += a167[i167];
s += a168[i168];
s += a169[i169];
s += a170[i170];
s += a171[i171];
s += a172[i172];
s += a173[i173];
s += a174[i174];
s += a175[i175];
s += a176[i176];
s += a177[i177];
s += a178[i178];
s += a179[i179];
s += a180[i180];
s += a181[i181];
s += a182[i182];
s += a183[i183];
s += a184[i184];
s += a185[i185];
s += a186[i186];
s += a187[i187];
s += a188[i188];
s += a189[i189];
s += a190[i190];
s += a191[i191];
s += a192[i192];
s += a193[i193];
s += a194[i194];
s += a195[i195];
s += a196[i196];
s += a197[i197];
s += a198[i198];
s += a199[i199];
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
return s; }

@Benchmark public int bench_big_n200_multipleTrue_trans0_transrandomTrue() {
return big_n200_multipleTrue_trans0_transrandomTrue();
}

int big_n10_multipleTrue_trans2_transrandomTrue() {
int s = 0;
if (!(trans0.length >= 2)) return -1;
int trans0_0 = trans0[0];
int trans0_1 = trans0[1];
if (!(trans1.length >= 2)) return -1;
int trans1_0 = trans1[0];
int trans1_1 = trans1[1];
if (!(trans2.length >= 2)) return -1;
int trans2_0 = trans2[0];
int trans2_1 = trans2[1];
if (!(trans3.length >= 2)) return -1;
int trans3_0 = trans3[0];
int trans3_1 = trans3[1];
if (!(trans4.length >= 2)) return -1;
int trans4_0 = trans4[0];
int trans4_1 = trans4[1];
if (!(trans5.length >= 2)) return -1;
int trans5_0 = trans5[0];
int trans5_1 = trans5[1];
if (!(trans6.length >= 2)) return -1;
int trans6_0 = trans6[0];
int trans6_1 = trans6[1];
if (!(trans7.length >= 2)) return -1;
int trans7_0 = trans7[0];
int trans7_1 = trans7[1];
if (!(trans8.length >= 2)) return -1;
int trans8_0 = trans8[0];
int trans8_1 = trans8[1];
if (!(trans9.length >= 2)) return -1;
int trans9_0 = trans9[0];
int trans9_1 = trans9[1];
if (trans0_1 <= a0.length)
if (trans0_0 <= trans0_1)
for (int i0 = 0; i0 < 1 && i0 < trans0_0; i0++) {
if (trans1_0 <= trans1_1)
if (trans1_1 <= a1.length)
for (int i1 = 0; i1 < 1 && i1 < trans1_0; i1++) {
if (trans2_1 <= a2.length)
if (trans2_0 <= trans2_1)
for (int i2 = 0; i2 < 1 && i2 < trans2_0; i2++) {
if (trans3_1 <= a3.length)
if (trans3_0 <= trans3_1)
for (int i3 = 0; i3 < 1 && i3 < trans3_0; i3++) {
if (trans4_1 <= a4.length)
if (trans4_0 <= trans4_1)
for (int i4 = 0; i4 < 1 && i4 < trans4_0; i4++) {
if (trans5_0 <= trans5_1)
if (trans5_1 <= a5.length)
for (int i5 = 0; i5 < 1 && i5 < trans5_0; i5++) {
if (trans6_1 <= a6.length)
if (trans6_0 <= trans6_1)
for (int i6 = 0; i6 < 1 && i6 < trans6_0; i6++) {
if (trans7_0 <= trans7_1)
if (trans7_1 <= a7.length)
for (int i7 = 0; i7 < 1 && i7 < trans7_0; i7++) {
if (trans8_0 <= trans8_1)
if (trans8_1 <= a8.length)
for (int i8 = 0; i8 < 1 && i8 < trans8_0; i8++) {
if (trans9_0 <= trans9_1)
if (trans9_1 <= a9.length)
for (int i9 = 0; i9 < 1 && i9 < trans9_0; i9++) {
s += a0[i0];
s += a1[i1];
s += a2[i2];
s += a3[i3];
s += a4[i4];
s += a5[i5];
s += a6[i6];
s += a7[i7];
s += a8[i8];
s += a9[i9];
}
}
}
}
}
}
}
}
}
}
return s; }

@Benchmark public int bench_big_n10_multipleTrue_trans2_transrandomTrue() {
return big_n10_multipleTrue_trans2_transrandomTrue();
}

int big_n20_multipleTrue_trans2_transrandomTrue() {
int s = 0;
if (!(trans0.length >= 2)) return -1;
int trans0_0 = trans0[0];
int trans0_1 = trans0[1];
if (!(trans1.length >= 2)) return -1;
int trans1_0 = trans1[0];
int trans1_1 = trans1[1];
if (!(trans2.length >= 2)) return -1;
int trans2_0 = trans2[0];
int trans2_1 = trans2[1];
if (!(trans3.length >= 2)) return -1;
int trans3_0 = trans3[0];
int trans3_1 = trans3[1];
if (!(trans4.length >= 2)) return -1;
int trans4_0 = trans4[0];
int trans4_1 = trans4[1];
if (!(trans5.length >= 2)) return -1;
int trans5_0 = trans5[0];
int trans5_1 = trans5[1];
if (!(trans6.length >= 2)) return -1;
int trans6_0 = trans6[0];
int trans6_1 = trans6[1];
if (!(trans7.length >= 2)) return -1;
int trans7_0 = trans7[0];
int trans7_1 = trans7[1];
if (!(trans8.length >= 2)) return -1;
int trans8_0 = trans8[0];
int trans8_1 = trans8[1];
if (!(trans9.length >= 2)) return -1;
int trans9_0 = trans9[0];
int trans9_1 = trans9[1];
if (!(trans10.length >= 2)) return -1;
int trans10_0 = trans10[0];
int trans10_1 = trans10[1];
if (!(trans11.length >= 2)) return -1;
int trans11_0 = trans11[0];
int trans11_1 = trans11[1];
if (!(trans12.length >= 2)) return -1;
int trans12_0 = trans12[0];
int trans12_1 = trans12[1];
if (!(trans13.length >= 2)) return -1;
int trans13_0 = trans13[0];
int trans13_1 = trans13[1];
if (!(trans14.length >= 2)) return -1;
int trans14_0 = trans14[0];
int trans14_1 = trans14[1];
if (!(trans15.length >= 2)) return -1;
int trans15_0 = trans15[0];
int trans15_1 = trans15[1];
if (!(trans16.length >= 2)) return -1;
int trans16_0 = trans16[0];
int trans16_1 = trans16[1];
if (!(trans17.length >= 2)) return -1;
int trans17_0 = trans17[0];
int trans17_1 = trans17[1];
if (!(trans18.length >= 2)) return -1;
int trans18_0 = trans18[0];
int trans18_1 = trans18[1];
if (!(trans19.length >= 2)) return -1;
int trans19_0 = trans19[0];
int trans19_1 = trans19[1];
if (trans0_1 <= a0.length)
if (trans0_0 <= trans0_1)
for (int i0 = 0; i0 < 1 && i0 < trans0_0; i0++) {
if (trans1_0 <= trans1_1)
if (trans1_1 <= a1.length)
for (int i1 = 0; i1 < 1 && i1 < trans1_0; i1++) {
if (trans2_1 <= a2.length)
if (trans2_0 <= trans2_1)
for (int i2 = 0; i2 < 1 && i2 < trans2_0; i2++) {
if (trans3_1 <= a3.length)
if (trans3_0 <= trans3_1)
for (int i3 = 0; i3 < 1 && i3 < trans3_0; i3++) {
if (trans4_1 <= a4.length)
if (trans4_0 <= trans4_1)
for (int i4 = 0; i4 < 1 && i4 < trans4_0; i4++) {
if (trans5_0 <= trans5_1)
if (trans5_1 <= a5.length)
for (int i5 = 0; i5 < 1 && i5 < trans5_0; i5++) {
if (trans6_1 <= a6.length)
if (trans6_0 <= trans6_1)
for (int i6 = 0; i6 < 1 && i6 < trans6_0; i6++) {
if (trans7_0 <= trans7_1)
if (trans7_1 <= a7.length)
for (int i7 = 0; i7 < 1 && i7 < trans7_0; i7++) {
if (trans8_0 <= trans8_1)
if (trans8_1 <= a8.length)
for (int i8 = 0; i8 < 1 && i8 < trans8_0; i8++) {
if (trans9_0 <= trans9_1)
if (trans9_1 <= a9.length)
for (int i9 = 0; i9 < 1 && i9 < trans9_0; i9++) {
if (trans10_0 <= trans10_1)
if (trans10_1 <= a10.length)
for (int i10 = 0; i10 < 1 && i10 < trans10_0; i10++) {
if (trans11_0 <= trans11_1)
if (trans11_1 <= a11.length)
for (int i11 = 0; i11 < 1 && i11 < trans11_0; i11++) {
if (trans12_1 <= a12.length)
if (trans12_0 <= trans12_1)
for (int i12 = 0; i12 < 1 && i12 < trans12_0; i12++) {
if (trans13_0 <= trans13_1)
if (trans13_1 <= a13.length)
for (int i13 = 0; i13 < 1 && i13 < trans13_0; i13++) {
if (trans14_0 <= trans14_1)
if (trans14_1 <= a14.length)
for (int i14 = 0; i14 < 1 && i14 < trans14_0; i14++) {
if (trans15_0 <= trans15_1)
if (trans15_1 <= a15.length)
for (int i15 = 0; i15 < 1 && i15 < trans15_0; i15++) {
if (trans16_1 <= a16.length)
if (trans16_0 <= trans16_1)
for (int i16 = 0; i16 < 1 && i16 < trans16_0; i16++) {
if (trans17_0 <= trans17_1)
if (trans17_1 <= a17.length)
for (int i17 = 0; i17 < 1 && i17 < trans17_0; i17++) {
if (trans18_1 <= a18.length)
if (trans18_0 <= trans18_1)
for (int i18 = 0; i18 < 1 && i18 < trans18_0; i18++) {
if (trans19_1 <= a19.length)
if (trans19_0 <= trans19_1)
for (int i19 = 0; i19 < 1 && i19 < trans19_0; i19++) {
s += a0[i0];
s += a1[i1];
s += a2[i2];
s += a3[i3];
s += a4[i4];
s += a5[i5];
s += a6[i6];
s += a7[i7];
s += a8[i8];
s += a9[i9];
s += a10[i10];
s += a11[i11];
s += a12[i12];
s += a13[i13];
s += a14[i14];
s += a15[i15];
s += a16[i16];
s += a17[i17];
s += a18[i18];
s += a19[i19];
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
return s; }

@Benchmark public int bench_big_n20_multipleTrue_trans2_transrandomTrue() {
return big_n20_multipleTrue_trans2_transrandomTrue();
}

int big_n50_multipleTrue_trans2_transrandomTrue() {
int s = 0;
if (!(trans0.length >= 2)) return -1;
int trans0_0 = trans0[0];
int trans0_1 = trans0[1];
if (!(trans1.length >= 2)) return -1;
int trans1_0 = trans1[0];
int trans1_1 = trans1[1];
if (!(trans2.length >= 2)) return -1;
int trans2_0 = trans2[0];
int trans2_1 = trans2[1];
if (!(trans3.length >= 2)) return -1;
int trans3_0 = trans3[0];
int trans3_1 = trans3[1];
if (!(trans4.length >= 2)) return -1;
int trans4_0 = trans4[0];
int trans4_1 = trans4[1];
if (!(trans5.length >= 2)) return -1;
int trans5_0 = trans5[0];
int trans5_1 = trans5[1];
if (!(trans6.length >= 2)) return -1;
int trans6_0 = trans6[0];
int trans6_1 = trans6[1];
if (!(trans7.length >= 2)) return -1;
int trans7_0 = trans7[0];
int trans7_1 = trans7[1];
if (!(trans8.length >= 2)) return -1;
int trans8_0 = trans8[0];
int trans8_1 = trans8[1];
if (!(trans9.length >= 2)) return -1;
int trans9_0 = trans9[0];
int trans9_1 = trans9[1];
if (!(trans10.length >= 2)) return -1;
int trans10_0 = trans10[0];
int trans10_1 = trans10[1];
if (!(trans11.length >= 2)) return -1;
int trans11_0 = trans11[0];
int trans11_1 = trans11[1];
if (!(trans12.length >= 2)) return -1;
int trans12_0 = trans12[0];
int trans12_1 = trans12[1];
if (!(trans13.length >= 2)) return -1;
int trans13_0 = trans13[0];
int trans13_1 = trans13[1];
if (!(trans14.length >= 2)) return -1;
int trans14_0 = trans14[0];
int trans14_1 = trans14[1];
if (!(trans15.length >= 2)) return -1;
int trans15_0 = trans15[0];
int trans15_1 = trans15[1];
if (!(trans16.length >= 2)) return -1;
int trans16_0 = trans16[0];
int trans16_1 = trans16[1];
if (!(trans17.length >= 2)) return -1;
int trans17_0 = trans17[0];
int trans17_1 = trans17[1];
if (!(trans18.length >= 2)) return -1;
int trans18_0 = trans18[0];
int trans18_1 = trans18[1];
if (!(trans19.length >= 2)) return -1;
int trans19_0 = trans19[0];
int trans19_1 = trans19[1];
if (!(trans20.length >= 2)) return -1;
int trans20_0 = trans20[0];
int trans20_1 = trans20[1];
if (!(trans21.length >= 2)) return -1;
int trans21_0 = trans21[0];
int trans21_1 = trans21[1];
if (!(trans22.length >= 2)) return -1;
int trans22_0 = trans22[0];
int trans22_1 = trans22[1];
if (!(trans23.length >= 2)) return -1;
int trans23_0 = trans23[0];
int trans23_1 = trans23[1];
if (!(trans24.length >= 2)) return -1;
int trans24_0 = trans24[0];
int trans24_1 = trans24[1];
if (!(trans25.length >= 2)) return -1;
int trans25_0 = trans25[0];
int trans25_1 = trans25[1];
if (!(trans26.length >= 2)) return -1;
int trans26_0 = trans26[0];
int trans26_1 = trans26[1];
if (!(trans27.length >= 2)) return -1;
int trans27_0 = trans27[0];
int trans27_1 = trans27[1];
if (!(trans28.length >= 2)) return -1;
int trans28_0 = trans28[0];
int trans28_1 = trans28[1];
if (!(trans29.length >= 2)) return -1;
int trans29_0 = trans29[0];
int trans29_1 = trans29[1];
if (!(trans30.length >= 2)) return -1;
int trans30_0 = trans30[0];
int trans30_1 = trans30[1];
if (!(trans31.length >= 2)) return -1;
int trans31_0 = trans31[0];
int trans31_1 = trans31[1];
if (!(trans32.length >= 2)) return -1;
int trans32_0 = trans32[0];
int trans32_1 = trans32[1];
if (!(trans33.length >= 2)) return -1;
int trans33_0 = trans33[0];
int trans33_1 = trans33[1];
if (!(trans34.length >= 2)) return -1;
int trans34_0 = trans34[0];
int trans34_1 = trans34[1];
if (!(trans35.length >= 2)) return -1;
int trans35_0 = trans35[0];
int trans35_1 = trans35[1];
if (!(trans36.length >= 2)) return -1;
int trans36_0 = trans36[0];
int trans36_1 = trans36[1];
if (!(trans37.length >= 2)) return -1;
int trans37_0 = trans37[0];
int trans37_1 = trans37[1];
if (!(trans38.length >= 2)) return -1;
int trans38_0 = trans38[0];
int trans38_1 = trans38[1];
if (!(trans39.length >= 2)) return -1;
int trans39_0 = trans39[0];
int trans39_1 = trans39[1];
if (!(trans40.length >= 2)) return -1;
int trans40_0 = trans40[0];
int trans40_1 = trans40[1];
if (!(trans41.length >= 2)) return -1;
int trans41_0 = trans41[0];
int trans41_1 = trans41[1];
if (!(trans42.length >= 2)) return -1;
int trans42_0 = trans42[0];
int trans42_1 = trans42[1];
if (!(trans43.length >= 2)) return -1;
int trans43_0 = trans43[0];
int trans43_1 = trans43[1];
if (!(trans44.length >= 2)) return -1;
int trans44_0 = trans44[0];
int trans44_1 = trans44[1];
if (!(trans45.length >= 2)) return -1;
int trans45_0 = trans45[0];
int trans45_1 = trans45[1];
if (!(trans46.length >= 2)) return -1;
int trans46_0 = trans46[0];
int trans46_1 = trans46[1];
if (!(trans47.length >= 2)) return -1;
int trans47_0 = trans47[0];
int trans47_1 = trans47[1];
if (!(trans48.length >= 2)) return -1;
int trans48_0 = trans48[0];
int trans48_1 = trans48[1];
if (!(trans49.length >= 2)) return -1;
int trans49_0 = trans49[0];
int trans49_1 = trans49[1];
if (trans0_1 <= a0.length)
if (trans0_0 <= trans0_1)
for (int i0 = 0; i0 < 1 && i0 < trans0_0; i0++) {
if (trans1_0 <= trans1_1)
if (trans1_1 <= a1.length)
for (int i1 = 0; i1 < 1 && i1 < trans1_0; i1++) {
if (trans2_1 <= a2.length)
if (trans2_0 <= trans2_1)
for (int i2 = 0; i2 < 1 && i2 < trans2_0; i2++) {
if (trans3_1 <= a3.length)
if (trans3_0 <= trans3_1)
for (int i3 = 0; i3 < 1 && i3 < trans3_0; i3++) {
if (trans4_1 <= a4.length)
if (trans4_0 <= trans4_1)
for (int i4 = 0; i4 < 1 && i4 < trans4_0; i4++) {
if (trans5_0 <= trans5_1)
if (trans5_1 <= a5.length)
for (int i5 = 0; i5 < 1 && i5 < trans5_0; i5++) {
if (trans6_1 <= a6.length)
if (trans6_0 <= trans6_1)
for (int i6 = 0; i6 < 1 && i6 < trans6_0; i6++) {
if (trans7_0 <= trans7_1)
if (trans7_1 <= a7.length)
for (int i7 = 0; i7 < 1 && i7 < trans7_0; i7++) {
if (trans8_0 <= trans8_1)
if (trans8_1 <= a8.length)
for (int i8 = 0; i8 < 1 && i8 < trans8_0; i8++) {
if (trans9_0 <= trans9_1)
if (trans9_1 <= a9.length)
for (int i9 = 0; i9 < 1 && i9 < trans9_0; i9++) {
if (trans10_0 <= trans10_1)
if (trans10_1 <= a10.length)
for (int i10 = 0; i10 < 1 && i10 < trans10_0; i10++) {
if (trans11_0 <= trans11_1)
if (trans11_1 <= a11.length)
for (int i11 = 0; i11 < 1 && i11 < trans11_0; i11++) {
if (trans12_1 <= a12.length)
if (trans12_0 <= trans12_1)
for (int i12 = 0; i12 < 1 && i12 < trans12_0; i12++) {
if (trans13_0 <= trans13_1)
if (trans13_1 <= a13.length)
for (int i13 = 0; i13 < 1 && i13 < trans13_0; i13++) {
if (trans14_0 <= trans14_1)
if (trans14_1 <= a14.length)
for (int i14 = 0; i14 < 1 && i14 < trans14_0; i14++) {
if (trans15_0 <= trans15_1)
if (trans15_1 <= a15.length)
for (int i15 = 0; i15 < 1 && i15 < trans15_0; i15++) {
if (trans16_1 <= a16.length)
if (trans16_0 <= trans16_1)
for (int i16 = 0; i16 < 1 && i16 < trans16_0; i16++) {
if (trans17_0 <= trans17_1)
if (trans17_1 <= a17.length)
for (int i17 = 0; i17 < 1 && i17 < trans17_0; i17++) {
if (trans18_1 <= a18.length)
if (trans18_0 <= trans18_1)
for (int i18 = 0; i18 < 1 && i18 < trans18_0; i18++) {
if (trans19_1 <= a19.length)
if (trans19_0 <= trans19_1)
for (int i19 = 0; i19 < 1 && i19 < trans19_0; i19++) {
if (trans20_0 <= trans20_1)
if (trans20_1 <= a20.length)
for (int i20 = 0; i20 < 1 && i20 < trans20_0; i20++) {
if (trans21_0 <= trans21_1)
if (trans21_1 <= a21.length)
for (int i21 = 0; i21 < 1 && i21 < trans21_0; i21++) {
if (trans22_0 <= trans22_1)
if (trans22_1 <= a22.length)
for (int i22 = 0; i22 < 1 && i22 < trans22_0; i22++) {
if (trans23_0 <= trans23_1)
if (trans23_1 <= a23.length)
for (int i23 = 0; i23 < 1 && i23 < trans23_0; i23++) {
if (trans24_0 <= trans24_1)
if (trans24_1 <= a24.length)
for (int i24 = 0; i24 < 1 && i24 < trans24_0; i24++) {
if (trans25_1 <= a25.length)
if (trans25_0 <= trans25_1)
for (int i25 = 0; i25 < 1 && i25 < trans25_0; i25++) {
if (trans26_0 <= trans26_1)
if (trans26_1 <= a26.length)
for (int i26 = 0; i26 < 1 && i26 < trans26_0; i26++) {
if (trans27_1 <= a27.length)
if (trans27_0 <= trans27_1)
for (int i27 = 0; i27 < 1 && i27 < trans27_0; i27++) {
if (trans28_1 <= a28.length)
if (trans28_0 <= trans28_1)
for (int i28 = 0; i28 < 1 && i28 < trans28_0; i28++) {
if (trans29_0 <= trans29_1)
if (trans29_1 <= a29.length)
for (int i29 = 0; i29 < 1 && i29 < trans29_0; i29++) {
if (trans30_0 <= trans30_1)
if (trans30_1 <= a30.length)
for (int i30 = 0; i30 < 1 && i30 < trans30_0; i30++) {
if (trans31_0 <= trans31_1)
if (trans31_1 <= a31.length)
for (int i31 = 0; i31 < 1 && i31 < trans31_0; i31++) {
if (trans32_0 <= trans32_1)
if (trans32_1 <= a32.length)
for (int i32 = 0; i32 < 1 && i32 < trans32_0; i32++) {
if (trans33_1 <= a33.length)
if (trans33_0 <= trans33_1)
for (int i33 = 0; i33 < 1 && i33 < trans33_0; i33++) {
if (trans34_1 <= a34.length)
if (trans34_0 <= trans34_1)
for (int i34 = 0; i34 < 1 && i34 < trans34_0; i34++) {
if (trans35_1 <= a35.length)
if (trans35_0 <= trans35_1)
for (int i35 = 0; i35 < 1 && i35 < trans35_0; i35++) {
if (trans36_1 <= a36.length)
if (trans36_0 <= trans36_1)
for (int i36 = 0; i36 < 1 && i36 < trans36_0; i36++) {
if (trans37_0 <= trans37_1)
if (trans37_1 <= a37.length)
for (int i37 = 0; i37 < 1 && i37 < trans37_0; i37++) {
if (trans38_1 <= a38.length)
if (trans38_0 <= trans38_1)
for (int i38 = 0; i38 < 1 && i38 < trans38_0; i38++) {
if (trans39_0 <= trans39_1)
if (trans39_1 <= a39.length)
for (int i39 = 0; i39 < 1 && i39 < trans39_0; i39++) {
if (trans40_0 <= trans40_1)
if (trans40_1 <= a40.length)
for (int i40 = 0; i40 < 1 && i40 < trans40_0; i40++) {
if (trans41_1 <= a41.length)
if (trans41_0 <= trans41_1)
for (int i41 = 0; i41 < 1 && i41 < trans41_0; i41++) {
if (trans42_0 <= trans42_1)
if (trans42_1 <= a42.length)
for (int i42 = 0; i42 < 1 && i42 < trans42_0; i42++) {
if (trans43_1 <= a43.length)
if (trans43_0 <= trans43_1)
for (int i43 = 0; i43 < 1 && i43 < trans43_0; i43++) {
if (trans44_0 <= trans44_1)
if (trans44_1 <= a44.length)
for (int i44 = 0; i44 < 1 && i44 < trans44_0; i44++) {
if (trans45_0 <= trans45_1)
if (trans45_1 <= a45.length)
for (int i45 = 0; i45 < 1 && i45 < trans45_0; i45++) {
if (trans46_1 <= a46.length)
if (trans46_0 <= trans46_1)
for (int i46 = 0; i46 < 1 && i46 < trans46_0; i46++) {
if (trans47_1 <= a47.length)
if (trans47_0 <= trans47_1)
for (int i47 = 0; i47 < 1 && i47 < trans47_0; i47++) {
if (trans48_1 <= a48.length)
if (trans48_0 <= trans48_1)
for (int i48 = 0; i48 < 1 && i48 < trans48_0; i48++) {
if (trans49_0 <= trans49_1)
if (trans49_1 <= a49.length)
for (int i49 = 0; i49 < 1 && i49 < trans49_0; i49++) {
s += a0[i0];
s += a1[i1];
s += a2[i2];
s += a3[i3];
s += a4[i4];
s += a5[i5];
s += a6[i6];
s += a7[i7];
s += a8[i8];
s += a9[i9];
s += a10[i10];
s += a11[i11];
s += a12[i12];
s += a13[i13];
s += a14[i14];
s += a15[i15];
s += a16[i16];
s += a17[i17];
s += a18[i18];
s += a19[i19];
s += a20[i20];
s += a21[i21];
s += a22[i22];
s += a23[i23];
s += a24[i24];
s += a25[i25];
s += a26[i26];
s += a27[i27];
s += a28[i28];
s += a29[i29];
s += a30[i30];
s += a31[i31];
s += a32[i32];
s += a33[i33];
s += a34[i34];
s += a35[i35];
s += a36[i36];
s += a37[i37];
s += a38[i38];
s += a39[i39];
s += a40[i40];
s += a41[i41];
s += a42[i42];
s += a43[i43];
s += a44[i44];
s += a45[i45];
s += a46[i46];
s += a47[i47];
s += a48[i48];
s += a49[i49];
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
return s; }

@Benchmark public int bench_big_n50_multipleTrue_trans2_transrandomTrue() {
return big_n50_multipleTrue_trans2_transrandomTrue();
}

int big_n100_multipleTrue_trans2_transrandomTrue() {
int s = 0;
if (!(trans0.length >= 2)) return -1;
int trans0_0 = trans0[0];
int trans0_1 = trans0[1];
if (!(trans1.length >= 2)) return -1;
int trans1_0 = trans1[0];
int trans1_1 = trans1[1];
if (!(trans2.length >= 2)) return -1;
int trans2_0 = trans2[0];
int trans2_1 = trans2[1];
if (!(trans3.length >= 2)) return -1;
int trans3_0 = trans3[0];
int trans3_1 = trans3[1];
if (!(trans4.length >= 2)) return -1;
int trans4_0 = trans4[0];
int trans4_1 = trans4[1];
if (!(trans5.length >= 2)) return -1;
int trans5_0 = trans5[0];
int trans5_1 = trans5[1];
if (!(trans6.length >= 2)) return -1;
int trans6_0 = trans6[0];
int trans6_1 = trans6[1];
if (!(trans7.length >= 2)) return -1;
int trans7_0 = trans7[0];
int trans7_1 = trans7[1];
if (!(trans8.length >= 2)) return -1;
int trans8_0 = trans8[0];
int trans8_1 = trans8[1];
if (!(trans9.length >= 2)) return -1;
int trans9_0 = trans9[0];
int trans9_1 = trans9[1];
if (!(trans10.length >= 2)) return -1;
int trans10_0 = trans10[0];
int trans10_1 = trans10[1];
if (!(trans11.length >= 2)) return -1;
int trans11_0 = trans11[0];
int trans11_1 = trans11[1];
if (!(trans12.length >= 2)) return -1;
int trans12_0 = trans12[0];
int trans12_1 = trans12[1];
if (!(trans13.length >= 2)) return -1;
int trans13_0 = trans13[0];
int trans13_1 = trans13[1];
if (!(trans14.length >= 2)) return -1;
int trans14_0 = trans14[0];
int trans14_1 = trans14[1];
if (!(trans15.length >= 2)) return -1;
int trans15_0 = trans15[0];
int trans15_1 = trans15[1];
if (!(trans16.length >= 2)) return -1;
int trans16_0 = trans16[0];
int trans16_1 = trans16[1];
if (!(trans17.length >= 2)) return -1;
int trans17_0 = trans17[0];
int trans17_1 = trans17[1];
if (!(trans18.length >= 2)) return -1;
int trans18_0 = trans18[0];
int trans18_1 = trans18[1];
if (!(trans19.length >= 2)) return -1;
int trans19_0 = trans19[0];
int trans19_1 = trans19[1];
if (!(trans20.length >= 2)) return -1;
int trans20_0 = trans20[0];
int trans20_1 = trans20[1];
if (!(trans21.length >= 2)) return -1;
int trans21_0 = trans21[0];
int trans21_1 = trans21[1];
if (!(trans22.length >= 2)) return -1;
int trans22_0 = trans22[0];
int trans22_1 = trans22[1];
if (!(trans23.length >= 2)) return -1;
int trans23_0 = trans23[0];
int trans23_1 = trans23[1];
if (!(trans24.length >= 2)) return -1;
int trans24_0 = trans24[0];
int trans24_1 = trans24[1];
if (!(trans25.length >= 2)) return -1;
int trans25_0 = trans25[0];
int trans25_1 = trans25[1];
if (!(trans26.length >= 2)) return -1;
int trans26_0 = trans26[0];
int trans26_1 = trans26[1];
if (!(trans27.length >= 2)) return -1;
int trans27_0 = trans27[0];
int trans27_1 = trans27[1];
if (!(trans28.length >= 2)) return -1;
int trans28_0 = trans28[0];
int trans28_1 = trans28[1];
if (!(trans29.length >= 2)) return -1;
int trans29_0 = trans29[0];
int trans29_1 = trans29[1];
if (!(trans30.length >= 2)) return -1;
int trans30_0 = trans30[0];
int trans30_1 = trans30[1];
if (!(trans31.length >= 2)) return -1;
int trans31_0 = trans31[0];
int trans31_1 = trans31[1];
if (!(trans32.length >= 2)) return -1;
int trans32_0 = trans32[0];
int trans32_1 = trans32[1];
if (!(trans33.length >= 2)) return -1;
int trans33_0 = trans33[0];
int trans33_1 = trans33[1];
if (!(trans34.length >= 2)) return -1;
int trans34_0 = trans34[0];
int trans34_1 = trans34[1];
if (!(trans35.length >= 2)) return -1;
int trans35_0 = trans35[0];
int trans35_1 = trans35[1];
if (!(trans36.length >= 2)) return -1;
int trans36_0 = trans36[0];
int trans36_1 = trans36[1];
if (!(trans37.length >= 2)) return -1;
int trans37_0 = trans37[0];
int trans37_1 = trans37[1];
if (!(trans38.length >= 2)) return -1;
int trans38_0 = trans38[0];
int trans38_1 = trans38[1];
if (!(trans39.length >= 2)) return -1;
int trans39_0 = trans39[0];
int trans39_1 = trans39[1];
if (!(trans40.length >= 2)) return -1;
int trans40_0 = trans40[0];
int trans40_1 = trans40[1];
if (!(trans41.length >= 2)) return -1;
int trans41_0 = trans41[0];
int trans41_1 = trans41[1];
if (!(trans42.length >= 2)) return -1;
int trans42_0 = trans42[0];
int trans42_1 = trans42[1];
if (!(trans43.length >= 2)) return -1;
int trans43_0 = trans43[0];
int trans43_1 = trans43[1];
if (!(trans44.length >= 2)) return -1;
int trans44_0 = trans44[0];
int trans44_1 = trans44[1];
if (!(trans45.length >= 2)) return -1;
int trans45_0 = trans45[0];
int trans45_1 = trans45[1];
if (!(trans46.length >= 2)) return -1;
int trans46_0 = trans46[0];
int trans46_1 = trans46[1];
if (!(trans47.length >= 2)) return -1;
int trans47_0 = trans47[0];
int trans47_1 = trans47[1];
if (!(trans48.length >= 2)) return -1;
int trans48_0 = trans48[0];
int trans48_1 = trans48[1];
if (!(trans49.length >= 2)) return -1;
int trans49_0 = trans49[0];
int trans49_1 = trans49[1];
if (!(trans50.length >= 2)) return -1;
int trans50_0 = trans50[0];
int trans50_1 = trans50[1];
if (!(trans51.length >= 2)) return -1;
int trans51_0 = trans51[0];
int trans51_1 = trans51[1];
if (!(trans52.length >= 2)) return -1;
int trans52_0 = trans52[0];
int trans52_1 = trans52[1];
if (!(trans53.length >= 2)) return -1;
int trans53_0 = trans53[0];
int trans53_1 = trans53[1];
if (!(trans54.length >= 2)) return -1;
int trans54_0 = trans54[0];
int trans54_1 = trans54[1];
if (!(trans55.length >= 2)) return -1;
int trans55_0 = trans55[0];
int trans55_1 = trans55[1];
if (!(trans56.length >= 2)) return -1;
int trans56_0 = trans56[0];
int trans56_1 = trans56[1];
if (!(trans57.length >= 2)) return -1;
int trans57_0 = trans57[0];
int trans57_1 = trans57[1];
if (!(trans58.length >= 2)) return -1;
int trans58_0 = trans58[0];
int trans58_1 = trans58[1];
if (!(trans59.length >= 2)) return -1;
int trans59_0 = trans59[0];
int trans59_1 = trans59[1];
if (!(trans60.length >= 2)) return -1;
int trans60_0 = trans60[0];
int trans60_1 = trans60[1];
if (!(trans61.length >= 2)) return -1;
int trans61_0 = trans61[0];
int trans61_1 = trans61[1];
if (!(trans62.length >= 2)) return -1;
int trans62_0 = trans62[0];
int trans62_1 = trans62[1];
if (!(trans63.length >= 2)) return -1;
int trans63_0 = trans63[0];
int trans63_1 = trans63[1];
if (!(trans64.length >= 2)) return -1;
int trans64_0 = trans64[0];
int trans64_1 = trans64[1];
if (!(trans65.length >= 2)) return -1;
int trans65_0 = trans65[0];
int trans65_1 = trans65[1];
if (!(trans66.length >= 2)) return -1;
int trans66_0 = trans66[0];
int trans66_1 = trans66[1];
if (!(trans67.length >= 2)) return -1;
int trans67_0 = trans67[0];
int trans67_1 = trans67[1];
if (!(trans68.length >= 2)) return -1;
int trans68_0 = trans68[0];
int trans68_1 = trans68[1];
if (!(trans69.length >= 2)) return -1;
int trans69_0 = trans69[0];
int trans69_1 = trans69[1];
if (!(trans70.length >= 2)) return -1;
int trans70_0 = trans70[0];
int trans70_1 = trans70[1];
if (!(trans71.length >= 2)) return -1;
int trans71_0 = trans71[0];
int trans71_1 = trans71[1];
if (!(trans72.length >= 2)) return -1;
int trans72_0 = trans72[0];
int trans72_1 = trans72[1];
if (!(trans73.length >= 2)) return -1;
int trans73_0 = trans73[0];
int trans73_1 = trans73[1];
if (!(trans74.length >= 2)) return -1;
int trans74_0 = trans74[0];
int trans74_1 = trans74[1];
if (!(trans75.length >= 2)) return -1;
int trans75_0 = trans75[0];
int trans75_1 = trans75[1];
if (!(trans76.length >= 2)) return -1;
int trans76_0 = trans76[0];
int trans76_1 = trans76[1];
if (!(trans77.length >= 2)) return -1;
int trans77_0 = trans77[0];
int trans77_1 = trans77[1];
if (!(trans78.length >= 2)) return -1;
int trans78_0 = trans78[0];
int trans78_1 = trans78[1];
if (!(trans79.length >= 2)) return -1;
int trans79_0 = trans79[0];
int trans79_1 = trans79[1];
if (!(trans80.length >= 2)) return -1;
int trans80_0 = trans80[0];
int trans80_1 = trans80[1];
if (!(trans81.length >= 2)) return -1;
int trans81_0 = trans81[0];
int trans81_1 = trans81[1];
if (!(trans82.length >= 2)) return -1;
int trans82_0 = trans82[0];
int trans82_1 = trans82[1];
if (!(trans83.length >= 2)) return -1;
int trans83_0 = trans83[0];
int trans83_1 = trans83[1];
if (!(trans84.length >= 2)) return -1;
int trans84_0 = trans84[0];
int trans84_1 = trans84[1];
if (!(trans85.length >= 2)) return -1;
int trans85_0 = trans85[0];
int trans85_1 = trans85[1];
if (!(trans86.length >= 2)) return -1;
int trans86_0 = trans86[0];
int trans86_1 = trans86[1];
if (!(trans87.length >= 2)) return -1;
int trans87_0 = trans87[0];
int trans87_1 = trans87[1];
if (!(trans88.length >= 2)) return -1;
int trans88_0 = trans88[0];
int trans88_1 = trans88[1];
if (!(trans89.length >= 2)) return -1;
int trans89_0 = trans89[0];
int trans89_1 = trans89[1];
if (!(trans90.length >= 2)) return -1;
int trans90_0 = trans90[0];
int trans90_1 = trans90[1];
if (!(trans91.length >= 2)) return -1;
int trans91_0 = trans91[0];
int trans91_1 = trans91[1];
if (!(trans92.length >= 2)) return -1;
int trans92_0 = trans92[0];
int trans92_1 = trans92[1];
if (!(trans93.length >= 2)) return -1;
int trans93_0 = trans93[0];
int trans93_1 = trans93[1];
if (!(trans94.length >= 2)) return -1;
int trans94_0 = trans94[0];
int trans94_1 = trans94[1];
if (!(trans95.length >= 2)) return -1;
int trans95_0 = trans95[0];
int trans95_1 = trans95[1];
if (!(trans96.length >= 2)) return -1;
int trans96_0 = trans96[0];
int trans96_1 = trans96[1];
if (!(trans97.length >= 2)) return -1;
int trans97_0 = trans97[0];
int trans97_1 = trans97[1];
if (!(trans98.length >= 2)) return -1;
int trans98_0 = trans98[0];
int trans98_1 = trans98[1];
if (!(trans99.length >= 2)) return -1;
int trans99_0 = trans99[0];
int trans99_1 = trans99[1];
if (trans0_1 <= a0.length)
if (trans0_0 <= trans0_1)
for (int i0 = 0; i0 < 1 && i0 < trans0_0; i0++) {
if (trans1_0 <= trans1_1)
if (trans1_1 <= a1.length)
for (int i1 = 0; i1 < 1 && i1 < trans1_0; i1++) {
if (trans2_1 <= a2.length)
if (trans2_0 <= trans2_1)
for (int i2 = 0; i2 < 1 && i2 < trans2_0; i2++) {
if (trans3_1 <= a3.length)
if (trans3_0 <= trans3_1)
for (int i3 = 0; i3 < 1 && i3 < trans3_0; i3++) {
if (trans4_1 <= a4.length)
if (trans4_0 <= trans4_1)
for (int i4 = 0; i4 < 1 && i4 < trans4_0; i4++) {
if (trans5_0 <= trans5_1)
if (trans5_1 <= a5.length)
for (int i5 = 0; i5 < 1 && i5 < trans5_0; i5++) {
if (trans6_1 <= a6.length)
if (trans6_0 <= trans6_1)
for (int i6 = 0; i6 < 1 && i6 < trans6_0; i6++) {
if (trans7_0 <= trans7_1)
if (trans7_1 <= a7.length)
for (int i7 = 0; i7 < 1 && i7 < trans7_0; i7++) {
if (trans8_0 <= trans8_1)
if (trans8_1 <= a8.length)
for (int i8 = 0; i8 < 1 && i8 < trans8_0; i8++) {
if (trans9_0 <= trans9_1)
if (trans9_1 <= a9.length)
for (int i9 = 0; i9 < 1 && i9 < trans9_0; i9++) {
if (trans10_0 <= trans10_1)
if (trans10_1 <= a10.length)
for (int i10 = 0; i10 < 1 && i10 < trans10_0; i10++) {
if (trans11_0 <= trans11_1)
if (trans11_1 <= a11.length)
for (int i11 = 0; i11 < 1 && i11 < trans11_0; i11++) {
if (trans12_1 <= a12.length)
if (trans12_0 <= trans12_1)
for (int i12 = 0; i12 < 1 && i12 < trans12_0; i12++) {
if (trans13_0 <= trans13_1)
if (trans13_1 <= a13.length)
for (int i13 = 0; i13 < 1 && i13 < trans13_0; i13++) {
if (trans14_0 <= trans14_1)
if (trans14_1 <= a14.length)
for (int i14 = 0; i14 < 1 && i14 < trans14_0; i14++) {
if (trans15_0 <= trans15_1)
if (trans15_1 <= a15.length)
for (int i15 = 0; i15 < 1 && i15 < trans15_0; i15++) {
if (trans16_1 <= a16.length)
if (trans16_0 <= trans16_1)
for (int i16 = 0; i16 < 1 && i16 < trans16_0; i16++) {
if (trans17_0 <= trans17_1)
if (trans17_1 <= a17.length)
for (int i17 = 0; i17 < 1 && i17 < trans17_0; i17++) {
if (trans18_1 <= a18.length)
if (trans18_0 <= trans18_1)
for (int i18 = 0; i18 < 1 && i18 < trans18_0; i18++) {
if (trans19_1 <= a19.length)
if (trans19_0 <= trans19_1)
for (int i19 = 0; i19 < 1 && i19 < trans19_0; i19++) {
if (trans20_0 <= trans20_1)
if (trans20_1 <= a20.length)
for (int i20 = 0; i20 < 1 && i20 < trans20_0; i20++) {
if (trans21_0 <= trans21_1)
if (trans21_1 <= a21.length)
for (int i21 = 0; i21 < 1 && i21 < trans21_0; i21++) {
if (trans22_0 <= trans22_1)
if (trans22_1 <= a22.length)
for (int i22 = 0; i22 < 1 && i22 < trans22_0; i22++) {
if (trans23_0 <= trans23_1)
if (trans23_1 <= a23.length)
for (int i23 = 0; i23 < 1 && i23 < trans23_0; i23++) {
if (trans24_0 <= trans24_1)
if (trans24_1 <= a24.length)
for (int i24 = 0; i24 < 1 && i24 < trans24_0; i24++) {
if (trans25_1 <= a25.length)
if (trans25_0 <= trans25_1)
for (int i25 = 0; i25 < 1 && i25 < trans25_0; i25++) {
if (trans26_0 <= trans26_1)
if (trans26_1 <= a26.length)
for (int i26 = 0; i26 < 1 && i26 < trans26_0; i26++) {
if (trans27_1 <= a27.length)
if (trans27_0 <= trans27_1)
for (int i27 = 0; i27 < 1 && i27 < trans27_0; i27++) {
if (trans28_1 <= a28.length)
if (trans28_0 <= trans28_1)
for (int i28 = 0; i28 < 1 && i28 < trans28_0; i28++) {
if (trans29_0 <= trans29_1)
if (trans29_1 <= a29.length)
for (int i29 = 0; i29 < 1 && i29 < trans29_0; i29++) {
if (trans30_0 <= trans30_1)
if (trans30_1 <= a30.length)
for (int i30 = 0; i30 < 1 && i30 < trans30_0; i30++) {
if (trans31_0 <= trans31_1)
if (trans31_1 <= a31.length)
for (int i31 = 0; i31 < 1 && i31 < trans31_0; i31++) {
if (trans32_0 <= trans32_1)
if (trans32_1 <= a32.length)
for (int i32 = 0; i32 < 1 && i32 < trans32_0; i32++) {
if (trans33_1 <= a33.length)
if (trans33_0 <= trans33_1)
for (int i33 = 0; i33 < 1 && i33 < trans33_0; i33++) {
if (trans34_1 <= a34.length)
if (trans34_0 <= trans34_1)
for (int i34 = 0; i34 < 1 && i34 < trans34_0; i34++) {
if (trans35_1 <= a35.length)
if (trans35_0 <= trans35_1)
for (int i35 = 0; i35 < 1 && i35 < trans35_0; i35++) {
if (trans36_1 <= a36.length)
if (trans36_0 <= trans36_1)
for (int i36 = 0; i36 < 1 && i36 < trans36_0; i36++) {
if (trans37_0 <= trans37_1)
if (trans37_1 <= a37.length)
for (int i37 = 0; i37 < 1 && i37 < trans37_0; i37++) {
if (trans38_1 <= a38.length)
if (trans38_0 <= trans38_1)
for (int i38 = 0; i38 < 1 && i38 < trans38_0; i38++) {
if (trans39_0 <= trans39_1)
if (trans39_1 <= a39.length)
for (int i39 = 0; i39 < 1 && i39 < trans39_0; i39++) {
if (trans40_0 <= trans40_1)
if (trans40_1 <= a40.length)
for (int i40 = 0; i40 < 1 && i40 < trans40_0; i40++) {
if (trans41_1 <= a41.length)
if (trans41_0 <= trans41_1)
for (int i41 = 0; i41 < 1 && i41 < trans41_0; i41++) {
if (trans42_0 <= trans42_1)
if (trans42_1 <= a42.length)
for (int i42 = 0; i42 < 1 && i42 < trans42_0; i42++) {
if (trans43_1 <= a43.length)
if (trans43_0 <= trans43_1)
for (int i43 = 0; i43 < 1 && i43 < trans43_0; i43++) {
if (trans44_0 <= trans44_1)
if (trans44_1 <= a44.length)
for (int i44 = 0; i44 < 1 && i44 < trans44_0; i44++) {
if (trans45_0 <= trans45_1)
if (trans45_1 <= a45.length)
for (int i45 = 0; i45 < 1 && i45 < trans45_0; i45++) {
if (trans46_1 <= a46.length)
if (trans46_0 <= trans46_1)
for (int i46 = 0; i46 < 1 && i46 < trans46_0; i46++) {
if (trans47_1 <= a47.length)
if (trans47_0 <= trans47_1)
for (int i47 = 0; i47 < 1 && i47 < trans47_0; i47++) {
if (trans48_1 <= a48.length)
if (trans48_0 <= trans48_1)
for (int i48 = 0; i48 < 1 && i48 < trans48_0; i48++) {
if (trans49_0 <= trans49_1)
if (trans49_1 <= a49.length)
for (int i49 = 0; i49 < 1 && i49 < trans49_0; i49++) {
if (trans50_1 <= a50.length)
if (trans50_0 <= trans50_1)
for (int i50 = 0; i50 < 1 && i50 < trans50_0; i50++) {
if (trans51_0 <= trans51_1)
if (trans51_1 <= a51.length)
for (int i51 = 0; i51 < 1 && i51 < trans51_0; i51++) {
if (trans52_1 <= a52.length)
if (trans52_0 <= trans52_1)
for (int i52 = 0; i52 < 1 && i52 < trans52_0; i52++) {
if (trans53_0 <= trans53_1)
if (trans53_1 <= a53.length)
for (int i53 = 0; i53 < 1 && i53 < trans53_0; i53++) {
if (trans54_0 <= trans54_1)
if (trans54_1 <= a54.length)
for (int i54 = 0; i54 < 1 && i54 < trans54_0; i54++) {
if (trans55_1 <= a55.length)
if (trans55_0 <= trans55_1)
for (int i55 = 0; i55 < 1 && i55 < trans55_0; i55++) {
if (trans56_0 <= trans56_1)
if (trans56_1 <= a56.length)
for (int i56 = 0; i56 < 1 && i56 < trans56_0; i56++) {
if (trans57_0 <= trans57_1)
if (trans57_1 <= a57.length)
for (int i57 = 0; i57 < 1 && i57 < trans57_0; i57++) {
if (trans58_0 <= trans58_1)
if (trans58_1 <= a58.length)
for (int i58 = 0; i58 < 1 && i58 < trans58_0; i58++) {
if (trans59_0 <= trans59_1)
if (trans59_1 <= a59.length)
for (int i59 = 0; i59 < 1 && i59 < trans59_0; i59++) {
if (trans60_0 <= trans60_1)
if (trans60_1 <= a60.length)
for (int i60 = 0; i60 < 1 && i60 < trans60_0; i60++) {
if (trans61_0 <= trans61_1)
if (trans61_1 <= a61.length)
for (int i61 = 0; i61 < 1 && i61 < trans61_0; i61++) {
if (trans62_1 <= a62.length)
if (trans62_0 <= trans62_1)
for (int i62 = 0; i62 < 1 && i62 < trans62_0; i62++) {
if (trans63_1 <= a63.length)
if (trans63_0 <= trans63_1)
for (int i63 = 0; i63 < 1 && i63 < trans63_0; i63++) {
if (trans64_1 <= a64.length)
if (trans64_0 <= trans64_1)
for (int i64 = 0; i64 < 1 && i64 < trans64_0; i64++) {
if (trans65_0 <= trans65_1)
if (trans65_1 <= a65.length)
for (int i65 = 0; i65 < 1 && i65 < trans65_0; i65++) {
if (trans66_1 <= a66.length)
if (trans66_0 <= trans66_1)
for (int i66 = 0; i66 < 1 && i66 < trans66_0; i66++) {
if (trans67_0 <= trans67_1)
if (trans67_1 <= a67.length)
for (int i67 = 0; i67 < 1 && i67 < trans67_0; i67++) {
if (trans68_0 <= trans68_1)
if (trans68_1 <= a68.length)
for (int i68 = 0; i68 < 1 && i68 < trans68_0; i68++) {
if (trans69_1 <= a69.length)
if (trans69_0 <= trans69_1)
for (int i69 = 0; i69 < 1 && i69 < trans69_0; i69++) {
if (trans70_1 <= a70.length)
if (trans70_0 <= trans70_1)
for (int i70 = 0; i70 < 1 && i70 < trans70_0; i70++) {
if (trans71_1 <= a71.length)
if (trans71_0 <= trans71_1)
for (int i71 = 0; i71 < 1 && i71 < trans71_0; i71++) {
if (trans72_0 <= trans72_1)
if (trans72_1 <= a72.length)
for (int i72 = 0; i72 < 1 && i72 < trans72_0; i72++) {
if (trans73_1 <= a73.length)
if (trans73_0 <= trans73_1)
for (int i73 = 0; i73 < 1 && i73 < trans73_0; i73++) {
if (trans74_1 <= a74.length)
if (trans74_0 <= trans74_1)
for (int i74 = 0; i74 < 1 && i74 < trans74_0; i74++) {
if (trans75_0 <= trans75_1)
if (trans75_1 <= a75.length)
for (int i75 = 0; i75 < 1 && i75 < trans75_0; i75++) {
if (trans76_0 <= trans76_1)
if (trans76_1 <= a76.length)
for (int i76 = 0; i76 < 1 && i76 < trans76_0; i76++) {
if (trans77_0 <= trans77_1)
if (trans77_1 <= a77.length)
for (int i77 = 0; i77 < 1 && i77 < trans77_0; i77++) {
if (trans78_0 <= trans78_1)
if (trans78_1 <= a78.length)
for (int i78 = 0; i78 < 1 && i78 < trans78_0; i78++) {
if (trans79_1 <= a79.length)
if (trans79_0 <= trans79_1)
for (int i79 = 0; i79 < 1 && i79 < trans79_0; i79++) {
if (trans80_1 <= a80.length)
if (trans80_0 <= trans80_1)
for (int i80 = 0; i80 < 1 && i80 < trans80_0; i80++) {
if (trans81_0 <= trans81_1)
if (trans81_1 <= a81.length)
for (int i81 = 0; i81 < 1 && i81 < trans81_0; i81++) {
if (trans82_0 <= trans82_1)
if (trans82_1 <= a82.length)
for (int i82 = 0; i82 < 1 && i82 < trans82_0; i82++) {
if (trans83_0 <= trans83_1)
if (trans83_1 <= a83.length)
for (int i83 = 0; i83 < 1 && i83 < trans83_0; i83++) {
if (trans84_1 <= a84.length)
if (trans84_0 <= trans84_1)
for (int i84 = 0; i84 < 1 && i84 < trans84_0; i84++) {
if (trans85_1 <= a85.length)
if (trans85_0 <= trans85_1)
for (int i85 = 0; i85 < 1 && i85 < trans85_0; i85++) {
if (trans86_1 <= a86.length)
if (trans86_0 <= trans86_1)
for (int i86 = 0; i86 < 1 && i86 < trans86_0; i86++) {
if (trans87_1 <= a87.length)
if (trans87_0 <= trans87_1)
for (int i87 = 0; i87 < 1 && i87 < trans87_0; i87++) {
if (trans88_0 <= trans88_1)
if (trans88_1 <= a88.length)
for (int i88 = 0; i88 < 1 && i88 < trans88_0; i88++) {
if (trans89_0 <= trans89_1)
if (trans89_1 <= a89.length)
for (int i89 = 0; i89 < 1 && i89 < trans89_0; i89++) {
if (trans90_1 <= a90.length)
if (trans90_0 <= trans90_1)
for (int i90 = 0; i90 < 1 && i90 < trans90_0; i90++) {
if (trans91_0 <= trans91_1)
if (trans91_1 <= a91.length)
for (int i91 = 0; i91 < 1 && i91 < trans91_0; i91++) {
if (trans92_0 <= trans92_1)
if (trans92_1 <= a92.length)
for (int i92 = 0; i92 < 1 && i92 < trans92_0; i92++) {
if (trans93_0 <= trans93_1)
if (trans93_1 <= a93.length)
for (int i93 = 0; i93 < 1 && i93 < trans93_0; i93++) {
if (trans94_0 <= trans94_1)
if (trans94_1 <= a94.length)
for (int i94 = 0; i94 < 1 && i94 < trans94_0; i94++) {
if (trans95_1 <= a95.length)
if (trans95_0 <= trans95_1)
for (int i95 = 0; i95 < 1 && i95 < trans95_0; i95++) {
if (trans96_0 <= trans96_1)
if (trans96_1 <= a96.length)
for (int i96 = 0; i96 < 1 && i96 < trans96_0; i96++) {
if (trans97_0 <= trans97_1)
if (trans97_1 <= a97.length)
for (int i97 = 0; i97 < 1 && i97 < trans97_0; i97++) {
if (trans98_1 <= a98.length)
if (trans98_0 <= trans98_1)
for (int i98 = 0; i98 < 1 && i98 < trans98_0; i98++) {
if (trans99_1 <= a99.length)
if (trans99_0 <= trans99_1)
for (int i99 = 0; i99 < 1 && i99 < trans99_0; i99++) {
s += a0[i0];
s += a1[i1];
s += a2[i2];
s += a3[i3];
s += a4[i4];
s += a5[i5];
s += a6[i6];
s += a7[i7];
s += a8[i8];
s += a9[i9];
s += a10[i10];
s += a11[i11];
s += a12[i12];
s += a13[i13];
s += a14[i14];
s += a15[i15];
s += a16[i16];
s += a17[i17];
s += a18[i18];
s += a19[i19];
s += a20[i20];
s += a21[i21];
s += a22[i22];
s += a23[i23];
s += a24[i24];
s += a25[i25];
s += a26[i26];
s += a27[i27];
s += a28[i28];
s += a29[i29];
s += a30[i30];
s += a31[i31];
s += a32[i32];
s += a33[i33];
s += a34[i34];
s += a35[i35];
s += a36[i36];
s += a37[i37];
s += a38[i38];
s += a39[i39];
s += a40[i40];
s += a41[i41];
s += a42[i42];
s += a43[i43];
s += a44[i44];
s += a45[i45];
s += a46[i46];
s += a47[i47];
s += a48[i48];
s += a49[i49];
s += a50[i50];
s += a51[i51];
s += a52[i52];
s += a53[i53];
s += a54[i54];
s += a55[i55];
s += a56[i56];
s += a57[i57];
s += a58[i58];
s += a59[i59];
s += a60[i60];
s += a61[i61];
s += a62[i62];
s += a63[i63];
s += a64[i64];
s += a65[i65];
s += a66[i66];
s += a67[i67];
s += a68[i68];
s += a69[i69];
s += a70[i70];
s += a71[i71];
s += a72[i72];
s += a73[i73];
s += a74[i74];
s += a75[i75];
s += a76[i76];
s += a77[i77];
s += a78[i78];
s += a79[i79];
s += a80[i80];
s += a81[i81];
s += a82[i82];
s += a83[i83];
s += a84[i84];
s += a85[i85];
s += a86[i86];
s += a87[i87];
s += a88[i88];
s += a89[i89];
s += a90[i90];
s += a91[i91];
s += a92[i92];
s += a93[i93];
s += a94[i94];
s += a95[i95];
s += a96[i96];
s += a97[i97];
s += a98[i98];
s += a99[i99];
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
return s; }

@Benchmark public int bench_big_n100_multipleTrue_trans2_transrandomTrue() {
return big_n100_multipleTrue_trans2_transrandomTrue();
}

int big_n200_multipleTrue_trans2_transrandomTrue() {
int s = 0;
if (!(trans0.length >= 2)) return -1;
int trans0_0 = trans0[0];
int trans0_1 = trans0[1];
if (!(trans1.length >= 2)) return -1;
int trans1_0 = trans1[0];
int trans1_1 = trans1[1];
if (!(trans2.length >= 2)) return -1;
int trans2_0 = trans2[0];
int trans2_1 = trans2[1];
if (!(trans3.length >= 2)) return -1;
int trans3_0 = trans3[0];
int trans3_1 = trans3[1];
if (!(trans4.length >= 2)) return -1;
int trans4_0 = trans4[0];
int trans4_1 = trans4[1];
if (!(trans5.length >= 2)) return -1;
int trans5_0 = trans5[0];
int trans5_1 = trans5[1];
if (!(trans6.length >= 2)) return -1;
int trans6_0 = trans6[0];
int trans6_1 = trans6[1];
if (!(trans7.length >= 2)) return -1;
int trans7_0 = trans7[0];
int trans7_1 = trans7[1];
if (!(trans8.length >= 2)) return -1;
int trans8_0 = trans8[0];
int trans8_1 = trans8[1];
if (!(trans9.length >= 2)) return -1;
int trans9_0 = trans9[0];
int trans9_1 = trans9[1];
if (!(trans10.length >= 2)) return -1;
int trans10_0 = trans10[0];
int trans10_1 = trans10[1];
if (!(trans11.length >= 2)) return -1;
int trans11_0 = trans11[0];
int trans11_1 = trans11[1];
if (!(trans12.length >= 2)) return -1;
int trans12_0 = trans12[0];
int trans12_1 = trans12[1];
if (!(trans13.length >= 2)) return -1;
int trans13_0 = trans13[0];
int trans13_1 = trans13[1];
if (!(trans14.length >= 2)) return -1;
int trans14_0 = trans14[0];
int trans14_1 = trans14[1];
if (!(trans15.length >= 2)) return -1;
int trans15_0 = trans15[0];
int trans15_1 = trans15[1];
if (!(trans16.length >= 2)) return -1;
int trans16_0 = trans16[0];
int trans16_1 = trans16[1];
if (!(trans17.length >= 2)) return -1;
int trans17_0 = trans17[0];
int trans17_1 = trans17[1];
if (!(trans18.length >= 2)) return -1;
int trans18_0 = trans18[0];
int trans18_1 = trans18[1];
if (!(trans19.length >= 2)) return -1;
int trans19_0 = trans19[0];
int trans19_1 = trans19[1];
if (!(trans20.length >= 2)) return -1;
int trans20_0 = trans20[0];
int trans20_1 = trans20[1];
if (!(trans21.length >= 2)) return -1;
int trans21_0 = trans21[0];
int trans21_1 = trans21[1];
if (!(trans22.length >= 2)) return -1;
int trans22_0 = trans22[0];
int trans22_1 = trans22[1];
if (!(trans23.length >= 2)) return -1;
int trans23_0 = trans23[0];
int trans23_1 = trans23[1];
if (!(trans24.length >= 2)) return -1;
int trans24_0 = trans24[0];
int trans24_1 = trans24[1];
if (!(trans25.length >= 2)) return -1;
int trans25_0 = trans25[0];
int trans25_1 = trans25[1];
if (!(trans26.length >= 2)) return -1;
int trans26_0 = trans26[0];
int trans26_1 = trans26[1];
if (!(trans27.length >= 2)) return -1;
int trans27_0 = trans27[0];
int trans27_1 = trans27[1];
if (!(trans28.length >= 2)) return -1;
int trans28_0 = trans28[0];
int trans28_1 = trans28[1];
if (!(trans29.length >= 2)) return -1;
int trans29_0 = trans29[0];
int trans29_1 = trans29[1];
if (!(trans30.length >= 2)) return -1;
int trans30_0 = trans30[0];
int trans30_1 = trans30[1];
if (!(trans31.length >= 2)) return -1;
int trans31_0 = trans31[0];
int trans31_1 = trans31[1];
if (!(trans32.length >= 2)) return -1;
int trans32_0 = trans32[0];
int trans32_1 = trans32[1];
if (!(trans33.length >= 2)) return -1;
int trans33_0 = trans33[0];
int trans33_1 = trans33[1];
if (!(trans34.length >= 2)) return -1;
int trans34_0 = trans34[0];
int trans34_1 = trans34[1];
if (!(trans35.length >= 2)) return -1;
int trans35_0 = trans35[0];
int trans35_1 = trans35[1];
if (!(trans36.length >= 2)) return -1;
int trans36_0 = trans36[0];
int trans36_1 = trans36[1];
if (!(trans37.length >= 2)) return -1;
int trans37_0 = trans37[0];
int trans37_1 = trans37[1];
if (!(trans38.length >= 2)) return -1;
int trans38_0 = trans38[0];
int trans38_1 = trans38[1];
if (!(trans39.length >= 2)) return -1;
int trans39_0 = trans39[0];
int trans39_1 = trans39[1];
if (!(trans40.length >= 2)) return -1;
int trans40_0 = trans40[0];
int trans40_1 = trans40[1];
if (!(trans41.length >= 2)) return -1;
int trans41_0 = trans41[0];
int trans41_1 = trans41[1];
if (!(trans42.length >= 2)) return -1;
int trans42_0 = trans42[0];
int trans42_1 = trans42[1];
if (!(trans43.length >= 2)) return -1;
int trans43_0 = trans43[0];
int trans43_1 = trans43[1];
if (!(trans44.length >= 2)) return -1;
int trans44_0 = trans44[0];
int trans44_1 = trans44[1];
if (!(trans45.length >= 2)) return -1;
int trans45_0 = trans45[0];
int trans45_1 = trans45[1];
if (!(trans46.length >= 2)) return -1;
int trans46_0 = trans46[0];
int trans46_1 = trans46[1];
if (!(trans47.length >= 2)) return -1;
int trans47_0 = trans47[0];
int trans47_1 = trans47[1];
if (!(trans48.length >= 2)) return -1;
int trans48_0 = trans48[0];
int trans48_1 = trans48[1];
if (!(trans49.length >= 2)) return -1;
int trans49_0 = trans49[0];
int trans49_1 = trans49[1];
if (!(trans50.length >= 2)) return -1;
int trans50_0 = trans50[0];
int trans50_1 = trans50[1];
if (!(trans51.length >= 2)) return -1;
int trans51_0 = trans51[0];
int trans51_1 = trans51[1];
if (!(trans52.length >= 2)) return -1;
int trans52_0 = trans52[0];
int trans52_1 = trans52[1];
if (!(trans53.length >= 2)) return -1;
int trans53_0 = trans53[0];
int trans53_1 = trans53[1];
if (!(trans54.length >= 2)) return -1;
int trans54_0 = trans54[0];
int trans54_1 = trans54[1];
if (!(trans55.length >= 2)) return -1;
int trans55_0 = trans55[0];
int trans55_1 = trans55[1];
if (!(trans56.length >= 2)) return -1;
int trans56_0 = trans56[0];
int trans56_1 = trans56[1];
if (!(trans57.length >= 2)) return -1;
int trans57_0 = trans57[0];
int trans57_1 = trans57[1];
if (!(trans58.length >= 2)) return -1;
int trans58_0 = trans58[0];
int trans58_1 = trans58[1];
if (!(trans59.length >= 2)) return -1;
int trans59_0 = trans59[0];
int trans59_1 = trans59[1];
if (!(trans60.length >= 2)) return -1;
int trans60_0 = trans60[0];
int trans60_1 = trans60[1];
if (!(trans61.length >= 2)) return -1;
int trans61_0 = trans61[0];
int trans61_1 = trans61[1];
if (!(trans62.length >= 2)) return -1;
int trans62_0 = trans62[0];
int trans62_1 = trans62[1];
if (!(trans63.length >= 2)) return -1;
int trans63_0 = trans63[0];
int trans63_1 = trans63[1];
if (!(trans64.length >= 2)) return -1;
int trans64_0 = trans64[0];
int trans64_1 = trans64[1];
if (!(trans65.length >= 2)) return -1;
int trans65_0 = trans65[0];
int trans65_1 = trans65[1];
if (!(trans66.length >= 2)) return -1;
int trans66_0 = trans66[0];
int trans66_1 = trans66[1];
if (!(trans67.length >= 2)) return -1;
int trans67_0 = trans67[0];
int trans67_1 = trans67[1];
if (!(trans68.length >= 2)) return -1;
int trans68_0 = trans68[0];
int trans68_1 = trans68[1];
if (!(trans69.length >= 2)) return -1;
int trans69_0 = trans69[0];
int trans69_1 = trans69[1];
if (!(trans70.length >= 2)) return -1;
int trans70_0 = trans70[0];
int trans70_1 = trans70[1];
if (!(trans71.length >= 2)) return -1;
int trans71_0 = trans71[0];
int trans71_1 = trans71[1];
if (!(trans72.length >= 2)) return -1;
int trans72_0 = trans72[0];
int trans72_1 = trans72[1];
if (!(trans73.length >= 2)) return -1;
int trans73_0 = trans73[0];
int trans73_1 = trans73[1];
if (!(trans74.length >= 2)) return -1;
int trans74_0 = trans74[0];
int trans74_1 = trans74[1];
if (!(trans75.length >= 2)) return -1;
int trans75_0 = trans75[0];
int trans75_1 = trans75[1];
if (!(trans76.length >= 2)) return -1;
int trans76_0 = trans76[0];
int trans76_1 = trans76[1];
if (!(trans77.length >= 2)) return -1;
int trans77_0 = trans77[0];
int trans77_1 = trans77[1];
if (!(trans78.length >= 2)) return -1;
int trans78_0 = trans78[0];
int trans78_1 = trans78[1];
if (!(trans79.length >= 2)) return -1;
int trans79_0 = trans79[0];
int trans79_1 = trans79[1];
if (!(trans80.length >= 2)) return -1;
int trans80_0 = trans80[0];
int trans80_1 = trans80[1];
if (!(trans81.length >= 2)) return -1;
int trans81_0 = trans81[0];
int trans81_1 = trans81[1];
if (!(trans82.length >= 2)) return -1;
int trans82_0 = trans82[0];
int trans82_1 = trans82[1];
if (!(trans83.length >= 2)) return -1;
int trans83_0 = trans83[0];
int trans83_1 = trans83[1];
if (!(trans84.length >= 2)) return -1;
int trans84_0 = trans84[0];
int trans84_1 = trans84[1];
if (!(trans85.length >= 2)) return -1;
int trans85_0 = trans85[0];
int trans85_1 = trans85[1];
if (!(trans86.length >= 2)) return -1;
int trans86_0 = trans86[0];
int trans86_1 = trans86[1];
if (!(trans87.length >= 2)) return -1;
int trans87_0 = trans87[0];
int trans87_1 = trans87[1];
if (!(trans88.length >= 2)) return -1;
int trans88_0 = trans88[0];
int trans88_1 = trans88[1];
if (!(trans89.length >= 2)) return -1;
int trans89_0 = trans89[0];
int trans89_1 = trans89[1];
if (!(trans90.length >= 2)) return -1;
int trans90_0 = trans90[0];
int trans90_1 = trans90[1];
if (!(trans91.length >= 2)) return -1;
int trans91_0 = trans91[0];
int trans91_1 = trans91[1];
if (!(trans92.length >= 2)) return -1;
int trans92_0 = trans92[0];
int trans92_1 = trans92[1];
if (!(trans93.length >= 2)) return -1;
int trans93_0 = trans93[0];
int trans93_1 = trans93[1];
if (!(trans94.length >= 2)) return -1;
int trans94_0 = trans94[0];
int trans94_1 = trans94[1];
if (!(trans95.length >= 2)) return -1;
int trans95_0 = trans95[0];
int trans95_1 = trans95[1];
if (!(trans96.length >= 2)) return -1;
int trans96_0 = trans96[0];
int trans96_1 = trans96[1];
if (!(trans97.length >= 2)) return -1;
int trans97_0 = trans97[0];
int trans97_1 = trans97[1];
if (!(trans98.length >= 2)) return -1;
int trans98_0 = trans98[0];
int trans98_1 = trans98[1];
if (!(trans99.length >= 2)) return -1;
int trans99_0 = trans99[0];
int trans99_1 = trans99[1];
if (!(trans100.length >= 2)) return -1;
int trans100_0 = trans100[0];
int trans100_1 = trans100[1];
if (!(trans101.length >= 2)) return -1;
int trans101_0 = trans101[0];
int trans101_1 = trans101[1];
if (!(trans102.length >= 2)) return -1;
int trans102_0 = trans102[0];
int trans102_1 = trans102[1];
if (!(trans103.length >= 2)) return -1;
int trans103_0 = trans103[0];
int trans103_1 = trans103[1];
if (!(trans104.length >= 2)) return -1;
int trans104_0 = trans104[0];
int trans104_1 = trans104[1];
if (!(trans105.length >= 2)) return -1;
int trans105_0 = trans105[0];
int trans105_1 = trans105[1];
if (!(trans106.length >= 2)) return -1;
int trans106_0 = trans106[0];
int trans106_1 = trans106[1];
if (!(trans107.length >= 2)) return -1;
int trans107_0 = trans107[0];
int trans107_1 = trans107[1];
if (!(trans108.length >= 2)) return -1;
int trans108_0 = trans108[0];
int trans108_1 = trans108[1];
if (!(trans109.length >= 2)) return -1;
int trans109_0 = trans109[0];
int trans109_1 = trans109[1];
if (!(trans110.length >= 2)) return -1;
int trans110_0 = trans110[0];
int trans110_1 = trans110[1];
if (!(trans111.length >= 2)) return -1;
int trans111_0 = trans111[0];
int trans111_1 = trans111[1];
if (!(trans112.length >= 2)) return -1;
int trans112_0 = trans112[0];
int trans112_1 = trans112[1];
if (!(trans113.length >= 2)) return -1;
int trans113_0 = trans113[0];
int trans113_1 = trans113[1];
if (!(trans114.length >= 2)) return -1;
int trans114_0 = trans114[0];
int trans114_1 = trans114[1];
if (!(trans115.length >= 2)) return -1;
int trans115_0 = trans115[0];
int trans115_1 = trans115[1];
if (!(trans116.length >= 2)) return -1;
int trans116_0 = trans116[0];
int trans116_1 = trans116[1];
if (!(trans117.length >= 2)) return -1;
int trans117_0 = trans117[0];
int trans117_1 = trans117[1];
if (!(trans118.length >= 2)) return -1;
int trans118_0 = trans118[0];
int trans118_1 = trans118[1];
if (!(trans119.length >= 2)) return -1;
int trans119_0 = trans119[0];
int trans119_1 = trans119[1];
if (!(trans120.length >= 2)) return -1;
int trans120_0 = trans120[0];
int trans120_1 = trans120[1];
if (!(trans121.length >= 2)) return -1;
int trans121_0 = trans121[0];
int trans121_1 = trans121[1];
if (!(trans122.length >= 2)) return -1;
int trans122_0 = trans122[0];
int trans122_1 = trans122[1];
if (!(trans123.length >= 2)) return -1;
int trans123_0 = trans123[0];
int trans123_1 = trans123[1];
if (!(trans124.length >= 2)) return -1;
int trans124_0 = trans124[0];
int trans124_1 = trans124[1];
if (!(trans125.length >= 2)) return -1;
int trans125_0 = trans125[0];
int trans125_1 = trans125[1];
if (!(trans126.length >= 2)) return -1;
int trans126_0 = trans126[0];
int trans126_1 = trans126[1];
if (!(trans127.length >= 2)) return -1;
int trans127_0 = trans127[0];
int trans127_1 = trans127[1];
if (!(trans128.length >= 2)) return -1;
int trans128_0 = trans128[0];
int trans128_1 = trans128[1];
if (!(trans129.length >= 2)) return -1;
int trans129_0 = trans129[0];
int trans129_1 = trans129[1];
if (!(trans130.length >= 2)) return -1;
int trans130_0 = trans130[0];
int trans130_1 = trans130[1];
if (!(trans131.length >= 2)) return -1;
int trans131_0 = trans131[0];
int trans131_1 = trans131[1];
if (!(trans132.length >= 2)) return -1;
int trans132_0 = trans132[0];
int trans132_1 = trans132[1];
if (!(trans133.length >= 2)) return -1;
int trans133_0 = trans133[0];
int trans133_1 = trans133[1];
if (!(trans134.length >= 2)) return -1;
int trans134_0 = trans134[0];
int trans134_1 = trans134[1];
if (!(trans135.length >= 2)) return -1;
int trans135_0 = trans135[0];
int trans135_1 = trans135[1];
if (!(trans136.length >= 2)) return -1;
int trans136_0 = trans136[0];
int trans136_1 = trans136[1];
if (!(trans137.length >= 2)) return -1;
int trans137_0 = trans137[0];
int trans137_1 = trans137[1];
if (!(trans138.length >= 2)) return -1;
int trans138_0 = trans138[0];
int trans138_1 = trans138[1];
if (!(trans139.length >= 2)) return -1;
int trans139_0 = trans139[0];
int trans139_1 = trans139[1];
if (!(trans140.length >= 2)) return -1;
int trans140_0 = trans140[0];
int trans140_1 = trans140[1];
if (!(trans141.length >= 2)) return -1;
int trans141_0 = trans141[0];
int trans141_1 = trans141[1];
if (!(trans142.length >= 2)) return -1;
int trans142_0 = trans142[0];
int trans142_1 = trans142[1];
if (!(trans143.length >= 2)) return -1;
int trans143_0 = trans143[0];
int trans143_1 = trans143[1];
if (!(trans144.length >= 2)) return -1;
int trans144_0 = trans144[0];
int trans144_1 = trans144[1];
if (!(trans145.length >= 2)) return -1;
int trans145_0 = trans145[0];
int trans145_1 = trans145[1];
if (!(trans146.length >= 2)) return -1;
int trans146_0 = trans146[0];
int trans146_1 = trans146[1];
if (!(trans147.length >= 2)) return -1;
int trans147_0 = trans147[0];
int trans147_1 = trans147[1];
if (!(trans148.length >= 2)) return -1;
int trans148_0 = trans148[0];
int trans148_1 = trans148[1];
if (!(trans149.length >= 2)) return -1;
int trans149_0 = trans149[0];
int trans149_1 = trans149[1];
if (!(trans150.length >= 2)) return -1;
int trans150_0 = trans150[0];
int trans150_1 = trans150[1];
if (!(trans151.length >= 2)) return -1;
int trans151_0 = trans151[0];
int trans151_1 = trans151[1];
if (!(trans152.length >= 2)) return -1;
int trans152_0 = trans152[0];
int trans152_1 = trans152[1];
if (!(trans153.length >= 2)) return -1;
int trans153_0 = trans153[0];
int trans153_1 = trans153[1];
if (!(trans154.length >= 2)) return -1;
int trans154_0 = trans154[0];
int trans154_1 = trans154[1];
if (!(trans155.length >= 2)) return -1;
int trans155_0 = trans155[0];
int trans155_1 = trans155[1];
if (!(trans156.length >= 2)) return -1;
int trans156_0 = trans156[0];
int trans156_1 = trans156[1];
if (!(trans157.length >= 2)) return -1;
int trans157_0 = trans157[0];
int trans157_1 = trans157[1];
if (!(trans158.length >= 2)) return -1;
int trans158_0 = trans158[0];
int trans158_1 = trans158[1];
if (!(trans159.length >= 2)) return -1;
int trans159_0 = trans159[0];
int trans159_1 = trans159[1];
if (!(trans160.length >= 2)) return -1;
int trans160_0 = trans160[0];
int trans160_1 = trans160[1];
if (!(trans161.length >= 2)) return -1;
int trans161_0 = trans161[0];
int trans161_1 = trans161[1];
if (!(trans162.length >= 2)) return -1;
int trans162_0 = trans162[0];
int trans162_1 = trans162[1];
if (!(trans163.length >= 2)) return -1;
int trans163_0 = trans163[0];
int trans163_1 = trans163[1];
if (!(trans164.length >= 2)) return -1;
int trans164_0 = trans164[0];
int trans164_1 = trans164[1];
if (!(trans165.length >= 2)) return -1;
int trans165_0 = trans165[0];
int trans165_1 = trans165[1];
if (!(trans166.length >= 2)) return -1;
int trans166_0 = trans166[0];
int trans166_1 = trans166[1];
if (!(trans167.length >= 2)) return -1;
int trans167_0 = trans167[0];
int trans167_1 = trans167[1];
if (!(trans168.length >= 2)) return -1;
int trans168_0 = trans168[0];
int trans168_1 = trans168[1];
if (!(trans169.length >= 2)) return -1;
int trans169_0 = trans169[0];
int trans169_1 = trans169[1];
if (!(trans170.length >= 2)) return -1;
int trans170_0 = trans170[0];
int trans170_1 = trans170[1];
if (!(trans171.length >= 2)) return -1;
int trans171_0 = trans171[0];
int trans171_1 = trans171[1];
if (!(trans172.length >= 2)) return -1;
int trans172_0 = trans172[0];
int trans172_1 = trans172[1];
if (!(trans173.length >= 2)) return -1;
int trans173_0 = trans173[0];
int trans173_1 = trans173[1];
if (!(trans174.length >= 2)) return -1;
int trans174_0 = trans174[0];
int trans174_1 = trans174[1];
if (!(trans175.length >= 2)) return -1;
int trans175_0 = trans175[0];
int trans175_1 = trans175[1];
if (!(trans176.length >= 2)) return -1;
int trans176_0 = trans176[0];
int trans176_1 = trans176[1];
if (!(trans177.length >= 2)) return -1;
int trans177_0 = trans177[0];
int trans177_1 = trans177[1];
if (!(trans178.length >= 2)) return -1;
int trans178_0 = trans178[0];
int trans178_1 = trans178[1];
if (!(trans179.length >= 2)) return -1;
int trans179_0 = trans179[0];
int trans179_1 = trans179[1];
if (!(trans180.length >= 2)) return -1;
int trans180_0 = trans180[0];
int trans180_1 = trans180[1];
if (!(trans181.length >= 2)) return -1;
int trans181_0 = trans181[0];
int trans181_1 = trans181[1];
if (!(trans182.length >= 2)) return -1;
int trans182_0 = trans182[0];
int trans182_1 = trans182[1];
if (!(trans183.length >= 2)) return -1;
int trans183_0 = trans183[0];
int trans183_1 = trans183[1];
if (!(trans184.length >= 2)) return -1;
int trans184_0 = trans184[0];
int trans184_1 = trans184[1];
if (!(trans185.length >= 2)) return -1;
int trans185_0 = trans185[0];
int trans185_1 = trans185[1];
if (!(trans186.length >= 2)) return -1;
int trans186_0 = trans186[0];
int trans186_1 = trans186[1];
if (!(trans187.length >= 2)) return -1;
int trans187_0 = trans187[0];
int trans187_1 = trans187[1];
if (!(trans188.length >= 2)) return -1;
int trans188_0 = trans188[0];
int trans188_1 = trans188[1];
if (!(trans189.length >= 2)) return -1;
int trans189_0 = trans189[0];
int trans189_1 = trans189[1];
if (!(trans190.length >= 2)) return -1;
int trans190_0 = trans190[0];
int trans190_1 = trans190[1];
if (!(trans191.length >= 2)) return -1;
int trans191_0 = trans191[0];
int trans191_1 = trans191[1];
if (!(trans192.length >= 2)) return -1;
int trans192_0 = trans192[0];
int trans192_1 = trans192[1];
if (!(trans193.length >= 2)) return -1;
int trans193_0 = trans193[0];
int trans193_1 = trans193[1];
if (!(trans194.length >= 2)) return -1;
int trans194_0 = trans194[0];
int trans194_1 = trans194[1];
if (!(trans195.length >= 2)) return -1;
int trans195_0 = trans195[0];
int trans195_1 = trans195[1];
if (!(trans196.length >= 2)) return -1;
int trans196_0 = trans196[0];
int trans196_1 = trans196[1];
if (!(trans197.length >= 2)) return -1;
int trans197_0 = trans197[0];
int trans197_1 = trans197[1];
if (!(trans198.length >= 2)) return -1;
int trans198_0 = trans198[0];
int trans198_1 = trans198[1];
if (!(trans199.length >= 2)) return -1;
int trans199_0 = trans199[0];
int trans199_1 = trans199[1];
if (trans0_1 <= a0.length)
if (trans0_0 <= trans0_1)
for (int i0 = 0; i0 < 1 && i0 < trans0_0; i0++) {
if (trans1_0 <= trans1_1)
if (trans1_1 <= a1.length)
for (int i1 = 0; i1 < 1 && i1 < trans1_0; i1++) {
if (trans2_1 <= a2.length)
if (trans2_0 <= trans2_1)
for (int i2 = 0; i2 < 1 && i2 < trans2_0; i2++) {
if (trans3_1 <= a3.length)
if (trans3_0 <= trans3_1)
for (int i3 = 0; i3 < 1 && i3 < trans3_0; i3++) {
if (trans4_1 <= a4.length)
if (trans4_0 <= trans4_1)
for (int i4 = 0; i4 < 1 && i4 < trans4_0; i4++) {
if (trans5_0 <= trans5_1)
if (trans5_1 <= a5.length)
for (int i5 = 0; i5 < 1 && i5 < trans5_0; i5++) {
if (trans6_1 <= a6.length)
if (trans6_0 <= trans6_1)
for (int i6 = 0; i6 < 1 && i6 < trans6_0; i6++) {
if (trans7_0 <= trans7_1)
if (trans7_1 <= a7.length)
for (int i7 = 0; i7 < 1 && i7 < trans7_0; i7++) {
if (trans8_0 <= trans8_1)
if (trans8_1 <= a8.length)
for (int i8 = 0; i8 < 1 && i8 < trans8_0; i8++) {
if (trans9_0 <= trans9_1)
if (trans9_1 <= a9.length)
for (int i9 = 0; i9 < 1 && i9 < trans9_0; i9++) {
if (trans10_0 <= trans10_1)
if (trans10_1 <= a10.length)
for (int i10 = 0; i10 < 1 && i10 < trans10_0; i10++) {
if (trans11_0 <= trans11_1)
if (trans11_1 <= a11.length)
for (int i11 = 0; i11 < 1 && i11 < trans11_0; i11++) {
if (trans12_1 <= a12.length)
if (trans12_0 <= trans12_1)
for (int i12 = 0; i12 < 1 && i12 < trans12_0; i12++) {
if (trans13_0 <= trans13_1)
if (trans13_1 <= a13.length)
for (int i13 = 0; i13 < 1 && i13 < trans13_0; i13++) {
if (trans14_0 <= trans14_1)
if (trans14_1 <= a14.length)
for (int i14 = 0; i14 < 1 && i14 < trans14_0; i14++) {
if (trans15_0 <= trans15_1)
if (trans15_1 <= a15.length)
for (int i15 = 0; i15 < 1 && i15 < trans15_0; i15++) {
if (trans16_1 <= a16.length)
if (trans16_0 <= trans16_1)
for (int i16 = 0; i16 < 1 && i16 < trans16_0; i16++) {
if (trans17_0 <= trans17_1)
if (trans17_1 <= a17.length)
for (int i17 = 0; i17 < 1 && i17 < trans17_0; i17++) {
if (trans18_1 <= a18.length)
if (trans18_0 <= trans18_1)
for (int i18 = 0; i18 < 1 && i18 < trans18_0; i18++) {
if (trans19_1 <= a19.length)
if (trans19_0 <= trans19_1)
for (int i19 = 0; i19 < 1 && i19 < trans19_0; i19++) {
if (trans20_0 <= trans20_1)
if (trans20_1 <= a20.length)
for (int i20 = 0; i20 < 1 && i20 < trans20_0; i20++) {
if (trans21_0 <= trans21_1)
if (trans21_1 <= a21.length)
for (int i21 = 0; i21 < 1 && i21 < trans21_0; i21++) {
if (trans22_0 <= trans22_1)
if (trans22_1 <= a22.length)
for (int i22 = 0; i22 < 1 && i22 < trans22_0; i22++) {
if (trans23_0 <= trans23_1)
if (trans23_1 <= a23.length)
for (int i23 = 0; i23 < 1 && i23 < trans23_0; i23++) {
if (trans24_0 <= trans24_1)
if (trans24_1 <= a24.length)
for (int i24 = 0; i24 < 1 && i24 < trans24_0; i24++) {
if (trans25_1 <= a25.length)
if (trans25_0 <= trans25_1)
for (int i25 = 0; i25 < 1 && i25 < trans25_0; i25++) {
if (trans26_0 <= trans26_1)
if (trans26_1 <= a26.length)
for (int i26 = 0; i26 < 1 && i26 < trans26_0; i26++) {
if (trans27_1 <= a27.length)
if (trans27_0 <= trans27_1)
for (int i27 = 0; i27 < 1 && i27 < trans27_0; i27++) {
if (trans28_1 <= a28.length)
if (trans28_0 <= trans28_1)
for (int i28 = 0; i28 < 1 && i28 < trans28_0; i28++) {
if (trans29_0 <= trans29_1)
if (trans29_1 <= a29.length)
for (int i29 = 0; i29 < 1 && i29 < trans29_0; i29++) {
if (trans30_0 <= trans30_1)
if (trans30_1 <= a30.length)
for (int i30 = 0; i30 < 1 && i30 < trans30_0; i30++) {
if (trans31_0 <= trans31_1)
if (trans31_1 <= a31.length)
for (int i31 = 0; i31 < 1 && i31 < trans31_0; i31++) {
if (trans32_0 <= trans32_1)
if (trans32_1 <= a32.length)
for (int i32 = 0; i32 < 1 && i32 < trans32_0; i32++) {
if (trans33_1 <= a33.length)
if (trans33_0 <= trans33_1)
for (int i33 = 0; i33 < 1 && i33 < trans33_0; i33++) {
if (trans34_1 <= a34.length)
if (trans34_0 <= trans34_1)
for (int i34 = 0; i34 < 1 && i34 < trans34_0; i34++) {
if (trans35_1 <= a35.length)
if (trans35_0 <= trans35_1)
for (int i35 = 0; i35 < 1 && i35 < trans35_0; i35++) {
if (trans36_1 <= a36.length)
if (trans36_0 <= trans36_1)
for (int i36 = 0; i36 < 1 && i36 < trans36_0; i36++) {
if (trans37_0 <= trans37_1)
if (trans37_1 <= a37.length)
for (int i37 = 0; i37 < 1 && i37 < trans37_0; i37++) {
if (trans38_1 <= a38.length)
if (trans38_0 <= trans38_1)
for (int i38 = 0; i38 < 1 && i38 < trans38_0; i38++) {
if (trans39_0 <= trans39_1)
if (trans39_1 <= a39.length)
for (int i39 = 0; i39 < 1 && i39 < trans39_0; i39++) {
if (trans40_0 <= trans40_1)
if (trans40_1 <= a40.length)
for (int i40 = 0; i40 < 1 && i40 < trans40_0; i40++) {
if (trans41_1 <= a41.length)
if (trans41_0 <= trans41_1)
for (int i41 = 0; i41 < 1 && i41 < trans41_0; i41++) {
if (trans42_0 <= trans42_1)
if (trans42_1 <= a42.length)
for (int i42 = 0; i42 < 1 && i42 < trans42_0; i42++) {
if (trans43_1 <= a43.length)
if (trans43_0 <= trans43_1)
for (int i43 = 0; i43 < 1 && i43 < trans43_0; i43++) {
if (trans44_0 <= trans44_1)
if (trans44_1 <= a44.length)
for (int i44 = 0; i44 < 1 && i44 < trans44_0; i44++) {
if (trans45_0 <= trans45_1)
if (trans45_1 <= a45.length)
for (int i45 = 0; i45 < 1 && i45 < trans45_0; i45++) {
if (trans46_1 <= a46.length)
if (trans46_0 <= trans46_1)
for (int i46 = 0; i46 < 1 && i46 < trans46_0; i46++) {
if (trans47_1 <= a47.length)
if (trans47_0 <= trans47_1)
for (int i47 = 0; i47 < 1 && i47 < trans47_0; i47++) {
if (trans48_1 <= a48.length)
if (trans48_0 <= trans48_1)
for (int i48 = 0; i48 < 1 && i48 < trans48_0; i48++) {
if (trans49_0 <= trans49_1)
if (trans49_1 <= a49.length)
for (int i49 = 0; i49 < 1 && i49 < trans49_0; i49++) {
if (trans50_1 <= a50.length)
if (trans50_0 <= trans50_1)
for (int i50 = 0; i50 < 1 && i50 < trans50_0; i50++) {
if (trans51_0 <= trans51_1)
if (trans51_1 <= a51.length)
for (int i51 = 0; i51 < 1 && i51 < trans51_0; i51++) {
if (trans52_1 <= a52.length)
if (trans52_0 <= trans52_1)
for (int i52 = 0; i52 < 1 && i52 < trans52_0; i52++) {
if (trans53_0 <= trans53_1)
if (trans53_1 <= a53.length)
for (int i53 = 0; i53 < 1 && i53 < trans53_0; i53++) {
if (trans54_0 <= trans54_1)
if (trans54_1 <= a54.length)
for (int i54 = 0; i54 < 1 && i54 < trans54_0; i54++) {
if (trans55_1 <= a55.length)
if (trans55_0 <= trans55_1)
for (int i55 = 0; i55 < 1 && i55 < trans55_0; i55++) {
if (trans56_0 <= trans56_1)
if (trans56_1 <= a56.length)
for (int i56 = 0; i56 < 1 && i56 < trans56_0; i56++) {
if (trans57_0 <= trans57_1)
if (trans57_1 <= a57.length)
for (int i57 = 0; i57 < 1 && i57 < trans57_0; i57++) {
if (trans58_0 <= trans58_1)
if (trans58_1 <= a58.length)
for (int i58 = 0; i58 < 1 && i58 < trans58_0; i58++) {
if (trans59_0 <= trans59_1)
if (trans59_1 <= a59.length)
for (int i59 = 0; i59 < 1 && i59 < trans59_0; i59++) {
if (trans60_0 <= trans60_1)
if (trans60_1 <= a60.length)
for (int i60 = 0; i60 < 1 && i60 < trans60_0; i60++) {
if (trans61_0 <= trans61_1)
if (trans61_1 <= a61.length)
for (int i61 = 0; i61 < 1 && i61 < trans61_0; i61++) {
if (trans62_1 <= a62.length)
if (trans62_0 <= trans62_1)
for (int i62 = 0; i62 < 1 && i62 < trans62_0; i62++) {
if (trans63_1 <= a63.length)
if (trans63_0 <= trans63_1)
for (int i63 = 0; i63 < 1 && i63 < trans63_0; i63++) {
if (trans64_1 <= a64.length)
if (trans64_0 <= trans64_1)
for (int i64 = 0; i64 < 1 && i64 < trans64_0; i64++) {
if (trans65_0 <= trans65_1)
if (trans65_1 <= a65.length)
for (int i65 = 0; i65 < 1 && i65 < trans65_0; i65++) {
if (trans66_1 <= a66.length)
if (trans66_0 <= trans66_1)
for (int i66 = 0; i66 < 1 && i66 < trans66_0; i66++) {
if (trans67_0 <= trans67_1)
if (trans67_1 <= a67.length)
for (int i67 = 0; i67 < 1 && i67 < trans67_0; i67++) {
if (trans68_0 <= trans68_1)
if (trans68_1 <= a68.length)
for (int i68 = 0; i68 < 1 && i68 < trans68_0; i68++) {
if (trans69_1 <= a69.length)
if (trans69_0 <= trans69_1)
for (int i69 = 0; i69 < 1 && i69 < trans69_0; i69++) {
if (trans70_1 <= a70.length)
if (trans70_0 <= trans70_1)
for (int i70 = 0; i70 < 1 && i70 < trans70_0; i70++) {
if (trans71_1 <= a71.length)
if (trans71_0 <= trans71_1)
for (int i71 = 0; i71 < 1 && i71 < trans71_0; i71++) {
if (trans72_0 <= trans72_1)
if (trans72_1 <= a72.length)
for (int i72 = 0; i72 < 1 && i72 < trans72_0; i72++) {
if (trans73_1 <= a73.length)
if (trans73_0 <= trans73_1)
for (int i73 = 0; i73 < 1 && i73 < trans73_0; i73++) {
if (trans74_1 <= a74.length)
if (trans74_0 <= trans74_1)
for (int i74 = 0; i74 < 1 && i74 < trans74_0; i74++) {
if (trans75_0 <= trans75_1)
if (trans75_1 <= a75.length)
for (int i75 = 0; i75 < 1 && i75 < trans75_0; i75++) {
if (trans76_0 <= trans76_1)
if (trans76_1 <= a76.length)
for (int i76 = 0; i76 < 1 && i76 < trans76_0; i76++) {
if (trans77_0 <= trans77_1)
if (trans77_1 <= a77.length)
for (int i77 = 0; i77 < 1 && i77 < trans77_0; i77++) {
if (trans78_0 <= trans78_1)
if (trans78_1 <= a78.length)
for (int i78 = 0; i78 < 1 && i78 < trans78_0; i78++) {
if (trans79_1 <= a79.length)
if (trans79_0 <= trans79_1)
for (int i79 = 0; i79 < 1 && i79 < trans79_0; i79++) {
if (trans80_1 <= a80.length)
if (trans80_0 <= trans80_1)
for (int i80 = 0; i80 < 1 && i80 < trans80_0; i80++) {
if (trans81_0 <= trans81_1)
if (trans81_1 <= a81.length)
for (int i81 = 0; i81 < 1 && i81 < trans81_0; i81++) {
if (trans82_0 <= trans82_1)
if (trans82_1 <= a82.length)
for (int i82 = 0; i82 < 1 && i82 < trans82_0; i82++) {
if (trans83_0 <= trans83_1)
if (trans83_1 <= a83.length)
for (int i83 = 0; i83 < 1 && i83 < trans83_0; i83++) {
if (trans84_1 <= a84.length)
if (trans84_0 <= trans84_1)
for (int i84 = 0; i84 < 1 && i84 < trans84_0; i84++) {
if (trans85_1 <= a85.length)
if (trans85_0 <= trans85_1)
for (int i85 = 0; i85 < 1 && i85 < trans85_0; i85++) {
if (trans86_1 <= a86.length)
if (trans86_0 <= trans86_1)
for (int i86 = 0; i86 < 1 && i86 < trans86_0; i86++) {
if (trans87_1 <= a87.length)
if (trans87_0 <= trans87_1)
for (int i87 = 0; i87 < 1 && i87 < trans87_0; i87++) {
if (trans88_0 <= trans88_1)
if (trans88_1 <= a88.length)
for (int i88 = 0; i88 < 1 && i88 < trans88_0; i88++) {
if (trans89_0 <= trans89_1)
if (trans89_1 <= a89.length)
for (int i89 = 0; i89 < 1 && i89 < trans89_0; i89++) {
if (trans90_1 <= a90.length)
if (trans90_0 <= trans90_1)
for (int i90 = 0; i90 < 1 && i90 < trans90_0; i90++) {
if (trans91_0 <= trans91_1)
if (trans91_1 <= a91.length)
for (int i91 = 0; i91 < 1 && i91 < trans91_0; i91++) {
if (trans92_0 <= trans92_1)
if (trans92_1 <= a92.length)
for (int i92 = 0; i92 < 1 && i92 < trans92_0; i92++) {
if (trans93_0 <= trans93_1)
if (trans93_1 <= a93.length)
for (int i93 = 0; i93 < 1 && i93 < trans93_0; i93++) {
if (trans94_0 <= trans94_1)
if (trans94_1 <= a94.length)
for (int i94 = 0; i94 < 1 && i94 < trans94_0; i94++) {
if (trans95_1 <= a95.length)
if (trans95_0 <= trans95_1)
for (int i95 = 0; i95 < 1 && i95 < trans95_0; i95++) {
if (trans96_0 <= trans96_1)
if (trans96_1 <= a96.length)
for (int i96 = 0; i96 < 1 && i96 < trans96_0; i96++) {
if (trans97_0 <= trans97_1)
if (trans97_1 <= a97.length)
for (int i97 = 0; i97 < 1 && i97 < trans97_0; i97++) {
if (trans98_1 <= a98.length)
if (trans98_0 <= trans98_1)
for (int i98 = 0; i98 < 1 && i98 < trans98_0; i98++) {
if (trans99_1 <= a99.length)
if (trans99_0 <= trans99_1)
for (int i99 = 0; i99 < 1 && i99 < trans99_0; i99++) {
if (trans100_0 <= trans100_1)
if (trans100_1 <= a100.length)
for (int i100 = 0; i100 < 1 && i100 < trans100_0; i100++) {
if (trans101_0 <= trans101_1)
if (trans101_1 <= a101.length)
for (int i101 = 0; i101 < 1 && i101 < trans101_0; i101++) {
if (trans102_0 <= trans102_1)
if (trans102_1 <= a102.length)
for (int i102 = 0; i102 < 1 && i102 < trans102_0; i102++) {
if (trans103_1 <= a103.length)
if (trans103_0 <= trans103_1)
for (int i103 = 0; i103 < 1 && i103 < trans103_0; i103++) {
if (trans104_0 <= trans104_1)
if (trans104_1 <= a104.length)
for (int i104 = 0; i104 < 1 && i104 < trans104_0; i104++) {
if (trans105_0 <= trans105_1)
if (trans105_1 <= a105.length)
for (int i105 = 0; i105 < 1 && i105 < trans105_0; i105++) {
if (trans106_0 <= trans106_1)
if (trans106_1 <= a106.length)
for (int i106 = 0; i106 < 1 && i106 < trans106_0; i106++) {
if (trans107_0 <= trans107_1)
if (trans107_1 <= a107.length)
for (int i107 = 0; i107 < 1 && i107 < trans107_0; i107++) {
if (trans108_1 <= a108.length)
if (trans108_0 <= trans108_1)
for (int i108 = 0; i108 < 1 && i108 < trans108_0; i108++) {
if (trans109_0 <= trans109_1)
if (trans109_1 <= a109.length)
for (int i109 = 0; i109 < 1 && i109 < trans109_0; i109++) {
if (trans110_0 <= trans110_1)
if (trans110_1 <= a110.length)
for (int i110 = 0; i110 < 1 && i110 < trans110_0; i110++) {
if (trans111_0 <= trans111_1)
if (trans111_1 <= a111.length)
for (int i111 = 0; i111 < 1 && i111 < trans111_0; i111++) {
if (trans112_0 <= trans112_1)
if (trans112_1 <= a112.length)
for (int i112 = 0; i112 < 1 && i112 < trans112_0; i112++) {
if (trans113_0 <= trans113_1)
if (trans113_1 <= a113.length)
for (int i113 = 0; i113 < 1 && i113 < trans113_0; i113++) {
if (trans114_0 <= trans114_1)
if (trans114_1 <= a114.length)
for (int i114 = 0; i114 < 1 && i114 < trans114_0; i114++) {
if (trans115_1 <= a115.length)
if (trans115_0 <= trans115_1)
for (int i115 = 0; i115 < 1 && i115 < trans115_0; i115++) {
if (trans116_0 <= trans116_1)
if (trans116_1 <= a116.length)
for (int i116 = 0; i116 < 1 && i116 < trans116_0; i116++) {
if (trans117_1 <= a117.length)
if (trans117_0 <= trans117_1)
for (int i117 = 0; i117 < 1 && i117 < trans117_0; i117++) {
if (trans118_1 <= a118.length)
if (trans118_0 <= trans118_1)
for (int i118 = 0; i118 < 1 && i118 < trans118_0; i118++) {
if (trans119_1 <= a119.length)
if (trans119_0 <= trans119_1)
for (int i119 = 0; i119 < 1 && i119 < trans119_0; i119++) {
if (trans120_1 <= a120.length)
if (trans120_0 <= trans120_1)
for (int i120 = 0; i120 < 1 && i120 < trans120_0; i120++) {
if (trans121_0 <= trans121_1)
if (trans121_1 <= a121.length)
for (int i121 = 0; i121 < 1 && i121 < trans121_0; i121++) {
if (trans122_1 <= a122.length)
if (trans122_0 <= trans122_1)
for (int i122 = 0; i122 < 1 && i122 < trans122_0; i122++) {
if (trans123_0 <= trans123_1)
if (trans123_1 <= a123.length)
for (int i123 = 0; i123 < 1 && i123 < trans123_0; i123++) {
if (trans124_1 <= a124.length)
if (trans124_0 <= trans124_1)
for (int i124 = 0; i124 < 1 && i124 < trans124_0; i124++) {
if (trans125_0 <= trans125_1)
if (trans125_1 <= a125.length)
for (int i125 = 0; i125 < 1 && i125 < trans125_0; i125++) {
if (trans126_1 <= a126.length)
if (trans126_0 <= trans126_1)
for (int i126 = 0; i126 < 1 && i126 < trans126_0; i126++) {
if (trans127_0 <= trans127_1)
if (trans127_1 <= a127.length)
for (int i127 = 0; i127 < 1 && i127 < trans127_0; i127++) {
if (trans128_1 <= a128.length)
if (trans128_0 <= trans128_1)
for (int i128 = 0; i128 < 1 && i128 < trans128_0; i128++) {
if (trans129_1 <= a129.length)
if (trans129_0 <= trans129_1)
for (int i129 = 0; i129 < 1 && i129 < trans129_0; i129++) {
if (trans130_0 <= trans130_1)
if (trans130_1 <= a130.length)
for (int i130 = 0; i130 < 1 && i130 < trans130_0; i130++) {
if (trans131_1 <= a131.length)
if (trans131_0 <= trans131_1)
for (int i131 = 0; i131 < 1 && i131 < trans131_0; i131++) {
if (trans132_1 <= a132.length)
if (trans132_0 <= trans132_1)
for (int i132 = 0; i132 < 1 && i132 < trans132_0; i132++) {
if (trans133_0 <= trans133_1)
if (trans133_1 <= a133.length)
for (int i133 = 0; i133 < 1 && i133 < trans133_0; i133++) {
if (trans134_0 <= trans134_1)
if (trans134_1 <= a134.length)
for (int i134 = 0; i134 < 1 && i134 < trans134_0; i134++) {
if (trans135_1 <= a135.length)
if (trans135_0 <= trans135_1)
for (int i135 = 0; i135 < 1 && i135 < trans135_0; i135++) {
if (trans136_1 <= a136.length)
if (trans136_0 <= trans136_1)
for (int i136 = 0; i136 < 1 && i136 < trans136_0; i136++) {
if (trans137_1 <= a137.length)
if (trans137_0 <= trans137_1)
for (int i137 = 0; i137 < 1 && i137 < trans137_0; i137++) {
if (trans138_1 <= a138.length)
if (trans138_0 <= trans138_1)
for (int i138 = 0; i138 < 1 && i138 < trans138_0; i138++) {
if (trans139_0 <= trans139_1)
if (trans139_1 <= a139.length)
for (int i139 = 0; i139 < 1 && i139 < trans139_0; i139++) {
if (trans140_0 <= trans140_1)
if (trans140_1 <= a140.length)
for (int i140 = 0; i140 < 1 && i140 < trans140_0; i140++) {
if (trans141_1 <= a141.length)
if (trans141_0 <= trans141_1)
for (int i141 = 0; i141 < 1 && i141 < trans141_0; i141++) {
if (trans142_1 <= a142.length)
if (trans142_0 <= trans142_1)
for (int i142 = 0; i142 < 1 && i142 < trans142_0; i142++) {
if (trans143_1 <= a143.length)
if (trans143_0 <= trans143_1)
for (int i143 = 0; i143 < 1 && i143 < trans143_0; i143++) {
if (trans144_0 <= trans144_1)
if (trans144_1 <= a144.length)
for (int i144 = 0; i144 < 1 && i144 < trans144_0; i144++) {
if (trans145_1 <= a145.length)
if (trans145_0 <= trans145_1)
for (int i145 = 0; i145 < 1 && i145 < trans145_0; i145++) {
if (trans146_0 <= trans146_1)
if (trans146_1 <= a146.length)
for (int i146 = 0; i146 < 1 && i146 < trans146_0; i146++) {
if (trans147_0 <= trans147_1)
if (trans147_1 <= a147.length)
for (int i147 = 0; i147 < 1 && i147 < trans147_0; i147++) {
if (trans148_1 <= a148.length)
if (trans148_0 <= trans148_1)
for (int i148 = 0; i148 < 1 && i148 < trans148_0; i148++) {
if (trans149_1 <= a149.length)
if (trans149_0 <= trans149_1)
for (int i149 = 0; i149 < 1 && i149 < trans149_0; i149++) {
if (trans150_1 <= a150.length)
if (trans150_0 <= trans150_1)
for (int i150 = 0; i150 < 1 && i150 < trans150_0; i150++) {
if (trans151_1 <= a151.length)
if (trans151_0 <= trans151_1)
for (int i151 = 0; i151 < 1 && i151 < trans151_0; i151++) {
if (trans152_1 <= a152.length)
if (trans152_0 <= trans152_1)
for (int i152 = 0; i152 < 1 && i152 < trans152_0; i152++) {
if (trans153_0 <= trans153_1)
if (trans153_1 <= a153.length)
for (int i153 = 0; i153 < 1 && i153 < trans153_0; i153++) {
if (trans154_0 <= trans154_1)
if (trans154_1 <= a154.length)
for (int i154 = 0; i154 < 1 && i154 < trans154_0; i154++) {
if (trans155_1 <= a155.length)
if (trans155_0 <= trans155_1)
for (int i155 = 0; i155 < 1 && i155 < trans155_0; i155++) {
if (trans156_1 <= a156.length)
if (trans156_0 <= trans156_1)
for (int i156 = 0; i156 < 1 && i156 < trans156_0; i156++) {
if (trans157_1 <= a157.length)
if (trans157_0 <= trans157_1)
for (int i157 = 0; i157 < 1 && i157 < trans157_0; i157++) {
if (trans158_1 <= a158.length)
if (trans158_0 <= trans158_1)
for (int i158 = 0; i158 < 1 && i158 < trans158_0; i158++) {
if (trans159_1 <= a159.length)
if (trans159_0 <= trans159_1)
for (int i159 = 0; i159 < 1 && i159 < trans159_0; i159++) {
if (trans160_1 <= a160.length)
if (trans160_0 <= trans160_1)
for (int i160 = 0; i160 < 1 && i160 < trans160_0; i160++) {
if (trans161_0 <= trans161_1)
if (trans161_1 <= a161.length)
for (int i161 = 0; i161 < 1 && i161 < trans161_0; i161++) {
if (trans162_1 <= a162.length)
if (trans162_0 <= trans162_1)
for (int i162 = 0; i162 < 1 && i162 < trans162_0; i162++) {
if (trans163_1 <= a163.length)
if (trans163_0 <= trans163_1)
for (int i163 = 0; i163 < 1 && i163 < trans163_0; i163++) {
if (trans164_1 <= a164.length)
if (trans164_0 <= trans164_1)
for (int i164 = 0; i164 < 1 && i164 < trans164_0; i164++) {
if (trans165_1 <= a165.length)
if (trans165_0 <= trans165_1)
for (int i165 = 0; i165 < 1 && i165 < trans165_0; i165++) {
if (trans166_1 <= a166.length)
if (trans166_0 <= trans166_1)
for (int i166 = 0; i166 < 1 && i166 < trans166_0; i166++) {
if (trans167_1 <= a167.length)
if (trans167_0 <= trans167_1)
for (int i167 = 0; i167 < 1 && i167 < trans167_0; i167++) {
if (trans168_1 <= a168.length)
if (trans168_0 <= trans168_1)
for (int i168 = 0; i168 < 1 && i168 < trans168_0; i168++) {
if (trans169_0 <= trans169_1)
if (trans169_1 <= a169.length)
for (int i169 = 0; i169 < 1 && i169 < trans169_0; i169++) {
if (trans170_1 <= a170.length)
if (trans170_0 <= trans170_1)
for (int i170 = 0; i170 < 1 && i170 < trans170_0; i170++) {
if (trans171_0 <= trans171_1)
if (trans171_1 <= a171.length)
for (int i171 = 0; i171 < 1 && i171 < trans171_0; i171++) {
if (trans172_1 <= a172.length)
if (trans172_0 <= trans172_1)
for (int i172 = 0; i172 < 1 && i172 < trans172_0; i172++) {
if (trans173_0 <= trans173_1)
if (trans173_1 <= a173.length)
for (int i173 = 0; i173 < 1 && i173 < trans173_0; i173++) {
if (trans174_1 <= a174.length)
if (trans174_0 <= trans174_1)
for (int i174 = 0; i174 < 1 && i174 < trans174_0; i174++) {
if (trans175_0 <= trans175_1)
if (trans175_1 <= a175.length)
for (int i175 = 0; i175 < 1 && i175 < trans175_0; i175++) {
if (trans176_1 <= a176.length)
if (trans176_0 <= trans176_1)
for (int i176 = 0; i176 < 1 && i176 < trans176_0; i176++) {
if (trans177_0 <= trans177_1)
if (trans177_1 <= a177.length)
for (int i177 = 0; i177 < 1 && i177 < trans177_0; i177++) {
if (trans178_0 <= trans178_1)
if (trans178_1 <= a178.length)
for (int i178 = 0; i178 < 1 && i178 < trans178_0; i178++) {
if (trans179_1 <= a179.length)
if (trans179_0 <= trans179_1)
for (int i179 = 0; i179 < 1 && i179 < trans179_0; i179++) {
if (trans180_1 <= a180.length)
if (trans180_0 <= trans180_1)
for (int i180 = 0; i180 < 1 && i180 < trans180_0; i180++) {
if (trans181_0 <= trans181_1)
if (trans181_1 <= a181.length)
for (int i181 = 0; i181 < 1 && i181 < trans181_0; i181++) {
if (trans182_0 <= trans182_1)
if (trans182_1 <= a182.length)
for (int i182 = 0; i182 < 1 && i182 < trans182_0; i182++) {
if (trans183_0 <= trans183_1)
if (trans183_1 <= a183.length)
for (int i183 = 0; i183 < 1 && i183 < trans183_0; i183++) {
if (trans184_1 <= a184.length)
if (trans184_0 <= trans184_1)
for (int i184 = 0; i184 < 1 && i184 < trans184_0; i184++) {
if (trans185_0 <= trans185_1)
if (trans185_1 <= a185.length)
for (int i185 = 0; i185 < 1 && i185 < trans185_0; i185++) {
if (trans186_1 <= a186.length)
if (trans186_0 <= trans186_1)
for (int i186 = 0; i186 < 1 && i186 < trans186_0; i186++) {
if (trans187_0 <= trans187_1)
if (trans187_1 <= a187.length)
for (int i187 = 0; i187 < 1 && i187 < trans187_0; i187++) {
if (trans188_0 <= trans188_1)
if (trans188_1 <= a188.length)
for (int i188 = 0; i188 < 1 && i188 < trans188_0; i188++) {
if (trans189_1 <= a189.length)
if (trans189_0 <= trans189_1)
for (int i189 = 0; i189 < 1 && i189 < trans189_0; i189++) {
if (trans190_1 <= a190.length)
if (trans190_0 <= trans190_1)
for (int i190 = 0; i190 < 1 && i190 < trans190_0; i190++) {
if (trans191_0 <= trans191_1)
if (trans191_1 <= a191.length)
for (int i191 = 0; i191 < 1 && i191 < trans191_0; i191++) {
if (trans192_0 <= trans192_1)
if (trans192_1 <= a192.length)
for (int i192 = 0; i192 < 1 && i192 < trans192_0; i192++) {
if (trans193_0 <= trans193_1)
if (trans193_1 <= a193.length)
for (int i193 = 0; i193 < 1 && i193 < trans193_0; i193++) {
if (trans194_1 <= a194.length)
if (trans194_0 <= trans194_1)
for (int i194 = 0; i194 < 1 && i194 < trans194_0; i194++) {
if (trans195_0 <= trans195_1)
if (trans195_1 <= a195.length)
for (int i195 = 0; i195 < 1 && i195 < trans195_0; i195++) {
if (trans196_1 <= a196.length)
if (trans196_0 <= trans196_1)
for (int i196 = 0; i196 < 1 && i196 < trans196_0; i196++) {
if (trans197_0 <= trans197_1)
if (trans197_1 <= a197.length)
for (int i197 = 0; i197 < 1 && i197 < trans197_0; i197++) {
if (trans198_1 <= a198.length)
if (trans198_0 <= trans198_1)
for (int i198 = 0; i198 < 1 && i198 < trans198_0; i198++) {
if (trans199_0 <= trans199_1)
if (trans199_1 <= a199.length)
for (int i199 = 0; i199 < 1 && i199 < trans199_0; i199++) {
s += a0[i0];
s += a1[i1];
s += a2[i2];
s += a3[i3];
s += a4[i4];
s += a5[i5];
s += a6[i6];
s += a7[i7];
s += a8[i8];
s += a9[i9];
s += a10[i10];
s += a11[i11];
s += a12[i12];
s += a13[i13];
s += a14[i14];
s += a15[i15];
s += a16[i16];
s += a17[i17];
s += a18[i18];
s += a19[i19];
s += a20[i20];
s += a21[i21];
s += a22[i22];
s += a23[i23];
s += a24[i24];
s += a25[i25];
s += a26[i26];
s += a27[i27];
s += a28[i28];
s += a29[i29];
s += a30[i30];
s += a31[i31];
s += a32[i32];
s += a33[i33];
s += a34[i34];
s += a35[i35];
s += a36[i36];
s += a37[i37];
s += a38[i38];
s += a39[i39];
s += a40[i40];
s += a41[i41];
s += a42[i42];
s += a43[i43];
s += a44[i44];
s += a45[i45];
s += a46[i46];
s += a47[i47];
s += a48[i48];
s += a49[i49];
s += a50[i50];
s += a51[i51];
s += a52[i52];
s += a53[i53];
s += a54[i54];
s += a55[i55];
s += a56[i56];
s += a57[i57];
s += a58[i58];
s += a59[i59];
s += a60[i60];
s += a61[i61];
s += a62[i62];
s += a63[i63];
s += a64[i64];
s += a65[i65];
s += a66[i66];
s += a67[i67];
s += a68[i68];
s += a69[i69];
s += a70[i70];
s += a71[i71];
s += a72[i72];
s += a73[i73];
s += a74[i74];
s += a75[i75];
s += a76[i76];
s += a77[i77];
s += a78[i78];
s += a79[i79];
s += a80[i80];
s += a81[i81];
s += a82[i82];
s += a83[i83];
s += a84[i84];
s += a85[i85];
s += a86[i86];
s += a87[i87];
s += a88[i88];
s += a89[i89];
s += a90[i90];
s += a91[i91];
s += a92[i92];
s += a93[i93];
s += a94[i94];
s += a95[i95];
s += a96[i96];
s += a97[i97];
s += a98[i98];
s += a99[i99];
s += a100[i100];
s += a101[i101];
s += a102[i102];
s += a103[i103];
s += a104[i104];
s += a105[i105];
s += a106[i106];
s += a107[i107];
s += a108[i108];
s += a109[i109];
s += a110[i110];
s += a111[i111];
s += a112[i112];
s += a113[i113];
s += a114[i114];
s += a115[i115];
s += a116[i116];
s += a117[i117];
s += a118[i118];
s += a119[i119];
s += a120[i120];
s += a121[i121];
s += a122[i122];
s += a123[i123];
s += a124[i124];
s += a125[i125];
s += a126[i126];
s += a127[i127];
s += a128[i128];
s += a129[i129];
s += a130[i130];
s += a131[i131];
s += a132[i132];
s += a133[i133];
s += a134[i134];
s += a135[i135];
s += a136[i136];
s += a137[i137];
s += a138[i138];
s += a139[i139];
s += a140[i140];
s += a141[i141];
s += a142[i142];
s += a143[i143];
s += a144[i144];
s += a145[i145];
s += a146[i146];
s += a147[i147];
s += a148[i148];
s += a149[i149];
s += a150[i150];
s += a151[i151];
s += a152[i152];
s += a153[i153];
s += a154[i154];
s += a155[i155];
s += a156[i156];
s += a157[i157];
s += a158[i158];
s += a159[i159];
s += a160[i160];
s += a161[i161];
s += a162[i162];
s += a163[i163];
s += a164[i164];
s += a165[i165];
s += a166[i166];
s += a167[i167];
s += a168[i168];
s += a169[i169];
s += a170[i170];
s += a171[i171];
s += a172[i172];
s += a173[i173];
s += a174[i174];
s += a175[i175];
s += a176[i176];
s += a177[i177];
s += a178[i178];
s += a179[i179];
s += a180[i180];
s += a181[i181];
s += a182[i182];
s += a183[i183];
s += a184[i184];
s += a185[i185];
s += a186[i186];
s += a187[i187];
s += a188[i188];
s += a189[i189];
s += a190[i190];
s += a191[i191];
s += a192[i192];
s += a193[i193];
s += a194[i194];
s += a195[i195];
s += a196[i196];
s += a197[i197];
s += a198[i198];
s += a199[i199];
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
return s; }

@Benchmark public int bench_big_n200_multipleTrue_trans2_transrandomTrue() {
return big_n200_multipleTrue_trans2_transrandomTrue();
}

int big_n200_multipleTrue_trans1_transrandomTrue() {
int s = 0;
if (!(trans0.length >= 1)) return -1;
int trans0_0 = trans0[0];
if (!(trans1.length >= 1)) return -1;
int trans1_0 = trans1[0];
if (!(trans2.length >= 1)) return -1;
int trans2_0 = trans2[0];
if (!(trans3.length >= 1)) return -1;
int trans3_0 = trans3[0];
if (!(trans4.length >= 1)) return -1;
int trans4_0 = trans4[0];
if (!(trans5.length >= 1)) return -1;
int trans5_0 = trans5[0];
if (!(trans6.length >= 1)) return -1;
int trans6_0 = trans6[0];
if (!(trans7.length >= 1)) return -1;
int trans7_0 = trans7[0];
if (!(trans8.length >= 1)) return -1;
int trans8_0 = trans8[0];
if (!(trans9.length >= 1)) return -1;
int trans9_0 = trans9[0];
if (!(trans10.length >= 1)) return -1;
int trans10_0 = trans10[0];
if (!(trans11.length >= 1)) return -1;
int trans11_0 = trans11[0];
if (!(trans12.length >= 1)) return -1;
int trans12_0 = trans12[0];
if (!(trans13.length >= 1)) return -1;
int trans13_0 = trans13[0];
if (!(trans14.length >= 1)) return -1;
int trans14_0 = trans14[0];
if (!(trans15.length >= 1)) return -1;
int trans15_0 = trans15[0];
if (!(trans16.length >= 1)) return -1;
int trans16_0 = trans16[0];
if (!(trans17.length >= 1)) return -1;
int trans17_0 = trans17[0];
if (!(trans18.length >= 1)) return -1;
int trans18_0 = trans18[0];
if (!(trans19.length >= 1)) return -1;
int trans19_0 = trans19[0];
if (!(trans20.length >= 1)) return -1;
int trans20_0 = trans20[0];
if (!(trans21.length >= 1)) return -1;
int trans21_0 = trans21[0];
if (!(trans22.length >= 1)) return -1;
int trans22_0 = trans22[0];
if (!(trans23.length >= 1)) return -1;
int trans23_0 = trans23[0];
if (!(trans24.length >= 1)) return -1;
int trans24_0 = trans24[0];
if (!(trans25.length >= 1)) return -1;
int trans25_0 = trans25[0];
if (!(trans26.length >= 1)) return -1;
int trans26_0 = trans26[0];
if (!(trans27.length >= 1)) return -1;
int trans27_0 = trans27[0];
if (!(trans28.length >= 1)) return -1;
int trans28_0 = trans28[0];
if (!(trans29.length >= 1)) return -1;
int trans29_0 = trans29[0];
if (!(trans30.length >= 1)) return -1;
int trans30_0 = trans30[0];
if (!(trans31.length >= 1)) return -1;
int trans31_0 = trans31[0];
if (!(trans32.length >= 1)) return -1;
int trans32_0 = trans32[0];
if (!(trans33.length >= 1)) return -1;
int trans33_0 = trans33[0];
if (!(trans34.length >= 1)) return -1;
int trans34_0 = trans34[0];
if (!(trans35.length >= 1)) return -1;
int trans35_0 = trans35[0];
if (!(trans36.length >= 1)) return -1;
int trans36_0 = trans36[0];
if (!(trans37.length >= 1)) return -1;
int trans37_0 = trans37[0];
if (!(trans38.length >= 1)) return -1;
int trans38_0 = trans38[0];
if (!(trans39.length >= 1)) return -1;
int trans39_0 = trans39[0];
if (!(trans40.length >= 1)) return -1;
int trans40_0 = trans40[0];
if (!(trans41.length >= 1)) return -1;
int trans41_0 = trans41[0];
if (!(trans42.length >= 1)) return -1;
int trans42_0 = trans42[0];
if (!(trans43.length >= 1)) return -1;
int trans43_0 = trans43[0];
if (!(trans44.length >= 1)) return -1;
int trans44_0 = trans44[0];
if (!(trans45.length >= 1)) return -1;
int trans45_0 = trans45[0];
if (!(trans46.length >= 1)) return -1;
int trans46_0 = trans46[0];
if (!(trans47.length >= 1)) return -1;
int trans47_0 = trans47[0];
if (!(trans48.length >= 1)) return -1;
int trans48_0 = trans48[0];
if (!(trans49.length >= 1)) return -1;
int trans49_0 = trans49[0];
if (!(trans50.length >= 1)) return -1;
int trans50_0 = trans50[0];
if (!(trans51.length >= 1)) return -1;
int trans51_0 = trans51[0];
if (!(trans52.length >= 1)) return -1;
int trans52_0 = trans52[0];
if (!(trans53.length >= 1)) return -1;
int trans53_0 = trans53[0];
if (!(trans54.length >= 1)) return -1;
int trans54_0 = trans54[0];
if (!(trans55.length >= 1)) return -1;
int trans55_0 = trans55[0];
if (!(trans56.length >= 1)) return -1;
int trans56_0 = trans56[0];
if (!(trans57.length >= 1)) return -1;
int trans57_0 = trans57[0];
if (!(trans58.length >= 1)) return -1;
int trans58_0 = trans58[0];
if (!(trans59.length >= 1)) return -1;
int trans59_0 = trans59[0];
if (!(trans60.length >= 1)) return -1;
int trans60_0 = trans60[0];
if (!(trans61.length >= 1)) return -1;
int trans61_0 = trans61[0];
if (!(trans62.length >= 1)) return -1;
int trans62_0 = trans62[0];
if (!(trans63.length >= 1)) return -1;
int trans63_0 = trans63[0];
if (!(trans64.length >= 1)) return -1;
int trans64_0 = trans64[0];
if (!(trans65.length >= 1)) return -1;
int trans65_0 = trans65[0];
if (!(trans66.length >= 1)) return -1;
int trans66_0 = trans66[0];
if (!(trans67.length >= 1)) return -1;
int trans67_0 = trans67[0];
if (!(trans68.length >= 1)) return -1;
int trans68_0 = trans68[0];
if (!(trans69.length >= 1)) return -1;
int trans69_0 = trans69[0];
if (!(trans70.length >= 1)) return -1;
int trans70_0 = trans70[0];
if (!(trans71.length >= 1)) return -1;
int trans71_0 = trans71[0];
if (!(trans72.length >= 1)) return -1;
int trans72_0 = trans72[0];
if (!(trans73.length >= 1)) return -1;
int trans73_0 = trans73[0];
if (!(trans74.length >= 1)) return -1;
int trans74_0 = trans74[0];
if (!(trans75.length >= 1)) return -1;
int trans75_0 = trans75[0];
if (!(trans76.length >= 1)) return -1;
int trans76_0 = trans76[0];
if (!(trans77.length >= 1)) return -1;
int trans77_0 = trans77[0];
if (!(trans78.length >= 1)) return -1;
int trans78_0 = trans78[0];
if (!(trans79.length >= 1)) return -1;
int trans79_0 = trans79[0];
if (!(trans80.length >= 1)) return -1;
int trans80_0 = trans80[0];
if (!(trans81.length >= 1)) return -1;
int trans81_0 = trans81[0];
if (!(trans82.length >= 1)) return -1;
int trans82_0 = trans82[0];
if (!(trans83.length >= 1)) return -1;
int trans83_0 = trans83[0];
if (!(trans84.length >= 1)) return -1;
int trans84_0 = trans84[0];
if (!(trans85.length >= 1)) return -1;
int trans85_0 = trans85[0];
if (!(trans86.length >= 1)) return -1;
int trans86_0 = trans86[0];
if (!(trans87.length >= 1)) return -1;
int trans87_0 = trans87[0];
if (!(trans88.length >= 1)) return -1;
int trans88_0 = trans88[0];
if (!(trans89.length >= 1)) return -1;
int trans89_0 = trans89[0];
if (!(trans90.length >= 1)) return -1;
int trans90_0 = trans90[0];
if (!(trans91.length >= 1)) return -1;
int trans91_0 = trans91[0];
if (!(trans92.length >= 1)) return -1;
int trans92_0 = trans92[0];
if (!(trans93.length >= 1)) return -1;
int trans93_0 = trans93[0];
if (!(trans94.length >= 1)) return -1;
int trans94_0 = trans94[0];
if (!(trans95.length >= 1)) return -1;
int trans95_0 = trans95[0];
if (!(trans96.length >= 1)) return -1;
int trans96_0 = trans96[0];
if (!(trans97.length >= 1)) return -1;
int trans97_0 = trans97[0];
if (!(trans98.length >= 1)) return -1;
int trans98_0 = trans98[0];
if (!(trans99.length >= 1)) return -1;
int trans99_0 = trans99[0];
if (!(trans100.length >= 1)) return -1;
int trans100_0 = trans100[0];
if (!(trans101.length >= 1)) return -1;
int trans101_0 = trans101[0];
if (!(trans102.length >= 1)) return -1;
int trans102_0 = trans102[0];
if (!(trans103.length >= 1)) return -1;
int trans103_0 = trans103[0];
if (!(trans104.length >= 1)) return -1;
int trans104_0 = trans104[0];
if (!(trans105.length >= 1)) return -1;
int trans105_0 = trans105[0];
if (!(trans106.length >= 1)) return -1;
int trans106_0 = trans106[0];
if (!(trans107.length >= 1)) return -1;
int trans107_0 = trans107[0];
if (!(trans108.length >= 1)) return -1;
int trans108_0 = trans108[0];
if (!(trans109.length >= 1)) return -1;
int trans109_0 = trans109[0];
if (!(trans110.length >= 1)) return -1;
int trans110_0 = trans110[0];
if (!(trans111.length >= 1)) return -1;
int trans111_0 = trans111[0];
if (!(trans112.length >= 1)) return -1;
int trans112_0 = trans112[0];
if (!(trans113.length >= 1)) return -1;
int trans113_0 = trans113[0];
if (!(trans114.length >= 1)) return -1;
int trans114_0 = trans114[0];
if (!(trans115.length >= 1)) return -1;
int trans115_0 = trans115[0];
if (!(trans116.length >= 1)) return -1;
int trans116_0 = trans116[0];
if (!(trans117.length >= 1)) return -1;
int trans117_0 = trans117[0];
if (!(trans118.length >= 1)) return -1;
int trans118_0 = trans118[0];
if (!(trans119.length >= 1)) return -1;
int trans119_0 = trans119[0];
if (!(trans120.length >= 1)) return -1;
int trans120_0 = trans120[0];
if (!(trans121.length >= 1)) return -1;
int trans121_0 = trans121[0];
if (!(trans122.length >= 1)) return -1;
int trans122_0 = trans122[0];
if (!(trans123.length >= 1)) return -1;
int trans123_0 = trans123[0];
if (!(trans124.length >= 1)) return -1;
int trans124_0 = trans124[0];
if (!(trans125.length >= 1)) return -1;
int trans125_0 = trans125[0];
if (!(trans126.length >= 1)) return -1;
int trans126_0 = trans126[0];
if (!(trans127.length >= 1)) return -1;
int trans127_0 = trans127[0];
if (!(trans128.length >= 1)) return -1;
int trans128_0 = trans128[0];
if (!(trans129.length >= 1)) return -1;
int trans129_0 = trans129[0];
if (!(trans130.length >= 1)) return -1;
int trans130_0 = trans130[0];
if (!(trans131.length >= 1)) return -1;
int trans131_0 = trans131[0];
if (!(trans132.length >= 1)) return -1;
int trans132_0 = trans132[0];
if (!(trans133.length >= 1)) return -1;
int trans133_0 = trans133[0];
if (!(trans134.length >= 1)) return -1;
int trans134_0 = trans134[0];
if (!(trans135.length >= 1)) return -1;
int trans135_0 = trans135[0];
if (!(trans136.length >= 1)) return -1;
int trans136_0 = trans136[0];
if (!(trans137.length >= 1)) return -1;
int trans137_0 = trans137[0];
if (!(trans138.length >= 1)) return -1;
int trans138_0 = trans138[0];
if (!(trans139.length >= 1)) return -1;
int trans139_0 = trans139[0];
if (!(trans140.length >= 1)) return -1;
int trans140_0 = trans140[0];
if (!(trans141.length >= 1)) return -1;
int trans141_0 = trans141[0];
if (!(trans142.length >= 1)) return -1;
int trans142_0 = trans142[0];
if (!(trans143.length >= 1)) return -1;
int trans143_0 = trans143[0];
if (!(trans144.length >= 1)) return -1;
int trans144_0 = trans144[0];
if (!(trans145.length >= 1)) return -1;
int trans145_0 = trans145[0];
if (!(trans146.length >= 1)) return -1;
int trans146_0 = trans146[0];
if (!(trans147.length >= 1)) return -1;
int trans147_0 = trans147[0];
if (!(trans148.length >= 1)) return -1;
int trans148_0 = trans148[0];
if (!(trans149.length >= 1)) return -1;
int trans149_0 = trans149[0];
if (!(trans150.length >= 1)) return -1;
int trans150_0 = trans150[0];
if (!(trans151.length >= 1)) return -1;
int trans151_0 = trans151[0];
if (!(trans152.length >= 1)) return -1;
int trans152_0 = trans152[0];
if (!(trans153.length >= 1)) return -1;
int trans153_0 = trans153[0];
if (!(trans154.length >= 1)) return -1;
int trans154_0 = trans154[0];
if (!(trans155.length >= 1)) return -1;
int trans155_0 = trans155[0];
if (!(trans156.length >= 1)) return -1;
int trans156_0 = trans156[0];
if (!(trans157.length >= 1)) return -1;
int trans157_0 = trans157[0];
if (!(trans158.length >= 1)) return -1;
int trans158_0 = trans158[0];
if (!(trans159.length >= 1)) return -1;
int trans159_0 = trans159[0];
if (!(trans160.length >= 1)) return -1;
int trans160_0 = trans160[0];
if (!(trans161.length >= 1)) return -1;
int trans161_0 = trans161[0];
if (!(trans162.length >= 1)) return -1;
int trans162_0 = trans162[0];
if (!(trans163.length >= 1)) return -1;
int trans163_0 = trans163[0];
if (!(trans164.length >= 1)) return -1;
int trans164_0 = trans164[0];
if (!(trans165.length >= 1)) return -1;
int trans165_0 = trans165[0];
if (!(trans166.length >= 1)) return -1;
int trans166_0 = trans166[0];
if (!(trans167.length >= 1)) return -1;
int trans167_0 = trans167[0];
if (!(trans168.length >= 1)) return -1;
int trans168_0 = trans168[0];
if (!(trans169.length >= 1)) return -1;
int trans169_0 = trans169[0];
if (!(trans170.length >= 1)) return -1;
int trans170_0 = trans170[0];
if (!(trans171.length >= 1)) return -1;
int trans171_0 = trans171[0];
if (!(trans172.length >= 1)) return -1;
int trans172_0 = trans172[0];
if (!(trans173.length >= 1)) return -1;
int trans173_0 = trans173[0];
if (!(trans174.length >= 1)) return -1;
int trans174_0 = trans174[0];
if (!(trans175.length >= 1)) return -1;
int trans175_0 = trans175[0];
if (!(trans176.length >= 1)) return -1;
int trans176_0 = trans176[0];
if (!(trans177.length >= 1)) return -1;
int trans177_0 = trans177[0];
if (!(trans178.length >= 1)) return -1;
int trans178_0 = trans178[0];
if (!(trans179.length >= 1)) return -1;
int trans179_0 = trans179[0];
if (!(trans180.length >= 1)) return -1;
int trans180_0 = trans180[0];
if (!(trans181.length >= 1)) return -1;
int trans181_0 = trans181[0];
if (!(trans182.length >= 1)) return -1;
int trans182_0 = trans182[0];
if (!(trans183.length >= 1)) return -1;
int trans183_0 = trans183[0];
if (!(trans184.length >= 1)) return -1;
int trans184_0 = trans184[0];
if (!(trans185.length >= 1)) return -1;
int trans185_0 = trans185[0];
if (!(trans186.length >= 1)) return -1;
int trans186_0 = trans186[0];
if (!(trans187.length >= 1)) return -1;
int trans187_0 = trans187[0];
if (!(trans188.length >= 1)) return -1;
int trans188_0 = trans188[0];
if (!(trans189.length >= 1)) return -1;
int trans189_0 = trans189[0];
if (!(trans190.length >= 1)) return -1;
int trans190_0 = trans190[0];
if (!(trans191.length >= 1)) return -1;
int trans191_0 = trans191[0];
if (!(trans192.length >= 1)) return -1;
int trans192_0 = trans192[0];
if (!(trans193.length >= 1)) return -1;
int trans193_0 = trans193[0];
if (!(trans194.length >= 1)) return -1;
int trans194_0 = trans194[0];
if (!(trans195.length >= 1)) return -1;
int trans195_0 = trans195[0];
if (!(trans196.length >= 1)) return -1;
int trans196_0 = trans196[0];
if (!(trans197.length >= 1)) return -1;
int trans197_0 = trans197[0];
if (!(trans198.length >= 1)) return -1;
int trans198_0 = trans198[0];
if (!(trans199.length >= 1)) return -1;
int trans199_0 = trans199[0];
if (trans0_0 <= a0.length)
for (int i0 = 0; i0 < 1 && i0 < trans0_0; i0++) {
if (trans1_0 <= a1.length)
for (int i1 = 0; i1 < 1 && i1 < trans1_0; i1++) {
if (trans2_0 <= a2.length)
for (int i2 = 0; i2 < 1 && i2 < trans2_0; i2++) {
if (trans3_0 <= a3.length)
for (int i3 = 0; i3 < 1 && i3 < trans3_0; i3++) {
if (trans4_0 <= a4.length)
for (int i4 = 0; i4 < 1 && i4 < trans4_0; i4++) {
if (trans5_0 <= a5.length)
for (int i5 = 0; i5 < 1 && i5 < trans5_0; i5++) {
if (trans6_0 <= a6.length)
for (int i6 = 0; i6 < 1 && i6 < trans6_0; i6++) {
if (trans7_0 <= a7.length)
for (int i7 = 0; i7 < 1 && i7 < trans7_0; i7++) {
if (trans8_0 <= a8.length)
for (int i8 = 0; i8 < 1 && i8 < trans8_0; i8++) {
if (trans9_0 <= a9.length)
for (int i9 = 0; i9 < 1 && i9 < trans9_0; i9++) {
if (trans10_0 <= a10.length)
for (int i10 = 0; i10 < 1 && i10 < trans10_0; i10++) {
if (trans11_0 <= a11.length)
for (int i11 = 0; i11 < 1 && i11 < trans11_0; i11++) {
if (trans12_0 <= a12.length)
for (int i12 = 0; i12 < 1 && i12 < trans12_0; i12++) {
if (trans13_0 <= a13.length)
for (int i13 = 0; i13 < 1 && i13 < trans13_0; i13++) {
if (trans14_0 <= a14.length)
for (int i14 = 0; i14 < 1 && i14 < trans14_0; i14++) {
if (trans15_0 <= a15.length)
for (int i15 = 0; i15 < 1 && i15 < trans15_0; i15++) {
if (trans16_0 <= a16.length)
for (int i16 = 0; i16 < 1 && i16 < trans16_0; i16++) {
if (trans17_0 <= a17.length)
for (int i17 = 0; i17 < 1 && i17 < trans17_0; i17++) {
if (trans18_0 <= a18.length)
for (int i18 = 0; i18 < 1 && i18 < trans18_0; i18++) {
if (trans19_0 <= a19.length)
for (int i19 = 0; i19 < 1 && i19 < trans19_0; i19++) {
if (trans20_0 <= a20.length)
for (int i20 = 0; i20 < 1 && i20 < trans20_0; i20++) {
if (trans21_0 <= a21.length)
for (int i21 = 0; i21 < 1 && i21 < trans21_0; i21++) {
if (trans22_0 <= a22.length)
for (int i22 = 0; i22 < 1 && i22 < trans22_0; i22++) {
if (trans23_0 <= a23.length)
for (int i23 = 0; i23 < 1 && i23 < trans23_0; i23++) {
if (trans24_0 <= a24.length)
for (int i24 = 0; i24 < 1 && i24 < trans24_0; i24++) {
if (trans25_0 <= a25.length)
for (int i25 = 0; i25 < 1 && i25 < trans25_0; i25++) {
if (trans26_0 <= a26.length)
for (int i26 = 0; i26 < 1 && i26 < trans26_0; i26++) {
if (trans27_0 <= a27.length)
for (int i27 = 0; i27 < 1 && i27 < trans27_0; i27++) {
if (trans28_0 <= a28.length)
for (int i28 = 0; i28 < 1 && i28 < trans28_0; i28++) {
if (trans29_0 <= a29.length)
for (int i29 = 0; i29 < 1 && i29 < trans29_0; i29++) {
if (trans30_0 <= a30.length)
for (int i30 = 0; i30 < 1 && i30 < trans30_0; i30++) {
if (trans31_0 <= a31.length)
for (int i31 = 0; i31 < 1 && i31 < trans31_0; i31++) {
if (trans32_0 <= a32.length)
for (int i32 = 0; i32 < 1 && i32 < trans32_0; i32++) {
if (trans33_0 <= a33.length)
for (int i33 = 0; i33 < 1 && i33 < trans33_0; i33++) {
if (trans34_0 <= a34.length)
for (int i34 = 0; i34 < 1 && i34 < trans34_0; i34++) {
if (trans35_0 <= a35.length)
for (int i35 = 0; i35 < 1 && i35 < trans35_0; i35++) {
if (trans36_0 <= a36.length)
for (int i36 = 0; i36 < 1 && i36 < trans36_0; i36++) {
if (trans37_0 <= a37.length)
for (int i37 = 0; i37 < 1 && i37 < trans37_0; i37++) {
if (trans38_0 <= a38.length)
for (int i38 = 0; i38 < 1 && i38 < trans38_0; i38++) {
if (trans39_0 <= a39.length)
for (int i39 = 0; i39 < 1 && i39 < trans39_0; i39++) {
if (trans40_0 <= a40.length)
for (int i40 = 0; i40 < 1 && i40 < trans40_0; i40++) {
if (trans41_0 <= a41.length)
for (int i41 = 0; i41 < 1 && i41 < trans41_0; i41++) {
if (trans42_0 <= a42.length)
for (int i42 = 0; i42 < 1 && i42 < trans42_0; i42++) {
if (trans43_0 <= a43.length)
for (int i43 = 0; i43 < 1 && i43 < trans43_0; i43++) {
if (trans44_0 <= a44.length)
for (int i44 = 0; i44 < 1 && i44 < trans44_0; i44++) {
if (trans45_0 <= a45.length)
for (int i45 = 0; i45 < 1 && i45 < trans45_0; i45++) {
if (trans46_0 <= a46.length)
for (int i46 = 0; i46 < 1 && i46 < trans46_0; i46++) {
if (trans47_0 <= a47.length)
for (int i47 = 0; i47 < 1 && i47 < trans47_0; i47++) {
if (trans48_0 <= a48.length)
for (int i48 = 0; i48 < 1 && i48 < trans48_0; i48++) {
if (trans49_0 <= a49.length)
for (int i49 = 0; i49 < 1 && i49 < trans49_0; i49++) {
if (trans50_0 <= a50.length)
for (int i50 = 0; i50 < 1 && i50 < trans50_0; i50++) {
if (trans51_0 <= a51.length)
for (int i51 = 0; i51 < 1 && i51 < trans51_0; i51++) {
if (trans52_0 <= a52.length)
for (int i52 = 0; i52 < 1 && i52 < trans52_0; i52++) {
if (trans53_0 <= a53.length)
for (int i53 = 0; i53 < 1 && i53 < trans53_0; i53++) {
if (trans54_0 <= a54.length)
for (int i54 = 0; i54 < 1 && i54 < trans54_0; i54++) {
if (trans55_0 <= a55.length)
for (int i55 = 0; i55 < 1 && i55 < trans55_0; i55++) {
if (trans56_0 <= a56.length)
for (int i56 = 0; i56 < 1 && i56 < trans56_0; i56++) {
if (trans57_0 <= a57.length)
for (int i57 = 0; i57 < 1 && i57 < trans57_0; i57++) {
if (trans58_0 <= a58.length)
for (int i58 = 0; i58 < 1 && i58 < trans58_0; i58++) {
if (trans59_0 <= a59.length)
for (int i59 = 0; i59 < 1 && i59 < trans59_0; i59++) {
if (trans60_0 <= a60.length)
for (int i60 = 0; i60 < 1 && i60 < trans60_0; i60++) {
if (trans61_0 <= a61.length)
for (int i61 = 0; i61 < 1 && i61 < trans61_0; i61++) {
if (trans62_0 <= a62.length)
for (int i62 = 0; i62 < 1 && i62 < trans62_0; i62++) {
if (trans63_0 <= a63.length)
for (int i63 = 0; i63 < 1 && i63 < trans63_0; i63++) {
if (trans64_0 <= a64.length)
for (int i64 = 0; i64 < 1 && i64 < trans64_0; i64++) {
if (trans65_0 <= a65.length)
for (int i65 = 0; i65 < 1 && i65 < trans65_0; i65++) {
if (trans66_0 <= a66.length)
for (int i66 = 0; i66 < 1 && i66 < trans66_0; i66++) {
if (trans67_0 <= a67.length)
for (int i67 = 0; i67 < 1 && i67 < trans67_0; i67++) {
if (trans68_0 <= a68.length)
for (int i68 = 0; i68 < 1 && i68 < trans68_0; i68++) {
if (trans69_0 <= a69.length)
for (int i69 = 0; i69 < 1 && i69 < trans69_0; i69++) {
if (trans70_0 <= a70.length)
for (int i70 = 0; i70 < 1 && i70 < trans70_0; i70++) {
if (trans71_0 <= a71.length)
for (int i71 = 0; i71 < 1 && i71 < trans71_0; i71++) {
if (trans72_0 <= a72.length)
for (int i72 = 0; i72 < 1 && i72 < trans72_0; i72++) {
if (trans73_0 <= a73.length)
for (int i73 = 0; i73 < 1 && i73 < trans73_0; i73++) {
if (trans74_0 <= a74.length)
for (int i74 = 0; i74 < 1 && i74 < trans74_0; i74++) {
if (trans75_0 <= a75.length)
for (int i75 = 0; i75 < 1 && i75 < trans75_0; i75++) {
if (trans76_0 <= a76.length)
for (int i76 = 0; i76 < 1 && i76 < trans76_0; i76++) {
if (trans77_0 <= a77.length)
for (int i77 = 0; i77 < 1 && i77 < trans77_0; i77++) {
if (trans78_0 <= a78.length)
for (int i78 = 0; i78 < 1 && i78 < trans78_0; i78++) {
if (trans79_0 <= a79.length)
for (int i79 = 0; i79 < 1 && i79 < trans79_0; i79++) {
if (trans80_0 <= a80.length)
for (int i80 = 0; i80 < 1 && i80 < trans80_0; i80++) {
if (trans81_0 <= a81.length)
for (int i81 = 0; i81 < 1 && i81 < trans81_0; i81++) {
if (trans82_0 <= a82.length)
for (int i82 = 0; i82 < 1 && i82 < trans82_0; i82++) {
if (trans83_0 <= a83.length)
for (int i83 = 0; i83 < 1 && i83 < trans83_0; i83++) {
if (trans84_0 <= a84.length)
for (int i84 = 0; i84 < 1 && i84 < trans84_0; i84++) {
if (trans85_0 <= a85.length)
for (int i85 = 0; i85 < 1 && i85 < trans85_0; i85++) {
if (trans86_0 <= a86.length)
for (int i86 = 0; i86 < 1 && i86 < trans86_0; i86++) {
if (trans87_0 <= a87.length)
for (int i87 = 0; i87 < 1 && i87 < trans87_0; i87++) {
if (trans88_0 <= a88.length)
for (int i88 = 0; i88 < 1 && i88 < trans88_0; i88++) {
if (trans89_0 <= a89.length)
for (int i89 = 0; i89 < 1 && i89 < trans89_0; i89++) {
if (trans90_0 <= a90.length)
for (int i90 = 0; i90 < 1 && i90 < trans90_0; i90++) {
if (trans91_0 <= a91.length)
for (int i91 = 0; i91 < 1 && i91 < trans91_0; i91++) {
if (trans92_0 <= a92.length)
for (int i92 = 0; i92 < 1 && i92 < trans92_0; i92++) {
if (trans93_0 <= a93.length)
for (int i93 = 0; i93 < 1 && i93 < trans93_0; i93++) {
if (trans94_0 <= a94.length)
for (int i94 = 0; i94 < 1 && i94 < trans94_0; i94++) {
if (trans95_0 <= a95.length)
for (int i95 = 0; i95 < 1 && i95 < trans95_0; i95++) {
if (trans96_0 <= a96.length)
for (int i96 = 0; i96 < 1 && i96 < trans96_0; i96++) {
if (trans97_0 <= a97.length)
for (int i97 = 0; i97 < 1 && i97 < trans97_0; i97++) {
if (trans98_0 <= a98.length)
for (int i98 = 0; i98 < 1 && i98 < trans98_0; i98++) {
if (trans99_0 <= a99.length)
for (int i99 = 0; i99 < 1 && i99 < trans99_0; i99++) {
if (trans100_0 <= a100.length)
for (int i100 = 0; i100 < 1 && i100 < trans100_0; i100++) {
if (trans101_0 <= a101.length)
for (int i101 = 0; i101 < 1 && i101 < trans101_0; i101++) {
if (trans102_0 <= a102.length)
for (int i102 = 0; i102 < 1 && i102 < trans102_0; i102++) {
if (trans103_0 <= a103.length)
for (int i103 = 0; i103 < 1 && i103 < trans103_0; i103++) {
if (trans104_0 <= a104.length)
for (int i104 = 0; i104 < 1 && i104 < trans104_0; i104++) {
if (trans105_0 <= a105.length)
for (int i105 = 0; i105 < 1 && i105 < trans105_0; i105++) {
if (trans106_0 <= a106.length)
for (int i106 = 0; i106 < 1 && i106 < trans106_0; i106++) {
if (trans107_0 <= a107.length)
for (int i107 = 0; i107 < 1 && i107 < trans107_0; i107++) {
if (trans108_0 <= a108.length)
for (int i108 = 0; i108 < 1 && i108 < trans108_0; i108++) {
if (trans109_0 <= a109.length)
for (int i109 = 0; i109 < 1 && i109 < trans109_0; i109++) {
if (trans110_0 <= a110.length)
for (int i110 = 0; i110 < 1 && i110 < trans110_0; i110++) {
if (trans111_0 <= a111.length)
for (int i111 = 0; i111 < 1 && i111 < trans111_0; i111++) {
if (trans112_0 <= a112.length)
for (int i112 = 0; i112 < 1 && i112 < trans112_0; i112++) {
if (trans113_0 <= a113.length)
for (int i113 = 0; i113 < 1 && i113 < trans113_0; i113++) {
if (trans114_0 <= a114.length)
for (int i114 = 0; i114 < 1 && i114 < trans114_0; i114++) {
if (trans115_0 <= a115.length)
for (int i115 = 0; i115 < 1 && i115 < trans115_0; i115++) {
if (trans116_0 <= a116.length)
for (int i116 = 0; i116 < 1 && i116 < trans116_0; i116++) {
if (trans117_0 <= a117.length)
for (int i117 = 0; i117 < 1 && i117 < trans117_0; i117++) {
if (trans118_0 <= a118.length)
for (int i118 = 0; i118 < 1 && i118 < trans118_0; i118++) {
if (trans119_0 <= a119.length)
for (int i119 = 0; i119 < 1 && i119 < trans119_0; i119++) {
if (trans120_0 <= a120.length)
for (int i120 = 0; i120 < 1 && i120 < trans120_0; i120++) {
if (trans121_0 <= a121.length)
for (int i121 = 0; i121 < 1 && i121 < trans121_0; i121++) {
if (trans122_0 <= a122.length)
for (int i122 = 0; i122 < 1 && i122 < trans122_0; i122++) {
if (trans123_0 <= a123.length)
for (int i123 = 0; i123 < 1 && i123 < trans123_0; i123++) {
if (trans124_0 <= a124.length)
for (int i124 = 0; i124 < 1 && i124 < trans124_0; i124++) {
if (trans125_0 <= a125.length)
for (int i125 = 0; i125 < 1 && i125 < trans125_0; i125++) {
if (trans126_0 <= a126.length)
for (int i126 = 0; i126 < 1 && i126 < trans126_0; i126++) {
if (trans127_0 <= a127.length)
for (int i127 = 0; i127 < 1 && i127 < trans127_0; i127++) {
if (trans128_0 <= a128.length)
for (int i128 = 0; i128 < 1 && i128 < trans128_0; i128++) {
if (trans129_0 <= a129.length)
for (int i129 = 0; i129 < 1 && i129 < trans129_0; i129++) {
if (trans130_0 <= a130.length)
for (int i130 = 0; i130 < 1 && i130 < trans130_0; i130++) {
if (trans131_0 <= a131.length)
for (int i131 = 0; i131 < 1 && i131 < trans131_0; i131++) {
if (trans132_0 <= a132.length)
for (int i132 = 0; i132 < 1 && i132 < trans132_0; i132++) {
if (trans133_0 <= a133.length)
for (int i133 = 0; i133 < 1 && i133 < trans133_0; i133++) {
if (trans134_0 <= a134.length)
for (int i134 = 0; i134 < 1 && i134 < trans134_0; i134++) {
if (trans135_0 <= a135.length)
for (int i135 = 0; i135 < 1 && i135 < trans135_0; i135++) {
if (trans136_0 <= a136.length)
for (int i136 = 0; i136 < 1 && i136 < trans136_0; i136++) {
if (trans137_0 <= a137.length)
for (int i137 = 0; i137 < 1 && i137 < trans137_0; i137++) {
if (trans138_0 <= a138.length)
for (int i138 = 0; i138 < 1 && i138 < trans138_0; i138++) {
if (trans139_0 <= a139.length)
for (int i139 = 0; i139 < 1 && i139 < trans139_0; i139++) {
if (trans140_0 <= a140.length)
for (int i140 = 0; i140 < 1 && i140 < trans140_0; i140++) {
if (trans141_0 <= a141.length)
for (int i141 = 0; i141 < 1 && i141 < trans141_0; i141++) {
if (trans142_0 <= a142.length)
for (int i142 = 0; i142 < 1 && i142 < trans142_0; i142++) {
if (trans143_0 <= a143.length)
for (int i143 = 0; i143 < 1 && i143 < trans143_0; i143++) {
if (trans144_0 <= a144.length)
for (int i144 = 0; i144 < 1 && i144 < trans144_0; i144++) {
if (trans145_0 <= a145.length)
for (int i145 = 0; i145 < 1 && i145 < trans145_0; i145++) {
if (trans146_0 <= a146.length)
for (int i146 = 0; i146 < 1 && i146 < trans146_0; i146++) {
if (trans147_0 <= a147.length)
for (int i147 = 0; i147 < 1 && i147 < trans147_0; i147++) {
if (trans148_0 <= a148.length)
for (int i148 = 0; i148 < 1 && i148 < trans148_0; i148++) {
if (trans149_0 <= a149.length)
for (int i149 = 0; i149 < 1 && i149 < trans149_0; i149++) {
if (trans150_0 <= a150.length)
for (int i150 = 0; i150 < 1 && i150 < trans150_0; i150++) {
if (trans151_0 <= a151.length)
for (int i151 = 0; i151 < 1 && i151 < trans151_0; i151++) {
if (trans152_0 <= a152.length)
for (int i152 = 0; i152 < 1 && i152 < trans152_0; i152++) {
if (trans153_0 <= a153.length)
for (int i153 = 0; i153 < 1 && i153 < trans153_0; i153++) {
if (trans154_0 <= a154.length)
for (int i154 = 0; i154 < 1 && i154 < trans154_0; i154++) {
if (trans155_0 <= a155.length)
for (int i155 = 0; i155 < 1 && i155 < trans155_0; i155++) {
if (trans156_0 <= a156.length)
for (int i156 = 0; i156 < 1 && i156 < trans156_0; i156++) {
if (trans157_0 <= a157.length)
for (int i157 = 0; i157 < 1 && i157 < trans157_0; i157++) {
if (trans158_0 <= a158.length)
for (int i158 = 0; i158 < 1 && i158 < trans158_0; i158++) {
if (trans159_0 <= a159.length)
for (int i159 = 0; i159 < 1 && i159 < trans159_0; i159++) {
if (trans160_0 <= a160.length)
for (int i160 = 0; i160 < 1 && i160 < trans160_0; i160++) {
if (trans161_0 <= a161.length)
for (int i161 = 0; i161 < 1 && i161 < trans161_0; i161++) {
if (trans162_0 <= a162.length)
for (int i162 = 0; i162 < 1 && i162 < trans162_0; i162++) {
if (trans163_0 <= a163.length)
for (int i163 = 0; i163 < 1 && i163 < trans163_0; i163++) {
if (trans164_0 <= a164.length)
for (int i164 = 0; i164 < 1 && i164 < trans164_0; i164++) {
if (trans165_0 <= a165.length)
for (int i165 = 0; i165 < 1 && i165 < trans165_0; i165++) {
if (trans166_0 <= a166.length)
for (int i166 = 0; i166 < 1 && i166 < trans166_0; i166++) {
if (trans167_0 <= a167.length)
for (int i167 = 0; i167 < 1 && i167 < trans167_0; i167++) {
if (trans168_0 <= a168.length)
for (int i168 = 0; i168 < 1 && i168 < trans168_0; i168++) {
if (trans169_0 <= a169.length)
for (int i169 = 0; i169 < 1 && i169 < trans169_0; i169++) {
if (trans170_0 <= a170.length)
for (int i170 = 0; i170 < 1 && i170 < trans170_0; i170++) {
if (trans171_0 <= a171.length)
for (int i171 = 0; i171 < 1 && i171 < trans171_0; i171++) {
if (trans172_0 <= a172.length)
for (int i172 = 0; i172 < 1 && i172 < trans172_0; i172++) {
if (trans173_0 <= a173.length)
for (int i173 = 0; i173 < 1 && i173 < trans173_0; i173++) {
if (trans174_0 <= a174.length)
for (int i174 = 0; i174 < 1 && i174 < trans174_0; i174++) {
if (trans175_0 <= a175.length)
for (int i175 = 0; i175 < 1 && i175 < trans175_0; i175++) {
if (trans176_0 <= a176.length)
for (int i176 = 0; i176 < 1 && i176 < trans176_0; i176++) {
if (trans177_0 <= a177.length)
for (int i177 = 0; i177 < 1 && i177 < trans177_0; i177++) {
if (trans178_0 <= a178.length)
for (int i178 = 0; i178 < 1 && i178 < trans178_0; i178++) {
if (trans179_0 <= a179.length)
for (int i179 = 0; i179 < 1 && i179 < trans179_0; i179++) {
if (trans180_0 <= a180.length)
for (int i180 = 0; i180 < 1 && i180 < trans180_0; i180++) {
if (trans181_0 <= a181.length)
for (int i181 = 0; i181 < 1 && i181 < trans181_0; i181++) {
if (trans182_0 <= a182.length)
for (int i182 = 0; i182 < 1 && i182 < trans182_0; i182++) {
if (trans183_0 <= a183.length)
for (int i183 = 0; i183 < 1 && i183 < trans183_0; i183++) {
if (trans184_0 <= a184.length)
for (int i184 = 0; i184 < 1 && i184 < trans184_0; i184++) {
if (trans185_0 <= a185.length)
for (int i185 = 0; i185 < 1 && i185 < trans185_0; i185++) {
if (trans186_0 <= a186.length)
for (int i186 = 0; i186 < 1 && i186 < trans186_0; i186++) {
if (trans187_0 <= a187.length)
for (int i187 = 0; i187 < 1 && i187 < trans187_0; i187++) {
if (trans188_0 <= a188.length)
for (int i188 = 0; i188 < 1 && i188 < trans188_0; i188++) {
if (trans189_0 <= a189.length)
for (int i189 = 0; i189 < 1 && i189 < trans189_0; i189++) {
if (trans190_0 <= a190.length)
for (int i190 = 0; i190 < 1 && i190 < trans190_0; i190++) {
if (trans191_0 <= a191.length)
for (int i191 = 0; i191 < 1 && i191 < trans191_0; i191++) {
if (trans192_0 <= a192.length)
for (int i192 = 0; i192 < 1 && i192 < trans192_0; i192++) {
if (trans193_0 <= a193.length)
for (int i193 = 0; i193 < 1 && i193 < trans193_0; i193++) {
if (trans194_0 <= a194.length)
for (int i194 = 0; i194 < 1 && i194 < trans194_0; i194++) {
if (trans195_0 <= a195.length)
for (int i195 = 0; i195 < 1 && i195 < trans195_0; i195++) {
if (trans196_0 <= a196.length)
for (int i196 = 0; i196 < 1 && i196 < trans196_0; i196++) {
if (trans197_0 <= a197.length)
for (int i197 = 0; i197 < 1 && i197 < trans197_0; i197++) {
if (trans198_0 <= a198.length)
for (int i198 = 0; i198 < 1 && i198 < trans198_0; i198++) {
if (trans199_0 <= a199.length)
for (int i199 = 0; i199 < 1 && i199 < trans199_0; i199++) {
s += a0[i0];
s += a1[i1];
s += a2[i2];
s += a3[i3];
s += a4[i4];
s += a5[i5];
s += a6[i6];
s += a7[i7];
s += a8[i8];
s += a9[i9];
s += a10[i10];
s += a11[i11];
s += a12[i12];
s += a13[i13];
s += a14[i14];
s += a15[i15];
s += a16[i16];
s += a17[i17];
s += a18[i18];
s += a19[i19];
s += a20[i20];
s += a21[i21];
s += a22[i22];
s += a23[i23];
s += a24[i24];
s += a25[i25];
s += a26[i26];
s += a27[i27];
s += a28[i28];
s += a29[i29];
s += a30[i30];
s += a31[i31];
s += a32[i32];
s += a33[i33];
s += a34[i34];
s += a35[i35];
s += a36[i36];
s += a37[i37];
s += a38[i38];
s += a39[i39];
s += a40[i40];
s += a41[i41];
s += a42[i42];
s += a43[i43];
s += a44[i44];
s += a45[i45];
s += a46[i46];
s += a47[i47];
s += a48[i48];
s += a49[i49];
s += a50[i50];
s += a51[i51];
s += a52[i52];
s += a53[i53];
s += a54[i54];
s += a55[i55];
s += a56[i56];
s += a57[i57];
s += a58[i58];
s += a59[i59];
s += a60[i60];
s += a61[i61];
s += a62[i62];
s += a63[i63];
s += a64[i64];
s += a65[i65];
s += a66[i66];
s += a67[i67];
s += a68[i68];
s += a69[i69];
s += a70[i70];
s += a71[i71];
s += a72[i72];
s += a73[i73];
s += a74[i74];
s += a75[i75];
s += a76[i76];
s += a77[i77];
s += a78[i78];
s += a79[i79];
s += a80[i80];
s += a81[i81];
s += a82[i82];
s += a83[i83];
s += a84[i84];
s += a85[i85];
s += a86[i86];
s += a87[i87];
s += a88[i88];
s += a89[i89];
s += a90[i90];
s += a91[i91];
s += a92[i92];
s += a93[i93];
s += a94[i94];
s += a95[i95];
s += a96[i96];
s += a97[i97];
s += a98[i98];
s += a99[i99];
s += a100[i100];
s += a101[i101];
s += a102[i102];
s += a103[i103];
s += a104[i104];
s += a105[i105];
s += a106[i106];
s += a107[i107];
s += a108[i108];
s += a109[i109];
s += a110[i110];
s += a111[i111];
s += a112[i112];
s += a113[i113];
s += a114[i114];
s += a115[i115];
s += a116[i116];
s += a117[i117];
s += a118[i118];
s += a119[i119];
s += a120[i120];
s += a121[i121];
s += a122[i122];
s += a123[i123];
s += a124[i124];
s += a125[i125];
s += a126[i126];
s += a127[i127];
s += a128[i128];
s += a129[i129];
s += a130[i130];
s += a131[i131];
s += a132[i132];
s += a133[i133];
s += a134[i134];
s += a135[i135];
s += a136[i136];
s += a137[i137];
s += a138[i138];
s += a139[i139];
s += a140[i140];
s += a141[i141];
s += a142[i142];
s += a143[i143];
s += a144[i144];
s += a145[i145];
s += a146[i146];
s += a147[i147];
s += a148[i148];
s += a149[i149];
s += a150[i150];
s += a151[i151];
s += a152[i152];
s += a153[i153];
s += a154[i154];
s += a155[i155];
s += a156[i156];
s += a157[i157];
s += a158[i158];
s += a159[i159];
s += a160[i160];
s += a161[i161];
s += a162[i162];
s += a163[i163];
s += a164[i164];
s += a165[i165];
s += a166[i166];
s += a167[i167];
s += a168[i168];
s += a169[i169];
s += a170[i170];
s += a171[i171];
s += a172[i172];
s += a173[i173];
s += a174[i174];
s += a175[i175];
s += a176[i176];
s += a177[i177];
s += a178[i178];
s += a179[i179];
s += a180[i180];
s += a181[i181];
s += a182[i182];
s += a183[i183];
s += a184[i184];
s += a185[i185];
s += a186[i186];
s += a187[i187];
s += a188[i188];
s += a189[i189];
s += a190[i190];
s += a191[i191];
s += a192[i192];
s += a193[i193];
s += a194[i194];
s += a195[i195];
s += a196[i196];
s += a197[i197];
s += a198[i198];
s += a199[i199];
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
return s; }

@Benchmark public int bench_big_n200_multipleTrue_trans1_transrandomTrue() {
return big_n200_multipleTrue_trans1_transrandomTrue();
}

int big_n200_multipleTrue_trans5_transrandomTrue() {
int s = 0;
if (!(trans0.length >= 5)) return -1;
int trans0_0 = trans0[0];
int trans0_1 = trans0[1];
int trans0_2 = trans0[2];
int trans0_3 = trans0[3];
int trans0_4 = trans0[4];
if (!(trans1.length >= 5)) return -1;
int trans1_0 = trans1[0];
int trans1_1 = trans1[1];
int trans1_2 = trans1[2];
int trans1_3 = trans1[3];
int trans1_4 = trans1[4];
if (!(trans2.length >= 5)) return -1;
int trans2_0 = trans2[0];
int trans2_1 = trans2[1];
int trans2_2 = trans2[2];
int trans2_3 = trans2[3];
int trans2_4 = trans2[4];
if (!(trans3.length >= 5)) return -1;
int trans3_0 = trans3[0];
int trans3_1 = trans3[1];
int trans3_2 = trans3[2];
int trans3_3 = trans3[3];
int trans3_4 = trans3[4];
if (!(trans4.length >= 5)) return -1;
int trans4_0 = trans4[0];
int trans4_1 = trans4[1];
int trans4_2 = trans4[2];
int trans4_3 = trans4[3];
int trans4_4 = trans4[4];
if (!(trans5.length >= 5)) return -1;
int trans5_0 = trans5[0];
int trans5_1 = trans5[1];
int trans5_2 = trans5[2];
int trans5_3 = trans5[3];
int trans5_4 = trans5[4];
if (!(trans6.length >= 5)) return -1;
int trans6_0 = trans6[0];
int trans6_1 = trans6[1];
int trans6_2 = trans6[2];
int trans6_3 = trans6[3];
int trans6_4 = trans6[4];
if (!(trans7.length >= 5)) return -1;
int trans7_0 = trans7[0];
int trans7_1 = trans7[1];
int trans7_2 = trans7[2];
int trans7_3 = trans7[3];
int trans7_4 = trans7[4];
if (!(trans8.length >= 5)) return -1;
int trans8_0 = trans8[0];
int trans8_1 = trans8[1];
int trans8_2 = trans8[2];
int trans8_3 = trans8[3];
int trans8_4 = trans8[4];
if (!(trans9.length >= 5)) return -1;
int trans9_0 = trans9[0];
int trans9_1 = trans9[1];
int trans9_2 = trans9[2];
int trans9_3 = trans9[3];
int trans9_4 = trans9[4];
if (!(trans10.length >= 5)) return -1;
int trans10_0 = trans10[0];
int trans10_1 = trans10[1];
int trans10_2 = trans10[2];
int trans10_3 = trans10[3];
int trans10_4 = trans10[4];
if (!(trans11.length >= 5)) return -1;
int trans11_0 = trans11[0];
int trans11_1 = trans11[1];
int trans11_2 = trans11[2];
int trans11_3 = trans11[3];
int trans11_4 = trans11[4];
if (!(trans12.length >= 5)) return -1;
int trans12_0 = trans12[0];
int trans12_1 = trans12[1];
int trans12_2 = trans12[2];
int trans12_3 = trans12[3];
int trans12_4 = trans12[4];
if (!(trans13.length >= 5)) return -1;
int trans13_0 = trans13[0];
int trans13_1 = trans13[1];
int trans13_2 = trans13[2];
int trans13_3 = trans13[3];
int trans13_4 = trans13[4];
if (!(trans14.length >= 5)) return -1;
int trans14_0 = trans14[0];
int trans14_1 = trans14[1];
int trans14_2 = trans14[2];
int trans14_3 = trans14[3];
int trans14_4 = trans14[4];
if (!(trans15.length >= 5)) return -1;
int trans15_0 = trans15[0];
int trans15_1 = trans15[1];
int trans15_2 = trans15[2];
int trans15_3 = trans15[3];
int trans15_4 = trans15[4];
if (!(trans16.length >= 5)) return -1;
int trans16_0 = trans16[0];
int trans16_1 = trans16[1];
int trans16_2 = trans16[2];
int trans16_3 = trans16[3];
int trans16_4 = trans16[4];
if (!(trans17.length >= 5)) return -1;
int trans17_0 = trans17[0];
int trans17_1 = trans17[1];
int trans17_2 = trans17[2];
int trans17_3 = trans17[3];
int trans17_4 = trans17[4];
if (!(trans18.length >= 5)) return -1;
int trans18_0 = trans18[0];
int trans18_1 = trans18[1];
int trans18_2 = trans18[2];
int trans18_3 = trans18[3];
int trans18_4 = trans18[4];
if (!(trans19.length >= 5)) return -1;
int trans19_0 = trans19[0];
int trans19_1 = trans19[1];
int trans19_2 = trans19[2];
int trans19_3 = trans19[3];
int trans19_4 = trans19[4];
if (!(trans20.length >= 5)) return -1;
int trans20_0 = trans20[0];
int trans20_1 = trans20[1];
int trans20_2 = trans20[2];
int trans20_3 = trans20[3];
int trans20_4 = trans20[4];
if (!(trans21.length >= 5)) return -1;
int trans21_0 = trans21[0];
int trans21_1 = trans21[1];
int trans21_2 = trans21[2];
int trans21_3 = trans21[3];
int trans21_4 = trans21[4];
if (!(trans22.length >= 5)) return -1;
int trans22_0 = trans22[0];
int trans22_1 = trans22[1];
int trans22_2 = trans22[2];
int trans22_3 = trans22[3];
int trans22_4 = trans22[4];
if (!(trans23.length >= 5)) return -1;
int trans23_0 = trans23[0];
int trans23_1 = trans23[1];
int trans23_2 = trans23[2];
int trans23_3 = trans23[3];
int trans23_4 = trans23[4];
if (!(trans24.length >= 5)) return -1;
int trans24_0 = trans24[0];
int trans24_1 = trans24[1];
int trans24_2 = trans24[2];
int trans24_3 = trans24[3];
int trans24_4 = trans24[4];
if (!(trans25.length >= 5)) return -1;
int trans25_0 = trans25[0];
int trans25_1 = trans25[1];
int trans25_2 = trans25[2];
int trans25_3 = trans25[3];
int trans25_4 = trans25[4];
if (!(trans26.length >= 5)) return -1;
int trans26_0 = trans26[0];
int trans26_1 = trans26[1];
int trans26_2 = trans26[2];
int trans26_3 = trans26[3];
int trans26_4 = trans26[4];
if (!(trans27.length >= 5)) return -1;
int trans27_0 = trans27[0];
int trans27_1 = trans27[1];
int trans27_2 = trans27[2];
int trans27_3 = trans27[3];
int trans27_4 = trans27[4];
if (!(trans28.length >= 5)) return -1;
int trans28_0 = trans28[0];
int trans28_1 = trans28[1];
int trans28_2 = trans28[2];
int trans28_3 = trans28[3];
int trans28_4 = trans28[4];
if (!(trans29.length >= 5)) return -1;
int trans29_0 = trans29[0];
int trans29_1 = trans29[1];
int trans29_2 = trans29[2];
int trans29_3 = trans29[3];
int trans29_4 = trans29[4];
if (!(trans30.length >= 5)) return -1;
int trans30_0 = trans30[0];
int trans30_1 = trans30[1];
int trans30_2 = trans30[2];
int trans30_3 = trans30[3];
int trans30_4 = trans30[4];
if (!(trans31.length >= 5)) return -1;
int trans31_0 = trans31[0];
int trans31_1 = trans31[1];
int trans31_2 = trans31[2];
int trans31_3 = trans31[3];
int trans31_4 = trans31[4];
if (!(trans32.length >= 5)) return -1;
int trans32_0 = trans32[0];
int trans32_1 = trans32[1];
int trans32_2 = trans32[2];
int trans32_3 = trans32[3];
int trans32_4 = trans32[4];
if (!(trans33.length >= 5)) return -1;
int trans33_0 = trans33[0];
int trans33_1 = trans33[1];
int trans33_2 = trans33[2];
int trans33_3 = trans33[3];
int trans33_4 = trans33[4];
if (!(trans34.length >= 5)) return -1;
int trans34_0 = trans34[0];
int trans34_1 = trans34[1];
int trans34_2 = trans34[2];
int trans34_3 = trans34[3];
int trans34_4 = trans34[4];
if (!(trans35.length >= 5)) return -1;
int trans35_0 = trans35[0];
int trans35_1 = trans35[1];
int trans35_2 = trans35[2];
int trans35_3 = trans35[3];
int trans35_4 = trans35[4];
if (!(trans36.length >= 5)) return -1;
int trans36_0 = trans36[0];
int trans36_1 = trans36[1];
int trans36_2 = trans36[2];
int trans36_3 = trans36[3];
int trans36_4 = trans36[4];
if (!(trans37.length >= 5)) return -1;
int trans37_0 = trans37[0];
int trans37_1 = trans37[1];
int trans37_2 = trans37[2];
int trans37_3 = trans37[3];
int trans37_4 = trans37[4];
if (!(trans38.length >= 5)) return -1;
int trans38_0 = trans38[0];
int trans38_1 = trans38[1];
int trans38_2 = trans38[2];
int trans38_3 = trans38[3];
int trans38_4 = trans38[4];
if (!(trans39.length >= 5)) return -1;
int trans39_0 = trans39[0];
int trans39_1 = trans39[1];
int trans39_2 = trans39[2];
int trans39_3 = trans39[3];
int trans39_4 = trans39[4];
if (!(trans40.length >= 5)) return -1;
int trans40_0 = trans40[0];
int trans40_1 = trans40[1];
int trans40_2 = trans40[2];
int trans40_3 = trans40[3];
int trans40_4 = trans40[4];
if (!(trans41.length >= 5)) return -1;
int trans41_0 = trans41[0];
int trans41_1 = trans41[1];
int trans41_2 = trans41[2];
int trans41_3 = trans41[3];
int trans41_4 = trans41[4];
if (!(trans42.length >= 5)) return -1;
int trans42_0 = trans42[0];
int trans42_1 = trans42[1];
int trans42_2 = trans42[2];
int trans42_3 = trans42[3];
int trans42_4 = trans42[4];
if (!(trans43.length >= 5)) return -1;
int trans43_0 = trans43[0];
int trans43_1 = trans43[1];
int trans43_2 = trans43[2];
int trans43_3 = trans43[3];
int trans43_4 = trans43[4];
if (!(trans44.length >= 5)) return -1;
int trans44_0 = trans44[0];
int trans44_1 = trans44[1];
int trans44_2 = trans44[2];
int trans44_3 = trans44[3];
int trans44_4 = trans44[4];
if (!(trans45.length >= 5)) return -1;
int trans45_0 = trans45[0];
int trans45_1 = trans45[1];
int trans45_2 = trans45[2];
int trans45_3 = trans45[3];
int trans45_4 = trans45[4];
if (!(trans46.length >= 5)) return -1;
int trans46_0 = trans46[0];
int trans46_1 = trans46[1];
int trans46_2 = trans46[2];
int trans46_3 = trans46[3];
int trans46_4 = trans46[4];
if (!(trans47.length >= 5)) return -1;
int trans47_0 = trans47[0];
int trans47_1 = trans47[1];
int trans47_2 = trans47[2];
int trans47_3 = trans47[3];
int trans47_4 = trans47[4];
if (!(trans48.length >= 5)) return -1;
int trans48_0 = trans48[0];
int trans48_1 = trans48[1];
int trans48_2 = trans48[2];
int trans48_3 = trans48[3];
int trans48_4 = trans48[4];
if (!(trans49.length >= 5)) return -1;
int trans49_0 = trans49[0];
int trans49_1 = trans49[1];
int trans49_2 = trans49[2];
int trans49_3 = trans49[3];
int trans49_4 = trans49[4];
if (!(trans50.length >= 5)) return -1;
int trans50_0 = trans50[0];
int trans50_1 = trans50[1];
int trans50_2 = trans50[2];
int trans50_3 = trans50[3];
int trans50_4 = trans50[4];
if (!(trans51.length >= 5)) return -1;
int trans51_0 = trans51[0];
int trans51_1 = trans51[1];
int trans51_2 = trans51[2];
int trans51_3 = trans51[3];
int trans51_4 = trans51[4];
if (!(trans52.length >= 5)) return -1;
int trans52_0 = trans52[0];
int trans52_1 = trans52[1];
int trans52_2 = trans52[2];
int trans52_3 = trans52[3];
int trans52_4 = trans52[4];
if (!(trans53.length >= 5)) return -1;
int trans53_0 = trans53[0];
int trans53_1 = trans53[1];
int trans53_2 = trans53[2];
int trans53_3 = trans53[3];
int trans53_4 = trans53[4];
if (!(trans54.length >= 5)) return -1;
int trans54_0 = trans54[0];
int trans54_1 = trans54[1];
int trans54_2 = trans54[2];
int trans54_3 = trans54[3];
int trans54_4 = trans54[4];
if (!(trans55.length >= 5)) return -1;
int trans55_0 = trans55[0];
int trans55_1 = trans55[1];
int trans55_2 = trans55[2];
int trans55_3 = trans55[3];
int trans55_4 = trans55[4];
if (!(trans56.length >= 5)) return -1;
int trans56_0 = trans56[0];
int trans56_1 = trans56[1];
int trans56_2 = trans56[2];
int trans56_3 = trans56[3];
int trans56_4 = trans56[4];
if (!(trans57.length >= 5)) return -1;
int trans57_0 = trans57[0];
int trans57_1 = trans57[1];
int trans57_2 = trans57[2];
int trans57_3 = trans57[3];
int trans57_4 = trans57[4];
if (!(trans58.length >= 5)) return -1;
int trans58_0 = trans58[0];
int trans58_1 = trans58[1];
int trans58_2 = trans58[2];
int trans58_3 = trans58[3];
int trans58_4 = trans58[4];
if (!(trans59.length >= 5)) return -1;
int trans59_0 = trans59[0];
int trans59_1 = trans59[1];
int trans59_2 = trans59[2];
int trans59_3 = trans59[3];
int trans59_4 = trans59[4];
if (!(trans60.length >= 5)) return -1;
int trans60_0 = trans60[0];
int trans60_1 = trans60[1];
int trans60_2 = trans60[2];
int trans60_3 = trans60[3];
int trans60_4 = trans60[4];
if (!(trans61.length >= 5)) return -1;
int trans61_0 = trans61[0];
int trans61_1 = trans61[1];
int trans61_2 = trans61[2];
int trans61_3 = trans61[3];
int trans61_4 = trans61[4];
if (!(trans62.length >= 5)) return -1;
int trans62_0 = trans62[0];
int trans62_1 = trans62[1];
int trans62_2 = trans62[2];
int trans62_3 = trans62[3];
int trans62_4 = trans62[4];
if (!(trans63.length >= 5)) return -1;
int trans63_0 = trans63[0];
int trans63_1 = trans63[1];
int trans63_2 = trans63[2];
int trans63_3 = trans63[3];
int trans63_4 = trans63[4];
if (!(trans64.length >= 5)) return -1;
int trans64_0 = trans64[0];
int trans64_1 = trans64[1];
int trans64_2 = trans64[2];
int trans64_3 = trans64[3];
int trans64_4 = trans64[4];
if (!(trans65.length >= 5)) return -1;
int trans65_0 = trans65[0];
int trans65_1 = trans65[1];
int trans65_2 = trans65[2];
int trans65_3 = trans65[3];
int trans65_4 = trans65[4];
if (!(trans66.length >= 5)) return -1;
int trans66_0 = trans66[0];
int trans66_1 = trans66[1];
int trans66_2 = trans66[2];
int trans66_3 = trans66[3];
int trans66_4 = trans66[4];
if (!(trans67.length >= 5)) return -1;
int trans67_0 = trans67[0];
int trans67_1 = trans67[1];
int trans67_2 = trans67[2];
int trans67_3 = trans67[3];
int trans67_4 = trans67[4];
if (!(trans68.length >= 5)) return -1;
int trans68_0 = trans68[0];
int trans68_1 = trans68[1];
int trans68_2 = trans68[2];
int trans68_3 = trans68[3];
int trans68_4 = trans68[4];
if (!(trans69.length >= 5)) return -1;
int trans69_0 = trans69[0];
int trans69_1 = trans69[1];
int trans69_2 = trans69[2];
int trans69_3 = trans69[3];
int trans69_4 = trans69[4];
if (!(trans70.length >= 5)) return -1;
int trans70_0 = trans70[0];
int trans70_1 = trans70[1];
int trans70_2 = trans70[2];
int trans70_3 = trans70[3];
int trans70_4 = trans70[4];
if (!(trans71.length >= 5)) return -1;
int trans71_0 = trans71[0];
int trans71_1 = trans71[1];
int trans71_2 = trans71[2];
int trans71_3 = trans71[3];
int trans71_4 = trans71[4];
if (!(trans72.length >= 5)) return -1;
int trans72_0 = trans72[0];
int trans72_1 = trans72[1];
int trans72_2 = trans72[2];
int trans72_3 = trans72[3];
int trans72_4 = trans72[4];
if (!(trans73.length >= 5)) return -1;
int trans73_0 = trans73[0];
int trans73_1 = trans73[1];
int trans73_2 = trans73[2];
int trans73_3 = trans73[3];
int trans73_4 = trans73[4];
if (!(trans74.length >= 5)) return -1;
int trans74_0 = trans74[0];
int trans74_1 = trans74[1];
int trans74_2 = trans74[2];
int trans74_3 = trans74[3];
int trans74_4 = trans74[4];
if (!(trans75.length >= 5)) return -1;
int trans75_0 = trans75[0];
int trans75_1 = trans75[1];
int trans75_2 = trans75[2];
int trans75_3 = trans75[3];
int trans75_4 = trans75[4];
if (!(trans76.length >= 5)) return -1;
int trans76_0 = trans76[0];
int trans76_1 = trans76[1];
int trans76_2 = trans76[2];
int trans76_3 = trans76[3];
int trans76_4 = trans76[4];
if (!(trans77.length >= 5)) return -1;
int trans77_0 = trans77[0];
int trans77_1 = trans77[1];
int trans77_2 = trans77[2];
int trans77_3 = trans77[3];
int trans77_4 = trans77[4];
if (!(trans78.length >= 5)) return -1;
int trans78_0 = trans78[0];
int trans78_1 = trans78[1];
int trans78_2 = trans78[2];
int trans78_3 = trans78[3];
int trans78_4 = trans78[4];
if (!(trans79.length >= 5)) return -1;
int trans79_0 = trans79[0];
int trans79_1 = trans79[1];
int trans79_2 = trans79[2];
int trans79_3 = trans79[3];
int trans79_4 = trans79[4];
if (!(trans80.length >= 5)) return -1;
int trans80_0 = trans80[0];
int trans80_1 = trans80[1];
int trans80_2 = trans80[2];
int trans80_3 = trans80[3];
int trans80_4 = trans80[4];
if (!(trans81.length >= 5)) return -1;
int trans81_0 = trans81[0];
int trans81_1 = trans81[1];
int trans81_2 = trans81[2];
int trans81_3 = trans81[3];
int trans81_4 = trans81[4];
if (!(trans82.length >= 5)) return -1;
int trans82_0 = trans82[0];
int trans82_1 = trans82[1];
int trans82_2 = trans82[2];
int trans82_3 = trans82[3];
int trans82_4 = trans82[4];
if (!(trans83.length >= 5)) return -1;
int trans83_0 = trans83[0];
int trans83_1 = trans83[1];
int trans83_2 = trans83[2];
int trans83_3 = trans83[3];
int trans83_4 = trans83[4];
if (!(trans84.length >= 5)) return -1;
int trans84_0 = trans84[0];
int trans84_1 = trans84[1];
int trans84_2 = trans84[2];
int trans84_3 = trans84[3];
int trans84_4 = trans84[4];
if (!(trans85.length >= 5)) return -1;
int trans85_0 = trans85[0];
int trans85_1 = trans85[1];
int trans85_2 = trans85[2];
int trans85_3 = trans85[3];
int trans85_4 = trans85[4];
if (!(trans86.length >= 5)) return -1;
int trans86_0 = trans86[0];
int trans86_1 = trans86[1];
int trans86_2 = trans86[2];
int trans86_3 = trans86[3];
int trans86_4 = trans86[4];
if (!(trans87.length >= 5)) return -1;
int trans87_0 = trans87[0];
int trans87_1 = trans87[1];
int trans87_2 = trans87[2];
int trans87_3 = trans87[3];
int trans87_4 = trans87[4];
if (!(trans88.length >= 5)) return -1;
int trans88_0 = trans88[0];
int trans88_1 = trans88[1];
int trans88_2 = trans88[2];
int trans88_3 = trans88[3];
int trans88_4 = trans88[4];
if (!(trans89.length >= 5)) return -1;
int trans89_0 = trans89[0];
int trans89_1 = trans89[1];
int trans89_2 = trans89[2];
int trans89_3 = trans89[3];
int trans89_4 = trans89[4];
if (!(trans90.length >= 5)) return -1;
int trans90_0 = trans90[0];
int trans90_1 = trans90[1];
int trans90_2 = trans90[2];
int trans90_3 = trans90[3];
int trans90_4 = trans90[4];
if (!(trans91.length >= 5)) return -1;
int trans91_0 = trans91[0];
int trans91_1 = trans91[1];
int trans91_2 = trans91[2];
int trans91_3 = trans91[3];
int trans91_4 = trans91[4];
if (!(trans92.length >= 5)) return -1;
int trans92_0 = trans92[0];
int trans92_1 = trans92[1];
int trans92_2 = trans92[2];
int trans92_3 = trans92[3];
int trans92_4 = trans92[4];
if (!(trans93.length >= 5)) return -1;
int trans93_0 = trans93[0];
int trans93_1 = trans93[1];
int trans93_2 = trans93[2];
int trans93_3 = trans93[3];
int trans93_4 = trans93[4];
if (!(trans94.length >= 5)) return -1;
int trans94_0 = trans94[0];
int trans94_1 = trans94[1];
int trans94_2 = trans94[2];
int trans94_3 = trans94[3];
int trans94_4 = trans94[4];
if (!(trans95.length >= 5)) return -1;
int trans95_0 = trans95[0];
int trans95_1 = trans95[1];
int trans95_2 = trans95[2];
int trans95_3 = trans95[3];
int trans95_4 = trans95[4];
if (!(trans96.length >= 5)) return -1;
int trans96_0 = trans96[0];
int trans96_1 = trans96[1];
int trans96_2 = trans96[2];
int trans96_3 = trans96[3];
int trans96_4 = trans96[4];
if (!(trans97.length >= 5)) return -1;
int trans97_0 = trans97[0];
int trans97_1 = trans97[1];
int trans97_2 = trans97[2];
int trans97_3 = trans97[3];
int trans97_4 = trans97[4];
if (!(trans98.length >= 5)) return -1;
int trans98_0 = trans98[0];
int trans98_1 = trans98[1];
int trans98_2 = trans98[2];
int trans98_3 = trans98[3];
int trans98_4 = trans98[4];
if (!(trans99.length >= 5)) return -1;
int trans99_0 = trans99[0];
int trans99_1 = trans99[1];
int trans99_2 = trans99[2];
int trans99_3 = trans99[3];
int trans99_4 = trans99[4];
if (!(trans100.length >= 5)) return -1;
int trans100_0 = trans100[0];
int trans100_1 = trans100[1];
int trans100_2 = trans100[2];
int trans100_3 = trans100[3];
int trans100_4 = trans100[4];
if (!(trans101.length >= 5)) return -1;
int trans101_0 = trans101[0];
int trans101_1 = trans101[1];
int trans101_2 = trans101[2];
int trans101_3 = trans101[3];
int trans101_4 = trans101[4];
if (!(trans102.length >= 5)) return -1;
int trans102_0 = trans102[0];
int trans102_1 = trans102[1];
int trans102_2 = trans102[2];
int trans102_3 = trans102[3];
int trans102_4 = trans102[4];
if (!(trans103.length >= 5)) return -1;
int trans103_0 = trans103[0];
int trans103_1 = trans103[1];
int trans103_2 = trans103[2];
int trans103_3 = trans103[3];
int trans103_4 = trans103[4];
if (!(trans104.length >= 5)) return -1;
int trans104_0 = trans104[0];
int trans104_1 = trans104[1];
int trans104_2 = trans104[2];
int trans104_3 = trans104[3];
int trans104_4 = trans104[4];
if (!(trans105.length >= 5)) return -1;
int trans105_0 = trans105[0];
int trans105_1 = trans105[1];
int trans105_2 = trans105[2];
int trans105_3 = trans105[3];
int trans105_4 = trans105[4];
if (!(trans106.length >= 5)) return -1;
int trans106_0 = trans106[0];
int trans106_1 = trans106[1];
int trans106_2 = trans106[2];
int trans106_3 = trans106[3];
int trans106_4 = trans106[4];
if (!(trans107.length >= 5)) return -1;
int trans107_0 = trans107[0];
int trans107_1 = trans107[1];
int trans107_2 = trans107[2];
int trans107_3 = trans107[3];
int trans107_4 = trans107[4];
if (!(trans108.length >= 5)) return -1;
int trans108_0 = trans108[0];
int trans108_1 = trans108[1];
int trans108_2 = trans108[2];
int trans108_3 = trans108[3];
int trans108_4 = trans108[4];
if (!(trans109.length >= 5)) return -1;
int trans109_0 = trans109[0];
int trans109_1 = trans109[1];
int trans109_2 = trans109[2];
int trans109_3 = trans109[3];
int trans109_4 = trans109[4];
if (!(trans110.length >= 5)) return -1;
int trans110_0 = trans110[0];
int trans110_1 = trans110[1];
int trans110_2 = trans110[2];
int trans110_3 = trans110[3];
int trans110_4 = trans110[4];
if (!(trans111.length >= 5)) return -1;
int trans111_0 = trans111[0];
int trans111_1 = trans111[1];
int trans111_2 = trans111[2];
int trans111_3 = trans111[3];
int trans111_4 = trans111[4];
if (!(trans112.length >= 5)) return -1;
int trans112_0 = trans112[0];
int trans112_1 = trans112[1];
int trans112_2 = trans112[2];
int trans112_3 = trans112[3];
int trans112_4 = trans112[4];
if (!(trans113.length >= 5)) return -1;
int trans113_0 = trans113[0];
int trans113_1 = trans113[1];
int trans113_2 = trans113[2];
int trans113_3 = trans113[3];
int trans113_4 = trans113[4];
if (!(trans114.length >= 5)) return -1;
int trans114_0 = trans114[0];
int trans114_1 = trans114[1];
int trans114_2 = trans114[2];
int trans114_3 = trans114[3];
int trans114_4 = trans114[4];
if (!(trans115.length >= 5)) return -1;
int trans115_0 = trans115[0];
int trans115_1 = trans115[1];
int trans115_2 = trans115[2];
int trans115_3 = trans115[3];
int trans115_4 = trans115[4];
if (!(trans116.length >= 5)) return -1;
int trans116_0 = trans116[0];
int trans116_1 = trans116[1];
int trans116_2 = trans116[2];
int trans116_3 = trans116[3];
int trans116_4 = trans116[4];
if (!(trans117.length >= 5)) return -1;
int trans117_0 = trans117[0];
int trans117_1 = trans117[1];
int trans117_2 = trans117[2];
int trans117_3 = trans117[3];
int trans117_4 = trans117[4];
if (!(trans118.length >= 5)) return -1;
int trans118_0 = trans118[0];
int trans118_1 = trans118[1];
int trans118_2 = trans118[2];
int trans118_3 = trans118[3];
int trans118_4 = trans118[4];
if (!(trans119.length >= 5)) return -1;
int trans119_0 = trans119[0];
int trans119_1 = trans119[1];
int trans119_2 = trans119[2];
int trans119_3 = trans119[3];
int trans119_4 = trans119[4];
if (!(trans120.length >= 5)) return -1;
int trans120_0 = trans120[0];
int trans120_1 = trans120[1];
int trans120_2 = trans120[2];
int trans120_3 = trans120[3];
int trans120_4 = trans120[4];
if (!(trans121.length >= 5)) return -1;
int trans121_0 = trans121[0];
int trans121_1 = trans121[1];
int trans121_2 = trans121[2];
int trans121_3 = trans121[3];
int trans121_4 = trans121[4];
if (!(trans122.length >= 5)) return -1;
int trans122_0 = trans122[0];
int trans122_1 = trans122[1];
int trans122_2 = trans122[2];
int trans122_3 = trans122[3];
int trans122_4 = trans122[4];
if (!(trans123.length >= 5)) return -1;
int trans123_0 = trans123[0];
int trans123_1 = trans123[1];
int trans123_2 = trans123[2];
int trans123_3 = trans123[3];
int trans123_4 = trans123[4];
if (!(trans124.length >= 5)) return -1;
int trans124_0 = trans124[0];
int trans124_1 = trans124[1];
int trans124_2 = trans124[2];
int trans124_3 = trans124[3];
int trans124_4 = trans124[4];
if (!(trans125.length >= 5)) return -1;
int trans125_0 = trans125[0];
int trans125_1 = trans125[1];
int trans125_2 = trans125[2];
int trans125_3 = trans125[3];
int trans125_4 = trans125[4];
if (!(trans126.length >= 5)) return -1;
int trans126_0 = trans126[0];
int trans126_1 = trans126[1];
int trans126_2 = trans126[2];
int trans126_3 = trans126[3];
int trans126_4 = trans126[4];
if (!(trans127.length >= 5)) return -1;
int trans127_0 = trans127[0];
int trans127_1 = trans127[1];
int trans127_2 = trans127[2];
int trans127_3 = trans127[3];
int trans127_4 = trans127[4];
if (!(trans128.length >= 5)) return -1;
int trans128_0 = trans128[0];
int trans128_1 = trans128[1];
int trans128_2 = trans128[2];
int trans128_3 = trans128[3];
int trans128_4 = trans128[4];
if (!(trans129.length >= 5)) return -1;
int trans129_0 = trans129[0];
int trans129_1 = trans129[1];
int trans129_2 = trans129[2];
int trans129_3 = trans129[3];
int trans129_4 = trans129[4];
if (!(trans130.length >= 5)) return -1;
int trans130_0 = trans130[0];
int trans130_1 = trans130[1];
int trans130_2 = trans130[2];
int trans130_3 = trans130[3];
int trans130_4 = trans130[4];
if (!(trans131.length >= 5)) return -1;
int trans131_0 = trans131[0];
int trans131_1 = trans131[1];
int trans131_2 = trans131[2];
int trans131_3 = trans131[3];
int trans131_4 = trans131[4];
if (!(trans132.length >= 5)) return -1;
int trans132_0 = trans132[0];
int trans132_1 = trans132[1];
int trans132_2 = trans132[2];
int trans132_3 = trans132[3];
int trans132_4 = trans132[4];
if (!(trans133.length >= 5)) return -1;
int trans133_0 = trans133[0];
int trans133_1 = trans133[1];
int trans133_2 = trans133[2];
int trans133_3 = trans133[3];
int trans133_4 = trans133[4];
if (!(trans134.length >= 5)) return -1;
int trans134_0 = trans134[0];
int trans134_1 = trans134[1];
int trans134_2 = trans134[2];
int trans134_3 = trans134[3];
int trans134_4 = trans134[4];
if (!(trans135.length >= 5)) return -1;
int trans135_0 = trans135[0];
int trans135_1 = trans135[1];
int trans135_2 = trans135[2];
int trans135_3 = trans135[3];
int trans135_4 = trans135[4];
if (!(trans136.length >= 5)) return -1;
int trans136_0 = trans136[0];
int trans136_1 = trans136[1];
int trans136_2 = trans136[2];
int trans136_3 = trans136[3];
int trans136_4 = trans136[4];
if (!(trans137.length >= 5)) return -1;
int trans137_0 = trans137[0];
int trans137_1 = trans137[1];
int trans137_2 = trans137[2];
int trans137_3 = trans137[3];
int trans137_4 = trans137[4];
if (!(trans138.length >= 5)) return -1;
int trans138_0 = trans138[0];
int trans138_1 = trans138[1];
int trans138_2 = trans138[2];
int trans138_3 = trans138[3];
int trans138_4 = trans138[4];
if (!(trans139.length >= 5)) return -1;
int trans139_0 = trans139[0];
int trans139_1 = trans139[1];
int trans139_2 = trans139[2];
int trans139_3 = trans139[3];
int trans139_4 = trans139[4];
if (!(trans140.length >= 5)) return -1;
int trans140_0 = trans140[0];
int trans140_1 = trans140[1];
int trans140_2 = trans140[2];
int trans140_3 = trans140[3];
int trans140_4 = trans140[4];
if (!(trans141.length >= 5)) return -1;
int trans141_0 = trans141[0];
int trans141_1 = trans141[1];
int trans141_2 = trans141[2];
int trans141_3 = trans141[3];
int trans141_4 = trans141[4];
if (!(trans142.length >= 5)) return -1;
int trans142_0 = trans142[0];
int trans142_1 = trans142[1];
int trans142_2 = trans142[2];
int trans142_3 = trans142[3];
int trans142_4 = trans142[4];
if (!(trans143.length >= 5)) return -1;
int trans143_0 = trans143[0];
int trans143_1 = trans143[1];
int trans143_2 = trans143[2];
int trans143_3 = trans143[3];
int trans143_4 = trans143[4];
if (!(trans144.length >= 5)) return -1;
int trans144_0 = trans144[0];
int trans144_1 = trans144[1];
int trans144_2 = trans144[2];
int trans144_3 = trans144[3];
int trans144_4 = trans144[4];
if (!(trans145.length >= 5)) return -1;
int trans145_0 = trans145[0];
int trans145_1 = trans145[1];
int trans145_2 = trans145[2];
int trans145_3 = trans145[3];
int trans145_4 = trans145[4];
if (!(trans146.length >= 5)) return -1;
int trans146_0 = trans146[0];
int trans146_1 = trans146[1];
int trans146_2 = trans146[2];
int trans146_3 = trans146[3];
int trans146_4 = trans146[4];
if (!(trans147.length >= 5)) return -1;
int trans147_0 = trans147[0];
int trans147_1 = trans147[1];
int trans147_2 = trans147[2];
int trans147_3 = trans147[3];
int trans147_4 = trans147[4];
if (!(trans148.length >= 5)) return -1;
int trans148_0 = trans148[0];
int trans148_1 = trans148[1];
int trans148_2 = trans148[2];
int trans148_3 = trans148[3];
int trans148_4 = trans148[4];
if (!(trans149.length >= 5)) return -1;
int trans149_0 = trans149[0];
int trans149_1 = trans149[1];
int trans149_2 = trans149[2];
int trans149_3 = trans149[3];
int trans149_4 = trans149[4];
if (!(trans150.length >= 5)) return -1;
int trans150_0 = trans150[0];
int trans150_1 = trans150[1];
int trans150_2 = trans150[2];
int trans150_3 = trans150[3];
int trans150_4 = trans150[4];
if (!(trans151.length >= 5)) return -1;
int trans151_0 = trans151[0];
int trans151_1 = trans151[1];
int trans151_2 = trans151[2];
int trans151_3 = trans151[3];
int trans151_4 = trans151[4];
if (!(trans152.length >= 5)) return -1;
int trans152_0 = trans152[0];
int trans152_1 = trans152[1];
int trans152_2 = trans152[2];
int trans152_3 = trans152[3];
int trans152_4 = trans152[4];
if (!(trans153.length >= 5)) return -1;
int trans153_0 = trans153[0];
int trans153_1 = trans153[1];
int trans153_2 = trans153[2];
int trans153_3 = trans153[3];
int trans153_4 = trans153[4];
if (!(trans154.length >= 5)) return -1;
int trans154_0 = trans154[0];
int trans154_1 = trans154[1];
int trans154_2 = trans154[2];
int trans154_3 = trans154[3];
int trans154_4 = trans154[4];
if (!(trans155.length >= 5)) return -1;
int trans155_0 = trans155[0];
int trans155_1 = trans155[1];
int trans155_2 = trans155[2];
int trans155_3 = trans155[3];
int trans155_4 = trans155[4];
if (!(trans156.length >= 5)) return -1;
int trans156_0 = trans156[0];
int trans156_1 = trans156[1];
int trans156_2 = trans156[2];
int trans156_3 = trans156[3];
int trans156_4 = trans156[4];
if (!(trans157.length >= 5)) return -1;
int trans157_0 = trans157[0];
int trans157_1 = trans157[1];
int trans157_2 = trans157[2];
int trans157_3 = trans157[3];
int trans157_4 = trans157[4];
if (!(trans158.length >= 5)) return -1;
int trans158_0 = trans158[0];
int trans158_1 = trans158[1];
int trans158_2 = trans158[2];
int trans158_3 = trans158[3];
int trans158_4 = trans158[4];
if (!(trans159.length >= 5)) return -1;
int trans159_0 = trans159[0];
int trans159_1 = trans159[1];
int trans159_2 = trans159[2];
int trans159_3 = trans159[3];
int trans159_4 = trans159[4];
if (!(trans160.length >= 5)) return -1;
int trans160_0 = trans160[0];
int trans160_1 = trans160[1];
int trans160_2 = trans160[2];
int trans160_3 = trans160[3];
int trans160_4 = trans160[4];
if (!(trans161.length >= 5)) return -1;
int trans161_0 = trans161[0];
int trans161_1 = trans161[1];
int trans161_2 = trans161[2];
int trans161_3 = trans161[3];
int trans161_4 = trans161[4];
if (!(trans162.length >= 5)) return -1;
int trans162_0 = trans162[0];
int trans162_1 = trans162[1];
int trans162_2 = trans162[2];
int trans162_3 = trans162[3];
int trans162_4 = trans162[4];
if (!(trans163.length >= 5)) return -1;
int trans163_0 = trans163[0];
int trans163_1 = trans163[1];
int trans163_2 = trans163[2];
int trans163_3 = trans163[3];
int trans163_4 = trans163[4];
if (!(trans164.length >= 5)) return -1;
int trans164_0 = trans164[0];
int trans164_1 = trans164[1];
int trans164_2 = trans164[2];
int trans164_3 = trans164[3];
int trans164_4 = trans164[4];
if (!(trans165.length >= 5)) return -1;
int trans165_0 = trans165[0];
int trans165_1 = trans165[1];
int trans165_2 = trans165[2];
int trans165_3 = trans165[3];
int trans165_4 = trans165[4];
if (!(trans166.length >= 5)) return -1;
int trans166_0 = trans166[0];
int trans166_1 = trans166[1];
int trans166_2 = trans166[2];
int trans166_3 = trans166[3];
int trans166_4 = trans166[4];
if (!(trans167.length >= 5)) return -1;
int trans167_0 = trans167[0];
int trans167_1 = trans167[1];
int trans167_2 = trans167[2];
int trans167_3 = trans167[3];
int trans167_4 = trans167[4];
if (!(trans168.length >= 5)) return -1;
int trans168_0 = trans168[0];
int trans168_1 = trans168[1];
int trans168_2 = trans168[2];
int trans168_3 = trans168[3];
int trans168_4 = trans168[4];
if (!(trans169.length >= 5)) return -1;
int trans169_0 = trans169[0];
int trans169_1 = trans169[1];
int trans169_2 = trans169[2];
int trans169_3 = trans169[3];
int trans169_4 = trans169[4];
if (!(trans170.length >= 5)) return -1;
int trans170_0 = trans170[0];
int trans170_1 = trans170[1];
int trans170_2 = trans170[2];
int trans170_3 = trans170[3];
int trans170_4 = trans170[4];
if (!(trans171.length >= 5)) return -1;
int trans171_0 = trans171[0];
int trans171_1 = trans171[1];
int trans171_2 = trans171[2];
int trans171_3 = trans171[3];
int trans171_4 = trans171[4];
if (!(trans172.length >= 5)) return -1;
int trans172_0 = trans172[0];
int trans172_1 = trans172[1];
int trans172_2 = trans172[2];
int trans172_3 = trans172[3];
int trans172_4 = trans172[4];
if (!(trans173.length >= 5)) return -1;
int trans173_0 = trans173[0];
int trans173_1 = trans173[1];
int trans173_2 = trans173[2];
int trans173_3 = trans173[3];
int trans173_4 = trans173[4];
if (!(trans174.length >= 5)) return -1;
int trans174_0 = trans174[0];
int trans174_1 = trans174[1];
int trans174_2 = trans174[2];
int trans174_3 = trans174[3];
int trans174_4 = trans174[4];
if (!(trans175.length >= 5)) return -1;
int trans175_0 = trans175[0];
int trans175_1 = trans175[1];
int trans175_2 = trans175[2];
int trans175_3 = trans175[3];
int trans175_4 = trans175[4];
if (!(trans176.length >= 5)) return -1;
int trans176_0 = trans176[0];
int trans176_1 = trans176[1];
int trans176_2 = trans176[2];
int trans176_3 = trans176[3];
int trans176_4 = trans176[4];
if (!(trans177.length >= 5)) return -1;
int trans177_0 = trans177[0];
int trans177_1 = trans177[1];
int trans177_2 = trans177[2];
int trans177_3 = trans177[3];
int trans177_4 = trans177[4];
if (!(trans178.length >= 5)) return -1;
int trans178_0 = trans178[0];
int trans178_1 = trans178[1];
int trans178_2 = trans178[2];
int trans178_3 = trans178[3];
int trans178_4 = trans178[4];
if (!(trans179.length >= 5)) return -1;
int trans179_0 = trans179[0];
int trans179_1 = trans179[1];
int trans179_2 = trans179[2];
int trans179_3 = trans179[3];
int trans179_4 = trans179[4];
if (!(trans180.length >= 5)) return -1;
int trans180_0 = trans180[0];
int trans180_1 = trans180[1];
int trans180_2 = trans180[2];
int trans180_3 = trans180[3];
int trans180_4 = trans180[4];
if (!(trans181.length >= 5)) return -1;
int trans181_0 = trans181[0];
int trans181_1 = trans181[1];
int trans181_2 = trans181[2];
int trans181_3 = trans181[3];
int trans181_4 = trans181[4];
if (!(trans182.length >= 5)) return -1;
int trans182_0 = trans182[0];
int trans182_1 = trans182[1];
int trans182_2 = trans182[2];
int trans182_3 = trans182[3];
int trans182_4 = trans182[4];
if (!(trans183.length >= 5)) return -1;
int trans183_0 = trans183[0];
int trans183_1 = trans183[1];
int trans183_2 = trans183[2];
int trans183_3 = trans183[3];
int trans183_4 = trans183[4];
if (!(trans184.length >= 5)) return -1;
int trans184_0 = trans184[0];
int trans184_1 = trans184[1];
int trans184_2 = trans184[2];
int trans184_3 = trans184[3];
int trans184_4 = trans184[4];
if (!(trans185.length >= 5)) return -1;
int trans185_0 = trans185[0];
int trans185_1 = trans185[1];
int trans185_2 = trans185[2];
int trans185_3 = trans185[3];
int trans185_4 = trans185[4];
if (!(trans186.length >= 5)) return -1;
int trans186_0 = trans186[0];
int trans186_1 = trans186[1];
int trans186_2 = trans186[2];
int trans186_3 = trans186[3];
int trans186_4 = trans186[4];
if (!(trans187.length >= 5)) return -1;
int trans187_0 = trans187[0];
int trans187_1 = trans187[1];
int trans187_2 = trans187[2];
int trans187_3 = trans187[3];
int trans187_4 = trans187[4];
if (!(trans188.length >= 5)) return -1;
int trans188_0 = trans188[0];
int trans188_1 = trans188[1];
int trans188_2 = trans188[2];
int trans188_3 = trans188[3];
int trans188_4 = trans188[4];
if (!(trans189.length >= 5)) return -1;
int trans189_0 = trans189[0];
int trans189_1 = trans189[1];
int trans189_2 = trans189[2];
int trans189_3 = trans189[3];
int trans189_4 = trans189[4];
if (!(trans190.length >= 5)) return -1;
int trans190_0 = trans190[0];
int trans190_1 = trans190[1];
int trans190_2 = trans190[2];
int trans190_3 = trans190[3];
int trans190_4 = trans190[4];
if (!(trans191.length >= 5)) return -1;
int trans191_0 = trans191[0];
int trans191_1 = trans191[1];
int trans191_2 = trans191[2];
int trans191_3 = trans191[3];
int trans191_4 = trans191[4];
if (!(trans192.length >= 5)) return -1;
int trans192_0 = trans192[0];
int trans192_1 = trans192[1];
int trans192_2 = trans192[2];
int trans192_3 = trans192[3];
int trans192_4 = trans192[4];
if (!(trans193.length >= 5)) return -1;
int trans193_0 = trans193[0];
int trans193_1 = trans193[1];
int trans193_2 = trans193[2];
int trans193_3 = trans193[3];
int trans193_4 = trans193[4];
if (!(trans194.length >= 5)) return -1;
int trans194_0 = trans194[0];
int trans194_1 = trans194[1];
int trans194_2 = trans194[2];
int trans194_3 = trans194[3];
int trans194_4 = trans194[4];
if (!(trans195.length >= 5)) return -1;
int trans195_0 = trans195[0];
int trans195_1 = trans195[1];
int trans195_2 = trans195[2];
int trans195_3 = trans195[3];
int trans195_4 = trans195[4];
if (!(trans196.length >= 5)) return -1;
int trans196_0 = trans196[0];
int trans196_1 = trans196[1];
int trans196_2 = trans196[2];
int trans196_3 = trans196[3];
int trans196_4 = trans196[4];
if (!(trans197.length >= 5)) return -1;
int trans197_0 = trans197[0];
int trans197_1 = trans197[1];
int trans197_2 = trans197[2];
int trans197_3 = trans197[3];
int trans197_4 = trans197[4];
if (!(trans198.length >= 5)) return -1;
int trans198_0 = trans198[0];
int trans198_1 = trans198[1];
int trans198_2 = trans198[2];
int trans198_3 = trans198[3];
int trans198_4 = trans198[4];
if (!(trans199.length >= 5)) return -1;
int trans199_0 = trans199[0];
int trans199_1 = trans199[1];
int trans199_2 = trans199[2];
int trans199_3 = trans199[3];
int trans199_4 = trans199[4];
if (trans0_1 <= trans0_2)
if (trans0_4 <= a0.length)
if (trans0_2 <= trans0_3)
if (trans0_3 <= trans0_4)
if (trans0_0 <= trans0_1)
for (int i0 = 0; i0 < 1 && i0 < trans0_0; i0++) {
if (trans1_4 <= a1.length)
if (trans1_3 <= trans1_4)
if (trans1_2 <= trans1_3)
if (trans1_1 <= trans1_2)
if (trans1_0 <= trans1_1)
for (int i1 = 0; i1 < 1 && i1 < trans1_0; i1++) {
if (trans2_4 <= a2.length)
if (trans2_3 <= trans2_4)
if (trans2_1 <= trans2_2)
if (trans2_2 <= trans2_3)
if (trans2_0 <= trans2_1)
for (int i2 = 0; i2 < 1 && i2 < trans2_0; i2++) {
if (trans3_2 <= trans3_3)
if (trans3_1 <= trans3_2)
if (trans3_0 <= trans3_1)
if (trans3_4 <= a3.length)
if (trans3_3 <= trans3_4)
for (int i3 = 0; i3 < 1 && i3 < trans3_0; i3++) {
if (trans4_3 <= trans4_4)
if (trans4_0 <= trans4_1)
if (trans4_1 <= trans4_2)
if (trans4_2 <= trans4_3)
if (trans4_4 <= a4.length)
for (int i4 = 0; i4 < 1 && i4 < trans4_0; i4++) {
if (trans5_4 <= a5.length)
if (trans5_0 <= trans5_1)
if (trans5_2 <= trans5_3)
if (trans5_1 <= trans5_2)
if (trans5_3 <= trans5_4)
for (int i5 = 0; i5 < 1 && i5 < trans5_0; i5++) {
if (trans6_0 <= trans6_1)
if (trans6_1 <= trans6_2)
if (trans6_3 <= trans6_4)
if (trans6_2 <= trans6_3)
if (trans6_4 <= a6.length)
for (int i6 = 0; i6 < 1 && i6 < trans6_0; i6++) {
if (trans7_2 <= trans7_3)
if (trans7_0 <= trans7_1)
if (trans7_1 <= trans7_2)
if (trans7_4 <= a7.length)
if (trans7_3 <= trans7_4)
for (int i7 = 0; i7 < 1 && i7 < trans7_0; i7++) {
if (trans8_2 <= trans8_3)
if (trans8_1 <= trans8_2)
if (trans8_4 <= a8.length)
if (trans8_0 <= trans8_1)
if (trans8_3 <= trans8_4)
for (int i8 = 0; i8 < 1 && i8 < trans8_0; i8++) {
if (trans9_0 <= trans9_1)
if (trans9_1 <= trans9_2)
if (trans9_3 <= trans9_4)
if (trans9_4 <= a9.length)
if (trans9_2 <= trans9_3)
for (int i9 = 0; i9 < 1 && i9 < trans9_0; i9++) {
if (trans10_1 <= trans10_2)
if (trans10_3 <= trans10_4)
if (trans10_2 <= trans10_3)
if (trans10_4 <= a10.length)
if (trans10_0 <= trans10_1)
for (int i10 = 0; i10 < 1 && i10 < trans10_0; i10++) {
if (trans11_2 <= trans11_3)
if (trans11_1 <= trans11_2)
if (trans11_4 <= a11.length)
if (trans11_3 <= trans11_4)
if (trans11_0 <= trans11_1)
for (int i11 = 0; i11 < 1 && i11 < trans11_0; i11++) {
if (trans12_2 <= trans12_3)
if (trans12_4 <= a12.length)
if (trans12_1 <= trans12_2)
if (trans12_0 <= trans12_1)
if (trans12_3 <= trans12_4)
for (int i12 = 0; i12 < 1 && i12 < trans12_0; i12++) {
if (trans13_0 <= trans13_1)
if (trans13_1 <= trans13_2)
if (trans13_2 <= trans13_3)
if (trans13_3 <= trans13_4)
if (trans13_4 <= a13.length)
for (int i13 = 0; i13 < 1 && i13 < trans13_0; i13++) {
if (trans14_2 <= trans14_3)
if (trans14_4 <= a14.length)
if (trans14_3 <= trans14_4)
if (trans14_0 <= trans14_1)
if (trans14_1 <= trans14_2)
for (int i14 = 0; i14 < 1 && i14 < trans14_0; i14++) {
if (trans15_4 <= a15.length)
if (trans15_0 <= trans15_1)
if (trans15_2 <= trans15_3)
if (trans15_3 <= trans15_4)
if (trans15_1 <= trans15_2)
for (int i15 = 0; i15 < 1 && i15 < trans15_0; i15++) {
if (trans16_0 <= trans16_1)
if (trans16_1 <= trans16_2)
if (trans16_2 <= trans16_3)
if (trans16_3 <= trans16_4)
if (trans16_4 <= a16.length)
for (int i16 = 0; i16 < 1 && i16 < trans16_0; i16++) {
if (trans17_4 <= a17.length)
if (trans17_2 <= trans17_3)
if (trans17_1 <= trans17_2)
if (trans17_3 <= trans17_4)
if (trans17_0 <= trans17_1)
for (int i17 = 0; i17 < 1 && i17 < trans17_0; i17++) {
if (trans18_4 <= a18.length)
if (trans18_0 <= trans18_1)
if (trans18_1 <= trans18_2)
if (trans18_2 <= trans18_3)
if (trans18_3 <= trans18_4)
for (int i18 = 0; i18 < 1 && i18 < trans18_0; i18++) {
if (trans19_0 <= trans19_1)
if (trans19_3 <= trans19_4)
if (trans19_2 <= trans19_3)
if (trans19_4 <= a19.length)
if (trans19_1 <= trans19_2)
for (int i19 = 0; i19 < 1 && i19 < trans19_0; i19++) {
if (trans20_3 <= trans20_4)
if (trans20_0 <= trans20_1)
if (trans20_4 <= a20.length)
if (trans20_2 <= trans20_3)
if (trans20_1 <= trans20_2)
for (int i20 = 0; i20 < 1 && i20 < trans20_0; i20++) {
if (trans21_2 <= trans21_3)
if (trans21_3 <= trans21_4)
if (trans21_4 <= a21.length)
if (trans21_0 <= trans21_1)
if (trans21_1 <= trans21_2)
for (int i21 = 0; i21 < 1 && i21 < trans21_0; i21++) {
if (trans22_0 <= trans22_1)
if (trans22_3 <= trans22_4)
if (trans22_4 <= a22.length)
if (trans22_2 <= trans22_3)
if (trans22_1 <= trans22_2)
for (int i22 = 0; i22 < 1 && i22 < trans22_0; i22++) {
if (trans23_2 <= trans23_3)
if (trans23_1 <= trans23_2)
if (trans23_4 <= a23.length)
if (trans23_0 <= trans23_1)
if (trans23_3 <= trans23_4)
for (int i23 = 0; i23 < 1 && i23 < trans23_0; i23++) {
if (trans24_0 <= trans24_1)
if (trans24_1 <= trans24_2)
if (trans24_3 <= trans24_4)
if (trans24_2 <= trans24_3)
if (trans24_4 <= a24.length)
for (int i24 = 0; i24 < 1 && i24 < trans24_0; i24++) {
if (trans25_1 <= trans25_2)
if (trans25_2 <= trans25_3)
if (trans25_3 <= trans25_4)
if (trans25_0 <= trans25_1)
if (trans25_4 <= a25.length)
for (int i25 = 0; i25 < 1 && i25 < trans25_0; i25++) {
if (trans26_3 <= trans26_4)
if (trans26_0 <= trans26_1)
if (trans26_4 <= a26.length)
if (trans26_2 <= trans26_3)
if (trans26_1 <= trans26_2)
for (int i26 = 0; i26 < 1 && i26 < trans26_0; i26++) {
if (trans27_0 <= trans27_1)
if (trans27_4 <= a27.length)
if (trans27_1 <= trans27_2)
if (trans27_3 <= trans27_4)
if (trans27_2 <= trans27_3)
for (int i27 = 0; i27 < 1 && i27 < trans27_0; i27++) {
if (trans28_3 <= trans28_4)
if (trans28_0 <= trans28_1)
if (trans28_4 <= a28.length)
if (trans28_2 <= trans28_3)
if (trans28_1 <= trans28_2)
for (int i28 = 0; i28 < 1 && i28 < trans28_0; i28++) {
if (trans29_0 <= trans29_1)
if (trans29_4 <= a29.length)
if (trans29_3 <= trans29_4)
if (trans29_2 <= trans29_3)
if (trans29_1 <= trans29_2)
for (int i29 = 0; i29 < 1 && i29 < trans29_0; i29++) {
if (trans30_0 <= trans30_1)
if (trans30_4 <= a30.length)
if (trans30_2 <= trans30_3)
if (trans30_1 <= trans30_2)
if (trans30_3 <= trans30_4)
for (int i30 = 0; i30 < 1 && i30 < trans30_0; i30++) {
if (trans31_0 <= trans31_1)
if (trans31_1 <= trans31_2)
if (trans31_3 <= trans31_4)
if (trans31_4 <= a31.length)
if (trans31_2 <= trans31_3)
for (int i31 = 0; i31 < 1 && i31 < trans31_0; i31++) {
if (trans32_4 <= a32.length)
if (trans32_2 <= trans32_3)
if (trans32_1 <= trans32_2)
if (trans32_3 <= trans32_4)
if (trans32_0 <= trans32_1)
for (int i32 = 0; i32 < 1 && i32 < trans32_0; i32++) {
if (trans33_0 <= trans33_1)
if (trans33_1 <= trans33_2)
if (trans33_2 <= trans33_3)
if (trans33_4 <= a33.length)
if (trans33_3 <= trans33_4)
for (int i33 = 0; i33 < 1 && i33 < trans33_0; i33++) {
if (trans34_4 <= a34.length)
if (trans34_0 <= trans34_1)
if (trans34_2 <= trans34_3)
if (trans34_3 <= trans34_4)
if (trans34_1 <= trans34_2)
for (int i34 = 0; i34 < 1 && i34 < trans34_0; i34++) {
if (trans35_2 <= trans35_3)
if (trans35_4 <= a35.length)
if (trans35_3 <= trans35_4)
if (trans35_0 <= trans35_1)
if (trans35_1 <= trans35_2)
for (int i35 = 0; i35 < 1 && i35 < trans35_0; i35++) {
if (trans36_4 <= a36.length)
if (trans36_0 <= trans36_1)
if (trans36_3 <= trans36_4)
if (trans36_2 <= trans36_3)
if (trans36_1 <= trans36_2)
for (int i36 = 0; i36 < 1 && i36 < trans36_0; i36++) {
if (trans37_3 <= trans37_4)
if (trans37_1 <= trans37_2)
if (trans37_0 <= trans37_1)
if (trans37_2 <= trans37_3)
if (trans37_4 <= a37.length)
for (int i37 = 0; i37 < 1 && i37 < trans37_0; i37++) {
if (trans38_2 <= trans38_3)
if (trans38_4 <= a38.length)
if (trans38_3 <= trans38_4)
if (trans38_1 <= trans38_2)
if (trans38_0 <= trans38_1)
for (int i38 = 0; i38 < 1 && i38 < trans38_0; i38++) {
if (trans39_3 <= trans39_4)
if (trans39_1 <= trans39_2)
if (trans39_2 <= trans39_3)
if (trans39_0 <= trans39_1)
if (trans39_4 <= a39.length)
for (int i39 = 0; i39 < 1 && i39 < trans39_0; i39++) {
if (trans40_4 <= a40.length)
if (trans40_0 <= trans40_1)
if (trans40_2 <= trans40_3)
if (trans40_1 <= trans40_2)
if (trans40_3 <= trans40_4)
for (int i40 = 0; i40 < 1 && i40 < trans40_0; i40++) {
if (trans41_0 <= trans41_1)
if (trans41_3 <= trans41_4)
if (trans41_2 <= trans41_3)
if (trans41_4 <= a41.length)
if (trans41_1 <= trans41_2)
for (int i41 = 0; i41 < 1 && i41 < trans41_0; i41++) {
if (trans42_1 <= trans42_2)
if (trans42_3 <= trans42_4)
if (trans42_0 <= trans42_1)
if (trans42_2 <= trans42_3)
if (trans42_4 <= a42.length)
for (int i42 = 0; i42 < 1 && i42 < trans42_0; i42++) {
if (trans43_3 <= trans43_4)
if (trans43_1 <= trans43_2)
if (trans43_4 <= a43.length)
if (trans43_2 <= trans43_3)
if (trans43_0 <= trans43_1)
for (int i43 = 0; i43 < 1 && i43 < trans43_0; i43++) {
if (trans44_3 <= trans44_4)
if (trans44_4 <= a44.length)
if (trans44_0 <= trans44_1)
if (trans44_1 <= trans44_2)
if (trans44_2 <= trans44_3)
for (int i44 = 0; i44 < 1 && i44 < trans44_0; i44++) {
if (trans45_3 <= trans45_4)
if (trans45_2 <= trans45_3)
if (trans45_1 <= trans45_2)
if (trans45_4 <= a45.length)
if (trans45_0 <= trans45_1)
for (int i45 = 0; i45 < 1 && i45 < trans45_0; i45++) {
if (trans46_3 <= trans46_4)
if (trans46_2 <= trans46_3)
if (trans46_0 <= trans46_1)
if (trans46_1 <= trans46_2)
if (trans46_4 <= a46.length)
for (int i46 = 0; i46 < 1 && i46 < trans46_0; i46++) {
if (trans47_1 <= trans47_2)
if (trans47_2 <= trans47_3)
if (trans47_3 <= trans47_4)
if (trans47_0 <= trans47_1)
if (trans47_4 <= a47.length)
for (int i47 = 0; i47 < 1 && i47 < trans47_0; i47++) {
if (trans48_1 <= trans48_2)
if (trans48_4 <= a48.length)
if (trans48_3 <= trans48_4)
if (trans48_0 <= trans48_1)
if (trans48_2 <= trans48_3)
for (int i48 = 0; i48 < 1 && i48 < trans48_0; i48++) {
if (trans49_3 <= trans49_4)
if (trans49_2 <= trans49_3)
if (trans49_0 <= trans49_1)
if (trans49_4 <= a49.length)
if (trans49_1 <= trans49_2)
for (int i49 = 0; i49 < 1 && i49 < trans49_0; i49++) {
if (trans50_2 <= trans50_3)
if (trans50_0 <= trans50_1)
if (trans50_4 <= a50.length)
if (trans50_1 <= trans50_2)
if (trans50_3 <= trans50_4)
for (int i50 = 0; i50 < 1 && i50 < trans50_0; i50++) {
if (trans51_2 <= trans51_3)
if (trans51_4 <= a51.length)
if (trans51_1 <= trans51_2)
if (trans51_0 <= trans51_1)
if (trans51_3 <= trans51_4)
for (int i51 = 0; i51 < 1 && i51 < trans51_0; i51++) {
if (trans52_1 <= trans52_2)
if (trans52_4 <= a52.length)
if (trans52_0 <= trans52_1)
if (trans52_3 <= trans52_4)
if (trans52_2 <= trans52_3)
for (int i52 = 0; i52 < 1 && i52 < trans52_0; i52++) {
if (trans53_0 <= trans53_1)
if (trans53_1 <= trans53_2)
if (trans53_2 <= trans53_3)
if (trans53_4 <= a53.length)
if (trans53_3 <= trans53_4)
for (int i53 = 0; i53 < 1 && i53 < trans53_0; i53++) {
if (trans54_2 <= trans54_3)
if (trans54_4 <= a54.length)
if (trans54_0 <= trans54_1)
if (trans54_3 <= trans54_4)
if (trans54_1 <= trans54_2)
for (int i54 = 0; i54 < 1 && i54 < trans54_0; i54++) {
if (trans55_2 <= trans55_3)
if (trans55_4 <= a55.length)
if (trans55_0 <= trans55_1)
if (trans55_1 <= trans55_2)
if (trans55_3 <= trans55_4)
for (int i55 = 0; i55 < 1 && i55 < trans55_0; i55++) {
if (trans56_1 <= trans56_2)
if (trans56_0 <= trans56_1)
if (trans56_3 <= trans56_4)
if (trans56_4 <= a56.length)
if (trans56_2 <= trans56_3)
for (int i56 = 0; i56 < 1 && i56 < trans56_0; i56++) {
if (trans57_0 <= trans57_1)
if (trans57_4 <= a57.length)
if (trans57_2 <= trans57_3)
if (trans57_1 <= trans57_2)
if (trans57_3 <= trans57_4)
for (int i57 = 0; i57 < 1 && i57 < trans57_0; i57++) {
if (trans58_3 <= trans58_4)
if (trans58_1 <= trans58_2)
if (trans58_4 <= a58.length)
if (trans58_2 <= trans58_3)
if (trans58_0 <= trans58_1)
for (int i58 = 0; i58 < 1 && i58 < trans58_0; i58++) {
if (trans59_4 <= a59.length)
if (trans59_1 <= trans59_2)
if (trans59_0 <= trans59_1)
if (trans59_2 <= trans59_3)
if (trans59_3 <= trans59_4)
for (int i59 = 0; i59 < 1 && i59 < trans59_0; i59++) {
if (trans60_4 <= a60.length)
if (trans60_1 <= trans60_2)
if (trans60_3 <= trans60_4)
if (trans60_2 <= trans60_3)
if (trans60_0 <= trans60_1)
for (int i60 = 0; i60 < 1 && i60 < trans60_0; i60++) {
if (trans61_3 <= trans61_4)
if (trans61_2 <= trans61_3)
if (trans61_0 <= trans61_1)
if (trans61_4 <= a61.length)
if (trans61_1 <= trans61_2)
for (int i61 = 0; i61 < 1 && i61 < trans61_0; i61++) {
if (trans62_2 <= trans62_3)
if (trans62_1 <= trans62_2)
if (trans62_3 <= trans62_4)
if (trans62_0 <= trans62_1)
if (trans62_4 <= a62.length)
for (int i62 = 0; i62 < 1 && i62 < trans62_0; i62++) {
if (trans63_2 <= trans63_3)
if (trans63_1 <= trans63_2)
if (trans63_3 <= trans63_4)
if (trans63_4 <= a63.length)
if (trans63_0 <= trans63_1)
for (int i63 = 0; i63 < 1 && i63 < trans63_0; i63++) {
if (trans64_4 <= a64.length)
if (trans64_0 <= trans64_1)
if (trans64_2 <= trans64_3)
if (trans64_3 <= trans64_4)
if (trans64_1 <= trans64_2)
for (int i64 = 0; i64 < 1 && i64 < trans64_0; i64++) {
if (trans65_4 <= a65.length)
if (trans65_1 <= trans65_2)
if (trans65_0 <= trans65_1)
if (trans65_3 <= trans65_4)
if (trans65_2 <= trans65_3)
for (int i65 = 0; i65 < 1 && i65 < trans65_0; i65++) {
if (trans66_4 <= a66.length)
if (trans66_1 <= trans66_2)
if (trans66_2 <= trans66_3)
if (trans66_0 <= trans66_1)
if (trans66_3 <= trans66_4)
for (int i66 = 0; i66 < 1 && i66 < trans66_0; i66++) {
if (trans67_4 <= a67.length)
if (trans67_1 <= trans67_2)
if (trans67_0 <= trans67_1)
if (trans67_2 <= trans67_3)
if (trans67_3 <= trans67_4)
for (int i67 = 0; i67 < 1 && i67 < trans67_0; i67++) {
if (trans68_1 <= trans68_2)
if (trans68_2 <= trans68_3)
if (trans68_3 <= trans68_4)
if (trans68_0 <= trans68_1)
if (trans68_4 <= a68.length)
for (int i68 = 0; i68 < 1 && i68 < trans68_0; i68++) {
if (trans69_3 <= trans69_4)
if (trans69_2 <= trans69_3)
if (trans69_4 <= a69.length)
if (trans69_1 <= trans69_2)
if (trans69_0 <= trans69_1)
for (int i69 = 0; i69 < 1 && i69 < trans69_0; i69++) {
if (trans70_2 <= trans70_3)
if (trans70_0 <= trans70_1)
if (trans70_4 <= a70.length)
if (trans70_3 <= trans70_4)
if (trans70_1 <= trans70_2)
for (int i70 = 0; i70 < 1 && i70 < trans70_0; i70++) {
if (trans71_1 <= trans71_2)
if (trans71_0 <= trans71_1)
if (trans71_3 <= trans71_4)
if (trans71_4 <= a71.length)
if (trans71_2 <= trans71_3)
for (int i71 = 0; i71 < 1 && i71 < trans71_0; i71++) {
if (trans72_2 <= trans72_3)
if (trans72_0 <= trans72_1)
if (trans72_1 <= trans72_2)
if (trans72_3 <= trans72_4)
if (trans72_4 <= a72.length)
for (int i72 = 0; i72 < 1 && i72 < trans72_0; i72++) {
if (trans73_0 <= trans73_1)
if (trans73_1 <= trans73_2)
if (trans73_3 <= trans73_4)
if (trans73_2 <= trans73_3)
if (trans73_4 <= a73.length)
for (int i73 = 0; i73 < 1 && i73 < trans73_0; i73++) {
if (trans74_1 <= trans74_2)
if (trans74_4 <= a74.length)
if (trans74_2 <= trans74_3)
if (trans74_0 <= trans74_1)
if (trans74_3 <= trans74_4)
for (int i74 = 0; i74 < 1 && i74 < trans74_0; i74++) {
if (trans75_0 <= trans75_1)
if (trans75_4 <= a75.length)
if (trans75_2 <= trans75_3)
if (trans75_3 <= trans75_4)
if (trans75_1 <= trans75_2)
for (int i75 = 0; i75 < 1 && i75 < trans75_0; i75++) {
if (trans76_3 <= trans76_4)
if (trans76_4 <= a76.length)
if (trans76_0 <= trans76_1)
if (trans76_2 <= trans76_3)
if (trans76_1 <= trans76_2)
for (int i76 = 0; i76 < 1 && i76 < trans76_0; i76++) {
if (trans77_0 <= trans77_1)
if (trans77_2 <= trans77_3)
if (trans77_1 <= trans77_2)
if (trans77_3 <= trans77_4)
if (trans77_4 <= a77.length)
for (int i77 = 0; i77 < 1 && i77 < trans77_0; i77++) {
if (trans78_2 <= trans78_3)
if (trans78_4 <= a78.length)
if (trans78_0 <= trans78_1)
if (trans78_3 <= trans78_4)
if (trans78_1 <= trans78_2)
for (int i78 = 0; i78 < 1 && i78 < trans78_0; i78++) {
if (trans79_0 <= trans79_1)
if (trans79_4 <= a79.length)
if (trans79_2 <= trans79_3)
if (trans79_3 <= trans79_4)
if (trans79_1 <= trans79_2)
for (int i79 = 0; i79 < 1 && i79 < trans79_0; i79++) {
if (trans80_1 <= trans80_2)
if (trans80_3 <= trans80_4)
if (trans80_0 <= trans80_1)
if (trans80_2 <= trans80_3)
if (trans80_4 <= a80.length)
for (int i80 = 0; i80 < 1 && i80 < trans80_0; i80++) {
if (trans81_0 <= trans81_1)
if (trans81_2 <= trans81_3)
if (trans81_3 <= trans81_4)
if (trans81_4 <= a81.length)
if (trans81_1 <= trans81_2)
for (int i81 = 0; i81 < 1 && i81 < trans81_0; i81++) {
if (trans82_4 <= a82.length)
if (trans82_2 <= trans82_3)
if (trans82_3 <= trans82_4)
if (trans82_0 <= trans82_1)
if (trans82_1 <= trans82_2)
for (int i82 = 0; i82 < 1 && i82 < trans82_0; i82++) {
if (trans83_0 <= trans83_1)
if (trans83_4 <= a83.length)
if (trans83_2 <= trans83_3)
if (trans83_3 <= trans83_4)
if (trans83_1 <= trans83_2)
for (int i83 = 0; i83 < 1 && i83 < trans83_0; i83++) {
if (trans84_2 <= trans84_3)
if (trans84_0 <= trans84_1)
if (trans84_1 <= trans84_2)
if (trans84_4 <= a84.length)
if (trans84_3 <= trans84_4)
for (int i84 = 0; i84 < 1 && i84 < trans84_0; i84++) {
if (trans85_1 <= trans85_2)
if (trans85_2 <= trans85_3)
if (trans85_4 <= a85.length)
if (trans85_0 <= trans85_1)
if (trans85_3 <= trans85_4)
for (int i85 = 0; i85 < 1 && i85 < trans85_0; i85++) {
if (trans86_1 <= trans86_2)
if (trans86_2 <= trans86_3)
if (trans86_3 <= trans86_4)
if (trans86_0 <= trans86_1)
if (trans86_4 <= a86.length)
for (int i86 = 0; i86 < 1 && i86 < trans86_0; i86++) {
if (trans87_0 <= trans87_1)
if (trans87_1 <= trans87_2)
if (trans87_2 <= trans87_3)
if (trans87_4 <= a87.length)
if (trans87_3 <= trans87_4)
for (int i87 = 0; i87 < 1 && i87 < trans87_0; i87++) {
if (trans88_0 <= trans88_1)
if (trans88_1 <= trans88_2)
if (trans88_4 <= a88.length)
if (trans88_2 <= trans88_3)
if (trans88_3 <= trans88_4)
for (int i88 = 0; i88 < 1 && i88 < trans88_0; i88++) {
if (trans89_0 <= trans89_1)
if (trans89_3 <= trans89_4)
if (trans89_2 <= trans89_3)
if (trans89_1 <= trans89_2)
if (trans89_4 <= a89.length)
for (int i89 = 0; i89 < 1 && i89 < trans89_0; i89++) {
if (trans90_3 <= trans90_4)
if (trans90_4 <= a90.length)
if (trans90_1 <= trans90_2)
if (trans90_0 <= trans90_1)
if (trans90_2 <= trans90_3)
for (int i90 = 0; i90 < 1 && i90 < trans90_0; i90++) {
if (trans91_2 <= trans91_3)
if (trans91_3 <= trans91_4)
if (trans91_1 <= trans91_2)
if (trans91_4 <= a91.length)
if (trans91_0 <= trans91_1)
for (int i91 = 0; i91 < 1 && i91 < trans91_0; i91++) {
if (trans92_1 <= trans92_2)
if (trans92_3 <= trans92_4)
if (trans92_4 <= a92.length)
if (trans92_0 <= trans92_1)
if (trans92_2 <= trans92_3)
for (int i92 = 0; i92 < 1 && i92 < trans92_0; i92++) {
if (trans93_4 <= a93.length)
if (trans93_3 <= trans93_4)
if (trans93_2 <= trans93_3)
if (trans93_1 <= trans93_2)
if (trans93_0 <= trans93_1)
for (int i93 = 0; i93 < 1 && i93 < trans93_0; i93++) {
if (trans94_0 <= trans94_1)
if (trans94_2 <= trans94_3)
if (trans94_3 <= trans94_4)
if (trans94_1 <= trans94_2)
if (trans94_4 <= a94.length)
for (int i94 = 0; i94 < 1 && i94 < trans94_0; i94++) {
if (trans95_4 <= a95.length)
if (trans95_3 <= trans95_4)
if (trans95_0 <= trans95_1)
if (trans95_1 <= trans95_2)
if (trans95_2 <= trans95_3)
for (int i95 = 0; i95 < 1 && i95 < trans95_0; i95++) {
if (trans96_1 <= trans96_2)
if (trans96_2 <= trans96_3)
if (trans96_0 <= trans96_1)
if (trans96_4 <= a96.length)
if (trans96_3 <= trans96_4)
for (int i96 = 0; i96 < 1 && i96 < trans96_0; i96++) {
if (trans97_3 <= trans97_4)
if (trans97_0 <= trans97_1)
if (trans97_4 <= a97.length)
if (trans97_2 <= trans97_3)
if (trans97_1 <= trans97_2)
for (int i97 = 0; i97 < 1 && i97 < trans97_0; i97++) {
if (trans98_2 <= trans98_3)
if (trans98_3 <= trans98_4)
if (trans98_0 <= trans98_1)
if (trans98_4 <= a98.length)
if (trans98_1 <= trans98_2)
for (int i98 = 0; i98 < 1 && i98 < trans98_0; i98++) {
if (trans99_1 <= trans99_2)
if (trans99_3 <= trans99_4)
if (trans99_4 <= a99.length)
if (trans99_0 <= trans99_1)
if (trans99_2 <= trans99_3)
for (int i99 = 0; i99 < 1 && i99 < trans99_0; i99++) {
if (trans100_3 <= trans100_4)
if (trans100_4 <= a100.length)
if (trans100_2 <= trans100_3)
if (trans100_1 <= trans100_2)
if (trans100_0 <= trans100_1)
for (int i100 = 0; i100 < 1 && i100 < trans100_0; i100++) {
if (trans101_0 <= trans101_1)
if (trans101_1 <= trans101_2)
if (trans101_3 <= trans101_4)
if (trans101_2 <= trans101_3)
if (trans101_4 <= a101.length)
for (int i101 = 0; i101 < 1 && i101 < trans101_0; i101++) {
if (trans102_2 <= trans102_3)
if (trans102_4 <= a102.length)
if (trans102_0 <= trans102_1)
if (trans102_3 <= trans102_4)
if (trans102_1 <= trans102_2)
for (int i102 = 0; i102 < 1 && i102 < trans102_0; i102++) {
if (trans103_1 <= trans103_2)
if (trans103_4 <= a103.length)
if (trans103_3 <= trans103_4)
if (trans103_0 <= trans103_1)
if (trans103_2 <= trans103_3)
for (int i103 = 0; i103 < 1 && i103 < trans103_0; i103++) {
if (trans104_0 <= trans104_1)
if (trans104_3 <= trans104_4)
if (trans104_4 <= a104.length)
if (trans104_1 <= trans104_2)
if (trans104_2 <= trans104_3)
for (int i104 = 0; i104 < 1 && i104 < trans104_0; i104++) {
if (trans105_3 <= trans105_4)
if (trans105_0 <= trans105_1)
if (trans105_4 <= a105.length)
if (trans105_2 <= trans105_3)
if (trans105_1 <= trans105_2)
for (int i105 = 0; i105 < 1 && i105 < trans105_0; i105++) {
if (trans106_1 <= trans106_2)
if (trans106_3 <= trans106_4)
if (trans106_0 <= trans106_1)
if (trans106_4 <= a106.length)
if (trans106_2 <= trans106_3)
for (int i106 = 0; i106 < 1 && i106 < trans106_0; i106++) {
if (trans107_3 <= trans107_4)
if (trans107_0 <= trans107_1)
if (trans107_4 <= a107.length)
if (trans107_1 <= trans107_2)
if (trans107_2 <= trans107_3)
for (int i107 = 0; i107 < 1 && i107 < trans107_0; i107++) {
if (trans108_2 <= trans108_3)
if (trans108_0 <= trans108_1)
if (trans108_3 <= trans108_4)
if (trans108_1 <= trans108_2)
if (trans108_4 <= a108.length)
for (int i108 = 0; i108 < 1 && i108 < trans108_0; i108++) {
if (trans109_4 <= a109.length)
if (trans109_3 <= trans109_4)
if (trans109_0 <= trans109_1)
if (trans109_1 <= trans109_2)
if (trans109_2 <= trans109_3)
for (int i109 = 0; i109 < 1 && i109 < trans109_0; i109++) {
if (trans110_3 <= trans110_4)
if (trans110_2 <= trans110_3)
if (trans110_0 <= trans110_1)
if (trans110_1 <= trans110_2)
if (trans110_4 <= a110.length)
for (int i110 = 0; i110 < 1 && i110 < trans110_0; i110++) {
if (trans111_1 <= trans111_2)
if (trans111_0 <= trans111_1)
if (trans111_3 <= trans111_4)
if (trans111_2 <= trans111_3)
if (trans111_4 <= a111.length)
for (int i111 = 0; i111 < 1 && i111 < trans111_0; i111++) {
if (trans112_4 <= a112.length)
if (trans112_0 <= trans112_1)
if (trans112_3 <= trans112_4)
if (trans112_2 <= trans112_3)
if (trans112_1 <= trans112_2)
for (int i112 = 0; i112 < 1 && i112 < trans112_0; i112++) {
if (trans113_1 <= trans113_2)
if (trans113_3 <= trans113_4)
if (trans113_0 <= trans113_1)
if (trans113_4 <= a113.length)
if (trans113_2 <= trans113_3)
for (int i113 = 0; i113 < 1 && i113 < trans113_0; i113++) {
if (trans114_3 <= trans114_4)
if (trans114_1 <= trans114_2)
if (trans114_2 <= trans114_3)
if (trans114_0 <= trans114_1)
if (trans114_4 <= a114.length)
for (int i114 = 0; i114 < 1 && i114 < trans114_0; i114++) {
if (trans115_0 <= trans115_1)
if (trans115_3 <= trans115_4)
if (trans115_4 <= a115.length)
if (trans115_2 <= trans115_3)
if (trans115_1 <= trans115_2)
for (int i115 = 0; i115 < 1 && i115 < trans115_0; i115++) {
if (trans116_2 <= trans116_3)
if (trans116_1 <= trans116_2)
if (trans116_0 <= trans116_1)
if (trans116_3 <= trans116_4)
if (trans116_4 <= a116.length)
for (int i116 = 0; i116 < 1 && i116 < trans116_0; i116++) {
if (trans117_2 <= trans117_3)
if (trans117_0 <= trans117_1)
if (trans117_4 <= a117.length)
if (trans117_3 <= trans117_4)
if (trans117_1 <= trans117_2)
for (int i117 = 0; i117 < 1 && i117 < trans117_0; i117++) {
if (trans118_1 <= trans118_2)
if (trans118_4 <= a118.length)
if (trans118_3 <= trans118_4)
if (trans118_0 <= trans118_1)
if (trans118_2 <= trans118_3)
for (int i118 = 0; i118 < 1 && i118 < trans118_0; i118++) {
if (trans119_3 <= trans119_4)
if (trans119_4 <= a119.length)
if (trans119_2 <= trans119_3)
if (trans119_1 <= trans119_2)
if (trans119_0 <= trans119_1)
for (int i119 = 0; i119 < 1 && i119 < trans119_0; i119++) {
if (trans120_1 <= trans120_2)
if (trans120_4 <= a120.length)
if (trans120_3 <= trans120_4)
if (trans120_2 <= trans120_3)
if (trans120_0 <= trans120_1)
for (int i120 = 0; i120 < 1 && i120 < trans120_0; i120++) {
if (trans121_3 <= trans121_4)
if (trans121_1 <= trans121_2)
if (trans121_2 <= trans121_3)
if (trans121_0 <= trans121_1)
if (trans121_4 <= a121.length)
for (int i121 = 0; i121 < 1 && i121 < trans121_0; i121++) {
if (trans122_4 <= a122.length)
if (trans122_2 <= trans122_3)
if (trans122_3 <= trans122_4)
if (trans122_1 <= trans122_2)
if (trans122_0 <= trans122_1)
for (int i122 = 0; i122 < 1 && i122 < trans122_0; i122++) {
if (trans123_0 <= trans123_1)
if (trans123_1 <= trans123_2)
if (trans123_3 <= trans123_4)
if (trans123_4 <= a123.length)
if (trans123_2 <= trans123_3)
for (int i123 = 0; i123 < 1 && i123 < trans123_0; i123++) {
if (trans124_1 <= trans124_2)
if (trans124_3 <= trans124_4)
if (trans124_2 <= trans124_3)
if (trans124_0 <= trans124_1)
if (trans124_4 <= a124.length)
for (int i124 = 0; i124 < 1 && i124 < trans124_0; i124++) {
if (trans125_3 <= trans125_4)
if (trans125_4 <= a125.length)
if (trans125_1 <= trans125_2)
if (trans125_0 <= trans125_1)
if (trans125_2 <= trans125_3)
for (int i125 = 0; i125 < 1 && i125 < trans125_0; i125++) {
if (trans126_3 <= trans126_4)
if (trans126_0 <= trans126_1)
if (trans126_2 <= trans126_3)
if (trans126_4 <= a126.length)
if (trans126_1 <= trans126_2)
for (int i126 = 0; i126 < 1 && i126 < trans126_0; i126++) {
if (trans127_3 <= trans127_4)
if (trans127_0 <= trans127_1)
if (trans127_4 <= a127.length)
if (trans127_1 <= trans127_2)
if (trans127_2 <= trans127_3)
for (int i127 = 0; i127 < 1 && i127 < trans127_0; i127++) {
if (trans128_3 <= trans128_4)
if (trans128_4 <= a128.length)
if (trans128_1 <= trans128_2)
if (trans128_2 <= trans128_3)
if (trans128_0 <= trans128_1)
for (int i128 = 0; i128 < 1 && i128 < trans128_0; i128++) {
if (trans129_3 <= trans129_4)
if (trans129_0 <= trans129_1)
if (trans129_2 <= trans129_3)
if (trans129_4 <= a129.length)
if (trans129_1 <= trans129_2)
for (int i129 = 0; i129 < 1 && i129 < trans129_0; i129++) {
if (trans130_4 <= a130.length)
if (trans130_2 <= trans130_3)
if (trans130_1 <= trans130_2)
if (trans130_3 <= trans130_4)
if (trans130_0 <= trans130_1)
for (int i130 = 0; i130 < 1 && i130 < trans130_0; i130++) {
if (trans131_1 <= trans131_2)
if (trans131_2 <= trans131_3)
if (trans131_4 <= a131.length)
if (trans131_0 <= trans131_1)
if (trans131_3 <= trans131_4)
for (int i131 = 0; i131 < 1 && i131 < trans131_0; i131++) {
if (trans132_3 <= trans132_4)
if (trans132_0 <= trans132_1)
if (trans132_2 <= trans132_3)
if (trans132_1 <= trans132_2)
if (trans132_4 <= a132.length)
for (int i132 = 0; i132 < 1 && i132 < trans132_0; i132++) {
if (trans133_1 <= trans133_2)
if (trans133_2 <= trans133_3)
if (trans133_3 <= trans133_4)
if (trans133_4 <= a133.length)
if (trans133_0 <= trans133_1)
for (int i133 = 0; i133 < 1 && i133 < trans133_0; i133++) {
if (trans134_3 <= trans134_4)
if (trans134_4 <= a134.length)
if (trans134_2 <= trans134_3)
if (trans134_0 <= trans134_1)
if (trans134_1 <= trans134_2)
for (int i134 = 0; i134 < 1 && i134 < trans134_0; i134++) {
if (trans135_4 <= a135.length)
if (trans135_1 <= trans135_2)
if (trans135_3 <= trans135_4)
if (trans135_2 <= trans135_3)
if (trans135_0 <= trans135_1)
for (int i135 = 0; i135 < 1 && i135 < trans135_0; i135++) {
if (trans136_3 <= trans136_4)
if (trans136_1 <= trans136_2)
if (trans136_0 <= trans136_1)
if (trans136_4 <= a136.length)
if (trans136_2 <= trans136_3)
for (int i136 = 0; i136 < 1 && i136 < trans136_0; i136++) {
if (trans137_1 <= trans137_2)
if (trans137_3 <= trans137_4)
if (trans137_2 <= trans137_3)
if (trans137_0 <= trans137_1)
if (trans137_4 <= a137.length)
for (int i137 = 0; i137 < 1 && i137 < trans137_0; i137++) {
if (trans138_4 <= a138.length)
if (trans138_2 <= trans138_3)
if (trans138_1 <= trans138_2)
if (trans138_0 <= trans138_1)
if (trans138_3 <= trans138_4)
for (int i138 = 0; i138 < 1 && i138 < trans138_0; i138++) {
if (trans139_3 <= trans139_4)
if (trans139_2 <= trans139_3)
if (trans139_0 <= trans139_1)
if (trans139_4 <= a139.length)
if (trans139_1 <= trans139_2)
for (int i139 = 0; i139 < 1 && i139 < trans139_0; i139++) {
if (trans140_2 <= trans140_3)
if (trans140_3 <= trans140_4)
if (trans140_1 <= trans140_2)
if (trans140_0 <= trans140_1)
if (trans140_4 <= a140.length)
for (int i140 = 0; i140 < 1 && i140 < trans140_0; i140++) {
if (trans141_4 <= a141.length)
if (trans141_0 <= trans141_1)
if (trans141_1 <= trans141_2)
if (trans141_3 <= trans141_4)
if (trans141_2 <= trans141_3)
for (int i141 = 0; i141 < 1 && i141 < trans141_0; i141++) {
if (trans142_1 <= trans142_2)
if (trans142_3 <= trans142_4)
if (trans142_0 <= trans142_1)
if (trans142_2 <= trans142_3)
if (trans142_4 <= a142.length)
for (int i142 = 0; i142 < 1 && i142 < trans142_0; i142++) {
if (trans143_0 <= trans143_1)
if (trans143_1 <= trans143_2)
if (trans143_2 <= trans143_3)
if (trans143_3 <= trans143_4)
if (trans143_4 <= a143.length)
for (int i143 = 0; i143 < 1 && i143 < trans143_0; i143++) {
if (trans144_3 <= trans144_4)
if (trans144_2 <= trans144_3)
if (trans144_4 <= a144.length)
if (trans144_0 <= trans144_1)
if (trans144_1 <= trans144_2)
for (int i144 = 0; i144 < 1 && i144 < trans144_0; i144++) {
if (trans145_3 <= trans145_4)
if (trans145_1 <= trans145_2)
if (trans145_2 <= trans145_3)
if (trans145_4 <= a145.length)
if (trans145_0 <= trans145_1)
for (int i145 = 0; i145 < 1 && i145 < trans145_0; i145++) {
if (trans146_1 <= trans146_2)
if (trans146_4 <= a146.length)
if (trans146_3 <= trans146_4)
if (trans146_2 <= trans146_3)
if (trans146_0 <= trans146_1)
for (int i146 = 0; i146 < 1 && i146 < trans146_0; i146++) {
if (trans147_3 <= trans147_4)
if (trans147_4 <= a147.length)
if (trans147_0 <= trans147_1)
if (trans147_2 <= trans147_3)
if (trans147_1 <= trans147_2)
for (int i147 = 0; i147 < 1 && i147 < trans147_0; i147++) {
if (trans148_1 <= trans148_2)
if (trans148_4 <= a148.length)
if (trans148_3 <= trans148_4)
if (trans148_0 <= trans148_1)
if (trans148_2 <= trans148_3)
for (int i148 = 0; i148 < 1 && i148 < trans148_0; i148++) {
if (trans149_4 <= a149.length)
if (trans149_2 <= trans149_3)
if (trans149_1 <= trans149_2)
if (trans149_0 <= trans149_1)
if (trans149_3 <= trans149_4)
for (int i149 = 0; i149 < 1 && i149 < trans149_0; i149++) {
if (trans150_0 <= trans150_1)
if (trans150_4 <= a150.length)
if (trans150_1 <= trans150_2)
if (trans150_2 <= trans150_3)
if (trans150_3 <= trans150_4)
for (int i150 = 0; i150 < 1 && i150 < trans150_0; i150++) {
if (trans151_4 <= a151.length)
if (trans151_2 <= trans151_3)
if (trans151_3 <= trans151_4)
if (trans151_0 <= trans151_1)
if (trans151_1 <= trans151_2)
for (int i151 = 0; i151 < 1 && i151 < trans151_0; i151++) {
if (trans152_4 <= a152.length)
if (trans152_2 <= trans152_3)
if (trans152_1 <= trans152_2)
if (trans152_3 <= trans152_4)
if (trans152_0 <= trans152_1)
for (int i152 = 0; i152 < 1 && i152 < trans152_0; i152++) {
if (trans153_2 <= trans153_3)
if (trans153_3 <= trans153_4)
if (trans153_0 <= trans153_1)
if (trans153_1 <= trans153_2)
if (trans153_4 <= a153.length)
for (int i153 = 0; i153 < 1 && i153 < trans153_0; i153++) {
if (trans154_4 <= a154.length)
if (trans154_1 <= trans154_2)
if (trans154_2 <= trans154_3)
if (trans154_0 <= trans154_1)
if (trans154_3 <= trans154_4)
for (int i154 = 0; i154 < 1 && i154 < trans154_0; i154++) {
if (trans155_2 <= trans155_3)
if (trans155_3 <= trans155_4)
if (trans155_0 <= trans155_1)
if (trans155_1 <= trans155_2)
if (trans155_4 <= a155.length)
for (int i155 = 0; i155 < 1 && i155 < trans155_0; i155++) {
if (trans156_3 <= trans156_4)
if (trans156_0 <= trans156_1)
if (trans156_1 <= trans156_2)
if (trans156_4 <= a156.length)
if (trans156_2 <= trans156_3)
for (int i156 = 0; i156 < 1 && i156 < trans156_0; i156++) {
if (trans157_2 <= trans157_3)
if (trans157_4 <= a157.length)
if (trans157_0 <= trans157_1)
if (trans157_1 <= trans157_2)
if (trans157_3 <= trans157_4)
for (int i157 = 0; i157 < 1 && i157 < trans157_0; i157++) {
if (trans158_1 <= trans158_2)
if (trans158_2 <= trans158_3)
if (trans158_0 <= trans158_1)
if (trans158_4 <= a158.length)
if (trans158_3 <= trans158_4)
for (int i158 = 0; i158 < 1 && i158 < trans158_0; i158++) {
if (trans159_4 <= a159.length)
if (trans159_3 <= trans159_4)
if (trans159_1 <= trans159_2)
if (trans159_2 <= trans159_3)
if (trans159_0 <= trans159_1)
for (int i159 = 0; i159 < 1 && i159 < trans159_0; i159++) {
if (trans160_3 <= trans160_4)
if (trans160_4 <= a160.length)
if (trans160_0 <= trans160_1)
if (trans160_2 <= trans160_3)
if (trans160_1 <= trans160_2)
for (int i160 = 0; i160 < 1 && i160 < trans160_0; i160++) {
if (trans161_0 <= trans161_1)
if (trans161_3 <= trans161_4)
if (trans161_2 <= trans161_3)
if (trans161_4 <= a161.length)
if (trans161_1 <= trans161_2)
for (int i161 = 0; i161 < 1 && i161 < trans161_0; i161++) {
if (trans162_4 <= a162.length)
if (trans162_3 <= trans162_4)
if (trans162_2 <= trans162_3)
if (trans162_1 <= trans162_2)
if (trans162_0 <= trans162_1)
for (int i162 = 0; i162 < 1 && i162 < trans162_0; i162++) {
if (trans163_3 <= trans163_4)
if (trans163_4 <= a163.length)
if (trans163_1 <= trans163_2)
if (trans163_0 <= trans163_1)
if (trans163_2 <= trans163_3)
for (int i163 = 0; i163 < 1 && i163 < trans163_0; i163++) {
if (trans164_3 <= trans164_4)
if (trans164_4 <= a164.length)
if (trans164_0 <= trans164_1)
if (trans164_1 <= trans164_2)
if (trans164_2 <= trans164_3)
for (int i164 = 0; i164 < 1 && i164 < trans164_0; i164++) {
if (trans165_1 <= trans165_2)
if (trans165_4 <= a165.length)
if (trans165_0 <= trans165_1)
if (trans165_3 <= trans165_4)
if (trans165_2 <= trans165_3)
for (int i165 = 0; i165 < 1 && i165 < trans165_0; i165++) {
if (trans166_1 <= trans166_2)
if (trans166_0 <= trans166_1)
if (trans166_4 <= a166.length)
if (trans166_3 <= trans166_4)
if (trans166_2 <= trans166_3)
for (int i166 = 0; i166 < 1 && i166 < trans166_0; i166++) {
if (trans167_1 <= trans167_2)
if (trans167_4 <= a167.length)
if (trans167_0 <= trans167_1)
if (trans167_2 <= trans167_3)
if (trans167_3 <= trans167_4)
for (int i167 = 0; i167 < 1 && i167 < trans167_0; i167++) {
if (trans168_1 <= trans168_2)
if (trans168_4 <= a168.length)
if (trans168_3 <= trans168_4)
if (trans168_2 <= trans168_3)
if (trans168_0 <= trans168_1)
for (int i168 = 0; i168 < 1 && i168 < trans168_0; i168++) {
if (trans169_2 <= trans169_3)
if (trans169_3 <= trans169_4)
if (trans169_4 <= a169.length)
if (trans169_1 <= trans169_2)
if (trans169_0 <= trans169_1)
for (int i169 = 0; i169 < 1 && i169 < trans169_0; i169++) {
if (trans170_4 <= a170.length)
if (trans170_0 <= trans170_1)
if (trans170_3 <= trans170_4)
if (trans170_1 <= trans170_2)
if (trans170_2 <= trans170_3)
for (int i170 = 0; i170 < 1 && i170 < trans170_0; i170++) {
if (trans171_3 <= trans171_4)
if (trans171_4 <= a171.length)
if (trans171_1 <= trans171_2)
if (trans171_2 <= trans171_3)
if (trans171_0 <= trans171_1)
for (int i171 = 0; i171 < 1 && i171 < trans171_0; i171++) {
if (trans172_1 <= trans172_2)
if (trans172_0 <= trans172_1)
if (trans172_2 <= trans172_3)
if (trans172_4 <= a172.length)
if (trans172_3 <= trans172_4)
for (int i172 = 0; i172 < 1 && i172 < trans172_0; i172++) {
if (trans173_1 <= trans173_2)
if (trans173_4 <= a173.length)
if (trans173_3 <= trans173_4)
if (trans173_0 <= trans173_1)
if (trans173_2 <= trans173_3)
for (int i173 = 0; i173 < 1 && i173 < trans173_0; i173++) {
if (trans174_3 <= trans174_4)
if (trans174_4 <= a174.length)
if (trans174_0 <= trans174_1)
if (trans174_2 <= trans174_3)
if (trans174_1 <= trans174_2)
for (int i174 = 0; i174 < 1 && i174 < trans174_0; i174++) {
if (trans175_0 <= trans175_1)
if (trans175_1 <= trans175_2)
if (trans175_3 <= trans175_4)
if (trans175_4 <= a175.length)
if (trans175_2 <= trans175_3)
for (int i175 = 0; i175 < 1 && i175 < trans175_0; i175++) {
if (trans176_4 <= a176.length)
if (trans176_0 <= trans176_1)
if (trans176_3 <= trans176_4)
if (trans176_1 <= trans176_2)
if (trans176_2 <= trans176_3)
for (int i176 = 0; i176 < 1 && i176 < trans176_0; i176++) {
if (trans177_1 <= trans177_2)
if (trans177_4 <= a177.length)
if (trans177_2 <= trans177_3)
if (trans177_3 <= trans177_4)
if (trans177_0 <= trans177_1)
for (int i177 = 0; i177 < 1 && i177 < trans177_0; i177++) {
if (trans178_3 <= trans178_4)
if (trans178_4 <= a178.length)
if (trans178_0 <= trans178_1)
if (trans178_2 <= trans178_3)
if (trans178_1 <= trans178_2)
for (int i178 = 0; i178 < 1 && i178 < trans178_0; i178++) {
if (trans179_4 <= a179.length)
if (trans179_2 <= trans179_3)
if (trans179_0 <= trans179_1)
if (trans179_3 <= trans179_4)
if (trans179_1 <= trans179_2)
for (int i179 = 0; i179 < 1 && i179 < trans179_0; i179++) {
if (trans180_2 <= trans180_3)
if (trans180_3 <= trans180_4)
if (trans180_1 <= trans180_2)
if (trans180_4 <= a180.length)
if (trans180_0 <= trans180_1)
for (int i180 = 0; i180 < 1 && i180 < trans180_0; i180++) {
if (trans181_1 <= trans181_2)
if (trans181_4 <= a181.length)
if (trans181_2 <= trans181_3)
if (trans181_0 <= trans181_1)
if (trans181_3 <= trans181_4)
for (int i181 = 0; i181 < 1 && i181 < trans181_0; i181++) {
if (trans182_3 <= trans182_4)
if (trans182_2 <= trans182_3)
if (trans182_1 <= trans182_2)
if (trans182_0 <= trans182_1)
if (trans182_4 <= a182.length)
for (int i182 = 0; i182 < 1 && i182 < trans182_0; i182++) {
if (trans183_2 <= trans183_3)
if (trans183_0 <= trans183_1)
if (trans183_3 <= trans183_4)
if (trans183_4 <= a183.length)
if (trans183_1 <= trans183_2)
for (int i183 = 0; i183 < 1 && i183 < trans183_0; i183++) {
if (trans184_1 <= trans184_2)
if (trans184_4 <= a184.length)
if (trans184_0 <= trans184_1)
if (trans184_3 <= trans184_4)
if (trans184_2 <= trans184_3)
for (int i184 = 0; i184 < 1 && i184 < trans184_0; i184++) {
if (trans185_1 <= trans185_2)
if (trans185_3 <= trans185_4)
if (trans185_4 <= a185.length)
if (trans185_0 <= trans185_1)
if (trans185_2 <= trans185_3)
for (int i185 = 0; i185 < 1 && i185 < trans185_0; i185++) {
if (trans186_1 <= trans186_2)
if (trans186_0 <= trans186_1)
if (trans186_2 <= trans186_3)
if (trans186_4 <= a186.length)
if (trans186_3 <= trans186_4)
for (int i186 = 0; i186 < 1 && i186 < trans186_0; i186++) {
if (trans187_4 <= a187.length)
if (trans187_2 <= trans187_3)
if (trans187_3 <= trans187_4)
if (trans187_0 <= trans187_1)
if (trans187_1 <= trans187_2)
for (int i187 = 0; i187 < 1 && i187 < trans187_0; i187++) {
if (trans188_1 <= trans188_2)
if (trans188_0 <= trans188_1)
if (trans188_4 <= a188.length)
if (trans188_2 <= trans188_3)
if (trans188_3 <= trans188_4)
for (int i188 = 0; i188 < 1 && i188 < trans188_0; i188++) {
if (trans189_4 <= a189.length)
if (trans189_1 <= trans189_2)
if (trans189_3 <= trans189_4)
if (trans189_2 <= trans189_3)
if (trans189_0 <= trans189_1)
for (int i189 = 0; i189 < 1 && i189 < trans189_0; i189++) {
if (trans190_4 <= a190.length)
if (trans190_1 <= trans190_2)
if (trans190_0 <= trans190_1)
if (trans190_3 <= trans190_4)
if (trans190_2 <= trans190_3)
for (int i190 = 0; i190 < 1 && i190 < trans190_0; i190++) {
if (trans191_2 <= trans191_3)
if (trans191_4 <= a191.length)
if (trans191_0 <= trans191_1)
if (trans191_1 <= trans191_2)
if (trans191_3 <= trans191_4)
for (int i191 = 0; i191 < 1 && i191 < trans191_0; i191++) {
if (trans192_0 <= trans192_1)
if (trans192_3 <= trans192_4)
if (trans192_4 <= a192.length)
if (trans192_1 <= trans192_2)
if (trans192_2 <= trans192_3)
for (int i192 = 0; i192 < 1 && i192 < trans192_0; i192++) {
if (trans193_1 <= trans193_2)
if (trans193_3 <= trans193_4)
if (trans193_2 <= trans193_3)
if (trans193_4 <= a193.length)
if (trans193_0 <= trans193_1)
for (int i193 = 0; i193 < 1 && i193 < trans193_0; i193++) {
if (trans194_0 <= trans194_1)
if (trans194_1 <= trans194_2)
if (trans194_2 <= trans194_3)
if (trans194_3 <= trans194_4)
if (trans194_4 <= a194.length)
for (int i194 = 0; i194 < 1 && i194 < trans194_0; i194++) {
if (trans195_0 <= trans195_1)
if (trans195_1 <= trans195_2)
if (trans195_3 <= trans195_4)
if (trans195_4 <= a195.length)
if (trans195_2 <= trans195_3)
for (int i195 = 0; i195 < 1 && i195 < trans195_0; i195++) {
if (trans196_0 <= trans196_1)
if (trans196_1 <= trans196_2)
if (trans196_2 <= trans196_3)
if (trans196_3 <= trans196_4)
if (trans196_4 <= a196.length)
for (int i196 = 0; i196 < 1 && i196 < trans196_0; i196++) {
if (trans197_3 <= trans197_4)
if (trans197_2 <= trans197_3)
if (trans197_4 <= a197.length)
if (trans197_1 <= trans197_2)
if (trans197_0 <= trans197_1)
for (int i197 = 0; i197 < 1 && i197 < trans197_0; i197++) {
if (trans198_2 <= trans198_3)
if (trans198_4 <= a198.length)
if (trans198_1 <= trans198_2)
if (trans198_3 <= trans198_4)
if (trans198_0 <= trans198_1)
for (int i198 = 0; i198 < 1 && i198 < trans198_0; i198++) {
if (trans199_0 <= trans199_1)
if (trans199_3 <= trans199_4)
if (trans199_1 <= trans199_2)
if (trans199_4 <= a199.length)
if (trans199_2 <= trans199_3)
for (int i199 = 0; i199 < 1 && i199 < trans199_0; i199++) {
s += a0[i0];
s += a1[i1];
s += a2[i2];
s += a3[i3];
s += a4[i4];
s += a5[i5];
s += a6[i6];
s += a7[i7];
s += a8[i8];
s += a9[i9];
s += a10[i10];
s += a11[i11];
s += a12[i12];
s += a13[i13];
s += a14[i14];
s += a15[i15];
s += a16[i16];
s += a17[i17];
s += a18[i18];
s += a19[i19];
s += a20[i20];
s += a21[i21];
s += a22[i22];
s += a23[i23];
s += a24[i24];
s += a25[i25];
s += a26[i26];
s += a27[i27];
s += a28[i28];
s += a29[i29];
s += a30[i30];
s += a31[i31];
s += a32[i32];
s += a33[i33];
s += a34[i34];
s += a35[i35];
s += a36[i36];
s += a37[i37];
s += a38[i38];
s += a39[i39];
s += a40[i40];
s += a41[i41];
s += a42[i42];
s += a43[i43];
s += a44[i44];
s += a45[i45];
s += a46[i46];
s += a47[i47];
s += a48[i48];
s += a49[i49];
s += a50[i50];
s += a51[i51];
s += a52[i52];
s += a53[i53];
s += a54[i54];
s += a55[i55];
s += a56[i56];
s += a57[i57];
s += a58[i58];
s += a59[i59];
s += a60[i60];
s += a61[i61];
s += a62[i62];
s += a63[i63];
s += a64[i64];
s += a65[i65];
s += a66[i66];
s += a67[i67];
s += a68[i68];
s += a69[i69];
s += a70[i70];
s += a71[i71];
s += a72[i72];
s += a73[i73];
s += a74[i74];
s += a75[i75];
s += a76[i76];
s += a77[i77];
s += a78[i78];
s += a79[i79];
s += a80[i80];
s += a81[i81];
s += a82[i82];
s += a83[i83];
s += a84[i84];
s += a85[i85];
s += a86[i86];
s += a87[i87];
s += a88[i88];
s += a89[i89];
s += a90[i90];
s += a91[i91];
s += a92[i92];
s += a93[i93];
s += a94[i94];
s += a95[i95];
s += a96[i96];
s += a97[i97];
s += a98[i98];
s += a99[i99];
s += a100[i100];
s += a101[i101];
s += a102[i102];
s += a103[i103];
s += a104[i104];
s += a105[i105];
s += a106[i106];
s += a107[i107];
s += a108[i108];
s += a109[i109];
s += a110[i110];
s += a111[i111];
s += a112[i112];
s += a113[i113];
s += a114[i114];
s += a115[i115];
s += a116[i116];
s += a117[i117];
s += a118[i118];
s += a119[i119];
s += a120[i120];
s += a121[i121];
s += a122[i122];
s += a123[i123];
s += a124[i124];
s += a125[i125];
s += a126[i126];
s += a127[i127];
s += a128[i128];
s += a129[i129];
s += a130[i130];
s += a131[i131];
s += a132[i132];
s += a133[i133];
s += a134[i134];
s += a135[i135];
s += a136[i136];
s += a137[i137];
s += a138[i138];
s += a139[i139];
s += a140[i140];
s += a141[i141];
s += a142[i142];
s += a143[i143];
s += a144[i144];
s += a145[i145];
s += a146[i146];
s += a147[i147];
s += a148[i148];
s += a149[i149];
s += a150[i150];
s += a151[i151];
s += a152[i152];
s += a153[i153];
s += a154[i154];
s += a155[i155];
s += a156[i156];
s += a157[i157];
s += a158[i158];
s += a159[i159];
s += a160[i160];
s += a161[i161];
s += a162[i162];
s += a163[i163];
s += a164[i164];
s += a165[i165];
s += a166[i166];
s += a167[i167];
s += a168[i168];
s += a169[i169];
s += a170[i170];
s += a171[i171];
s += a172[i172];
s += a173[i173];
s += a174[i174];
s += a175[i175];
s += a176[i176];
s += a177[i177];
s += a178[i178];
s += a179[i179];
s += a180[i180];
s += a181[i181];
s += a182[i182];
s += a183[i183];
s += a184[i184];
s += a185[i185];
s += a186[i186];
s += a187[i187];
s += a188[i188];
s += a189[i189];
s += a190[i190];
s += a191[i191];
s += a192[i192];
s += a193[i193];
s += a194[i194];
s += a195[i195];
s += a196[i196];
s += a197[i197];
s += a198[i198];
s += a199[i199];
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
return s; }

@Benchmark public int bench_big_n200_multipleTrue_trans5_transrandomTrue() {
return big_n200_multipleTrue_trans5_transrandomTrue();
}

int big_n200_multipleTrue_trans10_transrandomTrue() {
int s = 0;
if (!(trans0.length >= 10)) return -1;
int trans0_0 = trans0[0];
int trans0_1 = trans0[1];
int trans0_2 = trans0[2];
int trans0_3 = trans0[3];
int trans0_4 = trans0[4];
int trans0_5 = trans0[5];
int trans0_6 = trans0[6];
int trans0_7 = trans0[7];
int trans0_8 = trans0[8];
int trans0_9 = trans0[9];
if (!(trans1.length >= 10)) return -1;
int trans1_0 = trans1[0];
int trans1_1 = trans1[1];
int trans1_2 = trans1[2];
int trans1_3 = trans1[3];
int trans1_4 = trans1[4];
int trans1_5 = trans1[5];
int trans1_6 = trans1[6];
int trans1_7 = trans1[7];
int trans1_8 = trans1[8];
int trans1_9 = trans1[9];
if (!(trans2.length >= 10)) return -1;
int trans2_0 = trans2[0];
int trans2_1 = trans2[1];
int trans2_2 = trans2[2];
int trans2_3 = trans2[3];
int trans2_4 = trans2[4];
int trans2_5 = trans2[5];
int trans2_6 = trans2[6];
int trans2_7 = trans2[7];
int trans2_8 = trans2[8];
int trans2_9 = trans2[9];
if (!(trans3.length >= 10)) return -1;
int trans3_0 = trans3[0];
int trans3_1 = trans3[1];
int trans3_2 = trans3[2];
int trans3_3 = trans3[3];
int trans3_4 = trans3[4];
int trans3_5 = trans3[5];
int trans3_6 = trans3[6];
int trans3_7 = trans3[7];
int trans3_8 = trans3[8];
int trans3_9 = trans3[9];
if (!(trans4.length >= 10)) return -1;
int trans4_0 = trans4[0];
int trans4_1 = trans4[1];
int trans4_2 = trans4[2];
int trans4_3 = trans4[3];
int trans4_4 = trans4[4];
int trans4_5 = trans4[5];
int trans4_6 = trans4[6];
int trans4_7 = trans4[7];
int trans4_8 = trans4[8];
int trans4_9 = trans4[9];
if (!(trans5.length >= 10)) return -1;
int trans5_0 = trans5[0];
int trans5_1 = trans5[1];
int trans5_2 = trans5[2];
int trans5_3 = trans5[3];
int trans5_4 = trans5[4];
int trans5_5 = trans5[5];
int trans5_6 = trans5[6];
int trans5_7 = trans5[7];
int trans5_8 = trans5[8];
int trans5_9 = trans5[9];
if (!(trans6.length >= 10)) return -1;
int trans6_0 = trans6[0];
int trans6_1 = trans6[1];
int trans6_2 = trans6[2];
int trans6_3 = trans6[3];
int trans6_4 = trans6[4];
int trans6_5 = trans6[5];
int trans6_6 = trans6[6];
int trans6_7 = trans6[7];
int trans6_8 = trans6[8];
int trans6_9 = trans6[9];
if (!(trans7.length >= 10)) return -1;
int trans7_0 = trans7[0];
int trans7_1 = trans7[1];
int trans7_2 = trans7[2];
int trans7_3 = trans7[3];
int trans7_4 = trans7[4];
int trans7_5 = trans7[5];
int trans7_6 = trans7[6];
int trans7_7 = trans7[7];
int trans7_8 = trans7[8];
int trans7_9 = trans7[9];
if (!(trans8.length >= 10)) return -1;
int trans8_0 = trans8[0];
int trans8_1 = trans8[1];
int trans8_2 = trans8[2];
int trans8_3 = trans8[3];
int trans8_4 = trans8[4];
int trans8_5 = trans8[5];
int trans8_6 = trans8[6];
int trans8_7 = trans8[7];
int trans8_8 = trans8[8];
int trans8_9 = trans8[9];
if (!(trans9.length >= 10)) return -1;
int trans9_0 = trans9[0];
int trans9_1 = trans9[1];
int trans9_2 = trans9[2];
int trans9_3 = trans9[3];
int trans9_4 = trans9[4];
int trans9_5 = trans9[5];
int trans9_6 = trans9[6];
int trans9_7 = trans9[7];
int trans9_8 = trans9[8];
int trans9_9 = trans9[9];
if (!(trans10.length >= 10)) return -1;
int trans10_0 = trans10[0];
int trans10_1 = trans10[1];
int trans10_2 = trans10[2];
int trans10_3 = trans10[3];
int trans10_4 = trans10[4];
int trans10_5 = trans10[5];
int trans10_6 = trans10[6];
int trans10_7 = trans10[7];
int trans10_8 = trans10[8];
int trans10_9 = trans10[9];
if (!(trans11.length >= 10)) return -1;
int trans11_0 = trans11[0];
int trans11_1 = trans11[1];
int trans11_2 = trans11[2];
int trans11_3 = trans11[3];
int trans11_4 = trans11[4];
int trans11_5 = trans11[5];
int trans11_6 = trans11[6];
int trans11_7 = trans11[7];
int trans11_8 = trans11[8];
int trans11_9 = trans11[9];
if (!(trans12.length >= 10)) return -1;
int trans12_0 = trans12[0];
int trans12_1 = trans12[1];
int trans12_2 = trans12[2];
int trans12_3 = trans12[3];
int trans12_4 = trans12[4];
int trans12_5 = trans12[5];
int trans12_6 = trans12[6];
int trans12_7 = trans12[7];
int trans12_8 = trans12[8];
int trans12_9 = trans12[9];
if (!(trans13.length >= 10)) return -1;
int trans13_0 = trans13[0];
int trans13_1 = trans13[1];
int trans13_2 = trans13[2];
int trans13_3 = trans13[3];
int trans13_4 = trans13[4];
int trans13_5 = trans13[5];
int trans13_6 = trans13[6];
int trans13_7 = trans13[7];
int trans13_8 = trans13[8];
int trans13_9 = trans13[9];
if (!(trans14.length >= 10)) return -1;
int trans14_0 = trans14[0];
int trans14_1 = trans14[1];
int trans14_2 = trans14[2];
int trans14_3 = trans14[3];
int trans14_4 = trans14[4];
int trans14_5 = trans14[5];
int trans14_6 = trans14[6];
int trans14_7 = trans14[7];
int trans14_8 = trans14[8];
int trans14_9 = trans14[9];
if (!(trans15.length >= 10)) return -1;
int trans15_0 = trans15[0];
int trans15_1 = trans15[1];
int trans15_2 = trans15[2];
int trans15_3 = trans15[3];
int trans15_4 = trans15[4];
int trans15_5 = trans15[5];
int trans15_6 = trans15[6];
int trans15_7 = trans15[7];
int trans15_8 = trans15[8];
int trans15_9 = trans15[9];
if (!(trans16.length >= 10)) return -1;
int trans16_0 = trans16[0];
int trans16_1 = trans16[1];
int trans16_2 = trans16[2];
int trans16_3 = trans16[3];
int trans16_4 = trans16[4];
int trans16_5 = trans16[5];
int trans16_6 = trans16[6];
int trans16_7 = trans16[7];
int trans16_8 = trans16[8];
int trans16_9 = trans16[9];
if (!(trans17.length >= 10)) return -1;
int trans17_0 = trans17[0];
int trans17_1 = trans17[1];
int trans17_2 = trans17[2];
int trans17_3 = trans17[3];
int trans17_4 = trans17[4];
int trans17_5 = trans17[5];
int trans17_6 = trans17[6];
int trans17_7 = trans17[7];
int trans17_8 = trans17[8];
int trans17_9 = trans17[9];
if (!(trans18.length >= 10)) return -1;
int trans18_0 = trans18[0];
int trans18_1 = trans18[1];
int trans18_2 = trans18[2];
int trans18_3 = trans18[3];
int trans18_4 = trans18[4];
int trans18_5 = trans18[5];
int trans18_6 = trans18[6];
int trans18_7 = trans18[7];
int trans18_8 = trans18[8];
int trans18_9 = trans18[9];
if (!(trans19.length >= 10)) return -1;
int trans19_0 = trans19[0];
int trans19_1 = trans19[1];
int trans19_2 = trans19[2];
int trans19_3 = trans19[3];
int trans19_4 = trans19[4];
int trans19_5 = trans19[5];
int trans19_6 = trans19[6];
int trans19_7 = trans19[7];
int trans19_8 = trans19[8];
int trans19_9 = trans19[9];
if (!(trans20.length >= 10)) return -1;
int trans20_0 = trans20[0];
int trans20_1 = trans20[1];
int trans20_2 = trans20[2];
int trans20_3 = trans20[3];
int trans20_4 = trans20[4];
int trans20_5 = trans20[5];
int trans20_6 = trans20[6];
int trans20_7 = trans20[7];
int trans20_8 = trans20[8];
int trans20_9 = trans20[9];
if (!(trans21.length >= 10)) return -1;
int trans21_0 = trans21[0];
int trans21_1 = trans21[1];
int trans21_2 = trans21[2];
int trans21_3 = trans21[3];
int trans21_4 = trans21[4];
int trans21_5 = trans21[5];
int trans21_6 = trans21[6];
int trans21_7 = trans21[7];
int trans21_8 = trans21[8];
int trans21_9 = trans21[9];
if (!(trans22.length >= 10)) return -1;
int trans22_0 = trans22[0];
int trans22_1 = trans22[1];
int trans22_2 = trans22[2];
int trans22_3 = trans22[3];
int trans22_4 = trans22[4];
int trans22_5 = trans22[5];
int trans22_6 = trans22[6];
int trans22_7 = trans22[7];
int trans22_8 = trans22[8];
int trans22_9 = trans22[9];
if (!(trans23.length >= 10)) return -1;
int trans23_0 = trans23[0];
int trans23_1 = trans23[1];
int trans23_2 = trans23[2];
int trans23_3 = trans23[3];
int trans23_4 = trans23[4];
int trans23_5 = trans23[5];
int trans23_6 = trans23[6];
int trans23_7 = trans23[7];
int trans23_8 = trans23[8];
int trans23_9 = trans23[9];
if (!(trans24.length >= 10)) return -1;
int trans24_0 = trans24[0];
int trans24_1 = trans24[1];
int trans24_2 = trans24[2];
int trans24_3 = trans24[3];
int trans24_4 = trans24[4];
int trans24_5 = trans24[5];
int trans24_6 = trans24[6];
int trans24_7 = trans24[7];
int trans24_8 = trans24[8];
int trans24_9 = trans24[9];
if (!(trans25.length >= 10)) return -1;
int trans25_0 = trans25[0];
int trans25_1 = trans25[1];
int trans25_2 = trans25[2];
int trans25_3 = trans25[3];
int trans25_4 = trans25[4];
int trans25_5 = trans25[5];
int trans25_6 = trans25[6];
int trans25_7 = trans25[7];
int trans25_8 = trans25[8];
int trans25_9 = trans25[9];
if (!(trans26.length >= 10)) return -1;
int trans26_0 = trans26[0];
int trans26_1 = trans26[1];
int trans26_2 = trans26[2];
int trans26_3 = trans26[3];
int trans26_4 = trans26[4];
int trans26_5 = trans26[5];
int trans26_6 = trans26[6];
int trans26_7 = trans26[7];
int trans26_8 = trans26[8];
int trans26_9 = trans26[9];
if (!(trans27.length >= 10)) return -1;
int trans27_0 = trans27[0];
int trans27_1 = trans27[1];
int trans27_2 = trans27[2];
int trans27_3 = trans27[3];
int trans27_4 = trans27[4];
int trans27_5 = trans27[5];
int trans27_6 = trans27[6];
int trans27_7 = trans27[7];
int trans27_8 = trans27[8];
int trans27_9 = trans27[9];
if (!(trans28.length >= 10)) return -1;
int trans28_0 = trans28[0];
int trans28_1 = trans28[1];
int trans28_2 = trans28[2];
int trans28_3 = trans28[3];
int trans28_4 = trans28[4];
int trans28_5 = trans28[5];
int trans28_6 = trans28[6];
int trans28_7 = trans28[7];
int trans28_8 = trans28[8];
int trans28_9 = trans28[9];
if (!(trans29.length >= 10)) return -1;
int trans29_0 = trans29[0];
int trans29_1 = trans29[1];
int trans29_2 = trans29[2];
int trans29_3 = trans29[3];
int trans29_4 = trans29[4];
int trans29_5 = trans29[5];
int trans29_6 = trans29[6];
int trans29_7 = trans29[7];
int trans29_8 = trans29[8];
int trans29_9 = trans29[9];
if (!(trans30.length >= 10)) return -1;
int trans30_0 = trans30[0];
int trans30_1 = trans30[1];
int trans30_2 = trans30[2];
int trans30_3 = trans30[3];
int trans30_4 = trans30[4];
int trans30_5 = trans30[5];
int trans30_6 = trans30[6];
int trans30_7 = trans30[7];
int trans30_8 = trans30[8];
int trans30_9 = trans30[9];
if (!(trans31.length >= 10)) return -1;
int trans31_0 = trans31[0];
int trans31_1 = trans31[1];
int trans31_2 = trans31[2];
int trans31_3 = trans31[3];
int trans31_4 = trans31[4];
int trans31_5 = trans31[5];
int trans31_6 = trans31[6];
int trans31_7 = trans31[7];
int trans31_8 = trans31[8];
int trans31_9 = trans31[9];
if (!(trans32.length >= 10)) return -1;
int trans32_0 = trans32[0];
int trans32_1 = trans32[1];
int trans32_2 = trans32[2];
int trans32_3 = trans32[3];
int trans32_4 = trans32[4];
int trans32_5 = trans32[5];
int trans32_6 = trans32[6];
int trans32_7 = trans32[7];
int trans32_8 = trans32[8];
int trans32_9 = trans32[9];
if (!(trans33.length >= 10)) return -1;
int trans33_0 = trans33[0];
int trans33_1 = trans33[1];
int trans33_2 = trans33[2];
int trans33_3 = trans33[3];
int trans33_4 = trans33[4];
int trans33_5 = trans33[5];
int trans33_6 = trans33[6];
int trans33_7 = trans33[7];
int trans33_8 = trans33[8];
int trans33_9 = trans33[9];
if (!(trans34.length >= 10)) return -1;
int trans34_0 = trans34[0];
int trans34_1 = trans34[1];
int trans34_2 = trans34[2];
int trans34_3 = trans34[3];
int trans34_4 = trans34[4];
int trans34_5 = trans34[5];
int trans34_6 = trans34[6];
int trans34_7 = trans34[7];
int trans34_8 = trans34[8];
int trans34_9 = trans34[9];
if (!(trans35.length >= 10)) return -1;
int trans35_0 = trans35[0];
int trans35_1 = trans35[1];
int trans35_2 = trans35[2];
int trans35_3 = trans35[3];
int trans35_4 = trans35[4];
int trans35_5 = trans35[5];
int trans35_6 = trans35[6];
int trans35_7 = trans35[7];
int trans35_8 = trans35[8];
int trans35_9 = trans35[9];
if (!(trans36.length >= 10)) return -1;
int trans36_0 = trans36[0];
int trans36_1 = trans36[1];
int trans36_2 = trans36[2];
int trans36_3 = trans36[3];
int trans36_4 = trans36[4];
int trans36_5 = trans36[5];
int trans36_6 = trans36[6];
int trans36_7 = trans36[7];
int trans36_8 = trans36[8];
int trans36_9 = trans36[9];
if (!(trans37.length >= 10)) return -1;
int trans37_0 = trans37[0];
int trans37_1 = trans37[1];
int trans37_2 = trans37[2];
int trans37_3 = trans37[3];
int trans37_4 = trans37[4];
int trans37_5 = trans37[5];
int trans37_6 = trans37[6];
int trans37_7 = trans37[7];
int trans37_8 = trans37[8];
int trans37_9 = trans37[9];
if (!(trans38.length >= 10)) return -1;
int trans38_0 = trans38[0];
int trans38_1 = trans38[1];
int trans38_2 = trans38[2];
int trans38_3 = trans38[3];
int trans38_4 = trans38[4];
int trans38_5 = trans38[5];
int trans38_6 = trans38[6];
int trans38_7 = trans38[7];
int trans38_8 = trans38[8];
int trans38_9 = trans38[9];
if (!(trans39.length >= 10)) return -1;
int trans39_0 = trans39[0];
int trans39_1 = trans39[1];
int trans39_2 = trans39[2];
int trans39_3 = trans39[3];
int trans39_4 = trans39[4];
int trans39_5 = trans39[5];
int trans39_6 = trans39[6];
int trans39_7 = trans39[7];
int trans39_8 = trans39[8];
int trans39_9 = trans39[9];
if (!(trans40.length >= 10)) return -1;
int trans40_0 = trans40[0];
int trans40_1 = trans40[1];
int trans40_2 = trans40[2];
int trans40_3 = trans40[3];
int trans40_4 = trans40[4];
int trans40_5 = trans40[5];
int trans40_6 = trans40[6];
int trans40_7 = trans40[7];
int trans40_8 = trans40[8];
int trans40_9 = trans40[9];
if (!(trans41.length >= 10)) return -1;
int trans41_0 = trans41[0];
int trans41_1 = trans41[1];
int trans41_2 = trans41[2];
int trans41_3 = trans41[3];
int trans41_4 = trans41[4];
int trans41_5 = trans41[5];
int trans41_6 = trans41[6];
int trans41_7 = trans41[7];
int trans41_8 = trans41[8];
int trans41_9 = trans41[9];
if (!(trans42.length >= 10)) return -1;
int trans42_0 = trans42[0];
int trans42_1 = trans42[1];
int trans42_2 = trans42[2];
int trans42_3 = trans42[3];
int trans42_4 = trans42[4];
int trans42_5 = trans42[5];
int trans42_6 = trans42[6];
int trans42_7 = trans42[7];
int trans42_8 = trans42[8];
int trans42_9 = trans42[9];
if (!(trans43.length >= 10)) return -1;
int trans43_0 = trans43[0];
int trans43_1 = trans43[1];
int trans43_2 = trans43[2];
int trans43_3 = trans43[3];
int trans43_4 = trans43[4];
int trans43_5 = trans43[5];
int trans43_6 = trans43[6];
int trans43_7 = trans43[7];
int trans43_8 = trans43[8];
int trans43_9 = trans43[9];
if (!(trans44.length >= 10)) return -1;
int trans44_0 = trans44[0];
int trans44_1 = trans44[1];
int trans44_2 = trans44[2];
int trans44_3 = trans44[3];
int trans44_4 = trans44[4];
int trans44_5 = trans44[5];
int trans44_6 = trans44[6];
int trans44_7 = trans44[7];
int trans44_8 = trans44[8];
int trans44_9 = trans44[9];
if (!(trans45.length >= 10)) return -1;
int trans45_0 = trans45[0];
int trans45_1 = trans45[1];
int trans45_2 = trans45[2];
int trans45_3 = trans45[3];
int trans45_4 = trans45[4];
int trans45_5 = trans45[5];
int trans45_6 = trans45[6];
int trans45_7 = trans45[7];
int trans45_8 = trans45[8];
int trans45_9 = trans45[9];
if (!(trans46.length >= 10)) return -1;
int trans46_0 = trans46[0];
int trans46_1 = trans46[1];
int trans46_2 = trans46[2];
int trans46_3 = trans46[3];
int trans46_4 = trans46[4];
int trans46_5 = trans46[5];
int trans46_6 = trans46[6];
int trans46_7 = trans46[7];
int trans46_8 = trans46[8];
int trans46_9 = trans46[9];
if (!(trans47.length >= 10)) return -1;
int trans47_0 = trans47[0];
int trans47_1 = trans47[1];
int trans47_2 = trans47[2];
int trans47_3 = trans47[3];
int trans47_4 = trans47[4];
int trans47_5 = trans47[5];
int trans47_6 = trans47[6];
int trans47_7 = trans47[7];
int trans47_8 = trans47[8];
int trans47_9 = trans47[9];
if (!(trans48.length >= 10)) return -1;
int trans48_0 = trans48[0];
int trans48_1 = trans48[1];
int trans48_2 = trans48[2];
int trans48_3 = trans48[3];
int trans48_4 = trans48[4];
int trans48_5 = trans48[5];
int trans48_6 = trans48[6];
int trans48_7 = trans48[7];
int trans48_8 = trans48[8];
int trans48_9 = trans48[9];
if (!(trans49.length >= 10)) return -1;
int trans49_0 = trans49[0];
int trans49_1 = trans49[1];
int trans49_2 = trans49[2];
int trans49_3 = trans49[3];
int trans49_4 = trans49[4];
int trans49_5 = trans49[5];
int trans49_6 = trans49[6];
int trans49_7 = trans49[7];
int trans49_8 = trans49[8];
int trans49_9 = trans49[9];
if (!(trans50.length >= 10)) return -1;
int trans50_0 = trans50[0];
int trans50_1 = trans50[1];
int trans50_2 = trans50[2];
int trans50_3 = trans50[3];
int trans50_4 = trans50[4];
int trans50_5 = trans50[5];
int trans50_6 = trans50[6];
int trans50_7 = trans50[7];
int trans50_8 = trans50[8];
int trans50_9 = trans50[9];
if (!(trans51.length >= 10)) return -1;
int trans51_0 = trans51[0];
int trans51_1 = trans51[1];
int trans51_2 = trans51[2];
int trans51_3 = trans51[3];
int trans51_4 = trans51[4];
int trans51_5 = trans51[5];
int trans51_6 = trans51[6];
int trans51_7 = trans51[7];
int trans51_8 = trans51[8];
int trans51_9 = trans51[9];
if (!(trans52.length >= 10)) return -1;
int trans52_0 = trans52[0];
int trans52_1 = trans52[1];
int trans52_2 = trans52[2];
int trans52_3 = trans52[3];
int trans52_4 = trans52[4];
int trans52_5 = trans52[5];
int trans52_6 = trans52[6];
int trans52_7 = trans52[7];
int trans52_8 = trans52[8];
int trans52_9 = trans52[9];
if (!(trans53.length >= 10)) return -1;
int trans53_0 = trans53[0];
int trans53_1 = trans53[1];
int trans53_2 = trans53[2];
int trans53_3 = trans53[3];
int trans53_4 = trans53[4];
int trans53_5 = trans53[5];
int trans53_6 = trans53[6];
int trans53_7 = trans53[7];
int trans53_8 = trans53[8];
int trans53_9 = trans53[9];
if (!(trans54.length >= 10)) return -1;
int trans54_0 = trans54[0];
int trans54_1 = trans54[1];
int trans54_2 = trans54[2];
int trans54_3 = trans54[3];
int trans54_4 = trans54[4];
int trans54_5 = trans54[5];
int trans54_6 = trans54[6];
int trans54_7 = trans54[7];
int trans54_8 = trans54[8];
int trans54_9 = trans54[9];
if (!(trans55.length >= 10)) return -1;
int trans55_0 = trans55[0];
int trans55_1 = trans55[1];
int trans55_2 = trans55[2];
int trans55_3 = trans55[3];
int trans55_4 = trans55[4];
int trans55_5 = trans55[5];
int trans55_6 = trans55[6];
int trans55_7 = trans55[7];
int trans55_8 = trans55[8];
int trans55_9 = trans55[9];
if (!(trans56.length >= 10)) return -1;
int trans56_0 = trans56[0];
int trans56_1 = trans56[1];
int trans56_2 = trans56[2];
int trans56_3 = trans56[3];
int trans56_4 = trans56[4];
int trans56_5 = trans56[5];
int trans56_6 = trans56[6];
int trans56_7 = trans56[7];
int trans56_8 = trans56[8];
int trans56_9 = trans56[9];
if (!(trans57.length >= 10)) return -1;
int trans57_0 = trans57[0];
int trans57_1 = trans57[1];
int trans57_2 = trans57[2];
int trans57_3 = trans57[3];
int trans57_4 = trans57[4];
int trans57_5 = trans57[5];
int trans57_6 = trans57[6];
int trans57_7 = trans57[7];
int trans57_8 = trans57[8];
int trans57_9 = trans57[9];
if (!(trans58.length >= 10)) return -1;
int trans58_0 = trans58[0];
int trans58_1 = trans58[1];
int trans58_2 = trans58[2];
int trans58_3 = trans58[3];
int trans58_4 = trans58[4];
int trans58_5 = trans58[5];
int trans58_6 = trans58[6];
int trans58_7 = trans58[7];
int trans58_8 = trans58[8];
int trans58_9 = trans58[9];
if (!(trans59.length >= 10)) return -1;
int trans59_0 = trans59[0];
int trans59_1 = trans59[1];
int trans59_2 = trans59[2];
int trans59_3 = trans59[3];
int trans59_4 = trans59[4];
int trans59_5 = trans59[5];
int trans59_6 = trans59[6];
int trans59_7 = trans59[7];
int trans59_8 = trans59[8];
int trans59_9 = trans59[9];
if (!(trans60.length >= 10)) return -1;
int trans60_0 = trans60[0];
int trans60_1 = trans60[1];
int trans60_2 = trans60[2];
int trans60_3 = trans60[3];
int trans60_4 = trans60[4];
int trans60_5 = trans60[5];
int trans60_6 = trans60[6];
int trans60_7 = trans60[7];
int trans60_8 = trans60[8];
int trans60_9 = trans60[9];
if (!(trans61.length >= 10)) return -1;
int trans61_0 = trans61[0];
int trans61_1 = trans61[1];
int trans61_2 = trans61[2];
int trans61_3 = trans61[3];
int trans61_4 = trans61[4];
int trans61_5 = trans61[5];
int trans61_6 = trans61[6];
int trans61_7 = trans61[7];
int trans61_8 = trans61[8];
int trans61_9 = trans61[9];
if (!(trans62.length >= 10)) return -1;
int trans62_0 = trans62[0];
int trans62_1 = trans62[1];
int trans62_2 = trans62[2];
int trans62_3 = trans62[3];
int trans62_4 = trans62[4];
int trans62_5 = trans62[5];
int trans62_6 = trans62[6];
int trans62_7 = trans62[7];
int trans62_8 = trans62[8];
int trans62_9 = trans62[9];
if (!(trans63.length >= 10)) return -1;
int trans63_0 = trans63[0];
int trans63_1 = trans63[1];
int trans63_2 = trans63[2];
int trans63_3 = trans63[3];
int trans63_4 = trans63[4];
int trans63_5 = trans63[5];
int trans63_6 = trans63[6];
int trans63_7 = trans63[7];
int trans63_8 = trans63[8];
int trans63_9 = trans63[9];
if (!(trans64.length >= 10)) return -1;
int trans64_0 = trans64[0];
int trans64_1 = trans64[1];
int trans64_2 = trans64[2];
int trans64_3 = trans64[3];
int trans64_4 = trans64[4];
int trans64_5 = trans64[5];
int trans64_6 = trans64[6];
int trans64_7 = trans64[7];
int trans64_8 = trans64[8];
int trans64_9 = trans64[9];
if (!(trans65.length >= 10)) return -1;
int trans65_0 = trans65[0];
int trans65_1 = trans65[1];
int trans65_2 = trans65[2];
int trans65_3 = trans65[3];
int trans65_4 = trans65[4];
int trans65_5 = trans65[5];
int trans65_6 = trans65[6];
int trans65_7 = trans65[7];
int trans65_8 = trans65[8];
int trans65_9 = trans65[9];
if (!(trans66.length >= 10)) return -1;
int trans66_0 = trans66[0];
int trans66_1 = trans66[1];
int trans66_2 = trans66[2];
int trans66_3 = trans66[3];
int trans66_4 = trans66[4];
int trans66_5 = trans66[5];
int trans66_6 = trans66[6];
int trans66_7 = trans66[7];
int trans66_8 = trans66[8];
int trans66_9 = trans66[9];
if (!(trans67.length >= 10)) return -1;
int trans67_0 = trans67[0];
int trans67_1 = trans67[1];
int trans67_2 = trans67[2];
int trans67_3 = trans67[3];
int trans67_4 = trans67[4];
int trans67_5 = trans67[5];
int trans67_6 = trans67[6];
int trans67_7 = trans67[7];
int trans67_8 = trans67[8];
int trans67_9 = trans67[9];
if (!(trans68.length >= 10)) return -1;
int trans68_0 = trans68[0];
int trans68_1 = trans68[1];
int trans68_2 = trans68[2];
int trans68_3 = trans68[3];
int trans68_4 = trans68[4];
int trans68_5 = trans68[5];
int trans68_6 = trans68[6];
int trans68_7 = trans68[7];
int trans68_8 = trans68[8];
int trans68_9 = trans68[9];
if (!(trans69.length >= 10)) return -1;
int trans69_0 = trans69[0];
int trans69_1 = trans69[1];
int trans69_2 = trans69[2];
int trans69_3 = trans69[3];
int trans69_4 = trans69[4];
int trans69_5 = trans69[5];
int trans69_6 = trans69[6];
int trans69_7 = trans69[7];
int trans69_8 = trans69[8];
int trans69_9 = trans69[9];
if (!(trans70.length >= 10)) return -1;
int trans70_0 = trans70[0];
int trans70_1 = trans70[1];
int trans70_2 = trans70[2];
int trans70_3 = trans70[3];
int trans70_4 = trans70[4];
int trans70_5 = trans70[5];
int trans70_6 = trans70[6];
int trans70_7 = trans70[7];
int trans70_8 = trans70[8];
int trans70_9 = trans70[9];
if (!(trans71.length >= 10)) return -1;
int trans71_0 = trans71[0];
int trans71_1 = trans71[1];
int trans71_2 = trans71[2];
int trans71_3 = trans71[3];
int trans71_4 = trans71[4];
int trans71_5 = trans71[5];
int trans71_6 = trans71[6];
int trans71_7 = trans71[7];
int trans71_8 = trans71[8];
int trans71_9 = trans71[9];
if (!(trans72.length >= 10)) return -1;
int trans72_0 = trans72[0];
int trans72_1 = trans72[1];
int trans72_2 = trans72[2];
int trans72_3 = trans72[3];
int trans72_4 = trans72[4];
int trans72_5 = trans72[5];
int trans72_6 = trans72[6];
int trans72_7 = trans72[7];
int trans72_8 = trans72[8];
int trans72_9 = trans72[9];
if (!(trans73.length >= 10)) return -1;
int trans73_0 = trans73[0];
int trans73_1 = trans73[1];
int trans73_2 = trans73[2];
int trans73_3 = trans73[3];
int trans73_4 = trans73[4];
int trans73_5 = trans73[5];
int trans73_6 = trans73[6];
int trans73_7 = trans73[7];
int trans73_8 = trans73[8];
int trans73_9 = trans73[9];
if (!(trans74.length >= 10)) return -1;
int trans74_0 = trans74[0];
int trans74_1 = trans74[1];
int trans74_2 = trans74[2];
int trans74_3 = trans74[3];
int trans74_4 = trans74[4];
int trans74_5 = trans74[5];
int trans74_6 = trans74[6];
int trans74_7 = trans74[7];
int trans74_8 = trans74[8];
int trans74_9 = trans74[9];
if (!(trans75.length >= 10)) return -1;
int trans75_0 = trans75[0];
int trans75_1 = trans75[1];
int trans75_2 = trans75[2];
int trans75_3 = trans75[3];
int trans75_4 = trans75[4];
int trans75_5 = trans75[5];
int trans75_6 = trans75[6];
int trans75_7 = trans75[7];
int trans75_8 = trans75[8];
int trans75_9 = trans75[9];
if (!(trans76.length >= 10)) return -1;
int trans76_0 = trans76[0];
int trans76_1 = trans76[1];
int trans76_2 = trans76[2];
int trans76_3 = trans76[3];
int trans76_4 = trans76[4];
int trans76_5 = trans76[5];
int trans76_6 = trans76[6];
int trans76_7 = trans76[7];
int trans76_8 = trans76[8];
int trans76_9 = trans76[9];
if (!(trans77.length >= 10)) return -1;
int trans77_0 = trans77[0];
int trans77_1 = trans77[1];
int trans77_2 = trans77[2];
int trans77_3 = trans77[3];
int trans77_4 = trans77[4];
int trans77_5 = trans77[5];
int trans77_6 = trans77[6];
int trans77_7 = trans77[7];
int trans77_8 = trans77[8];
int trans77_9 = trans77[9];
if (!(trans78.length >= 10)) return -1;
int trans78_0 = trans78[0];
int trans78_1 = trans78[1];
int trans78_2 = trans78[2];
int trans78_3 = trans78[3];
int trans78_4 = trans78[4];
int trans78_5 = trans78[5];
int trans78_6 = trans78[6];
int trans78_7 = trans78[7];
int trans78_8 = trans78[8];
int trans78_9 = trans78[9];
if (!(trans79.length >= 10)) return -1;
int trans79_0 = trans79[0];
int trans79_1 = trans79[1];
int trans79_2 = trans79[2];
int trans79_3 = trans79[3];
int trans79_4 = trans79[4];
int trans79_5 = trans79[5];
int trans79_6 = trans79[6];
int trans79_7 = trans79[7];
int trans79_8 = trans79[8];
int trans79_9 = trans79[9];
if (!(trans80.length >= 10)) return -1;
int trans80_0 = trans80[0];
int trans80_1 = trans80[1];
int trans80_2 = trans80[2];
int trans80_3 = trans80[3];
int trans80_4 = trans80[4];
int trans80_5 = trans80[5];
int trans80_6 = trans80[6];
int trans80_7 = trans80[7];
int trans80_8 = trans80[8];
int trans80_9 = trans80[9];
if (!(trans81.length >= 10)) return -1;
int trans81_0 = trans81[0];
int trans81_1 = trans81[1];
int trans81_2 = trans81[2];
int trans81_3 = trans81[3];
int trans81_4 = trans81[4];
int trans81_5 = trans81[5];
int trans81_6 = trans81[6];
int trans81_7 = trans81[7];
int trans81_8 = trans81[8];
int trans81_9 = trans81[9];
if (!(trans82.length >= 10)) return -1;
int trans82_0 = trans82[0];
int trans82_1 = trans82[1];
int trans82_2 = trans82[2];
int trans82_3 = trans82[3];
int trans82_4 = trans82[4];
int trans82_5 = trans82[5];
int trans82_6 = trans82[6];
int trans82_7 = trans82[7];
int trans82_8 = trans82[8];
int trans82_9 = trans82[9];
if (!(trans83.length >= 10)) return -1;
int trans83_0 = trans83[0];
int trans83_1 = trans83[1];
int trans83_2 = trans83[2];
int trans83_3 = trans83[3];
int trans83_4 = trans83[4];
int trans83_5 = trans83[5];
int trans83_6 = trans83[6];
int trans83_7 = trans83[7];
int trans83_8 = trans83[8];
int trans83_9 = trans83[9];
if (!(trans84.length >= 10)) return -1;
int trans84_0 = trans84[0];
int trans84_1 = trans84[1];
int trans84_2 = trans84[2];
int trans84_3 = trans84[3];
int trans84_4 = trans84[4];
int trans84_5 = trans84[5];
int trans84_6 = trans84[6];
int trans84_7 = trans84[7];
int trans84_8 = trans84[8];
int trans84_9 = trans84[9];
if (!(trans85.length >= 10)) return -1;
int trans85_0 = trans85[0];
int trans85_1 = trans85[1];
int trans85_2 = trans85[2];
int trans85_3 = trans85[3];
int trans85_4 = trans85[4];
int trans85_5 = trans85[5];
int trans85_6 = trans85[6];
int trans85_7 = trans85[7];
int trans85_8 = trans85[8];
int trans85_9 = trans85[9];
if (!(trans86.length >= 10)) return -1;
int trans86_0 = trans86[0];
int trans86_1 = trans86[1];
int trans86_2 = trans86[2];
int trans86_3 = trans86[3];
int trans86_4 = trans86[4];
int trans86_5 = trans86[5];
int trans86_6 = trans86[6];
int trans86_7 = trans86[7];
int trans86_8 = trans86[8];
int trans86_9 = trans86[9];
if (!(trans87.length >= 10)) return -1;
int trans87_0 = trans87[0];
int trans87_1 = trans87[1];
int trans87_2 = trans87[2];
int trans87_3 = trans87[3];
int trans87_4 = trans87[4];
int trans87_5 = trans87[5];
int trans87_6 = trans87[6];
int trans87_7 = trans87[7];
int trans87_8 = trans87[8];
int trans87_9 = trans87[9];
if (!(trans88.length >= 10)) return -1;
int trans88_0 = trans88[0];
int trans88_1 = trans88[1];
int trans88_2 = trans88[2];
int trans88_3 = trans88[3];
int trans88_4 = trans88[4];
int trans88_5 = trans88[5];
int trans88_6 = trans88[6];
int trans88_7 = trans88[7];
int trans88_8 = trans88[8];
int trans88_9 = trans88[9];
if (!(trans89.length >= 10)) return -1;
int trans89_0 = trans89[0];
int trans89_1 = trans89[1];
int trans89_2 = trans89[2];
int trans89_3 = trans89[3];
int trans89_4 = trans89[4];
int trans89_5 = trans89[5];
int trans89_6 = trans89[6];
int trans89_7 = trans89[7];
int trans89_8 = trans89[8];
int trans89_9 = trans89[9];
if (!(trans90.length >= 10)) return -1;
int trans90_0 = trans90[0];
int trans90_1 = trans90[1];
int trans90_2 = trans90[2];
int trans90_3 = trans90[3];
int trans90_4 = trans90[4];
int trans90_5 = trans90[5];
int trans90_6 = trans90[6];
int trans90_7 = trans90[7];
int trans90_8 = trans90[8];
int trans90_9 = trans90[9];
if (!(trans91.length >= 10)) return -1;
int trans91_0 = trans91[0];
int trans91_1 = trans91[1];
int trans91_2 = trans91[2];
int trans91_3 = trans91[3];
int trans91_4 = trans91[4];
int trans91_5 = trans91[5];
int trans91_6 = trans91[6];
int trans91_7 = trans91[7];
int trans91_8 = trans91[8];
int trans91_9 = trans91[9];
if (!(trans92.length >= 10)) return -1;
int trans92_0 = trans92[0];
int trans92_1 = trans92[1];
int trans92_2 = trans92[2];
int trans92_3 = trans92[3];
int trans92_4 = trans92[4];
int trans92_5 = trans92[5];
int trans92_6 = trans92[6];
int trans92_7 = trans92[7];
int trans92_8 = trans92[8];
int trans92_9 = trans92[9];
if (!(trans93.length >= 10)) return -1;
int trans93_0 = trans93[0];
int trans93_1 = trans93[1];
int trans93_2 = trans93[2];
int trans93_3 = trans93[3];
int trans93_4 = trans93[4];
int trans93_5 = trans93[5];
int trans93_6 = trans93[6];
int trans93_7 = trans93[7];
int trans93_8 = trans93[8];
int trans93_9 = trans93[9];
if (!(trans94.length >= 10)) return -1;
int trans94_0 = trans94[0];
int trans94_1 = trans94[1];
int trans94_2 = trans94[2];
int trans94_3 = trans94[3];
int trans94_4 = trans94[4];
int trans94_5 = trans94[5];
int trans94_6 = trans94[6];
int trans94_7 = trans94[7];
int trans94_8 = trans94[8];
int trans94_9 = trans94[9];
if (!(trans95.length >= 10)) return -1;
int trans95_0 = trans95[0];
int trans95_1 = trans95[1];
int trans95_2 = trans95[2];
int trans95_3 = trans95[3];
int trans95_4 = trans95[4];
int trans95_5 = trans95[5];
int trans95_6 = trans95[6];
int trans95_7 = trans95[7];
int trans95_8 = trans95[8];
int trans95_9 = trans95[9];
if (!(trans96.length >= 10)) return -1;
int trans96_0 = trans96[0];
int trans96_1 = trans96[1];
int trans96_2 = trans96[2];
int trans96_3 = trans96[3];
int trans96_4 = trans96[4];
int trans96_5 = trans96[5];
int trans96_6 = trans96[6];
int trans96_7 = trans96[7];
int trans96_8 = trans96[8];
int trans96_9 = trans96[9];
if (!(trans97.length >= 10)) return -1;
int trans97_0 = trans97[0];
int trans97_1 = trans97[1];
int trans97_2 = trans97[2];
int trans97_3 = trans97[3];
int trans97_4 = trans97[4];
int trans97_5 = trans97[5];
int trans97_6 = trans97[6];
int trans97_7 = trans97[7];
int trans97_8 = trans97[8];
int trans97_9 = trans97[9];
if (!(trans98.length >= 10)) return -1;
int trans98_0 = trans98[0];
int trans98_1 = trans98[1];
int trans98_2 = trans98[2];
int trans98_3 = trans98[3];
int trans98_4 = trans98[4];
int trans98_5 = trans98[5];
int trans98_6 = trans98[6];
int trans98_7 = trans98[7];
int trans98_8 = trans98[8];
int trans98_9 = trans98[9];
if (!(trans99.length >= 10)) return -1;
int trans99_0 = trans99[0];
int trans99_1 = trans99[1];
int trans99_2 = trans99[2];
int trans99_3 = trans99[3];
int trans99_4 = trans99[4];
int trans99_5 = trans99[5];
int trans99_6 = trans99[6];
int trans99_7 = trans99[7];
int trans99_8 = trans99[8];
int trans99_9 = trans99[9];
if (!(trans100.length >= 10)) return -1;
int trans100_0 = trans100[0];
int trans100_1 = trans100[1];
int trans100_2 = trans100[2];
int trans100_3 = trans100[3];
int trans100_4 = trans100[4];
int trans100_5 = trans100[5];
int trans100_6 = trans100[6];
int trans100_7 = trans100[7];
int trans100_8 = trans100[8];
int trans100_9 = trans100[9];
if (!(trans101.length >= 10)) return -1;
int trans101_0 = trans101[0];
int trans101_1 = trans101[1];
int trans101_2 = trans101[2];
int trans101_3 = trans101[3];
int trans101_4 = trans101[4];
int trans101_5 = trans101[5];
int trans101_6 = trans101[6];
int trans101_7 = trans101[7];
int trans101_8 = trans101[8];
int trans101_9 = trans101[9];
if (!(trans102.length >= 10)) return -1;
int trans102_0 = trans102[0];
int trans102_1 = trans102[1];
int trans102_2 = trans102[2];
int trans102_3 = trans102[3];
int trans102_4 = trans102[4];
int trans102_5 = trans102[5];
int trans102_6 = trans102[6];
int trans102_7 = trans102[7];
int trans102_8 = trans102[8];
int trans102_9 = trans102[9];
if (!(trans103.length >= 10)) return -1;
int trans103_0 = trans103[0];
int trans103_1 = trans103[1];
int trans103_2 = trans103[2];
int trans103_3 = trans103[3];
int trans103_4 = trans103[4];
int trans103_5 = trans103[5];
int trans103_6 = trans103[6];
int trans103_7 = trans103[7];
int trans103_8 = trans103[8];
int trans103_9 = trans103[9];
if (!(trans104.length >= 10)) return -1;
int trans104_0 = trans104[0];
int trans104_1 = trans104[1];
int trans104_2 = trans104[2];
int trans104_3 = trans104[3];
int trans104_4 = trans104[4];
int trans104_5 = trans104[5];
int trans104_6 = trans104[6];
int trans104_7 = trans104[7];
int trans104_8 = trans104[8];
int trans104_9 = trans104[9];
if (!(trans105.length >= 10)) return -1;
int trans105_0 = trans105[0];
int trans105_1 = trans105[1];
int trans105_2 = trans105[2];
int trans105_3 = trans105[3];
int trans105_4 = trans105[4];
int trans105_5 = trans105[5];
int trans105_6 = trans105[6];
int trans105_7 = trans105[7];
int trans105_8 = trans105[8];
int trans105_9 = trans105[9];
if (!(trans106.length >= 10)) return -1;
int trans106_0 = trans106[0];
int trans106_1 = trans106[1];
int trans106_2 = trans106[2];
int trans106_3 = trans106[3];
int trans106_4 = trans106[4];
int trans106_5 = trans106[5];
int trans106_6 = trans106[6];
int trans106_7 = trans106[7];
int trans106_8 = trans106[8];
int trans106_9 = trans106[9];
if (!(trans107.length >= 10)) return -1;
int trans107_0 = trans107[0];
int trans107_1 = trans107[1];
int trans107_2 = trans107[2];
int trans107_3 = trans107[3];
int trans107_4 = trans107[4];
int trans107_5 = trans107[5];
int trans107_6 = trans107[6];
int trans107_7 = trans107[7];
int trans107_8 = trans107[8];
int trans107_9 = trans107[9];
if (!(trans108.length >= 10)) return -1;
int trans108_0 = trans108[0];
int trans108_1 = trans108[1];
int trans108_2 = trans108[2];
int trans108_3 = trans108[3];
int trans108_4 = trans108[4];
int trans108_5 = trans108[5];
int trans108_6 = trans108[6];
int trans108_7 = trans108[7];
int trans108_8 = trans108[8];
int trans108_9 = trans108[9];
if (!(trans109.length >= 10)) return -1;
int trans109_0 = trans109[0];
int trans109_1 = trans109[1];
int trans109_2 = trans109[2];
int trans109_3 = trans109[3];
int trans109_4 = trans109[4];
int trans109_5 = trans109[5];
int trans109_6 = trans109[6];
int trans109_7 = trans109[7];
int trans109_8 = trans109[8];
int trans109_9 = trans109[9];
if (!(trans110.length >= 10)) return -1;
int trans110_0 = trans110[0];
int trans110_1 = trans110[1];
int trans110_2 = trans110[2];
int trans110_3 = trans110[3];
int trans110_4 = trans110[4];
int trans110_5 = trans110[5];
int trans110_6 = trans110[6];
int trans110_7 = trans110[7];
int trans110_8 = trans110[8];
int trans110_9 = trans110[9];
if (!(trans111.length >= 10)) return -1;
int trans111_0 = trans111[0];
int trans111_1 = trans111[1];
int trans111_2 = trans111[2];
int trans111_3 = trans111[3];
int trans111_4 = trans111[4];
int trans111_5 = trans111[5];
int trans111_6 = trans111[6];
int trans111_7 = trans111[7];
int trans111_8 = trans111[8];
int trans111_9 = trans111[9];
if (!(trans112.length >= 10)) return -1;
int trans112_0 = trans112[0];
int trans112_1 = trans112[1];
int trans112_2 = trans112[2];
int trans112_3 = trans112[3];
int trans112_4 = trans112[4];
int trans112_5 = trans112[5];
int trans112_6 = trans112[6];
int trans112_7 = trans112[7];
int trans112_8 = trans112[8];
int trans112_9 = trans112[9];
if (!(trans113.length >= 10)) return -1;
int trans113_0 = trans113[0];
int trans113_1 = trans113[1];
int trans113_2 = trans113[2];
int trans113_3 = trans113[3];
int trans113_4 = trans113[4];
int trans113_5 = trans113[5];
int trans113_6 = trans113[6];
int trans113_7 = trans113[7];
int trans113_8 = trans113[8];
int trans113_9 = trans113[9];
if (!(trans114.length >= 10)) return -1;
int trans114_0 = trans114[0];
int trans114_1 = trans114[1];
int trans114_2 = trans114[2];
int trans114_3 = trans114[3];
int trans114_4 = trans114[4];
int trans114_5 = trans114[5];
int trans114_6 = trans114[6];
int trans114_7 = trans114[7];
int trans114_8 = trans114[8];
int trans114_9 = trans114[9];
if (!(trans115.length >= 10)) return -1;
int trans115_0 = trans115[0];
int trans115_1 = trans115[1];
int trans115_2 = trans115[2];
int trans115_3 = trans115[3];
int trans115_4 = trans115[4];
int trans115_5 = trans115[5];
int trans115_6 = trans115[6];
int trans115_7 = trans115[7];
int trans115_8 = trans115[8];
int trans115_9 = trans115[9];
if (!(trans116.length >= 10)) return -1;
int trans116_0 = trans116[0];
int trans116_1 = trans116[1];
int trans116_2 = trans116[2];
int trans116_3 = trans116[3];
int trans116_4 = trans116[4];
int trans116_5 = trans116[5];
int trans116_6 = trans116[6];
int trans116_7 = trans116[7];
int trans116_8 = trans116[8];
int trans116_9 = trans116[9];
if (!(trans117.length >= 10)) return -1;
int trans117_0 = trans117[0];
int trans117_1 = trans117[1];
int trans117_2 = trans117[2];
int trans117_3 = trans117[3];
int trans117_4 = trans117[4];
int trans117_5 = trans117[5];
int trans117_6 = trans117[6];
int trans117_7 = trans117[7];
int trans117_8 = trans117[8];
int trans117_9 = trans117[9];
if (!(trans118.length >= 10)) return -1;
int trans118_0 = trans118[0];
int trans118_1 = trans118[1];
int trans118_2 = trans118[2];
int trans118_3 = trans118[3];
int trans118_4 = trans118[4];
int trans118_5 = trans118[5];
int trans118_6 = trans118[6];
int trans118_7 = trans118[7];
int trans118_8 = trans118[8];
int trans118_9 = trans118[9];
if (!(trans119.length >= 10)) return -1;
int trans119_0 = trans119[0];
int trans119_1 = trans119[1];
int trans119_2 = trans119[2];
int trans119_3 = trans119[3];
int trans119_4 = trans119[4];
int trans119_5 = trans119[5];
int trans119_6 = trans119[6];
int trans119_7 = trans119[7];
int trans119_8 = trans119[8];
int trans119_9 = trans119[9];
if (!(trans120.length >= 10)) return -1;
int trans120_0 = trans120[0];
int trans120_1 = trans120[1];
int trans120_2 = trans120[2];
int trans120_3 = trans120[3];
int trans120_4 = trans120[4];
int trans120_5 = trans120[5];
int trans120_6 = trans120[6];
int trans120_7 = trans120[7];
int trans120_8 = trans120[8];
int trans120_9 = trans120[9];
if (!(trans121.length >= 10)) return -1;
int trans121_0 = trans121[0];
int trans121_1 = trans121[1];
int trans121_2 = trans121[2];
int trans121_3 = trans121[3];
int trans121_4 = trans121[4];
int trans121_5 = trans121[5];
int trans121_6 = trans121[6];
int trans121_7 = trans121[7];
int trans121_8 = trans121[8];
int trans121_9 = trans121[9];
if (!(trans122.length >= 10)) return -1;
int trans122_0 = trans122[0];
int trans122_1 = trans122[1];
int trans122_2 = trans122[2];
int trans122_3 = trans122[3];
int trans122_4 = trans122[4];
int trans122_5 = trans122[5];
int trans122_6 = trans122[6];
int trans122_7 = trans122[7];
int trans122_8 = trans122[8];
int trans122_9 = trans122[9];
if (!(trans123.length >= 10)) return -1;
int trans123_0 = trans123[0];
int trans123_1 = trans123[1];
int trans123_2 = trans123[2];
int trans123_3 = trans123[3];
int trans123_4 = trans123[4];
int trans123_5 = trans123[5];
int trans123_6 = trans123[6];
int trans123_7 = trans123[7];
int trans123_8 = trans123[8];
int trans123_9 = trans123[9];
if (!(trans124.length >= 10)) return -1;
int trans124_0 = trans124[0];
int trans124_1 = trans124[1];
int trans124_2 = trans124[2];
int trans124_3 = trans124[3];
int trans124_4 = trans124[4];
int trans124_5 = trans124[5];
int trans124_6 = trans124[6];
int trans124_7 = trans124[7];
int trans124_8 = trans124[8];
int trans124_9 = trans124[9];
if (!(trans125.length >= 10)) return -1;
int trans125_0 = trans125[0];
int trans125_1 = trans125[1];
int trans125_2 = trans125[2];
int trans125_3 = trans125[3];
int trans125_4 = trans125[4];
int trans125_5 = trans125[5];
int trans125_6 = trans125[6];
int trans125_7 = trans125[7];
int trans125_8 = trans125[8];
int trans125_9 = trans125[9];
if (!(trans126.length >= 10)) return -1;
int trans126_0 = trans126[0];
int trans126_1 = trans126[1];
int trans126_2 = trans126[2];
int trans126_3 = trans126[3];
int trans126_4 = trans126[4];
int trans126_5 = trans126[5];
int trans126_6 = trans126[6];
int trans126_7 = trans126[7];
int trans126_8 = trans126[8];
int trans126_9 = trans126[9];
if (!(trans127.length >= 10)) return -1;
int trans127_0 = trans127[0];
int trans127_1 = trans127[1];
int trans127_2 = trans127[2];
int trans127_3 = trans127[3];
int trans127_4 = trans127[4];
int trans127_5 = trans127[5];
int trans127_6 = trans127[6];
int trans127_7 = trans127[7];
int trans127_8 = trans127[8];
int trans127_9 = trans127[9];
if (!(trans128.length >= 10)) return -1;
int trans128_0 = trans128[0];
int trans128_1 = trans128[1];
int trans128_2 = trans128[2];
int trans128_3 = trans128[3];
int trans128_4 = trans128[4];
int trans128_5 = trans128[5];
int trans128_6 = trans128[6];
int trans128_7 = trans128[7];
int trans128_8 = trans128[8];
int trans128_9 = trans128[9];
if (!(trans129.length >= 10)) return -1;
int trans129_0 = trans129[0];
int trans129_1 = trans129[1];
int trans129_2 = trans129[2];
int trans129_3 = trans129[3];
int trans129_4 = trans129[4];
int trans129_5 = trans129[5];
int trans129_6 = trans129[6];
int trans129_7 = trans129[7];
int trans129_8 = trans129[8];
int trans129_9 = trans129[9];
if (!(trans130.length >= 10)) return -1;
int trans130_0 = trans130[0];
int trans130_1 = trans130[1];
int trans130_2 = trans130[2];
int trans130_3 = trans130[3];
int trans130_4 = trans130[4];
int trans130_5 = trans130[5];
int trans130_6 = trans130[6];
int trans130_7 = trans130[7];
int trans130_8 = trans130[8];
int trans130_9 = trans130[9];
if (!(trans131.length >= 10)) return -1;
int trans131_0 = trans131[0];
int trans131_1 = trans131[1];
int trans131_2 = trans131[2];
int trans131_3 = trans131[3];
int trans131_4 = trans131[4];
int trans131_5 = trans131[5];
int trans131_6 = trans131[6];
int trans131_7 = trans131[7];
int trans131_8 = trans131[8];
int trans131_9 = trans131[9];
if (!(trans132.length >= 10)) return -1;
int trans132_0 = trans132[0];
int trans132_1 = trans132[1];
int trans132_2 = trans132[2];
int trans132_3 = trans132[3];
int trans132_4 = trans132[4];
int trans132_5 = trans132[5];
int trans132_6 = trans132[6];
int trans132_7 = trans132[7];
int trans132_8 = trans132[8];
int trans132_9 = trans132[9];
if (!(trans133.length >= 10)) return -1;
int trans133_0 = trans133[0];
int trans133_1 = trans133[1];
int trans133_2 = trans133[2];
int trans133_3 = trans133[3];
int trans133_4 = trans133[4];
int trans133_5 = trans133[5];
int trans133_6 = trans133[6];
int trans133_7 = trans133[7];
int trans133_8 = trans133[8];
int trans133_9 = trans133[9];
if (!(trans134.length >= 10)) return -1;
int trans134_0 = trans134[0];
int trans134_1 = trans134[1];
int trans134_2 = trans134[2];
int trans134_3 = trans134[3];
int trans134_4 = trans134[4];
int trans134_5 = trans134[5];
int trans134_6 = trans134[6];
int trans134_7 = trans134[7];
int trans134_8 = trans134[8];
int trans134_9 = trans134[9];
if (!(trans135.length >= 10)) return -1;
int trans135_0 = trans135[0];
int trans135_1 = trans135[1];
int trans135_2 = trans135[2];
int trans135_3 = trans135[3];
int trans135_4 = trans135[4];
int trans135_5 = trans135[5];
int trans135_6 = trans135[6];
int trans135_7 = trans135[7];
int trans135_8 = trans135[8];
int trans135_9 = trans135[9];
if (!(trans136.length >= 10)) return -1;
int trans136_0 = trans136[0];
int trans136_1 = trans136[1];
int trans136_2 = trans136[2];
int trans136_3 = trans136[3];
int trans136_4 = trans136[4];
int trans136_5 = trans136[5];
int trans136_6 = trans136[6];
int trans136_7 = trans136[7];
int trans136_8 = trans136[8];
int trans136_9 = trans136[9];
if (!(trans137.length >= 10)) return -1;
int trans137_0 = trans137[0];
int trans137_1 = trans137[1];
int trans137_2 = trans137[2];
int trans137_3 = trans137[3];
int trans137_4 = trans137[4];
int trans137_5 = trans137[5];
int trans137_6 = trans137[6];
int trans137_7 = trans137[7];
int trans137_8 = trans137[8];
int trans137_9 = trans137[9];
if (!(trans138.length >= 10)) return -1;
int trans138_0 = trans138[0];
int trans138_1 = trans138[1];
int trans138_2 = trans138[2];
int trans138_3 = trans138[3];
int trans138_4 = trans138[4];
int trans138_5 = trans138[5];
int trans138_6 = trans138[6];
int trans138_7 = trans138[7];
int trans138_8 = trans138[8];
int trans138_9 = trans138[9];
if (!(trans139.length >= 10)) return -1;
int trans139_0 = trans139[0];
int trans139_1 = trans139[1];
int trans139_2 = trans139[2];
int trans139_3 = trans139[3];
int trans139_4 = trans139[4];
int trans139_5 = trans139[5];
int trans139_6 = trans139[6];
int trans139_7 = trans139[7];
int trans139_8 = trans139[8];
int trans139_9 = trans139[9];
if (!(trans140.length >= 10)) return -1;
int trans140_0 = trans140[0];
int trans140_1 = trans140[1];
int trans140_2 = trans140[2];
int trans140_3 = trans140[3];
int trans140_4 = trans140[4];
int trans140_5 = trans140[5];
int trans140_6 = trans140[6];
int trans140_7 = trans140[7];
int trans140_8 = trans140[8];
int trans140_9 = trans140[9];
if (!(trans141.length >= 10)) return -1;
int trans141_0 = trans141[0];
int trans141_1 = trans141[1];
int trans141_2 = trans141[2];
int trans141_3 = trans141[3];
int trans141_4 = trans141[4];
int trans141_5 = trans141[5];
int trans141_6 = trans141[6];
int trans141_7 = trans141[7];
int trans141_8 = trans141[8];
int trans141_9 = trans141[9];
if (!(trans142.length >= 10)) return -1;
int trans142_0 = trans142[0];
int trans142_1 = trans142[1];
int trans142_2 = trans142[2];
int trans142_3 = trans142[3];
int trans142_4 = trans142[4];
int trans142_5 = trans142[5];
int trans142_6 = trans142[6];
int trans142_7 = trans142[7];
int trans142_8 = trans142[8];
int trans142_9 = trans142[9];
if (!(trans143.length >= 10)) return -1;
int trans143_0 = trans143[0];
int trans143_1 = trans143[1];
int trans143_2 = trans143[2];
int trans143_3 = trans143[3];
int trans143_4 = trans143[4];
int trans143_5 = trans143[5];
int trans143_6 = trans143[6];
int trans143_7 = trans143[7];
int trans143_8 = trans143[8];
int trans143_9 = trans143[9];
if (!(trans144.length >= 10)) return -1;
int trans144_0 = trans144[0];
int trans144_1 = trans144[1];
int trans144_2 = trans144[2];
int trans144_3 = trans144[3];
int trans144_4 = trans144[4];
int trans144_5 = trans144[5];
int trans144_6 = trans144[6];
int trans144_7 = trans144[7];
int trans144_8 = trans144[8];
int trans144_9 = trans144[9];
if (!(trans145.length >= 10)) return -1;
int trans145_0 = trans145[0];
int trans145_1 = trans145[1];
int trans145_2 = trans145[2];
int trans145_3 = trans145[3];
int trans145_4 = trans145[4];
int trans145_5 = trans145[5];
int trans145_6 = trans145[6];
int trans145_7 = trans145[7];
int trans145_8 = trans145[8];
int trans145_9 = trans145[9];
if (!(trans146.length >= 10)) return -1;
int trans146_0 = trans146[0];
int trans146_1 = trans146[1];
int trans146_2 = trans146[2];
int trans146_3 = trans146[3];
int trans146_4 = trans146[4];
int trans146_5 = trans146[5];
int trans146_6 = trans146[6];
int trans146_7 = trans146[7];
int trans146_8 = trans146[8];
int trans146_9 = trans146[9];
if (!(trans147.length >= 10)) return -1;
int trans147_0 = trans147[0];
int trans147_1 = trans147[1];
int trans147_2 = trans147[2];
int trans147_3 = trans147[3];
int trans147_4 = trans147[4];
int trans147_5 = trans147[5];
int trans147_6 = trans147[6];
int trans147_7 = trans147[7];
int trans147_8 = trans147[8];
int trans147_9 = trans147[9];
if (!(trans148.length >= 10)) return -1;
int trans148_0 = trans148[0];
int trans148_1 = trans148[1];
int trans148_2 = trans148[2];
int trans148_3 = trans148[3];
int trans148_4 = trans148[4];
int trans148_5 = trans148[5];
int trans148_6 = trans148[6];
int trans148_7 = trans148[7];
int trans148_8 = trans148[8];
int trans148_9 = trans148[9];
if (!(trans149.length >= 10)) return -1;
int trans149_0 = trans149[0];
int trans149_1 = trans149[1];
int trans149_2 = trans149[2];
int trans149_3 = trans149[3];
int trans149_4 = trans149[4];
int trans149_5 = trans149[5];
int trans149_6 = trans149[6];
int trans149_7 = trans149[7];
int trans149_8 = trans149[8];
int trans149_9 = trans149[9];
if (!(trans150.length >= 10)) return -1;
int trans150_0 = trans150[0];
int trans150_1 = trans150[1];
int trans150_2 = trans150[2];
int trans150_3 = trans150[3];
int trans150_4 = trans150[4];
int trans150_5 = trans150[5];
int trans150_6 = trans150[6];
int trans150_7 = trans150[7];
int trans150_8 = trans150[8];
int trans150_9 = trans150[9];
if (!(trans151.length >= 10)) return -1;
int trans151_0 = trans151[0];
int trans151_1 = trans151[1];
int trans151_2 = trans151[2];
int trans151_3 = trans151[3];
int trans151_4 = trans151[4];
int trans151_5 = trans151[5];
int trans151_6 = trans151[6];
int trans151_7 = trans151[7];
int trans151_8 = trans151[8];
int trans151_9 = trans151[9];
if (!(trans152.length >= 10)) return -1;
int trans152_0 = trans152[0];
int trans152_1 = trans152[1];
int trans152_2 = trans152[2];
int trans152_3 = trans152[3];
int trans152_4 = trans152[4];
int trans152_5 = trans152[5];
int trans152_6 = trans152[6];
int trans152_7 = trans152[7];
int trans152_8 = trans152[8];
int trans152_9 = trans152[9];
if (!(trans153.length >= 10)) return -1;
int trans153_0 = trans153[0];
int trans153_1 = trans153[1];
int trans153_2 = trans153[2];
int trans153_3 = trans153[3];
int trans153_4 = trans153[4];
int trans153_5 = trans153[5];
int trans153_6 = trans153[6];
int trans153_7 = trans153[7];
int trans153_8 = trans153[8];
int trans153_9 = trans153[9];
if (!(trans154.length >= 10)) return -1;
int trans154_0 = trans154[0];
int trans154_1 = trans154[1];
int trans154_2 = trans154[2];
int trans154_3 = trans154[3];
int trans154_4 = trans154[4];
int trans154_5 = trans154[5];
int trans154_6 = trans154[6];
int trans154_7 = trans154[7];
int trans154_8 = trans154[8];
int trans154_9 = trans154[9];
if (!(trans155.length >= 10)) return -1;
int trans155_0 = trans155[0];
int trans155_1 = trans155[1];
int trans155_2 = trans155[2];
int trans155_3 = trans155[3];
int trans155_4 = trans155[4];
int trans155_5 = trans155[5];
int trans155_6 = trans155[6];
int trans155_7 = trans155[7];
int trans155_8 = trans155[8];
int trans155_9 = trans155[9];
if (!(trans156.length >= 10)) return -1;
int trans156_0 = trans156[0];
int trans156_1 = trans156[1];
int trans156_2 = trans156[2];
int trans156_3 = trans156[3];
int trans156_4 = trans156[4];
int trans156_5 = trans156[5];
int trans156_6 = trans156[6];
int trans156_7 = trans156[7];
int trans156_8 = trans156[8];
int trans156_9 = trans156[9];
if (!(trans157.length >= 10)) return -1;
int trans157_0 = trans157[0];
int trans157_1 = trans157[1];
int trans157_2 = trans157[2];
int trans157_3 = trans157[3];
int trans157_4 = trans157[4];
int trans157_5 = trans157[5];
int trans157_6 = trans157[6];
int trans157_7 = trans157[7];
int trans157_8 = trans157[8];
int trans157_9 = trans157[9];
if (!(trans158.length >= 10)) return -1;
int trans158_0 = trans158[0];
int trans158_1 = trans158[1];
int trans158_2 = trans158[2];
int trans158_3 = trans158[3];
int trans158_4 = trans158[4];
int trans158_5 = trans158[5];
int trans158_6 = trans158[6];
int trans158_7 = trans158[7];
int trans158_8 = trans158[8];
int trans158_9 = trans158[9];
if (!(trans159.length >= 10)) return -1;
int trans159_0 = trans159[0];
int trans159_1 = trans159[1];
int trans159_2 = trans159[2];
int trans159_3 = trans159[3];
int trans159_4 = trans159[4];
int trans159_5 = trans159[5];
int trans159_6 = trans159[6];
int trans159_7 = trans159[7];
int trans159_8 = trans159[8];
int trans159_9 = trans159[9];
if (!(trans160.length >= 10)) return -1;
int trans160_0 = trans160[0];
int trans160_1 = trans160[1];
int trans160_2 = trans160[2];
int trans160_3 = trans160[3];
int trans160_4 = trans160[4];
int trans160_5 = trans160[5];
int trans160_6 = trans160[6];
int trans160_7 = trans160[7];
int trans160_8 = trans160[8];
int trans160_9 = trans160[9];
if (!(trans161.length >= 10)) return -1;
int trans161_0 = trans161[0];
int trans161_1 = trans161[1];
int trans161_2 = trans161[2];
int trans161_3 = trans161[3];
int trans161_4 = trans161[4];
int trans161_5 = trans161[5];
int trans161_6 = trans161[6];
int trans161_7 = trans161[7];
int trans161_8 = trans161[8];
int trans161_9 = trans161[9];
if (!(trans162.length >= 10)) return -1;
int trans162_0 = trans162[0];
int trans162_1 = trans162[1];
int trans162_2 = trans162[2];
int trans162_3 = trans162[3];
int trans162_4 = trans162[4];
int trans162_5 = trans162[5];
int trans162_6 = trans162[6];
int trans162_7 = trans162[7];
int trans162_8 = trans162[8];
int trans162_9 = trans162[9];
if (!(trans163.length >= 10)) return -1;
int trans163_0 = trans163[0];
int trans163_1 = trans163[1];
int trans163_2 = trans163[2];
int trans163_3 = trans163[3];
int trans163_4 = trans163[4];
int trans163_5 = trans163[5];
int trans163_6 = trans163[6];
int trans163_7 = trans163[7];
int trans163_8 = trans163[8];
int trans163_9 = trans163[9];
if (!(trans164.length >= 10)) return -1;
int trans164_0 = trans164[0];
int trans164_1 = trans164[1];
int trans164_2 = trans164[2];
int trans164_3 = trans164[3];
int trans164_4 = trans164[4];
int trans164_5 = trans164[5];
int trans164_6 = trans164[6];
int trans164_7 = trans164[7];
int trans164_8 = trans164[8];
int trans164_9 = trans164[9];
if (!(trans165.length >= 10)) return -1;
int trans165_0 = trans165[0];
int trans165_1 = trans165[1];
int trans165_2 = trans165[2];
int trans165_3 = trans165[3];
int trans165_4 = trans165[4];
int trans165_5 = trans165[5];
int trans165_6 = trans165[6];
int trans165_7 = trans165[7];
int trans165_8 = trans165[8];
int trans165_9 = trans165[9];
if (!(trans166.length >= 10)) return -1;
int trans166_0 = trans166[0];
int trans166_1 = trans166[1];
int trans166_2 = trans166[2];
int trans166_3 = trans166[3];
int trans166_4 = trans166[4];
int trans166_5 = trans166[5];
int trans166_6 = trans166[6];
int trans166_7 = trans166[7];
int trans166_8 = trans166[8];
int trans166_9 = trans166[9];
if (!(trans167.length >= 10)) return -1;
int trans167_0 = trans167[0];
int trans167_1 = trans167[1];
int trans167_2 = trans167[2];
int trans167_3 = trans167[3];
int trans167_4 = trans167[4];
int trans167_5 = trans167[5];
int trans167_6 = trans167[6];
int trans167_7 = trans167[7];
int trans167_8 = trans167[8];
int trans167_9 = trans167[9];
if (!(trans168.length >= 10)) return -1;
int trans168_0 = trans168[0];
int trans168_1 = trans168[1];
int trans168_2 = trans168[2];
int trans168_3 = trans168[3];
int trans168_4 = trans168[4];
int trans168_5 = trans168[5];
int trans168_6 = trans168[6];
int trans168_7 = trans168[7];
int trans168_8 = trans168[8];
int trans168_9 = trans168[9];
if (!(trans169.length >= 10)) return -1;
int trans169_0 = trans169[0];
int trans169_1 = trans169[1];
int trans169_2 = trans169[2];
int trans169_3 = trans169[3];
int trans169_4 = trans169[4];
int trans169_5 = trans169[5];
int trans169_6 = trans169[6];
int trans169_7 = trans169[7];
int trans169_8 = trans169[8];
int trans169_9 = trans169[9];
if (!(trans170.length >= 10)) return -1;
int trans170_0 = trans170[0];
int trans170_1 = trans170[1];
int trans170_2 = trans170[2];
int trans170_3 = trans170[3];
int trans170_4 = trans170[4];
int trans170_5 = trans170[5];
int trans170_6 = trans170[6];
int trans170_7 = trans170[7];
int trans170_8 = trans170[8];
int trans170_9 = trans170[9];
if (!(trans171.length >= 10)) return -1;
int trans171_0 = trans171[0];
int trans171_1 = trans171[1];
int trans171_2 = trans171[2];
int trans171_3 = trans171[3];
int trans171_4 = trans171[4];
int trans171_5 = trans171[5];
int trans171_6 = trans171[6];
int trans171_7 = trans171[7];
int trans171_8 = trans171[8];
int trans171_9 = trans171[9];
if (!(trans172.length >= 10)) return -1;
int trans172_0 = trans172[0];
int trans172_1 = trans172[1];
int trans172_2 = trans172[2];
int trans172_3 = trans172[3];
int trans172_4 = trans172[4];
int trans172_5 = trans172[5];
int trans172_6 = trans172[6];
int trans172_7 = trans172[7];
int trans172_8 = trans172[8];
int trans172_9 = trans172[9];
if (!(trans173.length >= 10)) return -1;
int trans173_0 = trans173[0];
int trans173_1 = trans173[1];
int trans173_2 = trans173[2];
int trans173_3 = trans173[3];
int trans173_4 = trans173[4];
int trans173_5 = trans173[5];
int trans173_6 = trans173[6];
int trans173_7 = trans173[7];
int trans173_8 = trans173[8];
int trans173_9 = trans173[9];
if (!(trans174.length >= 10)) return -1;
int trans174_0 = trans174[0];
int trans174_1 = trans174[1];
int trans174_2 = trans174[2];
int trans174_3 = trans174[3];
int trans174_4 = trans174[4];
int trans174_5 = trans174[5];
int trans174_6 = trans174[6];
int trans174_7 = trans174[7];
int trans174_8 = trans174[8];
int trans174_9 = trans174[9];
if (!(trans175.length >= 10)) return -1;
int trans175_0 = trans175[0];
int trans175_1 = trans175[1];
int trans175_2 = trans175[2];
int trans175_3 = trans175[3];
int trans175_4 = trans175[4];
int trans175_5 = trans175[5];
int trans175_6 = trans175[6];
int trans175_7 = trans175[7];
int trans175_8 = trans175[8];
int trans175_9 = trans175[9];
if (!(trans176.length >= 10)) return -1;
int trans176_0 = trans176[0];
int trans176_1 = trans176[1];
int trans176_2 = trans176[2];
int trans176_3 = trans176[3];
int trans176_4 = trans176[4];
int trans176_5 = trans176[5];
int trans176_6 = trans176[6];
int trans176_7 = trans176[7];
int trans176_8 = trans176[8];
int trans176_9 = trans176[9];
if (!(trans177.length >= 10)) return -1;
int trans177_0 = trans177[0];
int trans177_1 = trans177[1];
int trans177_2 = trans177[2];
int trans177_3 = trans177[3];
int trans177_4 = trans177[4];
int trans177_5 = trans177[5];
int trans177_6 = trans177[6];
int trans177_7 = trans177[7];
int trans177_8 = trans177[8];
int trans177_9 = trans177[9];
if (!(trans178.length >= 10)) return -1;
int trans178_0 = trans178[0];
int trans178_1 = trans178[1];
int trans178_2 = trans178[2];
int trans178_3 = trans178[3];
int trans178_4 = trans178[4];
int trans178_5 = trans178[5];
int trans178_6 = trans178[6];
int trans178_7 = trans178[7];
int trans178_8 = trans178[8];
int trans178_9 = trans178[9];
if (!(trans179.length >= 10)) return -1;
int trans179_0 = trans179[0];
int trans179_1 = trans179[1];
int trans179_2 = trans179[2];
int trans179_3 = trans179[3];
int trans179_4 = trans179[4];
int trans179_5 = trans179[5];
int trans179_6 = trans179[6];
int trans179_7 = trans179[7];
int trans179_8 = trans179[8];
int trans179_9 = trans179[9];
if (!(trans180.length >= 10)) return -1;
int trans180_0 = trans180[0];
int trans180_1 = trans180[1];
int trans180_2 = trans180[2];
int trans180_3 = trans180[3];
int trans180_4 = trans180[4];
int trans180_5 = trans180[5];
int trans180_6 = trans180[6];
int trans180_7 = trans180[7];
int trans180_8 = trans180[8];
int trans180_9 = trans180[9];
if (!(trans181.length >= 10)) return -1;
int trans181_0 = trans181[0];
int trans181_1 = trans181[1];
int trans181_2 = trans181[2];
int trans181_3 = trans181[3];
int trans181_4 = trans181[4];
int trans181_5 = trans181[5];
int trans181_6 = trans181[6];
int trans181_7 = trans181[7];
int trans181_8 = trans181[8];
int trans181_9 = trans181[9];
if (!(trans182.length >= 10)) return -1;
int trans182_0 = trans182[0];
int trans182_1 = trans182[1];
int trans182_2 = trans182[2];
int trans182_3 = trans182[3];
int trans182_4 = trans182[4];
int trans182_5 = trans182[5];
int trans182_6 = trans182[6];
int trans182_7 = trans182[7];
int trans182_8 = trans182[8];
int trans182_9 = trans182[9];
if (!(trans183.length >= 10)) return -1;
int trans183_0 = trans183[0];
int trans183_1 = trans183[1];
int trans183_2 = trans183[2];
int trans183_3 = trans183[3];
int trans183_4 = trans183[4];
int trans183_5 = trans183[5];
int trans183_6 = trans183[6];
int trans183_7 = trans183[7];
int trans183_8 = trans183[8];
int trans183_9 = trans183[9];
if (!(trans184.length >= 10)) return -1;
int trans184_0 = trans184[0];
int trans184_1 = trans184[1];
int trans184_2 = trans184[2];
int trans184_3 = trans184[3];
int trans184_4 = trans184[4];
int trans184_5 = trans184[5];
int trans184_6 = trans184[6];
int trans184_7 = trans184[7];
int trans184_8 = trans184[8];
int trans184_9 = trans184[9];
if (!(trans185.length >= 10)) return -1;
int trans185_0 = trans185[0];
int trans185_1 = trans185[1];
int trans185_2 = trans185[2];
int trans185_3 = trans185[3];
int trans185_4 = trans185[4];
int trans185_5 = trans185[5];
int trans185_6 = trans185[6];
int trans185_7 = trans185[7];
int trans185_8 = trans185[8];
int trans185_9 = trans185[9];
if (!(trans186.length >= 10)) return -1;
int trans186_0 = trans186[0];
int trans186_1 = trans186[1];
int trans186_2 = trans186[2];
int trans186_3 = trans186[3];
int trans186_4 = trans186[4];
int trans186_5 = trans186[5];
int trans186_6 = trans186[6];
int trans186_7 = trans186[7];
int trans186_8 = trans186[8];
int trans186_9 = trans186[9];
if (!(trans187.length >= 10)) return -1;
int trans187_0 = trans187[0];
int trans187_1 = trans187[1];
int trans187_2 = trans187[2];
int trans187_3 = trans187[3];
int trans187_4 = trans187[4];
int trans187_5 = trans187[5];
int trans187_6 = trans187[6];
int trans187_7 = trans187[7];
int trans187_8 = trans187[8];
int trans187_9 = trans187[9];
if (!(trans188.length >= 10)) return -1;
int trans188_0 = trans188[0];
int trans188_1 = trans188[1];
int trans188_2 = trans188[2];
int trans188_3 = trans188[3];
int trans188_4 = trans188[4];
int trans188_5 = trans188[5];
int trans188_6 = trans188[6];
int trans188_7 = trans188[7];
int trans188_8 = trans188[8];
int trans188_9 = trans188[9];
if (!(trans189.length >= 10)) return -1;
int trans189_0 = trans189[0];
int trans189_1 = trans189[1];
int trans189_2 = trans189[2];
int trans189_3 = trans189[3];
int trans189_4 = trans189[4];
int trans189_5 = trans189[5];
int trans189_6 = trans189[6];
int trans189_7 = trans189[7];
int trans189_8 = trans189[8];
int trans189_9 = trans189[9];
if (!(trans190.length >= 10)) return -1;
int trans190_0 = trans190[0];
int trans190_1 = trans190[1];
int trans190_2 = trans190[2];
int trans190_3 = trans190[3];
int trans190_4 = trans190[4];
int trans190_5 = trans190[5];
int trans190_6 = trans190[6];
int trans190_7 = trans190[7];
int trans190_8 = trans190[8];
int trans190_9 = trans190[9];
if (!(trans191.length >= 10)) return -1;
int trans191_0 = trans191[0];
int trans191_1 = trans191[1];
int trans191_2 = trans191[2];
int trans191_3 = trans191[3];
int trans191_4 = trans191[4];
int trans191_5 = trans191[5];
int trans191_6 = trans191[6];
int trans191_7 = trans191[7];
int trans191_8 = trans191[8];
int trans191_9 = trans191[9];
if (!(trans192.length >= 10)) return -1;
int trans192_0 = trans192[0];
int trans192_1 = trans192[1];
int trans192_2 = trans192[2];
int trans192_3 = trans192[3];
int trans192_4 = trans192[4];
int trans192_5 = trans192[5];
int trans192_6 = trans192[6];
int trans192_7 = trans192[7];
int trans192_8 = trans192[8];
int trans192_9 = trans192[9];
if (!(trans193.length >= 10)) return -1;
int trans193_0 = trans193[0];
int trans193_1 = trans193[1];
int trans193_2 = trans193[2];
int trans193_3 = trans193[3];
int trans193_4 = trans193[4];
int trans193_5 = trans193[5];
int trans193_6 = trans193[6];
int trans193_7 = trans193[7];
int trans193_8 = trans193[8];
int trans193_9 = trans193[9];
if (!(trans194.length >= 10)) return -1;
int trans194_0 = trans194[0];
int trans194_1 = trans194[1];
int trans194_2 = trans194[2];
int trans194_3 = trans194[3];
int trans194_4 = trans194[4];
int trans194_5 = trans194[5];
int trans194_6 = trans194[6];
int trans194_7 = trans194[7];
int trans194_8 = trans194[8];
int trans194_9 = trans194[9];
if (!(trans195.length >= 10)) return -1;
int trans195_0 = trans195[0];
int trans195_1 = trans195[1];
int trans195_2 = trans195[2];
int trans195_3 = trans195[3];
int trans195_4 = trans195[4];
int trans195_5 = trans195[5];
int trans195_6 = trans195[6];
int trans195_7 = trans195[7];
int trans195_8 = trans195[8];
int trans195_9 = trans195[9];
if (!(trans196.length >= 10)) return -1;
int trans196_0 = trans196[0];
int trans196_1 = trans196[1];
int trans196_2 = trans196[2];
int trans196_3 = trans196[3];
int trans196_4 = trans196[4];
int trans196_5 = trans196[5];
int trans196_6 = trans196[6];
int trans196_7 = trans196[7];
int trans196_8 = trans196[8];
int trans196_9 = trans196[9];
if (!(trans197.length >= 10)) return -1;
int trans197_0 = trans197[0];
int trans197_1 = trans197[1];
int trans197_2 = trans197[2];
int trans197_3 = trans197[3];
int trans197_4 = trans197[4];
int trans197_5 = trans197[5];
int trans197_6 = trans197[6];
int trans197_7 = trans197[7];
int trans197_8 = trans197[8];
int trans197_9 = trans197[9];
if (!(trans198.length >= 10)) return -1;
int trans198_0 = trans198[0];
int trans198_1 = trans198[1];
int trans198_2 = trans198[2];
int trans198_3 = trans198[3];
int trans198_4 = trans198[4];
int trans198_5 = trans198[5];
int trans198_6 = trans198[6];
int trans198_7 = trans198[7];
int trans198_8 = trans198[8];
int trans198_9 = trans198[9];
if (!(trans199.length >= 10)) return -1;
int trans199_0 = trans199[0];
int trans199_1 = trans199[1];
int trans199_2 = trans199[2];
int trans199_3 = trans199[3];
int trans199_4 = trans199[4];
int trans199_5 = trans199[5];
int trans199_6 = trans199[6];
int trans199_7 = trans199[7];
int trans199_8 = trans199[8];
int trans199_9 = trans199[9];
if (trans0_2 <= trans0_3)
if (trans0_4 <= trans0_5)
if (trans0_5 <= trans0_6)
if (trans0_3 <= trans0_4)
if (trans0_1 <= trans0_2)
if (trans0_8 <= trans0_9)
if (trans0_6 <= trans0_7)
if (trans0_9 <= a0.length)
if (trans0_7 <= trans0_8)
if (trans0_0 <= trans0_1)
for (int i0 = 0; i0 < 1 && i0 < trans0_0; i0++) {
if (trans1_9 <= a1.length)
if (trans1_5 <= trans1_6)
if (trans1_1 <= trans1_2)
if (trans1_4 <= trans1_5)
if (trans1_2 <= trans1_3)
if (trans1_0 <= trans1_1)
if (trans1_3 <= trans1_4)
if (trans1_8 <= trans1_9)
if (trans1_6 <= trans1_7)
if (trans1_7 <= trans1_8)
for (int i1 = 0; i1 < 1 && i1 < trans1_0; i1++) {
if (trans2_0 <= trans2_1)
if (trans2_9 <= a2.length)
if (trans2_8 <= trans2_9)
if (trans2_2 <= trans2_3)
if (trans2_4 <= trans2_5)
if (trans2_5 <= trans2_6)
if (trans2_6 <= trans2_7)
if (trans2_1 <= trans2_2)
if (trans2_3 <= trans2_4)
if (trans2_7 <= trans2_8)
for (int i2 = 0; i2 < 1 && i2 < trans2_0; i2++) {
if (trans3_2 <= trans3_3)
if (trans3_5 <= trans3_6)
if (trans3_4 <= trans3_5)
if (trans3_0 <= trans3_1)
if (trans3_6 <= trans3_7)
if (trans3_1 <= trans3_2)
if (trans3_3 <= trans3_4)
if (trans3_9 <= a3.length)
if (trans3_8 <= trans3_9)
if (trans3_7 <= trans3_8)
for (int i3 = 0; i3 < 1 && i3 < trans3_0; i3++) {
if (trans4_2 <= trans4_3)
if (trans4_3 <= trans4_4)
if (trans4_8 <= trans4_9)
if (trans4_1 <= trans4_2)
if (trans4_6 <= trans4_7)
if (trans4_4 <= trans4_5)
if (trans4_0 <= trans4_1)
if (trans4_7 <= trans4_8)
if (trans4_9 <= a4.length)
if (trans4_5 <= trans4_6)
for (int i4 = 0; i4 < 1 && i4 < trans4_0; i4++) {
if (trans5_4 <= trans5_5)
if (trans5_1 <= trans5_2)
if (trans5_2 <= trans5_3)
if (trans5_5 <= trans5_6)
if (trans5_9 <= a5.length)
if (trans5_0 <= trans5_1)
if (trans5_6 <= trans5_7)
if (trans5_8 <= trans5_9)
if (trans5_7 <= trans5_8)
if (trans5_3 <= trans5_4)
for (int i5 = 0; i5 < 1 && i5 < trans5_0; i5++) {
if (trans6_9 <= a6.length)
if (trans6_0 <= trans6_1)
if (trans6_8 <= trans6_9)
if (trans6_5 <= trans6_6)
if (trans6_6 <= trans6_7)
if (trans6_3 <= trans6_4)
if (trans6_7 <= trans6_8)
if (trans6_1 <= trans6_2)
if (trans6_2 <= trans6_3)
if (trans6_4 <= trans6_5)
for (int i6 = 0; i6 < 1 && i6 < trans6_0; i6++) {
if (trans7_7 <= trans7_8)
if (trans7_5 <= trans7_6)
if (trans7_1 <= trans7_2)
if (trans7_3 <= trans7_4)
if (trans7_0 <= trans7_1)
if (trans7_2 <= trans7_3)
if (trans7_4 <= trans7_5)
if (trans7_6 <= trans7_7)
if (trans7_8 <= trans7_9)
if (trans7_9 <= a7.length)
for (int i7 = 0; i7 < 1 && i7 < trans7_0; i7++) {
if (trans8_2 <= trans8_3)
if (trans8_9 <= a8.length)
if (trans8_0 <= trans8_1)
if (trans8_3 <= trans8_4)
if (trans8_8 <= trans8_9)
if (trans8_6 <= trans8_7)
if (trans8_1 <= trans8_2)
if (trans8_4 <= trans8_5)
if (trans8_5 <= trans8_6)
if (trans8_7 <= trans8_8)
for (int i8 = 0; i8 < 1 && i8 < trans8_0; i8++) {
if (trans9_9 <= a9.length)
if (trans9_5 <= trans9_6)
if (trans9_7 <= trans9_8)
if (trans9_1 <= trans9_2)
if (trans9_6 <= trans9_7)
if (trans9_2 <= trans9_3)
if (trans9_0 <= trans9_1)
if (trans9_8 <= trans9_9)
if (trans9_3 <= trans9_4)
if (trans9_4 <= trans9_5)
for (int i9 = 0; i9 < 1 && i9 < trans9_0; i9++) {
if (trans10_0 <= trans10_1)
if (trans10_9 <= a10.length)
if (trans10_5 <= trans10_6)
if (trans10_2 <= trans10_3)
if (trans10_4 <= trans10_5)
if (trans10_3 <= trans10_4)
if (trans10_8 <= trans10_9)
if (trans10_1 <= trans10_2)
if (trans10_7 <= trans10_8)
if (trans10_6 <= trans10_7)
for (int i10 = 0; i10 < 1 && i10 < trans10_0; i10++) {
if (trans11_4 <= trans11_5)
if (trans11_5 <= trans11_6)
if (trans11_8 <= trans11_9)
if (trans11_3 <= trans11_4)
if (trans11_7 <= trans11_8)
if (trans11_6 <= trans11_7)
if (trans11_1 <= trans11_2)
if (trans11_2 <= trans11_3)
if (trans11_0 <= trans11_1)
if (trans11_9 <= a11.length)
for (int i11 = 0; i11 < 1 && i11 < trans11_0; i11++) {
if (trans12_3 <= trans12_4)
if (trans12_0 <= trans12_1)
if (trans12_4 <= trans12_5)
if (trans12_8 <= trans12_9)
if (trans12_5 <= trans12_6)
if (trans12_2 <= trans12_3)
if (trans12_1 <= trans12_2)
if (trans12_9 <= a12.length)
if (trans12_7 <= trans12_8)
if (trans12_6 <= trans12_7)
for (int i12 = 0; i12 < 1 && i12 < trans12_0; i12++) {
if (trans13_0 <= trans13_1)
if (trans13_3 <= trans13_4)
if (trans13_5 <= trans13_6)
if (trans13_2 <= trans13_3)
if (trans13_8 <= trans13_9)
if (trans13_1 <= trans13_2)
if (trans13_9 <= a13.length)
if (trans13_7 <= trans13_8)
if (trans13_6 <= trans13_7)
if (trans13_4 <= trans13_5)
for (int i13 = 0; i13 < 1 && i13 < trans13_0; i13++) {
if (trans14_8 <= trans14_9)
if (trans14_1 <= trans14_2)
if (trans14_2 <= trans14_3)
if (trans14_4 <= trans14_5)
if (trans14_5 <= trans14_6)
if (trans14_6 <= trans14_7)
if (trans14_3 <= trans14_4)
if (trans14_9 <= a14.length)
if (trans14_0 <= trans14_1)
if (trans14_7 <= trans14_8)
for (int i14 = 0; i14 < 1 && i14 < trans14_0; i14++) {
if (trans15_5 <= trans15_6)
if (trans15_9 <= a15.length)
if (trans15_2 <= trans15_3)
if (trans15_8 <= trans15_9)
if (trans15_0 <= trans15_1)
if (trans15_4 <= trans15_5)
if (trans15_7 <= trans15_8)
if (trans15_1 <= trans15_2)
if (trans15_6 <= trans15_7)
if (trans15_3 <= trans15_4)
for (int i15 = 0; i15 < 1 && i15 < trans15_0; i15++) {
if (trans16_6 <= trans16_7)
if (trans16_7 <= trans16_8)
if (trans16_0 <= trans16_1)
if (trans16_8 <= trans16_9)
if (trans16_1 <= trans16_2)
if (trans16_2 <= trans16_3)
if (trans16_4 <= trans16_5)
if (trans16_9 <= a16.length)
if (trans16_5 <= trans16_6)
if (trans16_3 <= trans16_4)
for (int i16 = 0; i16 < 1 && i16 < trans16_0; i16++) {
if (trans17_2 <= trans17_3)
if (trans17_7 <= trans17_8)
if (trans17_1 <= trans17_2)
if (trans17_3 <= trans17_4)
if (trans17_9 <= a17.length)
if (trans17_5 <= trans17_6)
if (trans17_6 <= trans17_7)
if (trans17_8 <= trans17_9)
if (trans17_0 <= trans17_1)
if (trans17_4 <= trans17_5)
for (int i17 = 0; i17 < 1 && i17 < trans17_0; i17++) {
if (trans18_6 <= trans18_7)
if (trans18_4 <= trans18_5)
if (trans18_0 <= trans18_1)
if (trans18_7 <= trans18_8)
if (trans18_8 <= trans18_9)
if (trans18_5 <= trans18_6)
if (trans18_1 <= trans18_2)
if (trans18_2 <= trans18_3)
if (trans18_3 <= trans18_4)
if (trans18_9 <= a18.length)
for (int i18 = 0; i18 < 1 && i18 < trans18_0; i18++) {
if (trans19_6 <= trans19_7)
if (trans19_8 <= trans19_9)
if (trans19_7 <= trans19_8)
if (trans19_1 <= trans19_2)
if (trans19_2 <= trans19_3)
if (trans19_5 <= trans19_6)
if (trans19_3 <= trans19_4)
if (trans19_9 <= a19.length)
if (trans19_4 <= trans19_5)
if (trans19_0 <= trans19_1)
for (int i19 = 0; i19 < 1 && i19 < trans19_0; i19++) {
if (trans20_1 <= trans20_2)
if (trans20_7 <= trans20_8)
if (trans20_6 <= trans20_7)
if (trans20_2 <= trans20_3)
if (trans20_4 <= trans20_5)
if (trans20_5 <= trans20_6)
if (trans20_3 <= trans20_4)
if (trans20_9 <= a20.length)
if (trans20_8 <= trans20_9)
if (trans20_0 <= trans20_1)
for (int i20 = 0; i20 < 1 && i20 < trans20_0; i20++) {
if (trans21_5 <= trans21_6)
if (trans21_7 <= trans21_8)
if (trans21_8 <= trans21_9)
if (trans21_9 <= a21.length)
if (trans21_6 <= trans21_7)
if (trans21_4 <= trans21_5)
if (trans21_1 <= trans21_2)
if (trans21_0 <= trans21_1)
if (trans21_3 <= trans21_4)
if (trans21_2 <= trans21_3)
for (int i21 = 0; i21 < 1 && i21 < trans21_0; i21++) {
if (trans22_7 <= trans22_8)
if (trans22_4 <= trans22_5)
if (trans22_0 <= trans22_1)
if (trans22_8 <= trans22_9)
if (trans22_5 <= trans22_6)
if (trans22_6 <= trans22_7)
if (trans22_1 <= trans22_2)
if (trans22_2 <= trans22_3)
if (trans22_9 <= a22.length)
if (trans22_3 <= trans22_4)
for (int i22 = 0; i22 < 1 && i22 < trans22_0; i22++) {
if (trans23_5 <= trans23_6)
if (trans23_4 <= trans23_5)
if (trans23_8 <= trans23_9)
if (trans23_2 <= trans23_3)
if (trans23_7 <= trans23_8)
if (trans23_3 <= trans23_4)
if (trans23_0 <= trans23_1)
if (trans23_6 <= trans23_7)
if (trans23_1 <= trans23_2)
if (trans23_9 <= a23.length)
for (int i23 = 0; i23 < 1 && i23 < trans23_0; i23++) {
if (trans24_9 <= a24.length)
if (trans24_1 <= trans24_2)
if (trans24_0 <= trans24_1)
if (trans24_2 <= trans24_3)
if (trans24_4 <= trans24_5)
if (trans24_5 <= trans24_6)
if (trans24_6 <= trans24_7)
if (trans24_8 <= trans24_9)
if (trans24_7 <= trans24_8)
if (trans24_3 <= trans24_4)
for (int i24 = 0; i24 < 1 && i24 < trans24_0; i24++) {
if (trans25_3 <= trans25_4)
if (trans25_0 <= trans25_1)
if (trans25_8 <= trans25_9)
if (trans25_4 <= trans25_5)
if (trans25_2 <= trans25_3)
if (trans25_7 <= trans25_8)
if (trans25_9 <= a25.length)
if (trans25_6 <= trans25_7)
if (trans25_5 <= trans25_6)
if (trans25_1 <= trans25_2)
for (int i25 = 0; i25 < 1 && i25 < trans25_0; i25++) {
if (trans26_8 <= trans26_9)
if (trans26_1 <= trans26_2)
if (trans26_7 <= trans26_8)
if (trans26_2 <= trans26_3)
if (trans26_4 <= trans26_5)
if (trans26_0 <= trans26_1)
if (trans26_9 <= a26.length)
if (trans26_5 <= trans26_6)
if (trans26_3 <= trans26_4)
if (trans26_6 <= trans26_7)
for (int i26 = 0; i26 < 1 && i26 < trans26_0; i26++) {
if (trans27_1 <= trans27_2)
if (trans27_4 <= trans27_5)
if (trans27_8 <= trans27_9)
if (trans27_9 <= a27.length)
if (trans27_2 <= trans27_3)
if (trans27_0 <= trans27_1)
if (trans27_7 <= trans27_8)
if (trans27_3 <= trans27_4)
if (trans27_5 <= trans27_6)
if (trans27_6 <= trans27_7)
for (int i27 = 0; i27 < 1 && i27 < trans27_0; i27++) {
if (trans28_6 <= trans28_7)
if (trans28_5 <= trans28_6)
if (trans28_3 <= trans28_4)
if (trans28_2 <= trans28_3)
if (trans28_1 <= trans28_2)
if (trans28_7 <= trans28_8)
if (trans28_4 <= trans28_5)
if (trans28_9 <= a28.length)
if (trans28_8 <= trans28_9)
if (trans28_0 <= trans28_1)
for (int i28 = 0; i28 < 1 && i28 < trans28_0; i28++) {
if (trans29_4 <= trans29_5)
if (trans29_2 <= trans29_3)
if (trans29_7 <= trans29_8)
if (trans29_9 <= a29.length)
if (trans29_8 <= trans29_9)
if (trans29_1 <= trans29_2)
if (trans29_5 <= trans29_6)
if (trans29_6 <= trans29_7)
if (trans29_3 <= trans29_4)
if (trans29_0 <= trans29_1)
for (int i29 = 0; i29 < 1 && i29 < trans29_0; i29++) {
if (trans30_2 <= trans30_3)
if (trans30_7 <= trans30_8)
if (trans30_9 <= a30.length)
if (trans30_5 <= trans30_6)
if (trans30_3 <= trans30_4)
if (trans30_8 <= trans30_9)
if (trans30_0 <= trans30_1)
if (trans30_6 <= trans30_7)
if (trans30_4 <= trans30_5)
if (trans30_1 <= trans30_2)
for (int i30 = 0; i30 < 1 && i30 < trans30_0; i30++) {
if (trans31_3 <= trans31_4)
if (trans31_2 <= trans31_3)
if (trans31_9 <= a31.length)
if (trans31_5 <= trans31_6)
if (trans31_7 <= trans31_8)
if (trans31_8 <= trans31_9)
if (trans31_6 <= trans31_7)
if (trans31_0 <= trans31_1)
if (trans31_1 <= trans31_2)
if (trans31_4 <= trans31_5)
for (int i31 = 0; i31 < 1 && i31 < trans31_0; i31++) {
if (trans32_0 <= trans32_1)
if (trans32_4 <= trans32_5)
if (trans32_9 <= a32.length)
if (trans32_5 <= trans32_6)
if (trans32_1 <= trans32_2)
if (trans32_2 <= trans32_3)
if (trans32_6 <= trans32_7)
if (trans32_7 <= trans32_8)
if (trans32_8 <= trans32_9)
if (trans32_3 <= trans32_4)
for (int i32 = 0; i32 < 1 && i32 < trans32_0; i32++) {
if (trans33_0 <= trans33_1)
if (trans33_8 <= trans33_9)
if (trans33_9 <= a33.length)
if (trans33_2 <= trans33_3)
if (trans33_5 <= trans33_6)
if (trans33_7 <= trans33_8)
if (trans33_1 <= trans33_2)
if (trans33_4 <= trans33_5)
if (trans33_6 <= trans33_7)
if (trans33_3 <= trans33_4)
for (int i33 = 0; i33 < 1 && i33 < trans33_0; i33++) {
if (trans34_4 <= trans34_5)
if (trans34_5 <= trans34_6)
if (trans34_9 <= a34.length)
if (trans34_2 <= trans34_3)
if (trans34_3 <= trans34_4)
if (trans34_1 <= trans34_2)
if (trans34_6 <= trans34_7)
if (trans34_8 <= trans34_9)
if (trans34_0 <= trans34_1)
if (trans34_7 <= trans34_8)
for (int i34 = 0; i34 < 1 && i34 < trans34_0; i34++) {
if (trans35_5 <= trans35_6)
if (trans35_4 <= trans35_5)
if (trans35_0 <= trans35_1)
if (trans35_3 <= trans35_4)
if (trans35_1 <= trans35_2)
if (trans35_6 <= trans35_7)
if (trans35_9 <= a35.length)
if (trans35_8 <= trans35_9)
if (trans35_7 <= trans35_8)
if (trans35_2 <= trans35_3)
for (int i35 = 0; i35 < 1 && i35 < trans35_0; i35++) {
if (trans36_1 <= trans36_2)
if (trans36_5 <= trans36_6)
if (trans36_9 <= a36.length)
if (trans36_0 <= trans36_1)
if (trans36_2 <= trans36_3)
if (trans36_8 <= trans36_9)
if (trans36_6 <= trans36_7)
if (trans36_4 <= trans36_5)
if (trans36_7 <= trans36_8)
if (trans36_3 <= trans36_4)
for (int i36 = 0; i36 < 1 && i36 < trans36_0; i36++) {
if (trans37_9 <= a37.length)
if (trans37_2 <= trans37_3)
if (trans37_5 <= trans37_6)
if (trans37_8 <= trans37_9)
if (trans37_0 <= trans37_1)
if (trans37_4 <= trans37_5)
if (trans37_1 <= trans37_2)
if (trans37_6 <= trans37_7)
if (trans37_7 <= trans37_8)
if (trans37_3 <= trans37_4)
for (int i37 = 0; i37 < 1 && i37 < trans37_0; i37++) {
if (trans38_2 <= trans38_3)
if (trans38_1 <= trans38_2)
if (trans38_0 <= trans38_1)
if (trans38_4 <= trans38_5)
if (trans38_8 <= trans38_9)
if (trans38_3 <= trans38_4)
if (trans38_5 <= trans38_6)
if (trans38_6 <= trans38_7)
if (trans38_7 <= trans38_8)
if (trans38_9 <= a38.length)
for (int i38 = 0; i38 < 1 && i38 < trans38_0; i38++) {
if (trans39_3 <= trans39_4)
if (trans39_6 <= trans39_7)
if (trans39_8 <= trans39_9)
if (trans39_9 <= a39.length)
if (trans39_7 <= trans39_8)
if (trans39_5 <= trans39_6)
if (trans39_4 <= trans39_5)
if (trans39_0 <= trans39_1)
if (trans39_2 <= trans39_3)
if (trans39_1 <= trans39_2)
for (int i39 = 0; i39 < 1 && i39 < trans39_0; i39++) {
if (trans40_1 <= trans40_2)
if (trans40_0 <= trans40_1)
if (trans40_8 <= trans40_9)
if (trans40_4 <= trans40_5)
if (trans40_2 <= trans40_3)
if (trans40_5 <= trans40_6)
if (trans40_3 <= trans40_4)
if (trans40_7 <= trans40_8)
if (trans40_9 <= a40.length)
if (trans40_6 <= trans40_7)
for (int i40 = 0; i40 < 1 && i40 < trans40_0; i40++) {
if (trans41_1 <= trans41_2)
if (trans41_3 <= trans41_4)
if (trans41_7 <= trans41_8)
if (trans41_9 <= a41.length)
if (trans41_2 <= trans41_3)
if (trans41_0 <= trans41_1)
if (trans41_6 <= trans41_7)
if (trans41_5 <= trans41_6)
if (trans41_4 <= trans41_5)
if (trans41_8 <= trans41_9)
for (int i41 = 0; i41 < 1 && i41 < trans41_0; i41++) {
if (trans42_2 <= trans42_3)
if (trans42_8 <= trans42_9)
if (trans42_3 <= trans42_4)
if (trans42_4 <= trans42_5)
if (trans42_9 <= a42.length)
if (trans42_7 <= trans42_8)
if (trans42_0 <= trans42_1)
if (trans42_5 <= trans42_6)
if (trans42_1 <= trans42_2)
if (trans42_6 <= trans42_7)
for (int i42 = 0; i42 < 1 && i42 < trans42_0; i42++) {
if (trans43_7 <= trans43_8)
if (trans43_6 <= trans43_7)
if (trans43_0 <= trans43_1)
if (trans43_1 <= trans43_2)
if (trans43_9 <= a43.length)
if (trans43_3 <= trans43_4)
if (trans43_5 <= trans43_6)
if (trans43_4 <= trans43_5)
if (trans43_2 <= trans43_3)
if (trans43_8 <= trans43_9)
for (int i43 = 0; i43 < 1 && i43 < trans43_0; i43++) {
if (trans44_5 <= trans44_6)
if (trans44_4 <= trans44_5)
if (trans44_7 <= trans44_8)
if (trans44_3 <= trans44_4)
if (trans44_2 <= trans44_3)
if (trans44_8 <= trans44_9)
if (trans44_1 <= trans44_2)
if (trans44_0 <= trans44_1)
if (trans44_9 <= a44.length)
if (trans44_6 <= trans44_7)
for (int i44 = 0; i44 < 1 && i44 < trans44_0; i44++) {
if (trans45_1 <= trans45_2)
if (trans45_3 <= trans45_4)
if (trans45_6 <= trans45_7)
if (trans45_0 <= trans45_1)
if (trans45_5 <= trans45_6)
if (trans45_7 <= trans45_8)
if (trans45_8 <= trans45_9)
if (trans45_4 <= trans45_5)
if (trans45_9 <= a45.length)
if (trans45_2 <= trans45_3)
for (int i45 = 0; i45 < 1 && i45 < trans45_0; i45++) {
if (trans46_5 <= trans46_6)
if (trans46_7 <= trans46_8)
if (trans46_0 <= trans46_1)
if (trans46_8 <= trans46_9)
if (trans46_6 <= trans46_7)
if (trans46_2 <= trans46_3)
if (trans46_4 <= trans46_5)
if (trans46_9 <= a46.length)
if (trans46_3 <= trans46_4)
if (trans46_1 <= trans46_2)
for (int i46 = 0; i46 < 1 && i46 < trans46_0; i46++) {
if (trans47_3 <= trans47_4)
if (trans47_7 <= trans47_8)
if (trans47_5 <= trans47_6)
if (trans47_2 <= trans47_3)
if (trans47_9 <= a47.length)
if (trans47_8 <= trans47_9)
if (trans47_0 <= trans47_1)
if (trans47_4 <= trans47_5)
if (trans47_6 <= trans47_7)
if (trans47_1 <= trans47_2)
for (int i47 = 0; i47 < 1 && i47 < trans47_0; i47++) {
if (trans48_1 <= trans48_2)
if (trans48_9 <= a48.length)
if (trans48_6 <= trans48_7)
if (trans48_7 <= trans48_8)
if (trans48_2 <= trans48_3)
if (trans48_0 <= trans48_1)
if (trans48_8 <= trans48_9)
if (trans48_4 <= trans48_5)
if (trans48_5 <= trans48_6)
if (trans48_3 <= trans48_4)
for (int i48 = 0; i48 < 1 && i48 < trans48_0; i48++) {
if (trans49_2 <= trans49_3)
if (trans49_9 <= a49.length)
if (trans49_7 <= trans49_8)
if (trans49_1 <= trans49_2)
if (trans49_6 <= trans49_7)
if (trans49_0 <= trans49_1)
if (trans49_4 <= trans49_5)
if (trans49_3 <= trans49_4)
if (trans49_8 <= trans49_9)
if (trans49_5 <= trans49_6)
for (int i49 = 0; i49 < 1 && i49 < trans49_0; i49++) {
if (trans50_6 <= trans50_7)
if (trans50_2 <= trans50_3)
if (trans50_0 <= trans50_1)
if (trans50_1 <= trans50_2)
if (trans50_9 <= a50.length)
if (trans50_5 <= trans50_6)
if (trans50_7 <= trans50_8)
if (trans50_8 <= trans50_9)
if (trans50_3 <= trans50_4)
if (trans50_4 <= trans50_5)
for (int i50 = 0; i50 < 1 && i50 < trans50_0; i50++) {
if (trans51_3 <= trans51_4)
if (trans51_8 <= trans51_9)
if (trans51_6 <= trans51_7)
if (trans51_7 <= trans51_8)
if (trans51_2 <= trans51_3)
if (trans51_4 <= trans51_5)
if (trans51_1 <= trans51_2)
if (trans51_0 <= trans51_1)
if (trans51_5 <= trans51_6)
if (trans51_9 <= a51.length)
for (int i51 = 0; i51 < 1 && i51 < trans51_0; i51++) {
if (trans52_7 <= trans52_8)
if (trans52_9 <= a52.length)
if (trans52_6 <= trans52_7)
if (trans52_5 <= trans52_6)
if (trans52_1 <= trans52_2)
if (trans52_8 <= trans52_9)
if (trans52_4 <= trans52_5)
if (trans52_0 <= trans52_1)
if (trans52_2 <= trans52_3)
if (trans52_3 <= trans52_4)
for (int i52 = 0; i52 < 1 && i52 < trans52_0; i52++) {
if (trans53_5 <= trans53_6)
if (trans53_2 <= trans53_3)
if (trans53_4 <= trans53_5)
if (trans53_1 <= trans53_2)
if (trans53_3 <= trans53_4)
if (trans53_0 <= trans53_1)
if (trans53_6 <= trans53_7)
if (trans53_7 <= trans53_8)
if (trans53_9 <= a53.length)
if (trans53_8 <= trans53_9)
for (int i53 = 0; i53 < 1 && i53 < trans53_0; i53++) {
if (trans54_9 <= a54.length)
if (trans54_3 <= trans54_4)
if (trans54_2 <= trans54_3)
if (trans54_8 <= trans54_9)
if (trans54_6 <= trans54_7)
if (trans54_4 <= trans54_5)
if (trans54_7 <= trans54_8)
if (trans54_0 <= trans54_1)
if (trans54_5 <= trans54_6)
if (trans54_1 <= trans54_2)
for (int i54 = 0; i54 < 1 && i54 < trans54_0; i54++) {
if (trans55_3 <= trans55_4)
if (trans55_9 <= a55.length)
if (trans55_6 <= trans55_7)
if (trans55_5 <= trans55_6)
if (trans55_7 <= trans55_8)
if (trans55_4 <= trans55_5)
if (trans55_2 <= trans55_3)
if (trans55_0 <= trans55_1)
if (trans55_1 <= trans55_2)
if (trans55_8 <= trans55_9)
for (int i55 = 0; i55 < 1 && i55 < trans55_0; i55++) {
if (trans56_9 <= a56.length)
if (trans56_1 <= trans56_2)
if (trans56_6 <= trans56_7)
if (trans56_5 <= trans56_6)
if (trans56_7 <= trans56_8)
if (trans56_8 <= trans56_9)
if (trans56_3 <= trans56_4)
if (trans56_4 <= trans56_5)
if (trans56_2 <= trans56_3)
if (trans56_0 <= trans56_1)
for (int i56 = 0; i56 < 1 && i56 < trans56_0; i56++) {
if (trans57_1 <= trans57_2)
if (trans57_5 <= trans57_6)
if (trans57_4 <= trans57_5)
if (trans57_6 <= trans57_7)
if (trans57_3 <= trans57_4)
if (trans57_7 <= trans57_8)
if (trans57_2 <= trans57_3)
if (trans57_9 <= a57.length)
if (trans57_0 <= trans57_1)
if (trans57_8 <= trans57_9)
for (int i57 = 0; i57 < 1 && i57 < trans57_0; i57++) {
if (trans58_8 <= trans58_9)
if (trans58_2 <= trans58_3)
if (trans58_7 <= trans58_8)
if (trans58_0 <= trans58_1)
if (trans58_6 <= trans58_7)
if (trans58_4 <= trans58_5)
if (trans58_1 <= trans58_2)
if (trans58_5 <= trans58_6)
if (trans58_9 <= a58.length)
if (trans58_3 <= trans58_4)
for (int i58 = 0; i58 < 1 && i58 < trans58_0; i58++) {
if (trans59_6 <= trans59_7)
if (trans59_9 <= a59.length)
if (trans59_5 <= trans59_6)
if (trans59_7 <= trans59_8)
if (trans59_0 <= trans59_1)
if (trans59_1 <= trans59_2)
if (trans59_4 <= trans59_5)
if (trans59_8 <= trans59_9)
if (trans59_3 <= trans59_4)
if (trans59_2 <= trans59_3)
for (int i59 = 0; i59 < 1 && i59 < trans59_0; i59++) {
if (trans60_7 <= trans60_8)
if (trans60_2 <= trans60_3)
if (trans60_9 <= a60.length)
if (trans60_5 <= trans60_6)
if (trans60_8 <= trans60_9)
if (trans60_4 <= trans60_5)
if (trans60_0 <= trans60_1)
if (trans60_3 <= trans60_4)
if (trans60_1 <= trans60_2)
if (trans60_6 <= trans60_7)
for (int i60 = 0; i60 < 1 && i60 < trans60_0; i60++) {
if (trans61_3 <= trans61_4)
if (trans61_4 <= trans61_5)
if (trans61_6 <= trans61_7)
if (trans61_5 <= trans61_6)
if (trans61_9 <= a61.length)
if (trans61_0 <= trans61_1)
if (trans61_7 <= trans61_8)
if (trans61_1 <= trans61_2)
if (trans61_8 <= trans61_9)
if (trans61_2 <= trans61_3)
for (int i61 = 0; i61 < 1 && i61 < trans61_0; i61++) {
if (trans62_6 <= trans62_7)
if (trans62_1 <= trans62_2)
if (trans62_2 <= trans62_3)
if (trans62_9 <= a62.length)
if (trans62_7 <= trans62_8)
if (trans62_8 <= trans62_9)
if (trans62_3 <= trans62_4)
if (trans62_0 <= trans62_1)
if (trans62_4 <= trans62_5)
if (trans62_5 <= trans62_6)
for (int i62 = 0; i62 < 1 && i62 < trans62_0; i62++) {
if (trans63_4 <= trans63_5)
if (trans63_3 <= trans63_4)
if (trans63_2 <= trans63_3)
if (trans63_0 <= trans63_1)
if (trans63_8 <= trans63_9)
if (trans63_9 <= a63.length)
if (trans63_5 <= trans63_6)
if (trans63_6 <= trans63_7)
if (trans63_7 <= trans63_8)
if (trans63_1 <= trans63_2)
for (int i63 = 0; i63 < 1 && i63 < trans63_0; i63++) {
if (trans64_4 <= trans64_5)
if (trans64_6 <= trans64_7)
if (trans64_1 <= trans64_2)
if (trans64_3 <= trans64_4)
if (trans64_2 <= trans64_3)
if (trans64_7 <= trans64_8)
if (trans64_9 <= a64.length)
if (trans64_5 <= trans64_6)
if (trans64_0 <= trans64_1)
if (trans64_8 <= trans64_9)
for (int i64 = 0; i64 < 1 && i64 < trans64_0; i64++) {
if (trans65_0 <= trans65_1)
if (trans65_5 <= trans65_6)
if (trans65_2 <= trans65_3)
if (trans65_7 <= trans65_8)
if (trans65_6 <= trans65_7)
if (trans65_1 <= trans65_2)
if (trans65_9 <= a65.length)
if (trans65_3 <= trans65_4)
if (trans65_4 <= trans65_5)
if (trans65_8 <= trans65_9)
for (int i65 = 0; i65 < 1 && i65 < trans65_0; i65++) {
if (trans66_6 <= trans66_7)
if (trans66_1 <= trans66_2)
if (trans66_7 <= trans66_8)
if (trans66_9 <= a66.length)
if (trans66_5 <= trans66_6)
if (trans66_8 <= trans66_9)
if (trans66_3 <= trans66_4)
if (trans66_4 <= trans66_5)
if (trans66_0 <= trans66_1)
if (trans66_2 <= trans66_3)
for (int i66 = 0; i66 < 1 && i66 < trans66_0; i66++) {
if (trans67_5 <= trans67_6)
if (trans67_4 <= trans67_5)
if (trans67_0 <= trans67_1)
if (trans67_6 <= trans67_7)
if (trans67_7 <= trans67_8)
if (trans67_1 <= trans67_2)
if (trans67_2 <= trans67_3)
if (trans67_9 <= a67.length)
if (trans67_3 <= trans67_4)
if (trans67_8 <= trans67_9)
for (int i67 = 0; i67 < 1 && i67 < trans67_0; i67++) {
if (trans68_8 <= trans68_9)
if (trans68_4 <= trans68_5)
if (trans68_1 <= trans68_2)
if (trans68_5 <= trans68_6)
if (trans68_6 <= trans68_7)
if (trans68_2 <= trans68_3)
if (trans68_3 <= trans68_4)
if (trans68_9 <= a68.length)
if (trans68_7 <= trans68_8)
if (trans68_0 <= trans68_1)
for (int i68 = 0; i68 < 1 && i68 < trans68_0; i68++) {
if (trans69_4 <= trans69_5)
if (trans69_2 <= trans69_3)
if (trans69_6 <= trans69_7)
if (trans69_7 <= trans69_8)
if (trans69_0 <= trans69_1)
if (trans69_5 <= trans69_6)
if (trans69_8 <= trans69_9)
if (trans69_9 <= a69.length)
if (trans69_1 <= trans69_2)
if (trans69_3 <= trans69_4)
for (int i69 = 0; i69 < 1 && i69 < trans69_0; i69++) {
if (trans70_5 <= trans70_6)
if (trans70_1 <= trans70_2)
if (trans70_6 <= trans70_7)
if (trans70_0 <= trans70_1)
if (trans70_4 <= trans70_5)
if (trans70_3 <= trans70_4)
if (trans70_7 <= trans70_8)
if (trans70_9 <= a70.length)
if (trans70_2 <= trans70_3)
if (trans70_8 <= trans70_9)
for (int i70 = 0; i70 < 1 && i70 < trans70_0; i70++) {
if (trans71_6 <= trans71_7)
if (trans71_0 <= trans71_1)
if (trans71_1 <= trans71_2)
if (trans71_4 <= trans71_5)
if (trans71_7 <= trans71_8)
if (trans71_5 <= trans71_6)
if (trans71_8 <= trans71_9)
if (trans71_2 <= trans71_3)
if (trans71_3 <= trans71_4)
if (trans71_9 <= a71.length)
for (int i71 = 0; i71 < 1 && i71 < trans71_0; i71++) {
if (trans72_1 <= trans72_2)
if (trans72_8 <= trans72_9)
if (trans72_9 <= a72.length)
if (trans72_4 <= trans72_5)
if (trans72_5 <= trans72_6)
if (trans72_3 <= trans72_4)
if (trans72_6 <= trans72_7)
if (trans72_0 <= trans72_1)
if (trans72_2 <= trans72_3)
if (trans72_7 <= trans72_8)
for (int i72 = 0; i72 < 1 && i72 < trans72_0; i72++) {
if (trans73_8 <= trans73_9)
if (trans73_7 <= trans73_8)
if (trans73_9 <= a73.length)
if (trans73_2 <= trans73_3)
if (trans73_1 <= trans73_2)
if (trans73_3 <= trans73_4)
if (trans73_6 <= trans73_7)
if (trans73_4 <= trans73_5)
if (trans73_5 <= trans73_6)
if (trans73_0 <= trans73_1)
for (int i73 = 0; i73 < 1 && i73 < trans73_0; i73++) {
if (trans74_8 <= trans74_9)
if (trans74_6 <= trans74_7)
if (trans74_7 <= trans74_8)
if (trans74_2 <= trans74_3)
if (trans74_1 <= trans74_2)
if (trans74_4 <= trans74_5)
if (trans74_0 <= trans74_1)
if (trans74_5 <= trans74_6)
if (trans74_9 <= a74.length)
if (trans74_3 <= trans74_4)
for (int i74 = 0; i74 < 1 && i74 < trans74_0; i74++) {
if (trans75_3 <= trans75_4)
if (trans75_7 <= trans75_8)
if (trans75_6 <= trans75_7)
if (trans75_2 <= trans75_3)
if (trans75_5 <= trans75_6)
if (trans75_0 <= trans75_1)
if (trans75_1 <= trans75_2)
if (trans75_8 <= trans75_9)
if (trans75_9 <= a75.length)
if (trans75_4 <= trans75_5)
for (int i75 = 0; i75 < 1 && i75 < trans75_0; i75++) {
if (trans76_3 <= trans76_4)
if (trans76_9 <= a76.length)
if (trans76_1 <= trans76_2)
if (trans76_0 <= trans76_1)
if (trans76_8 <= trans76_9)
if (trans76_6 <= trans76_7)
if (trans76_4 <= trans76_5)
if (trans76_7 <= trans76_8)
if (trans76_5 <= trans76_6)
if (trans76_2 <= trans76_3)
for (int i76 = 0; i76 < 1 && i76 < trans76_0; i76++) {
if (trans77_3 <= trans77_4)
if (trans77_6 <= trans77_7)
if (trans77_8 <= trans77_9)
if (trans77_7 <= trans77_8)
if (trans77_5 <= trans77_6)
if (trans77_4 <= trans77_5)
if (trans77_9 <= a77.length)
if (trans77_1 <= trans77_2)
if (trans77_0 <= trans77_1)
if (trans77_2 <= trans77_3)
for (int i77 = 0; i77 < 1 && i77 < trans77_0; i77++) {
if (trans78_7 <= trans78_8)
if (trans78_2 <= trans78_3)
if (trans78_0 <= trans78_1)
if (trans78_3 <= trans78_4)
if (trans78_9 <= a78.length)
if (trans78_4 <= trans78_5)
if (trans78_8 <= trans78_9)
if (trans78_5 <= trans78_6)
if (trans78_6 <= trans78_7)
if (trans78_1 <= trans78_2)
for (int i78 = 0; i78 < 1 && i78 < trans78_0; i78++) {
if (trans79_1 <= trans79_2)
if (trans79_4 <= trans79_5)
if (trans79_9 <= a79.length)
if (trans79_2 <= trans79_3)
if (trans79_8 <= trans79_9)
if (trans79_6 <= trans79_7)
if (trans79_3 <= trans79_4)
if (trans79_0 <= trans79_1)
if (trans79_7 <= trans79_8)
if (trans79_5 <= trans79_6)
for (int i79 = 0; i79 < 1 && i79 < trans79_0; i79++) {
if (trans80_5 <= trans80_6)
if (trans80_3 <= trans80_4)
if (trans80_1 <= trans80_2)
if (trans80_6 <= trans80_7)
if (trans80_4 <= trans80_5)
if (trans80_8 <= trans80_9)
if (trans80_7 <= trans80_8)
if (trans80_2 <= trans80_3)
if (trans80_9 <= a80.length)
if (trans80_0 <= trans80_1)
for (int i80 = 0; i80 < 1 && i80 < trans80_0; i80++) {
if (trans81_5 <= trans81_6)
if (trans81_0 <= trans81_1)
if (trans81_3 <= trans81_4)
if (trans81_7 <= trans81_8)
if (trans81_1 <= trans81_2)
if (trans81_4 <= trans81_5)
if (trans81_2 <= trans81_3)
if (trans81_6 <= trans81_7)
if (trans81_8 <= trans81_9)
if (trans81_9 <= a81.length)
for (int i81 = 0; i81 < 1 && i81 < trans81_0; i81++) {
if (trans82_4 <= trans82_5)
if (trans82_9 <= a82.length)
if (trans82_3 <= trans82_4)
if (trans82_6 <= trans82_7)
if (trans82_8 <= trans82_9)
if (trans82_1 <= trans82_2)
if (trans82_5 <= trans82_6)
if (trans82_2 <= trans82_3)
if (trans82_7 <= trans82_8)
if (trans82_0 <= trans82_1)
for (int i82 = 0; i82 < 1 && i82 < trans82_0; i82++) {
if (trans83_2 <= trans83_3)
if (trans83_3 <= trans83_4)
if (trans83_5 <= trans83_6)
if (trans83_4 <= trans83_5)
if (trans83_7 <= trans83_8)
if (trans83_1 <= trans83_2)
if (trans83_0 <= trans83_1)
if (trans83_6 <= trans83_7)
if (trans83_8 <= trans83_9)
if (trans83_9 <= a83.length)
for (int i83 = 0; i83 < 1 && i83 < trans83_0; i83++) {
if (trans84_3 <= trans84_4)
if (trans84_2 <= trans84_3)
if (trans84_9 <= a84.length)
if (trans84_8 <= trans84_9)
if (trans84_5 <= trans84_6)
if (trans84_6 <= trans84_7)
if (trans84_4 <= trans84_5)
if (trans84_1 <= trans84_2)
if (trans84_0 <= trans84_1)
if (trans84_7 <= trans84_8)
for (int i84 = 0; i84 < 1 && i84 < trans84_0; i84++) {
if (trans85_1 <= trans85_2)
if (trans85_7 <= trans85_8)
if (trans85_5 <= trans85_6)
if (trans85_9 <= a85.length)
if (trans85_8 <= trans85_9)
if (trans85_0 <= trans85_1)
if (trans85_4 <= trans85_5)
if (trans85_6 <= trans85_7)
if (trans85_2 <= trans85_3)
if (trans85_3 <= trans85_4)
for (int i85 = 0; i85 < 1 && i85 < trans85_0; i85++) {
if (trans86_2 <= trans86_3)
if (trans86_9 <= a86.length)
if (trans86_7 <= trans86_8)
if (trans86_3 <= trans86_4)
if (trans86_0 <= trans86_1)
if (trans86_6 <= trans86_7)
if (trans86_5 <= trans86_6)
if (trans86_1 <= trans86_2)
if (trans86_8 <= trans86_9)
if (trans86_4 <= trans86_5)
for (int i86 = 0; i86 < 1 && i86 < trans86_0; i86++) {
if (trans87_5 <= trans87_6)
if (trans87_8 <= trans87_9)
if (trans87_6 <= trans87_7)
if (trans87_2 <= trans87_3)
if (trans87_7 <= trans87_8)
if (trans87_1 <= trans87_2)
if (trans87_4 <= trans87_5)
if (trans87_9 <= a87.length)
if (trans87_0 <= trans87_1)
if (trans87_3 <= trans87_4)
for (int i87 = 0; i87 < 1 && i87 < trans87_0; i87++) {
if (trans88_5 <= trans88_6)
if (trans88_0 <= trans88_1)
if (trans88_8 <= trans88_9)
if (trans88_6 <= trans88_7)
if (trans88_9 <= a88.length)
if (trans88_3 <= trans88_4)
if (trans88_2 <= trans88_3)
if (trans88_7 <= trans88_8)
if (trans88_4 <= trans88_5)
if (trans88_1 <= trans88_2)
for (int i88 = 0; i88 < 1 && i88 < trans88_0; i88++) {
if (trans89_6 <= trans89_7)
if (trans89_2 <= trans89_3)
if (trans89_8 <= trans89_9)
if (trans89_0 <= trans89_1)
if (trans89_3 <= trans89_4)
if (trans89_7 <= trans89_8)
if (trans89_9 <= a89.length)
if (trans89_4 <= trans89_5)
if (trans89_5 <= trans89_6)
if (trans89_1 <= trans89_2)
for (int i89 = 0; i89 < 1 && i89 < trans89_0; i89++) {
if (trans90_0 <= trans90_1)
if (trans90_1 <= trans90_2)
if (trans90_5 <= trans90_6)
if (trans90_7 <= trans90_8)
if (trans90_2 <= trans90_3)
if (trans90_3 <= trans90_4)
if (trans90_4 <= trans90_5)
if (trans90_6 <= trans90_7)
if (trans90_9 <= a90.length)
if (trans90_8 <= trans90_9)
for (int i90 = 0; i90 < 1 && i90 < trans90_0; i90++) {
if (trans91_3 <= trans91_4)
if (trans91_2 <= trans91_3)
if (trans91_8 <= trans91_9)
if (trans91_5 <= trans91_6)
if (trans91_1 <= trans91_2)
if (trans91_4 <= trans91_5)
if (trans91_0 <= trans91_1)
if (trans91_7 <= trans91_8)
if (trans91_6 <= trans91_7)
if (trans91_9 <= a91.length)
for (int i91 = 0; i91 < 1 && i91 < trans91_0; i91++) {
if (trans92_0 <= trans92_1)
if (trans92_7 <= trans92_8)
if (trans92_1 <= trans92_2)
if (trans92_4 <= trans92_5)
if (trans92_8 <= trans92_9)
if (trans92_9 <= a92.length)
if (trans92_2 <= trans92_3)
if (trans92_3 <= trans92_4)
if (trans92_5 <= trans92_6)
if (trans92_6 <= trans92_7)
for (int i92 = 0; i92 < 1 && i92 < trans92_0; i92++) {
if (trans93_4 <= trans93_5)
if (trans93_8 <= trans93_9)
if (trans93_5 <= trans93_6)
if (trans93_7 <= trans93_8)
if (trans93_3 <= trans93_4)
if (trans93_1 <= trans93_2)
if (trans93_2 <= trans93_3)
if (trans93_0 <= trans93_1)
if (trans93_9 <= a93.length)
if (trans93_6 <= trans93_7)
for (int i93 = 0; i93 < 1 && i93 < trans93_0; i93++) {
if (trans94_2 <= trans94_3)
if (trans94_0 <= trans94_1)
if (trans94_5 <= trans94_6)
if (trans94_7 <= trans94_8)
if (trans94_1 <= trans94_2)
if (trans94_9 <= a94.length)
if (trans94_3 <= trans94_4)
if (trans94_8 <= trans94_9)
if (trans94_6 <= trans94_7)
if (trans94_4 <= trans94_5)
for (int i94 = 0; i94 < 1 && i94 < trans94_0; i94++) {
if (trans95_1 <= trans95_2)
if (trans95_8 <= trans95_9)
if (trans95_2 <= trans95_3)
if (trans95_5 <= trans95_6)
if (trans95_3 <= trans95_4)
if (trans95_9 <= a95.length)
if (trans95_0 <= trans95_1)
if (trans95_7 <= trans95_8)
if (trans95_6 <= trans95_7)
if (trans95_4 <= trans95_5)
for (int i95 = 0; i95 < 1 && i95 < trans95_0; i95++) {
if (trans96_9 <= a96.length)
if (trans96_6 <= trans96_7)
if (trans96_0 <= trans96_1)
if (trans96_2 <= trans96_3)
if (trans96_1 <= trans96_2)
if (trans96_3 <= trans96_4)
if (trans96_8 <= trans96_9)
if (trans96_5 <= trans96_6)
if (trans96_4 <= trans96_5)
if (trans96_7 <= trans96_8)
for (int i96 = 0; i96 < 1 && i96 < trans96_0; i96++) {
if (trans97_3 <= trans97_4)
if (trans97_8 <= trans97_9)
if (trans97_2 <= trans97_3)
if (trans97_0 <= trans97_1)
if (trans97_9 <= a97.length)
if (trans97_4 <= trans97_5)
if (trans97_5 <= trans97_6)
if (trans97_1 <= trans97_2)
if (trans97_7 <= trans97_8)
if (trans97_6 <= trans97_7)
for (int i97 = 0; i97 < 1 && i97 < trans97_0; i97++) {
if (trans98_6 <= trans98_7)
if (trans98_1 <= trans98_2)
if (trans98_4 <= trans98_5)
if (trans98_5 <= trans98_6)
if (trans98_9 <= a98.length)
if (trans98_7 <= trans98_8)
if (trans98_0 <= trans98_1)
if (trans98_8 <= trans98_9)
if (trans98_3 <= trans98_4)
if (trans98_2 <= trans98_3)
for (int i98 = 0; i98 < 1 && i98 < trans98_0; i98++) {
if (trans99_1 <= trans99_2)
if (trans99_2 <= trans99_3)
if (trans99_8 <= trans99_9)
if (trans99_4 <= trans99_5)
if (trans99_9 <= a99.length)
if (trans99_5 <= trans99_6)
if (trans99_3 <= trans99_4)
if (trans99_7 <= trans99_8)
if (trans99_6 <= trans99_7)
if (trans99_0 <= trans99_1)
for (int i99 = 0; i99 < 1 && i99 < trans99_0; i99++) {
if (trans100_5 <= trans100_6)
if (trans100_8 <= trans100_9)
if (trans100_6 <= trans100_7)
if (trans100_0 <= trans100_1)
if (trans100_4 <= trans100_5)
if (trans100_9 <= a100.length)
if (trans100_1 <= trans100_2)
if (trans100_3 <= trans100_4)
if (trans100_2 <= trans100_3)
if (trans100_7 <= trans100_8)
for (int i100 = 0; i100 < 1 && i100 < trans100_0; i100++) {
if (trans101_2 <= trans101_3)
if (trans101_8 <= trans101_9)
if (trans101_0 <= trans101_1)
if (trans101_3 <= trans101_4)
if (trans101_5 <= trans101_6)
if (trans101_6 <= trans101_7)
if (trans101_7 <= trans101_8)
if (trans101_1 <= trans101_2)
if (trans101_4 <= trans101_5)
if (trans101_9 <= a101.length)
for (int i101 = 0; i101 < 1 && i101 < trans101_0; i101++) {
if (trans102_5 <= trans102_6)
if (trans102_6 <= trans102_7)
if (trans102_2 <= trans102_3)
if (trans102_8 <= trans102_9)
if (trans102_3 <= trans102_4)
if (trans102_7 <= trans102_8)
if (trans102_9 <= a102.length)
if (trans102_1 <= trans102_2)
if (trans102_0 <= trans102_1)
if (trans102_4 <= trans102_5)
for (int i102 = 0; i102 < 1 && i102 < trans102_0; i102++) {
if (trans103_9 <= a103.length)
if (trans103_0 <= trans103_1)
if (trans103_1 <= trans103_2)
if (trans103_6 <= trans103_7)
if (trans103_4 <= trans103_5)
if (trans103_2 <= trans103_3)
if (trans103_8 <= trans103_9)
if (trans103_7 <= trans103_8)
if (trans103_5 <= trans103_6)
if (trans103_3 <= trans103_4)
for (int i103 = 0; i103 < 1 && i103 < trans103_0; i103++) {
if (trans104_6 <= trans104_7)
if (trans104_3 <= trans104_4)
if (trans104_5 <= trans104_6)
if (trans104_9 <= a104.length)
if (trans104_7 <= trans104_8)
if (trans104_8 <= trans104_9)
if (trans104_2 <= trans104_3)
if (trans104_0 <= trans104_1)
if (trans104_1 <= trans104_2)
if (trans104_4 <= trans104_5)
for (int i104 = 0; i104 < 1 && i104 < trans104_0; i104++) {
if (trans105_4 <= trans105_5)
if (trans105_1 <= trans105_2)
if (trans105_8 <= trans105_9)
if (trans105_6 <= trans105_7)
if (trans105_2 <= trans105_3)
if (trans105_0 <= trans105_1)
if (trans105_9 <= a105.length)
if (trans105_5 <= trans105_6)
if (trans105_7 <= trans105_8)
if (trans105_3 <= trans105_4)
for (int i105 = 0; i105 < 1 && i105 < trans105_0; i105++) {
if (trans106_5 <= trans106_6)
if (trans106_1 <= trans106_2)
if (trans106_8 <= trans106_9)
if (trans106_0 <= trans106_1)
if (trans106_9 <= a106.length)
if (trans106_2 <= trans106_3)
if (trans106_4 <= trans106_5)
if (trans106_6 <= trans106_7)
if (trans106_7 <= trans106_8)
if (trans106_3 <= trans106_4)
for (int i106 = 0; i106 < 1 && i106 < trans106_0; i106++) {
if (trans107_6 <= trans107_7)
if (trans107_9 <= a107.length)
if (trans107_3 <= trans107_4)
if (trans107_1 <= trans107_2)
if (trans107_4 <= trans107_5)
if (trans107_8 <= trans107_9)
if (trans107_0 <= trans107_1)
if (trans107_7 <= trans107_8)
if (trans107_2 <= trans107_3)
if (trans107_5 <= trans107_6)
for (int i107 = 0; i107 < 1 && i107 < trans107_0; i107++) {
if (trans108_9 <= a108.length)
if (trans108_3 <= trans108_4)
if (trans108_1 <= trans108_2)
if (trans108_4 <= trans108_5)
if (trans108_2 <= trans108_3)
if (trans108_5 <= trans108_6)
if (trans108_7 <= trans108_8)
if (trans108_0 <= trans108_1)
if (trans108_8 <= trans108_9)
if (trans108_6 <= trans108_7)
for (int i108 = 0; i108 < 1 && i108 < trans108_0; i108++) {
if (trans109_0 <= trans109_1)
if (trans109_8 <= trans109_9)
if (trans109_4 <= trans109_5)
if (trans109_6 <= trans109_7)
if (trans109_7 <= trans109_8)
if (trans109_5 <= trans109_6)
if (trans109_1 <= trans109_2)
if (trans109_9 <= a109.length)
if (trans109_2 <= trans109_3)
if (trans109_3 <= trans109_4)
for (int i109 = 0; i109 < 1 && i109 < trans109_0; i109++) {
if (trans110_8 <= trans110_9)
if (trans110_6 <= trans110_7)
if (trans110_5 <= trans110_6)
if (trans110_3 <= trans110_4)
if (trans110_0 <= trans110_1)
if (trans110_9 <= a110.length)
if (trans110_2 <= trans110_3)
if (trans110_1 <= trans110_2)
if (trans110_4 <= trans110_5)
if (trans110_7 <= trans110_8)
for (int i110 = 0; i110 < 1 && i110 < trans110_0; i110++) {
if (trans111_7 <= trans111_8)
if (trans111_9 <= a111.length)
if (trans111_0 <= trans111_1)
if (trans111_5 <= trans111_6)
if (trans111_3 <= trans111_4)
if (trans111_6 <= trans111_7)
if (trans111_2 <= trans111_3)
if (trans111_4 <= trans111_5)
if (trans111_1 <= trans111_2)
if (trans111_8 <= trans111_9)
for (int i111 = 0; i111 < 1 && i111 < trans111_0; i111++) {
if (trans112_3 <= trans112_4)
if (trans112_2 <= trans112_3)
if (trans112_8 <= trans112_9)
if (trans112_6 <= trans112_7)
if (trans112_4 <= trans112_5)
if (trans112_9 <= a112.length)
if (trans112_7 <= trans112_8)
if (trans112_1 <= trans112_2)
if (trans112_0 <= trans112_1)
if (trans112_5 <= trans112_6)
for (int i112 = 0; i112 < 1 && i112 < trans112_0; i112++) {
if (trans113_4 <= trans113_5)
if (trans113_1 <= trans113_2)
if (trans113_0 <= trans113_1)
if (trans113_8 <= trans113_9)
if (trans113_5 <= trans113_6)
if (trans113_9 <= a113.length)
if (trans113_6 <= trans113_7)
if (trans113_2 <= trans113_3)
if (trans113_7 <= trans113_8)
if (trans113_3 <= trans113_4)
for (int i113 = 0; i113 < 1 && i113 < trans113_0; i113++) {
if (trans114_2 <= trans114_3)
if (trans114_5 <= trans114_6)
if (trans114_6 <= trans114_7)
if (trans114_3 <= trans114_4)
if (trans114_7 <= trans114_8)
if (trans114_1 <= trans114_2)
if (trans114_0 <= trans114_1)
if (trans114_9 <= a114.length)
if (trans114_4 <= trans114_5)
if (trans114_8 <= trans114_9)
for (int i114 = 0; i114 < 1 && i114 < trans114_0; i114++) {
if (trans115_4 <= trans115_5)
if (trans115_0 <= trans115_1)
if (trans115_3 <= trans115_4)
if (trans115_9 <= a115.length)
if (trans115_5 <= trans115_6)
if (trans115_1 <= trans115_2)
if (trans115_6 <= trans115_7)
if (trans115_7 <= trans115_8)
if (trans115_2 <= trans115_3)
if (trans115_8 <= trans115_9)
for (int i115 = 0; i115 < 1 && i115 < trans115_0; i115++) {
if (trans116_8 <= trans116_9)
if (trans116_3 <= trans116_4)
if (trans116_2 <= trans116_3)
if (trans116_4 <= trans116_5)
if (trans116_9 <= a116.length)
if (trans116_6 <= trans116_7)
if (trans116_0 <= trans116_1)
if (trans116_5 <= trans116_6)
if (trans116_1 <= trans116_2)
if (trans116_7 <= trans116_8)
for (int i116 = 0; i116 < 1 && i116 < trans116_0; i116++) {
if (trans117_2 <= trans117_3)
if (trans117_4 <= trans117_5)
if (trans117_5 <= trans117_6)
if (trans117_9 <= a117.length)
if (trans117_8 <= trans117_9)
if (trans117_7 <= trans117_8)
if (trans117_0 <= trans117_1)
if (trans117_6 <= trans117_7)
if (trans117_1 <= trans117_2)
if (trans117_3 <= trans117_4)
for (int i117 = 0; i117 < 1 && i117 < trans117_0; i117++) {
if (trans118_2 <= trans118_3)
if (trans118_8 <= trans118_9)
if (trans118_5 <= trans118_6)
if (trans118_9 <= a118.length)
if (trans118_1 <= trans118_2)
if (trans118_3 <= trans118_4)
if (trans118_4 <= trans118_5)
if (trans118_6 <= trans118_7)
if (trans118_7 <= trans118_8)
if (trans118_0 <= trans118_1)
for (int i118 = 0; i118 < 1 && i118 < trans118_0; i118++) {
if (trans119_7 <= trans119_8)
if (trans119_1 <= trans119_2)
if (trans119_3 <= trans119_4)
if (trans119_0 <= trans119_1)
if (trans119_4 <= trans119_5)
if (trans119_2 <= trans119_3)
if (trans119_5 <= trans119_6)
if (trans119_9 <= a119.length)
if (trans119_8 <= trans119_9)
if (trans119_6 <= trans119_7)
for (int i119 = 0; i119 < 1 && i119 < trans119_0; i119++) {
if (trans120_2 <= trans120_3)
if (trans120_5 <= trans120_6)
if (trans120_4 <= trans120_5)
if (trans120_1 <= trans120_2)
if (trans120_6 <= trans120_7)
if (trans120_9 <= a120.length)
if (trans120_7 <= trans120_8)
if (trans120_3 <= trans120_4)
if (trans120_8 <= trans120_9)
if (trans120_0 <= trans120_1)
for (int i120 = 0; i120 < 1 && i120 < trans120_0; i120++) {
if (trans121_5 <= trans121_6)
if (trans121_8 <= trans121_9)
if (trans121_6 <= trans121_7)
if (trans121_4 <= trans121_5)
if (trans121_9 <= a121.length)
if (trans121_0 <= trans121_1)
if (trans121_1 <= trans121_2)
if (trans121_3 <= trans121_4)
if (trans121_2 <= trans121_3)
if (trans121_7 <= trans121_8)
for (int i121 = 0; i121 < 1 && i121 < trans121_0; i121++) {
if (trans122_8 <= trans122_9)
if (trans122_1 <= trans122_2)
if (trans122_0 <= trans122_1)
if (trans122_2 <= trans122_3)
if (trans122_9 <= a122.length)
if (trans122_7 <= trans122_8)
if (trans122_5 <= trans122_6)
if (trans122_3 <= trans122_4)
if (trans122_4 <= trans122_5)
if (trans122_6 <= trans122_7)
for (int i122 = 0; i122 < 1 && i122 < trans122_0; i122++) {
if (trans123_4 <= trans123_5)
if (trans123_0 <= trans123_1)
if (trans123_2 <= trans123_3)
if (trans123_7 <= trans123_8)
if (trans123_8 <= trans123_9)
if (trans123_5 <= trans123_6)
if (trans123_3 <= trans123_4)
if (trans123_9 <= a123.length)
if (trans123_6 <= trans123_7)
if (trans123_1 <= trans123_2)
for (int i123 = 0; i123 < 1 && i123 < trans123_0; i123++) {
if (trans124_0 <= trans124_1)
if (trans124_9 <= a124.length)
if (trans124_6 <= trans124_7)
if (trans124_8 <= trans124_9)
if (trans124_7 <= trans124_8)
if (trans124_2 <= trans124_3)
if (trans124_3 <= trans124_4)
if (trans124_4 <= trans124_5)
if (trans124_1 <= trans124_2)
if (trans124_5 <= trans124_6)
for (int i124 = 0; i124 < 1 && i124 < trans124_0; i124++) {
if (trans125_2 <= trans125_3)
if (trans125_1 <= trans125_2)
if (trans125_0 <= trans125_1)
if (trans125_6 <= trans125_7)
if (trans125_4 <= trans125_5)
if (trans125_3 <= trans125_4)
if (trans125_9 <= a125.length)
if (trans125_7 <= trans125_8)
if (trans125_5 <= trans125_6)
if (trans125_8 <= trans125_9)
for (int i125 = 0; i125 < 1 && i125 < trans125_0; i125++) {
if (trans126_7 <= trans126_8)
if (trans126_3 <= trans126_4)
if (trans126_1 <= trans126_2)
if (trans126_4 <= trans126_5)
if (trans126_6 <= trans126_7)
if (trans126_8 <= trans126_9)
if (trans126_2 <= trans126_3)
if (trans126_5 <= trans126_6)
if (trans126_9 <= a126.length)
if (trans126_0 <= trans126_1)
for (int i126 = 0; i126 < 1 && i126 < trans126_0; i126++) {
if (trans127_0 <= trans127_1)
if (trans127_5 <= trans127_6)
if (trans127_9 <= a127.length)
if (trans127_4 <= trans127_5)
if (trans127_1 <= trans127_2)
if (trans127_3 <= trans127_4)
if (trans127_8 <= trans127_9)
if (trans127_2 <= trans127_3)
if (trans127_7 <= trans127_8)
if (trans127_6 <= trans127_7)
for (int i127 = 0; i127 < 1 && i127 < trans127_0; i127++) {
if (trans128_9 <= a128.length)
if (trans128_8 <= trans128_9)
if (trans128_6 <= trans128_7)
if (trans128_7 <= trans128_8)
if (trans128_3 <= trans128_4)
if (trans128_0 <= trans128_1)
if (trans128_5 <= trans128_6)
if (trans128_2 <= trans128_3)
if (trans128_1 <= trans128_2)
if (trans128_4 <= trans128_5)
for (int i128 = 0; i128 < 1 && i128 < trans128_0; i128++) {
if (trans129_9 <= a129.length)
if (trans129_8 <= trans129_9)
if (trans129_0 <= trans129_1)
if (trans129_3 <= trans129_4)
if (trans129_4 <= trans129_5)
if (trans129_6 <= trans129_7)
if (trans129_7 <= trans129_8)
if (trans129_2 <= trans129_3)
if (trans129_1 <= trans129_2)
if (trans129_5 <= trans129_6)
for (int i129 = 0; i129 < 1 && i129 < trans129_0; i129++) {
if (trans130_1 <= trans130_2)
if (trans130_6 <= trans130_7)
if (trans130_0 <= trans130_1)
if (trans130_4 <= trans130_5)
if (trans130_2 <= trans130_3)
if (trans130_8 <= trans130_9)
if (trans130_5 <= trans130_6)
if (trans130_3 <= trans130_4)
if (trans130_7 <= trans130_8)
if (trans130_9 <= a130.length)
for (int i130 = 0; i130 < 1 && i130 < trans130_0; i130++) {
if (trans131_3 <= trans131_4)
if (trans131_7 <= trans131_8)
if (trans131_9 <= a131.length)
if (trans131_1 <= trans131_2)
if (trans131_4 <= trans131_5)
if (trans131_8 <= trans131_9)
if (trans131_6 <= trans131_7)
if (trans131_5 <= trans131_6)
if (trans131_2 <= trans131_3)
if (trans131_0 <= trans131_1)
for (int i131 = 0; i131 < 1 && i131 < trans131_0; i131++) {
if (trans132_6 <= trans132_7)
if (trans132_5 <= trans132_6)
if (trans132_1 <= trans132_2)
if (trans132_2 <= trans132_3)
if (trans132_7 <= trans132_8)
if (trans132_9 <= a132.length)
if (trans132_8 <= trans132_9)
if (trans132_4 <= trans132_5)
if (trans132_3 <= trans132_4)
if (trans132_0 <= trans132_1)
for (int i132 = 0; i132 < 1 && i132 < trans132_0; i132++) {
if (trans133_8 <= trans133_9)
if (trans133_4 <= trans133_5)
if (trans133_3 <= trans133_4)
if (trans133_1 <= trans133_2)
if (trans133_0 <= trans133_1)
if (trans133_9 <= a133.length)
if (trans133_6 <= trans133_7)
if (trans133_2 <= trans133_3)
if (trans133_5 <= trans133_6)
if (trans133_7 <= trans133_8)
for (int i133 = 0; i133 < 1 && i133 < trans133_0; i133++) {
if (trans134_7 <= trans134_8)
if (trans134_2 <= trans134_3)
if (trans134_8 <= trans134_9)
if (trans134_9 <= a134.length)
if (trans134_1 <= trans134_2)
if (trans134_5 <= trans134_6)
if (trans134_6 <= trans134_7)
if (trans134_3 <= trans134_4)
if (trans134_0 <= trans134_1)
if (trans134_4 <= trans134_5)
for (int i134 = 0; i134 < 1 && i134 < trans134_0; i134++) {
if (trans135_7 <= trans135_8)
if (trans135_1 <= trans135_2)
if (trans135_4 <= trans135_5)
if (trans135_8 <= trans135_9)
if (trans135_3 <= trans135_4)
if (trans135_0 <= trans135_1)
if (trans135_2 <= trans135_3)
if (trans135_5 <= trans135_6)
if (trans135_6 <= trans135_7)
if (trans135_9 <= a135.length)
for (int i135 = 0; i135 < 1 && i135 < trans135_0; i135++) {
if (trans136_4 <= trans136_5)
if (trans136_5 <= trans136_6)
if (trans136_7 <= trans136_8)
if (trans136_2 <= trans136_3)
if (trans136_6 <= trans136_7)
if (trans136_1 <= trans136_2)
if (trans136_0 <= trans136_1)
if (trans136_8 <= trans136_9)
if (trans136_3 <= trans136_4)
if (trans136_9 <= a136.length)
for (int i136 = 0; i136 < 1 && i136 < trans136_0; i136++) {
if (trans137_3 <= trans137_4)
if (trans137_1 <= trans137_2)
if (trans137_6 <= trans137_7)
if (trans137_8 <= trans137_9)
if (trans137_9 <= a137.length)
if (trans137_5 <= trans137_6)
if (trans137_2 <= trans137_3)
if (trans137_0 <= trans137_1)
if (trans137_4 <= trans137_5)
if (trans137_7 <= trans137_8)
for (int i137 = 0; i137 < 1 && i137 < trans137_0; i137++) {
if (trans138_8 <= trans138_9)
if (trans138_4 <= trans138_5)
if (trans138_0 <= trans138_1)
if (trans138_3 <= trans138_4)
if (trans138_7 <= trans138_8)
if (trans138_9 <= a138.length)
if (trans138_2 <= trans138_3)
if (trans138_5 <= trans138_6)
if (trans138_1 <= trans138_2)
if (trans138_6 <= trans138_7)
for (int i138 = 0; i138 < 1 && i138 < trans138_0; i138++) {
if (trans139_7 <= trans139_8)
if (trans139_1 <= trans139_2)
if (trans139_6 <= trans139_7)
if (trans139_4 <= trans139_5)
if (trans139_5 <= trans139_6)
if (trans139_0 <= trans139_1)
if (trans139_8 <= trans139_9)
if (trans139_3 <= trans139_4)
if (trans139_2 <= trans139_3)
if (trans139_9 <= a139.length)
for (int i139 = 0; i139 < 1 && i139 < trans139_0; i139++) {
if (trans140_2 <= trans140_3)
if (trans140_7 <= trans140_8)
if (trans140_5 <= trans140_6)
if (trans140_4 <= trans140_5)
if (trans140_0 <= trans140_1)
if (trans140_9 <= a140.length)
if (trans140_3 <= trans140_4)
if (trans140_1 <= trans140_2)
if (trans140_6 <= trans140_7)
if (trans140_8 <= trans140_9)
for (int i140 = 0; i140 < 1 && i140 < trans140_0; i140++) {
if (trans141_0 <= trans141_1)
if (trans141_4 <= trans141_5)
if (trans141_9 <= a141.length)
if (trans141_1 <= trans141_2)
if (trans141_5 <= trans141_6)
if (trans141_7 <= trans141_8)
if (trans141_2 <= trans141_3)
if (trans141_8 <= trans141_9)
if (trans141_6 <= trans141_7)
if (trans141_3 <= trans141_4)
for (int i141 = 0; i141 < 1 && i141 < trans141_0; i141++) {
if (trans142_8 <= trans142_9)
if (trans142_2 <= trans142_3)
if (trans142_7 <= trans142_8)
if (trans142_4 <= trans142_5)
if (trans142_5 <= trans142_6)
if (trans142_3 <= trans142_4)
if (trans142_1 <= trans142_2)
if (trans142_9 <= a142.length)
if (trans142_0 <= trans142_1)
if (trans142_6 <= trans142_7)
for (int i142 = 0; i142 < 1 && i142 < trans142_0; i142++) {
if (trans143_4 <= trans143_5)
if (trans143_5 <= trans143_6)
if (trans143_9 <= a143.length)
if (trans143_1 <= trans143_2)
if (trans143_2 <= trans143_3)
if (trans143_6 <= trans143_7)
if (trans143_3 <= trans143_4)
if (trans143_8 <= trans143_9)
if (trans143_7 <= trans143_8)
if (trans143_0 <= trans143_1)
for (int i143 = 0; i143 < 1 && i143 < trans143_0; i143++) {
if (trans144_4 <= trans144_5)
if (trans144_2 <= trans144_3)
if (trans144_0 <= trans144_1)
if (trans144_7 <= trans144_8)
if (trans144_9 <= a144.length)
if (trans144_1 <= trans144_2)
if (trans144_8 <= trans144_9)
if (trans144_5 <= trans144_6)
if (trans144_3 <= trans144_4)
if (trans144_6 <= trans144_7)
for (int i144 = 0; i144 < 1 && i144 < trans144_0; i144++) {
if (trans145_7 <= trans145_8)
if (trans145_5 <= trans145_6)
if (trans145_0 <= trans145_1)
if (trans145_9 <= a145.length)
if (trans145_3 <= trans145_4)
if (trans145_2 <= trans145_3)
if (trans145_4 <= trans145_5)
if (trans145_8 <= trans145_9)
if (trans145_1 <= trans145_2)
if (trans145_6 <= trans145_7)
for (int i145 = 0; i145 < 1 && i145 < trans145_0; i145++) {
if (trans146_3 <= trans146_4)
if (trans146_7 <= trans146_8)
if (trans146_5 <= trans146_6)
if (trans146_8 <= trans146_9)
if (trans146_2 <= trans146_3)
if (trans146_9 <= a146.length)
if (trans146_0 <= trans146_1)
if (trans146_1 <= trans146_2)
if (trans146_6 <= trans146_7)
if (trans146_4 <= trans146_5)
for (int i146 = 0; i146 < 1 && i146 < trans146_0; i146++) {
if (trans147_7 <= trans147_8)
if (trans147_9 <= a147.length)
if (trans147_8 <= trans147_9)
if (trans147_5 <= trans147_6)
if (trans147_2 <= trans147_3)
if (trans147_0 <= trans147_1)
if (trans147_4 <= trans147_5)
if (trans147_1 <= trans147_2)
if (trans147_3 <= trans147_4)
if (trans147_6 <= trans147_7)
for (int i147 = 0; i147 < 1 && i147 < trans147_0; i147++) {
if (trans148_7 <= trans148_8)
if (trans148_6 <= trans148_7)
if (trans148_2 <= trans148_3)
if (trans148_1 <= trans148_2)
if (trans148_3 <= trans148_4)
if (trans148_8 <= trans148_9)
if (trans148_0 <= trans148_1)
if (trans148_4 <= trans148_5)
if (trans148_5 <= trans148_6)
if (trans148_9 <= a148.length)
for (int i148 = 0; i148 < 1 && i148 < trans148_0; i148++) {
if (trans149_0 <= trans149_1)
if (trans149_2 <= trans149_3)
if (trans149_8 <= trans149_9)
if (trans149_7 <= trans149_8)
if (trans149_3 <= trans149_4)
if (trans149_9 <= a149.length)
if (trans149_1 <= trans149_2)
if (trans149_6 <= trans149_7)
if (trans149_5 <= trans149_6)
if (trans149_4 <= trans149_5)
for (int i149 = 0; i149 < 1 && i149 < trans149_0; i149++) {
if (trans150_3 <= trans150_4)
if (trans150_4 <= trans150_5)
if (trans150_8 <= trans150_9)
if (trans150_5 <= trans150_6)
if (trans150_9 <= a150.length)
if (trans150_2 <= trans150_3)
if (trans150_7 <= trans150_8)
if (trans150_0 <= trans150_1)
if (trans150_1 <= trans150_2)
if (trans150_6 <= trans150_7)
for (int i150 = 0; i150 < 1 && i150 < trans150_0; i150++) {
if (trans151_5 <= trans151_6)
if (trans151_3 <= trans151_4)
if (trans151_9 <= a151.length)
if (trans151_4 <= trans151_5)
if (trans151_7 <= trans151_8)
if (trans151_1 <= trans151_2)
if (trans151_6 <= trans151_7)
if (trans151_0 <= trans151_1)
if (trans151_2 <= trans151_3)
if (trans151_8 <= trans151_9)
for (int i151 = 0; i151 < 1 && i151 < trans151_0; i151++) {
if (trans152_4 <= trans152_5)
if (trans152_8 <= trans152_9)
if (trans152_9 <= a152.length)
if (trans152_5 <= trans152_6)
if (trans152_2 <= trans152_3)
if (trans152_6 <= trans152_7)
if (trans152_3 <= trans152_4)
if (trans152_1 <= trans152_2)
if (trans152_0 <= trans152_1)
if (trans152_7 <= trans152_8)
for (int i152 = 0; i152 < 1 && i152 < trans152_0; i152++) {
if (trans153_6 <= trans153_7)
if (trans153_9 <= a153.length)
if (trans153_4 <= trans153_5)
if (trans153_2 <= trans153_3)
if (trans153_8 <= trans153_9)
if (trans153_0 <= trans153_1)
if (trans153_7 <= trans153_8)
if (trans153_3 <= trans153_4)
if (trans153_5 <= trans153_6)
if (trans153_1 <= trans153_2)
for (int i153 = 0; i153 < 1 && i153 < trans153_0; i153++) {
if (trans154_2 <= trans154_3)
if (trans154_5 <= trans154_6)
if (trans154_4 <= trans154_5)
if (trans154_6 <= trans154_7)
if (trans154_1 <= trans154_2)
if (trans154_3 <= trans154_4)
if (trans154_0 <= trans154_1)
if (trans154_9 <= a154.length)
if (trans154_8 <= trans154_9)
if (trans154_7 <= trans154_8)
for (int i154 = 0; i154 < 1 && i154 < trans154_0; i154++) {
if (trans155_5 <= trans155_6)
if (trans155_1 <= trans155_2)
if (trans155_8 <= trans155_9)
if (trans155_0 <= trans155_1)
if (trans155_9 <= a155.length)
if (trans155_2 <= trans155_3)
if (trans155_6 <= trans155_7)
if (trans155_4 <= trans155_5)
if (trans155_7 <= trans155_8)
if (trans155_3 <= trans155_4)
for (int i155 = 0; i155 < 1 && i155 < trans155_0; i155++) {
if (trans156_7 <= trans156_8)
if (trans156_9 <= a156.length)
if (trans156_3 <= trans156_4)
if (trans156_0 <= trans156_1)
if (trans156_5 <= trans156_6)
if (trans156_6 <= trans156_7)
if (trans156_4 <= trans156_5)
if (trans156_1 <= trans156_2)
if (trans156_8 <= trans156_9)
if (trans156_2 <= trans156_3)
for (int i156 = 0; i156 < 1 && i156 < trans156_0; i156++) {
if (trans157_9 <= a157.length)
if (trans157_0 <= trans157_1)
if (trans157_2 <= trans157_3)
if (trans157_5 <= trans157_6)
if (trans157_4 <= trans157_5)
if (trans157_3 <= trans157_4)
if (trans157_1 <= trans157_2)
if (trans157_6 <= trans157_7)
if (trans157_7 <= trans157_8)
if (trans157_8 <= trans157_9)
for (int i157 = 0; i157 < 1 && i157 < trans157_0; i157++) {
if (trans158_9 <= a158.length)
if (trans158_5 <= trans158_6)
if (trans158_8 <= trans158_9)
if (trans158_1 <= trans158_2)
if (trans158_7 <= trans158_8)
if (trans158_0 <= trans158_1)
if (trans158_4 <= trans158_5)
if (trans158_6 <= trans158_7)
if (trans158_3 <= trans158_4)
if (trans158_2 <= trans158_3)
for (int i158 = 0; i158 < 1 && i158 < trans158_0; i158++) {
if (trans159_4 <= trans159_5)
if (trans159_0 <= trans159_1)
if (trans159_2 <= trans159_3)
if (trans159_8 <= trans159_9)
if (trans159_5 <= trans159_6)
if (trans159_6 <= trans159_7)
if (trans159_9 <= a159.length)
if (trans159_7 <= trans159_8)
if (trans159_3 <= trans159_4)
if (trans159_1 <= trans159_2)
for (int i159 = 0; i159 < 1 && i159 < trans159_0; i159++) {
if (trans160_7 <= trans160_8)
if (trans160_4 <= trans160_5)
if (trans160_9 <= a160.length)
if (trans160_8 <= trans160_9)
if (trans160_6 <= trans160_7)
if (trans160_1 <= trans160_2)
if (trans160_3 <= trans160_4)
if (trans160_2 <= trans160_3)
if (trans160_5 <= trans160_6)
if (trans160_0 <= trans160_1)
for (int i160 = 0; i160 < 1 && i160 < trans160_0; i160++) {
if (trans161_6 <= trans161_7)
if (trans161_3 <= trans161_4)
if (trans161_9 <= a161.length)
if (trans161_1 <= trans161_2)
if (trans161_7 <= trans161_8)
if (trans161_2 <= trans161_3)
if (trans161_5 <= trans161_6)
if (trans161_0 <= trans161_1)
if (trans161_8 <= trans161_9)
if (trans161_4 <= trans161_5)
for (int i161 = 0; i161 < 1 && i161 < trans161_0; i161++) {
if (trans162_6 <= trans162_7)
if (trans162_7 <= trans162_8)
if (trans162_1 <= trans162_2)
if (trans162_8 <= trans162_9)
if (trans162_9 <= a162.length)
if (trans162_0 <= trans162_1)
if (trans162_5 <= trans162_6)
if (trans162_4 <= trans162_5)
if (trans162_2 <= trans162_3)
if (trans162_3 <= trans162_4)
for (int i162 = 0; i162 < 1 && i162 < trans162_0; i162++) {
if (trans163_4 <= trans163_5)
if (trans163_2 <= trans163_3)
if (trans163_7 <= trans163_8)
if (trans163_6 <= trans163_7)
if (trans163_9 <= a163.length)
if (trans163_8 <= trans163_9)
if (trans163_1 <= trans163_2)
if (trans163_0 <= trans163_1)
if (trans163_5 <= trans163_6)
if (trans163_3 <= trans163_4)
for (int i163 = 0; i163 < 1 && i163 < trans163_0; i163++) {
if (trans164_9 <= a164.length)
if (trans164_2 <= trans164_3)
if (trans164_4 <= trans164_5)
if (trans164_6 <= trans164_7)
if (trans164_7 <= trans164_8)
if (trans164_3 <= trans164_4)
if (trans164_0 <= trans164_1)
if (trans164_1 <= trans164_2)
if (trans164_5 <= trans164_6)
if (trans164_8 <= trans164_9)
for (int i164 = 0; i164 < 1 && i164 < trans164_0; i164++) {
if (trans165_4 <= trans165_5)
if (trans165_7 <= trans165_8)
if (trans165_9 <= a165.length)
if (trans165_0 <= trans165_1)
if (trans165_8 <= trans165_9)
if (trans165_3 <= trans165_4)
if (trans165_2 <= trans165_3)
if (trans165_1 <= trans165_2)
if (trans165_5 <= trans165_6)
if (trans165_6 <= trans165_7)
for (int i165 = 0; i165 < 1 && i165 < trans165_0; i165++) {
if (trans166_3 <= trans166_4)
if (trans166_0 <= trans166_1)
if (trans166_1 <= trans166_2)
if (trans166_8 <= trans166_9)
if (trans166_2 <= trans166_3)
if (trans166_6 <= trans166_7)
if (trans166_4 <= trans166_5)
if (trans166_7 <= trans166_8)
if (trans166_5 <= trans166_6)
if (trans166_9 <= a166.length)
for (int i166 = 0; i166 < 1 && i166 < trans166_0; i166++) {
if (trans167_9 <= a167.length)
if (trans167_0 <= trans167_1)
if (trans167_2 <= trans167_3)
if (trans167_8 <= trans167_9)
if (trans167_5 <= trans167_6)
if (trans167_7 <= trans167_8)
if (trans167_1 <= trans167_2)
if (trans167_4 <= trans167_5)
if (trans167_6 <= trans167_7)
if (trans167_3 <= trans167_4)
for (int i167 = 0; i167 < 1 && i167 < trans167_0; i167++) {
if (trans168_3 <= trans168_4)
if (trans168_4 <= trans168_5)
if (trans168_2 <= trans168_3)
if (trans168_1 <= trans168_2)
if (trans168_8 <= trans168_9)
if (trans168_0 <= trans168_1)
if (trans168_6 <= trans168_7)
if (trans168_9 <= a168.length)
if (trans168_5 <= trans168_6)
if (trans168_7 <= trans168_8)
for (int i168 = 0; i168 < 1 && i168 < trans168_0; i168++) {
if (trans169_2 <= trans169_3)
if (trans169_3 <= trans169_4)
if (trans169_7 <= trans169_8)
if (trans169_8 <= trans169_9)
if (trans169_1 <= trans169_2)
if (trans169_6 <= trans169_7)
if (trans169_4 <= trans169_5)
if (trans169_9 <= a169.length)
if (trans169_0 <= trans169_1)
if (trans169_5 <= trans169_6)
for (int i169 = 0; i169 < 1 && i169 < trans169_0; i169++) {
if (trans170_2 <= trans170_3)
if (trans170_4 <= trans170_5)
if (trans170_9 <= a170.length)
if (trans170_8 <= trans170_9)
if (trans170_6 <= trans170_7)
if (trans170_5 <= trans170_6)
if (trans170_7 <= trans170_8)
if (trans170_3 <= trans170_4)
if (trans170_1 <= trans170_2)
if (trans170_0 <= trans170_1)
for (int i170 = 0; i170 < 1 && i170 < trans170_0; i170++) {
if (trans171_5 <= trans171_6)
if (trans171_7 <= trans171_8)
if (trans171_9 <= a171.length)
if (trans171_2 <= trans171_3)
if (trans171_6 <= trans171_7)
if (trans171_8 <= trans171_9)
if (trans171_4 <= trans171_5)
if (trans171_0 <= trans171_1)
if (trans171_3 <= trans171_4)
if (trans171_1 <= trans171_2)
for (int i171 = 0; i171 < 1 && i171 < trans171_0; i171++) {
if (trans172_4 <= trans172_5)
if (trans172_1 <= trans172_2)
if (trans172_6 <= trans172_7)
if (trans172_2 <= trans172_3)
if (trans172_8 <= trans172_9)
if (trans172_0 <= trans172_1)
if (trans172_3 <= trans172_4)
if (trans172_7 <= trans172_8)
if (trans172_9 <= a172.length)
if (trans172_5 <= trans172_6)
for (int i172 = 0; i172 < 1 && i172 < trans172_0; i172++) {
if (trans173_1 <= trans173_2)
if (trans173_2 <= trans173_3)
if (trans173_5 <= trans173_6)
if (trans173_7 <= trans173_8)
if (trans173_6 <= trans173_7)
if (trans173_8 <= trans173_9)
if (trans173_4 <= trans173_5)
if (trans173_3 <= trans173_4)
if (trans173_9 <= a173.length)
if (trans173_0 <= trans173_1)
for (int i173 = 0; i173 < 1 && i173 < trans173_0; i173++) {
if (trans174_0 <= trans174_1)
if (trans174_2 <= trans174_3)
if (trans174_3 <= trans174_4)
if (trans174_6 <= trans174_7)
if (trans174_7 <= trans174_8)
if (trans174_1 <= trans174_2)
if (trans174_8 <= trans174_9)
if (trans174_4 <= trans174_5)
if (trans174_9 <= a174.length)
if (trans174_5 <= trans174_6)
for (int i174 = 0; i174 < 1 && i174 < trans174_0; i174++) {
if (trans175_9 <= a175.length)
if (trans175_4 <= trans175_5)
if (trans175_3 <= trans175_4)
if (trans175_7 <= trans175_8)
if (trans175_8 <= trans175_9)
if (trans175_6 <= trans175_7)
if (trans175_2 <= trans175_3)
if (trans175_0 <= trans175_1)
if (trans175_5 <= trans175_6)
if (trans175_1 <= trans175_2)
for (int i175 = 0; i175 < 1 && i175 < trans175_0; i175++) {
if (trans176_1 <= trans176_2)
if (trans176_6 <= trans176_7)
if (trans176_4 <= trans176_5)
if (trans176_9 <= a176.length)
if (trans176_0 <= trans176_1)
if (trans176_3 <= trans176_4)
if (trans176_7 <= trans176_8)
if (trans176_2 <= trans176_3)
if (trans176_8 <= trans176_9)
if (trans176_5 <= trans176_6)
for (int i176 = 0; i176 < 1 && i176 < trans176_0; i176++) {
if (trans177_5 <= trans177_6)
if (trans177_2 <= trans177_3)
if (trans177_9 <= a177.length)
if (trans177_0 <= trans177_1)
if (trans177_1 <= trans177_2)
if (trans177_4 <= trans177_5)
if (trans177_7 <= trans177_8)
if (trans177_6 <= trans177_7)
if (trans177_8 <= trans177_9)
if (trans177_3 <= trans177_4)
for (int i177 = 0; i177 < 1 && i177 < trans177_0; i177++) {
if (trans178_6 <= trans178_7)
if (trans178_3 <= trans178_4)
if (trans178_1 <= trans178_2)
if (trans178_5 <= trans178_6)
if (trans178_8 <= trans178_9)
if (trans178_0 <= trans178_1)
if (trans178_7 <= trans178_8)
if (trans178_2 <= trans178_3)
if (trans178_9 <= a178.length)
if (trans178_4 <= trans178_5)
for (int i178 = 0; i178 < 1 && i178 < trans178_0; i178++) {
if (trans179_5 <= trans179_6)
if (trans179_1 <= trans179_2)
if (trans179_2 <= trans179_3)
if (trans179_8 <= trans179_9)
if (trans179_3 <= trans179_4)
if (trans179_7 <= trans179_8)
if (trans179_6 <= trans179_7)
if (trans179_9 <= a179.length)
if (trans179_4 <= trans179_5)
if (trans179_0 <= trans179_1)
for (int i179 = 0; i179 < 1 && i179 < trans179_0; i179++) {
if (trans180_1 <= trans180_2)
if (trans180_8 <= trans180_9)
if (trans180_7 <= trans180_8)
if (trans180_2 <= trans180_3)
if (trans180_3 <= trans180_4)
if (trans180_5 <= trans180_6)
if (trans180_9 <= a180.length)
if (trans180_0 <= trans180_1)
if (trans180_4 <= trans180_5)
if (trans180_6 <= trans180_7)
for (int i180 = 0; i180 < 1 && i180 < trans180_0; i180++) {
if (trans181_0 <= trans181_1)
if (trans181_8 <= trans181_9)
if (trans181_2 <= trans181_3)
if (trans181_4 <= trans181_5)
if (trans181_5 <= trans181_6)
if (trans181_9 <= a181.length)
if (trans181_7 <= trans181_8)
if (trans181_1 <= trans181_2)
if (trans181_6 <= trans181_7)
if (trans181_3 <= trans181_4)
for (int i181 = 0; i181 < 1 && i181 < trans181_0; i181++) {
if (trans182_6 <= trans182_7)
if (trans182_5 <= trans182_6)
if (trans182_9 <= a182.length)
if (trans182_0 <= trans182_1)
if (trans182_4 <= trans182_5)
if (trans182_7 <= trans182_8)
if (trans182_1 <= trans182_2)
if (trans182_2 <= trans182_3)
if (trans182_8 <= trans182_9)
if (trans182_3 <= trans182_4)
for (int i182 = 0; i182 < 1 && i182 < trans182_0; i182++) {
if (trans183_8 <= trans183_9)
if (trans183_9 <= a183.length)
if (trans183_6 <= trans183_7)
if (trans183_7 <= trans183_8)
if (trans183_0 <= trans183_1)
if (trans183_4 <= trans183_5)
if (trans183_5 <= trans183_6)
if (trans183_3 <= trans183_4)
if (trans183_1 <= trans183_2)
if (trans183_2 <= trans183_3)
for (int i183 = 0; i183 < 1 && i183 < trans183_0; i183++) {
if (trans184_7 <= trans184_8)
if (trans184_4 <= trans184_5)
if (trans184_0 <= trans184_1)
if (trans184_6 <= trans184_7)
if (trans184_9 <= a184.length)
if (trans184_8 <= trans184_9)
if (trans184_1 <= trans184_2)
if (trans184_3 <= trans184_4)
if (trans184_2 <= trans184_3)
if (trans184_5 <= trans184_6)
for (int i184 = 0; i184 < 1 && i184 < trans184_0; i184++) {
if (trans185_5 <= trans185_6)
if (trans185_9 <= a185.length)
if (trans185_8 <= trans185_9)
if (trans185_6 <= trans185_7)
if (trans185_2 <= trans185_3)
if (trans185_7 <= trans185_8)
if (trans185_1 <= trans185_2)
if (trans185_3 <= trans185_4)
if (trans185_0 <= trans185_1)
if (trans185_4 <= trans185_5)
for (int i185 = 0; i185 < 1 && i185 < trans185_0; i185++) {
if (trans186_0 <= trans186_1)
if (trans186_5 <= trans186_6)
if (trans186_9 <= a186.length)
if (trans186_7 <= trans186_8)
if (trans186_2 <= trans186_3)
if (trans186_4 <= trans186_5)
if (trans186_3 <= trans186_4)
if (trans186_8 <= trans186_9)
if (trans186_1 <= trans186_2)
if (trans186_6 <= trans186_7)
for (int i186 = 0; i186 < 1 && i186 < trans186_0; i186++) {
if (trans187_9 <= a187.length)
if (trans187_7 <= trans187_8)
if (trans187_6 <= trans187_7)
if (trans187_5 <= trans187_6)
if (trans187_8 <= trans187_9)
if (trans187_4 <= trans187_5)
if (trans187_2 <= trans187_3)
if (trans187_0 <= trans187_1)
if (trans187_3 <= trans187_4)
if (trans187_1 <= trans187_2)
for (int i187 = 0; i187 < 1 && i187 < trans187_0; i187++) {
if (trans188_9 <= a188.length)
if (trans188_4 <= trans188_5)
if (trans188_0 <= trans188_1)
if (trans188_5 <= trans188_6)
if (trans188_8 <= trans188_9)
if (trans188_1 <= trans188_2)
if (trans188_6 <= trans188_7)
if (trans188_3 <= trans188_4)
if (trans188_7 <= trans188_8)
if (trans188_2 <= trans188_3)
for (int i188 = 0; i188 < 1 && i188 < trans188_0; i188++) {
if (trans189_6 <= trans189_7)
if (trans189_2 <= trans189_3)
if (trans189_5 <= trans189_6)
if (trans189_1 <= trans189_2)
if (trans189_0 <= trans189_1)
if (trans189_9 <= a189.length)
if (trans189_4 <= trans189_5)
if (trans189_7 <= trans189_8)
if (trans189_3 <= trans189_4)
if (trans189_8 <= trans189_9)
for (int i189 = 0; i189 < 1 && i189 < trans189_0; i189++) {
if (trans190_0 <= trans190_1)
if (trans190_8 <= trans190_9)
if (trans190_5 <= trans190_6)
if (trans190_6 <= trans190_7)
if (trans190_2 <= trans190_3)
if (trans190_7 <= trans190_8)
if (trans190_9 <= a190.length)
if (trans190_1 <= trans190_2)
if (trans190_3 <= trans190_4)
if (trans190_4 <= trans190_5)
for (int i190 = 0; i190 < 1 && i190 < trans190_0; i190++) {
if (trans191_3 <= trans191_4)
if (trans191_1 <= trans191_2)
if (trans191_6 <= trans191_7)
if (trans191_0 <= trans191_1)
if (trans191_8 <= trans191_9)
if (trans191_4 <= trans191_5)
if (trans191_2 <= trans191_3)
if (trans191_5 <= trans191_6)
if (trans191_9 <= a191.length)
if (trans191_7 <= trans191_8)
for (int i191 = 0; i191 < 1 && i191 < trans191_0; i191++) {
if (trans192_1 <= trans192_2)
if (trans192_5 <= trans192_6)
if (trans192_3 <= trans192_4)
if (trans192_7 <= trans192_8)
if (trans192_6 <= trans192_7)
if (trans192_0 <= trans192_1)
if (trans192_9 <= a192.length)
if (trans192_4 <= trans192_5)
if (trans192_8 <= trans192_9)
if (trans192_2 <= trans192_3)
for (int i192 = 0; i192 < 1 && i192 < trans192_0; i192++) {
if (trans193_7 <= trans193_8)
if (trans193_4 <= trans193_5)
if (trans193_9 <= a193.length)
if (trans193_8 <= trans193_9)
if (trans193_3 <= trans193_4)
if (trans193_1 <= trans193_2)
if (trans193_2 <= trans193_3)
if (trans193_6 <= trans193_7)
if (trans193_0 <= trans193_1)
if (trans193_5 <= trans193_6)
for (int i193 = 0; i193 < 1 && i193 < trans193_0; i193++) {
if (trans194_8 <= trans194_9)
if (trans194_7 <= trans194_8)
if (trans194_5 <= trans194_6)
if (trans194_3 <= trans194_4)
if (trans194_9 <= a194.length)
if (trans194_0 <= trans194_1)
if (trans194_2 <= trans194_3)
if (trans194_1 <= trans194_2)
if (trans194_6 <= trans194_7)
if (trans194_4 <= trans194_5)
for (int i194 = 0; i194 < 1 && i194 < trans194_0; i194++) {
if (trans195_1 <= trans195_2)
if (trans195_0 <= trans195_1)
if (trans195_5 <= trans195_6)
if (trans195_7 <= trans195_8)
if (trans195_6 <= trans195_7)
if (trans195_3 <= trans195_4)
if (trans195_2 <= trans195_3)
if (trans195_8 <= trans195_9)
if (trans195_4 <= trans195_5)
if (trans195_9 <= a195.length)
for (int i195 = 0; i195 < 1 && i195 < trans195_0; i195++) {
if (trans196_9 <= a196.length)
if (trans196_5 <= trans196_6)
if (trans196_2 <= trans196_3)
if (trans196_1 <= trans196_2)
if (trans196_7 <= trans196_8)
if (trans196_0 <= trans196_1)
if (trans196_3 <= trans196_4)
if (trans196_8 <= trans196_9)
if (trans196_4 <= trans196_5)
if (trans196_6 <= trans196_7)
for (int i196 = 0; i196 < 1 && i196 < trans196_0; i196++) {
if (trans197_9 <= a197.length)
if (trans197_3 <= trans197_4)
if (trans197_7 <= trans197_8)
if (trans197_5 <= trans197_6)
if (trans197_1 <= trans197_2)
if (trans197_6 <= trans197_7)
if (trans197_4 <= trans197_5)
if (trans197_0 <= trans197_1)
if (trans197_2 <= trans197_3)
if (trans197_8 <= trans197_9)
for (int i197 = 0; i197 < 1 && i197 < trans197_0; i197++) {
if (trans198_2 <= trans198_3)
if (trans198_4 <= trans198_5)
if (trans198_0 <= trans198_1)
if (trans198_5 <= trans198_6)
if (trans198_7 <= trans198_8)
if (trans198_9 <= a198.length)
if (trans198_6 <= trans198_7)
if (trans198_1 <= trans198_2)
if (trans198_8 <= trans198_9)
if (trans198_3 <= trans198_4)
for (int i198 = 0; i198 < 1 && i198 < trans198_0; i198++) {
if (trans199_4 <= trans199_5)
if (trans199_3 <= trans199_4)
if (trans199_7 <= trans199_8)
if (trans199_6 <= trans199_7)
if (trans199_2 <= trans199_3)
if (trans199_8 <= trans199_9)
if (trans199_0 <= trans199_1)
if (trans199_1 <= trans199_2)
if (trans199_9 <= a199.length)
if (trans199_5 <= trans199_6)
for (int i199 = 0; i199 < 1 && i199 < trans199_0; i199++) {
s += a0[i0];
s += a1[i1];
s += a2[i2];
s += a3[i3];
s += a4[i4];
s += a5[i5];
s += a6[i6];
s += a7[i7];
s += a8[i8];
s += a9[i9];
s += a10[i10];
s += a11[i11];
s += a12[i12];
s += a13[i13];
s += a14[i14];
s += a15[i15];
s += a16[i16];
s += a17[i17];
s += a18[i18];
s += a19[i19];
s += a20[i20];
s += a21[i21];
s += a22[i22];
s += a23[i23];
s += a24[i24];
s += a25[i25];
s += a26[i26];
s += a27[i27];
s += a28[i28];
s += a29[i29];
s += a30[i30];
s += a31[i31];
s += a32[i32];
s += a33[i33];
s += a34[i34];
s += a35[i35];
s += a36[i36];
s += a37[i37];
s += a38[i38];
s += a39[i39];
s += a40[i40];
s += a41[i41];
s += a42[i42];
s += a43[i43];
s += a44[i44];
s += a45[i45];
s += a46[i46];
s += a47[i47];
s += a48[i48];
s += a49[i49];
s += a50[i50];
s += a51[i51];
s += a52[i52];
s += a53[i53];
s += a54[i54];
s += a55[i55];
s += a56[i56];
s += a57[i57];
s += a58[i58];
s += a59[i59];
s += a60[i60];
s += a61[i61];
s += a62[i62];
s += a63[i63];
s += a64[i64];
s += a65[i65];
s += a66[i66];
s += a67[i67];
s += a68[i68];
s += a69[i69];
s += a70[i70];
s += a71[i71];
s += a72[i72];
s += a73[i73];
s += a74[i74];
s += a75[i75];
s += a76[i76];
s += a77[i77];
s += a78[i78];
s += a79[i79];
s += a80[i80];
s += a81[i81];
s += a82[i82];
s += a83[i83];
s += a84[i84];
s += a85[i85];
s += a86[i86];
s += a87[i87];
s += a88[i88];
s += a89[i89];
s += a90[i90];
s += a91[i91];
s += a92[i92];
s += a93[i93];
s += a94[i94];
s += a95[i95];
s += a96[i96];
s += a97[i97];
s += a98[i98];
s += a99[i99];
s += a100[i100];
s += a101[i101];
s += a102[i102];
s += a103[i103];
s += a104[i104];
s += a105[i105];
s += a106[i106];
s += a107[i107];
s += a108[i108];
s += a109[i109];
s += a110[i110];
s += a111[i111];
s += a112[i112];
s += a113[i113];
s += a114[i114];
s += a115[i115];
s += a116[i116];
s += a117[i117];
s += a118[i118];
s += a119[i119];
s += a120[i120];
s += a121[i121];
s += a122[i122];
s += a123[i123];
s += a124[i124];
s += a125[i125];
s += a126[i126];
s += a127[i127];
s += a128[i128];
s += a129[i129];
s += a130[i130];
s += a131[i131];
s += a132[i132];
s += a133[i133];
s += a134[i134];
s += a135[i135];
s += a136[i136];
s += a137[i137];
s += a138[i138];
s += a139[i139];
s += a140[i140];
s += a141[i141];
s += a142[i142];
s += a143[i143];
s += a144[i144];
s += a145[i145];
s += a146[i146];
s += a147[i147];
s += a148[i148];
s += a149[i149];
s += a150[i150];
s += a151[i151];
s += a152[i152];
s += a153[i153];
s += a154[i154];
s += a155[i155];
s += a156[i156];
s += a157[i157];
s += a158[i158];
s += a159[i159];
s += a160[i160];
s += a161[i161];
s += a162[i162];
s += a163[i163];
s += a164[i164];
s += a165[i165];
s += a166[i166];
s += a167[i167];
s += a168[i168];
s += a169[i169];
s += a170[i170];
s += a171[i171];
s += a172[i172];
s += a173[i173];
s += a174[i174];
s += a175[i175];
s += a176[i176];
s += a177[i177];
s += a178[i178];
s += a179[i179];
s += a180[i180];
s += a181[i181];
s += a182[i182];
s += a183[i183];
s += a184[i184];
s += a185[i185];
s += a186[i186];
s += a187[i187];
s += a188[i188];
s += a189[i189];
s += a190[i190];
s += a191[i191];
s += a192[i192];
s += a193[i193];
s += a194[i194];
s += a195[i195];
s += a196[i196];
s += a197[i197];
s += a198[i198];
s += a199[i199];
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
return s; }

@Benchmark public int bench_big_n200_multipleTrue_trans10_transrandomTrue() {
return big_n200_multipleTrue_trans10_transrandomTrue();
}


}
