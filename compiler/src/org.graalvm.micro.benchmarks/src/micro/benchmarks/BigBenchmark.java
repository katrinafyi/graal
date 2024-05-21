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
if (!(trans1.length >= 2)) return -1;
if (!(trans2.length >= 2)) return -1;
if (!(trans3.length >= 2)) return -1;
if (!(trans4.length >= 2)) return -1;
if (!(trans5.length >= 2)) return -1;
if (!(trans6.length >= 2)) return -1;
if (!(trans7.length >= 2)) return -1;
if (!(trans8.length >= 2)) return -1;
if (!(trans9.length >= 2)) return -1;
if (trans0[1] <= a0.length)
if (trans0[0] <= trans0[1])
for (int i0 = 0; i0 < 1 && i0 < trans0[0]; i0++) {
if (trans1[0] <= trans1[1])
if (trans1[1] <= a1.length)
for (int i1 = 0; i1 < 1 && i1 < trans1[0]; i1++) {
if (trans2[1] <= a2.length)
if (trans2[0] <= trans2[1])
for (int i2 = 0; i2 < 1 && i2 < trans2[0]; i2++) {
if (trans3[1] <= a3.length)
if (trans3[0] <= trans3[1])
for (int i3 = 0; i3 < 1 && i3 < trans3[0]; i3++) {
if (trans4[1] <= a4.length)
if (trans4[0] <= trans4[1])
for (int i4 = 0; i4 < 1 && i4 < trans4[0]; i4++) {
if (trans5[0] <= trans5[1])
if (trans5[1] <= a5.length)
for (int i5 = 0; i5 < 1 && i5 < trans5[0]; i5++) {
if (trans6[1] <= a6.length)
if (trans6[0] <= trans6[1])
for (int i6 = 0; i6 < 1 && i6 < trans6[0]; i6++) {
if (trans7[0] <= trans7[1])
if (trans7[1] <= a7.length)
for (int i7 = 0; i7 < 1 && i7 < trans7[0]; i7++) {
if (trans8[0] <= trans8[1])
if (trans8[1] <= a8.length)
for (int i8 = 0; i8 < 1 && i8 < trans8[0]; i8++) {
if (trans9[0] <= trans9[1])
if (trans9[1] <= a9.length)
for (int i9 = 0; i9 < 1 && i9 < trans9[0]; i9++) {
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
if (!(trans1.length >= 2)) return -1;
if (!(trans2.length >= 2)) return -1;
if (!(trans3.length >= 2)) return -1;
if (!(trans4.length >= 2)) return -1;
if (!(trans5.length >= 2)) return -1;
if (!(trans6.length >= 2)) return -1;
if (!(trans7.length >= 2)) return -1;
if (!(trans8.length >= 2)) return -1;
if (!(trans9.length >= 2)) return -1;
if (!(trans10.length >= 2)) return -1;
if (!(trans11.length >= 2)) return -1;
if (!(trans12.length >= 2)) return -1;
if (!(trans13.length >= 2)) return -1;
if (!(trans14.length >= 2)) return -1;
if (!(trans15.length >= 2)) return -1;
if (!(trans16.length >= 2)) return -1;
if (!(trans17.length >= 2)) return -1;
if (!(trans18.length >= 2)) return -1;
if (!(trans19.length >= 2)) return -1;
if (trans0[1] <= a0.length)
if (trans0[0] <= trans0[1])
for (int i0 = 0; i0 < 1 && i0 < trans0[0]; i0++) {
if (trans1[0] <= trans1[1])
if (trans1[1] <= a1.length)
for (int i1 = 0; i1 < 1 && i1 < trans1[0]; i1++) {
if (trans2[1] <= a2.length)
if (trans2[0] <= trans2[1])
for (int i2 = 0; i2 < 1 && i2 < trans2[0]; i2++) {
if (trans3[1] <= a3.length)
if (trans3[0] <= trans3[1])
for (int i3 = 0; i3 < 1 && i3 < trans3[0]; i3++) {
if (trans4[1] <= a4.length)
if (trans4[0] <= trans4[1])
for (int i4 = 0; i4 < 1 && i4 < trans4[0]; i4++) {
if (trans5[0] <= trans5[1])
if (trans5[1] <= a5.length)
for (int i5 = 0; i5 < 1 && i5 < trans5[0]; i5++) {
if (trans6[1] <= a6.length)
if (trans6[0] <= trans6[1])
for (int i6 = 0; i6 < 1 && i6 < trans6[0]; i6++) {
if (trans7[0] <= trans7[1])
if (trans7[1] <= a7.length)
for (int i7 = 0; i7 < 1 && i7 < trans7[0]; i7++) {
if (trans8[0] <= trans8[1])
if (trans8[1] <= a8.length)
for (int i8 = 0; i8 < 1 && i8 < trans8[0]; i8++) {
if (trans9[0] <= trans9[1])
if (trans9[1] <= a9.length)
for (int i9 = 0; i9 < 1 && i9 < trans9[0]; i9++) {
if (trans10[0] <= trans10[1])
if (trans10[1] <= a10.length)
for (int i10 = 0; i10 < 1 && i10 < trans10[0]; i10++) {
if (trans11[0] <= trans11[1])
if (trans11[1] <= a11.length)
for (int i11 = 0; i11 < 1 && i11 < trans11[0]; i11++) {
if (trans12[1] <= a12.length)
if (trans12[0] <= trans12[1])
for (int i12 = 0; i12 < 1 && i12 < trans12[0]; i12++) {
if (trans13[0] <= trans13[1])
if (trans13[1] <= a13.length)
for (int i13 = 0; i13 < 1 && i13 < trans13[0]; i13++) {
if (trans14[0] <= trans14[1])
if (trans14[1] <= a14.length)
for (int i14 = 0; i14 < 1 && i14 < trans14[0]; i14++) {
if (trans15[0] <= trans15[1])
if (trans15[1] <= a15.length)
for (int i15 = 0; i15 < 1 && i15 < trans15[0]; i15++) {
if (trans16[1] <= a16.length)
if (trans16[0] <= trans16[1])
for (int i16 = 0; i16 < 1 && i16 < trans16[0]; i16++) {
if (trans17[0] <= trans17[1])
if (trans17[1] <= a17.length)
for (int i17 = 0; i17 < 1 && i17 < trans17[0]; i17++) {
if (trans18[1] <= a18.length)
if (trans18[0] <= trans18[1])
for (int i18 = 0; i18 < 1 && i18 < trans18[0]; i18++) {
if (trans19[1] <= a19.length)
if (trans19[0] <= trans19[1])
for (int i19 = 0; i19 < 1 && i19 < trans19[0]; i19++) {
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
if (!(trans1.length >= 2)) return -1;
if (!(trans2.length >= 2)) return -1;
if (!(trans3.length >= 2)) return -1;
if (!(trans4.length >= 2)) return -1;
if (!(trans5.length >= 2)) return -1;
if (!(trans6.length >= 2)) return -1;
if (!(trans7.length >= 2)) return -1;
if (!(trans8.length >= 2)) return -1;
if (!(trans9.length >= 2)) return -1;
if (!(trans10.length >= 2)) return -1;
if (!(trans11.length >= 2)) return -1;
if (!(trans12.length >= 2)) return -1;
if (!(trans13.length >= 2)) return -1;
if (!(trans14.length >= 2)) return -1;
if (!(trans15.length >= 2)) return -1;
if (!(trans16.length >= 2)) return -1;
if (!(trans17.length >= 2)) return -1;
if (!(trans18.length >= 2)) return -1;
if (!(trans19.length >= 2)) return -1;
if (!(trans20.length >= 2)) return -1;
if (!(trans21.length >= 2)) return -1;
if (!(trans22.length >= 2)) return -1;
if (!(trans23.length >= 2)) return -1;
if (!(trans24.length >= 2)) return -1;
if (!(trans25.length >= 2)) return -1;
if (!(trans26.length >= 2)) return -1;
if (!(trans27.length >= 2)) return -1;
if (!(trans28.length >= 2)) return -1;
if (!(trans29.length >= 2)) return -1;
if (!(trans30.length >= 2)) return -1;
if (!(trans31.length >= 2)) return -1;
if (!(trans32.length >= 2)) return -1;
if (!(trans33.length >= 2)) return -1;
if (!(trans34.length >= 2)) return -1;
if (!(trans35.length >= 2)) return -1;
if (!(trans36.length >= 2)) return -1;
if (!(trans37.length >= 2)) return -1;
if (!(trans38.length >= 2)) return -1;
if (!(trans39.length >= 2)) return -1;
if (!(trans40.length >= 2)) return -1;
if (!(trans41.length >= 2)) return -1;
if (!(trans42.length >= 2)) return -1;
if (!(trans43.length >= 2)) return -1;
if (!(trans44.length >= 2)) return -1;
if (!(trans45.length >= 2)) return -1;
if (!(trans46.length >= 2)) return -1;
if (!(trans47.length >= 2)) return -1;
if (!(trans48.length >= 2)) return -1;
if (!(trans49.length >= 2)) return -1;
if (trans0[1] <= a0.length)
if (trans0[0] <= trans0[1])
for (int i0 = 0; i0 < 1 && i0 < trans0[0]; i0++) {
if (trans1[0] <= trans1[1])
if (trans1[1] <= a1.length)
for (int i1 = 0; i1 < 1 && i1 < trans1[0]; i1++) {
if (trans2[1] <= a2.length)
if (trans2[0] <= trans2[1])
for (int i2 = 0; i2 < 1 && i2 < trans2[0]; i2++) {
if (trans3[1] <= a3.length)
if (trans3[0] <= trans3[1])
for (int i3 = 0; i3 < 1 && i3 < trans3[0]; i3++) {
if (trans4[1] <= a4.length)
if (trans4[0] <= trans4[1])
for (int i4 = 0; i4 < 1 && i4 < trans4[0]; i4++) {
if (trans5[0] <= trans5[1])
if (trans5[1] <= a5.length)
for (int i5 = 0; i5 < 1 && i5 < trans5[0]; i5++) {
if (trans6[1] <= a6.length)
if (trans6[0] <= trans6[1])
for (int i6 = 0; i6 < 1 && i6 < trans6[0]; i6++) {
if (trans7[0] <= trans7[1])
if (trans7[1] <= a7.length)
for (int i7 = 0; i7 < 1 && i7 < trans7[0]; i7++) {
if (trans8[0] <= trans8[1])
if (trans8[1] <= a8.length)
for (int i8 = 0; i8 < 1 && i8 < trans8[0]; i8++) {
if (trans9[0] <= trans9[1])
if (trans9[1] <= a9.length)
for (int i9 = 0; i9 < 1 && i9 < trans9[0]; i9++) {
if (trans10[0] <= trans10[1])
if (trans10[1] <= a10.length)
for (int i10 = 0; i10 < 1 && i10 < trans10[0]; i10++) {
if (trans11[0] <= trans11[1])
if (trans11[1] <= a11.length)
for (int i11 = 0; i11 < 1 && i11 < trans11[0]; i11++) {
if (trans12[1] <= a12.length)
if (trans12[0] <= trans12[1])
for (int i12 = 0; i12 < 1 && i12 < trans12[0]; i12++) {
if (trans13[0] <= trans13[1])
if (trans13[1] <= a13.length)
for (int i13 = 0; i13 < 1 && i13 < trans13[0]; i13++) {
if (trans14[0] <= trans14[1])
if (trans14[1] <= a14.length)
for (int i14 = 0; i14 < 1 && i14 < trans14[0]; i14++) {
if (trans15[0] <= trans15[1])
if (trans15[1] <= a15.length)
for (int i15 = 0; i15 < 1 && i15 < trans15[0]; i15++) {
if (trans16[1] <= a16.length)
if (trans16[0] <= trans16[1])
for (int i16 = 0; i16 < 1 && i16 < trans16[0]; i16++) {
if (trans17[0] <= trans17[1])
if (trans17[1] <= a17.length)
for (int i17 = 0; i17 < 1 && i17 < trans17[0]; i17++) {
if (trans18[1] <= a18.length)
if (trans18[0] <= trans18[1])
for (int i18 = 0; i18 < 1 && i18 < trans18[0]; i18++) {
if (trans19[1] <= a19.length)
if (trans19[0] <= trans19[1])
for (int i19 = 0; i19 < 1 && i19 < trans19[0]; i19++) {
if (trans20[0] <= trans20[1])
if (trans20[1] <= a20.length)
for (int i20 = 0; i20 < 1 && i20 < trans20[0]; i20++) {
if (trans21[0] <= trans21[1])
if (trans21[1] <= a21.length)
for (int i21 = 0; i21 < 1 && i21 < trans21[0]; i21++) {
if (trans22[0] <= trans22[1])
if (trans22[1] <= a22.length)
for (int i22 = 0; i22 < 1 && i22 < trans22[0]; i22++) {
if (trans23[0] <= trans23[1])
if (trans23[1] <= a23.length)
for (int i23 = 0; i23 < 1 && i23 < trans23[0]; i23++) {
if (trans24[0] <= trans24[1])
if (trans24[1] <= a24.length)
for (int i24 = 0; i24 < 1 && i24 < trans24[0]; i24++) {
if (trans25[1] <= a25.length)
if (trans25[0] <= trans25[1])
for (int i25 = 0; i25 < 1 && i25 < trans25[0]; i25++) {
if (trans26[0] <= trans26[1])
if (trans26[1] <= a26.length)
for (int i26 = 0; i26 < 1 && i26 < trans26[0]; i26++) {
if (trans27[1] <= a27.length)
if (trans27[0] <= trans27[1])
for (int i27 = 0; i27 < 1 && i27 < trans27[0]; i27++) {
if (trans28[1] <= a28.length)
if (trans28[0] <= trans28[1])
for (int i28 = 0; i28 < 1 && i28 < trans28[0]; i28++) {
if (trans29[0] <= trans29[1])
if (trans29[1] <= a29.length)
for (int i29 = 0; i29 < 1 && i29 < trans29[0]; i29++) {
if (trans30[0] <= trans30[1])
if (trans30[1] <= a30.length)
for (int i30 = 0; i30 < 1 && i30 < trans30[0]; i30++) {
if (trans31[0] <= trans31[1])
if (trans31[1] <= a31.length)
for (int i31 = 0; i31 < 1 && i31 < trans31[0]; i31++) {
if (trans32[0] <= trans32[1])
if (trans32[1] <= a32.length)
for (int i32 = 0; i32 < 1 && i32 < trans32[0]; i32++) {
if (trans33[1] <= a33.length)
if (trans33[0] <= trans33[1])
for (int i33 = 0; i33 < 1 && i33 < trans33[0]; i33++) {
if (trans34[1] <= a34.length)
if (trans34[0] <= trans34[1])
for (int i34 = 0; i34 < 1 && i34 < trans34[0]; i34++) {
if (trans35[1] <= a35.length)
if (trans35[0] <= trans35[1])
for (int i35 = 0; i35 < 1 && i35 < trans35[0]; i35++) {
if (trans36[1] <= a36.length)
if (trans36[0] <= trans36[1])
for (int i36 = 0; i36 < 1 && i36 < trans36[0]; i36++) {
if (trans37[0] <= trans37[1])
if (trans37[1] <= a37.length)
for (int i37 = 0; i37 < 1 && i37 < trans37[0]; i37++) {
if (trans38[1] <= a38.length)
if (trans38[0] <= trans38[1])
for (int i38 = 0; i38 < 1 && i38 < trans38[0]; i38++) {
if (trans39[0] <= trans39[1])
if (trans39[1] <= a39.length)
for (int i39 = 0; i39 < 1 && i39 < trans39[0]; i39++) {
if (trans40[0] <= trans40[1])
if (trans40[1] <= a40.length)
for (int i40 = 0; i40 < 1 && i40 < trans40[0]; i40++) {
if (trans41[1] <= a41.length)
if (trans41[0] <= trans41[1])
for (int i41 = 0; i41 < 1 && i41 < trans41[0]; i41++) {
if (trans42[0] <= trans42[1])
if (trans42[1] <= a42.length)
for (int i42 = 0; i42 < 1 && i42 < trans42[0]; i42++) {
if (trans43[1] <= a43.length)
if (trans43[0] <= trans43[1])
for (int i43 = 0; i43 < 1 && i43 < trans43[0]; i43++) {
if (trans44[0] <= trans44[1])
if (trans44[1] <= a44.length)
for (int i44 = 0; i44 < 1 && i44 < trans44[0]; i44++) {
if (trans45[0] <= trans45[1])
if (trans45[1] <= a45.length)
for (int i45 = 0; i45 < 1 && i45 < trans45[0]; i45++) {
if (trans46[1] <= a46.length)
if (trans46[0] <= trans46[1])
for (int i46 = 0; i46 < 1 && i46 < trans46[0]; i46++) {
if (trans47[1] <= a47.length)
if (trans47[0] <= trans47[1])
for (int i47 = 0; i47 < 1 && i47 < trans47[0]; i47++) {
if (trans48[1] <= a48.length)
if (trans48[0] <= trans48[1])
for (int i48 = 0; i48 < 1 && i48 < trans48[0]; i48++) {
if (trans49[0] <= trans49[1])
if (trans49[1] <= a49.length)
for (int i49 = 0; i49 < 1 && i49 < trans49[0]; i49++) {
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
if (!(trans1.length >= 2)) return -1;
if (!(trans2.length >= 2)) return -1;
if (!(trans3.length >= 2)) return -1;
if (!(trans4.length >= 2)) return -1;
if (!(trans5.length >= 2)) return -1;
if (!(trans6.length >= 2)) return -1;
if (!(trans7.length >= 2)) return -1;
if (!(trans8.length >= 2)) return -1;
if (!(trans9.length >= 2)) return -1;
if (!(trans10.length >= 2)) return -1;
if (!(trans11.length >= 2)) return -1;
if (!(trans12.length >= 2)) return -1;
if (!(trans13.length >= 2)) return -1;
if (!(trans14.length >= 2)) return -1;
if (!(trans15.length >= 2)) return -1;
if (!(trans16.length >= 2)) return -1;
if (!(trans17.length >= 2)) return -1;
if (!(trans18.length >= 2)) return -1;
if (!(trans19.length >= 2)) return -1;
if (!(trans20.length >= 2)) return -1;
if (!(trans21.length >= 2)) return -1;
if (!(trans22.length >= 2)) return -1;
if (!(trans23.length >= 2)) return -1;
if (!(trans24.length >= 2)) return -1;
if (!(trans25.length >= 2)) return -1;
if (!(trans26.length >= 2)) return -1;
if (!(trans27.length >= 2)) return -1;
if (!(trans28.length >= 2)) return -1;
if (!(trans29.length >= 2)) return -1;
if (!(trans30.length >= 2)) return -1;
if (!(trans31.length >= 2)) return -1;
if (!(trans32.length >= 2)) return -1;
if (!(trans33.length >= 2)) return -1;
if (!(trans34.length >= 2)) return -1;
if (!(trans35.length >= 2)) return -1;
if (!(trans36.length >= 2)) return -1;
if (!(trans37.length >= 2)) return -1;
if (!(trans38.length >= 2)) return -1;
if (!(trans39.length >= 2)) return -1;
if (!(trans40.length >= 2)) return -1;
if (!(trans41.length >= 2)) return -1;
if (!(trans42.length >= 2)) return -1;
if (!(trans43.length >= 2)) return -1;
if (!(trans44.length >= 2)) return -1;
if (!(trans45.length >= 2)) return -1;
if (!(trans46.length >= 2)) return -1;
if (!(trans47.length >= 2)) return -1;
if (!(trans48.length >= 2)) return -1;
if (!(trans49.length >= 2)) return -1;
if (!(trans50.length >= 2)) return -1;
if (!(trans51.length >= 2)) return -1;
if (!(trans52.length >= 2)) return -1;
if (!(trans53.length >= 2)) return -1;
if (!(trans54.length >= 2)) return -1;
if (!(trans55.length >= 2)) return -1;
if (!(trans56.length >= 2)) return -1;
if (!(trans57.length >= 2)) return -1;
if (!(trans58.length >= 2)) return -1;
if (!(trans59.length >= 2)) return -1;
if (!(trans60.length >= 2)) return -1;
if (!(trans61.length >= 2)) return -1;
if (!(trans62.length >= 2)) return -1;
if (!(trans63.length >= 2)) return -1;
if (!(trans64.length >= 2)) return -1;
if (!(trans65.length >= 2)) return -1;
if (!(trans66.length >= 2)) return -1;
if (!(trans67.length >= 2)) return -1;
if (!(trans68.length >= 2)) return -1;
if (!(trans69.length >= 2)) return -1;
if (!(trans70.length >= 2)) return -1;
if (!(trans71.length >= 2)) return -1;
if (!(trans72.length >= 2)) return -1;
if (!(trans73.length >= 2)) return -1;
if (!(trans74.length >= 2)) return -1;
if (!(trans75.length >= 2)) return -1;
if (!(trans76.length >= 2)) return -1;
if (!(trans77.length >= 2)) return -1;
if (!(trans78.length >= 2)) return -1;
if (!(trans79.length >= 2)) return -1;
if (!(trans80.length >= 2)) return -1;
if (!(trans81.length >= 2)) return -1;
if (!(trans82.length >= 2)) return -1;
if (!(trans83.length >= 2)) return -1;
if (!(trans84.length >= 2)) return -1;
if (!(trans85.length >= 2)) return -1;
if (!(trans86.length >= 2)) return -1;
if (!(trans87.length >= 2)) return -1;
if (!(trans88.length >= 2)) return -1;
if (!(trans89.length >= 2)) return -1;
if (!(trans90.length >= 2)) return -1;
if (!(trans91.length >= 2)) return -1;
if (!(trans92.length >= 2)) return -1;
if (!(trans93.length >= 2)) return -1;
if (!(trans94.length >= 2)) return -1;
if (!(trans95.length >= 2)) return -1;
if (!(trans96.length >= 2)) return -1;
if (!(trans97.length >= 2)) return -1;
if (!(trans98.length >= 2)) return -1;
if (!(trans99.length >= 2)) return -1;
if (trans0[1] <= a0.length)
if (trans0[0] <= trans0[1])
for (int i0 = 0; i0 < 1 && i0 < trans0[0]; i0++) {
if (trans1[0] <= trans1[1])
if (trans1[1] <= a1.length)
for (int i1 = 0; i1 < 1 && i1 < trans1[0]; i1++) {
if (trans2[1] <= a2.length)
if (trans2[0] <= trans2[1])
for (int i2 = 0; i2 < 1 && i2 < trans2[0]; i2++) {
if (trans3[1] <= a3.length)
if (trans3[0] <= trans3[1])
for (int i3 = 0; i3 < 1 && i3 < trans3[0]; i3++) {
if (trans4[1] <= a4.length)
if (trans4[0] <= trans4[1])
for (int i4 = 0; i4 < 1 && i4 < trans4[0]; i4++) {
if (trans5[0] <= trans5[1])
if (trans5[1] <= a5.length)
for (int i5 = 0; i5 < 1 && i5 < trans5[0]; i5++) {
if (trans6[1] <= a6.length)
if (trans6[0] <= trans6[1])
for (int i6 = 0; i6 < 1 && i6 < trans6[0]; i6++) {
if (trans7[0] <= trans7[1])
if (trans7[1] <= a7.length)
for (int i7 = 0; i7 < 1 && i7 < trans7[0]; i7++) {
if (trans8[0] <= trans8[1])
if (trans8[1] <= a8.length)
for (int i8 = 0; i8 < 1 && i8 < trans8[0]; i8++) {
if (trans9[0] <= trans9[1])
if (trans9[1] <= a9.length)
for (int i9 = 0; i9 < 1 && i9 < trans9[0]; i9++) {
if (trans10[0] <= trans10[1])
if (trans10[1] <= a10.length)
for (int i10 = 0; i10 < 1 && i10 < trans10[0]; i10++) {
if (trans11[0] <= trans11[1])
if (trans11[1] <= a11.length)
for (int i11 = 0; i11 < 1 && i11 < trans11[0]; i11++) {
if (trans12[1] <= a12.length)
if (trans12[0] <= trans12[1])
for (int i12 = 0; i12 < 1 && i12 < trans12[0]; i12++) {
if (trans13[0] <= trans13[1])
if (trans13[1] <= a13.length)
for (int i13 = 0; i13 < 1 && i13 < trans13[0]; i13++) {
if (trans14[0] <= trans14[1])
if (trans14[1] <= a14.length)
for (int i14 = 0; i14 < 1 && i14 < trans14[0]; i14++) {
if (trans15[0] <= trans15[1])
if (trans15[1] <= a15.length)
for (int i15 = 0; i15 < 1 && i15 < trans15[0]; i15++) {
if (trans16[1] <= a16.length)
if (trans16[0] <= trans16[1])
for (int i16 = 0; i16 < 1 && i16 < trans16[0]; i16++) {
if (trans17[0] <= trans17[1])
if (trans17[1] <= a17.length)
for (int i17 = 0; i17 < 1 && i17 < trans17[0]; i17++) {
if (trans18[1] <= a18.length)
if (trans18[0] <= trans18[1])
for (int i18 = 0; i18 < 1 && i18 < trans18[0]; i18++) {
if (trans19[1] <= a19.length)
if (trans19[0] <= trans19[1])
for (int i19 = 0; i19 < 1 && i19 < trans19[0]; i19++) {
if (trans20[0] <= trans20[1])
if (trans20[1] <= a20.length)
for (int i20 = 0; i20 < 1 && i20 < trans20[0]; i20++) {
if (trans21[0] <= trans21[1])
if (trans21[1] <= a21.length)
for (int i21 = 0; i21 < 1 && i21 < trans21[0]; i21++) {
if (trans22[0] <= trans22[1])
if (trans22[1] <= a22.length)
for (int i22 = 0; i22 < 1 && i22 < trans22[0]; i22++) {
if (trans23[0] <= trans23[1])
if (trans23[1] <= a23.length)
for (int i23 = 0; i23 < 1 && i23 < trans23[0]; i23++) {
if (trans24[0] <= trans24[1])
if (trans24[1] <= a24.length)
for (int i24 = 0; i24 < 1 && i24 < trans24[0]; i24++) {
if (trans25[1] <= a25.length)
if (trans25[0] <= trans25[1])
for (int i25 = 0; i25 < 1 && i25 < trans25[0]; i25++) {
if (trans26[0] <= trans26[1])
if (trans26[1] <= a26.length)
for (int i26 = 0; i26 < 1 && i26 < trans26[0]; i26++) {
if (trans27[1] <= a27.length)
if (trans27[0] <= trans27[1])
for (int i27 = 0; i27 < 1 && i27 < trans27[0]; i27++) {
if (trans28[1] <= a28.length)
if (trans28[0] <= trans28[1])
for (int i28 = 0; i28 < 1 && i28 < trans28[0]; i28++) {
if (trans29[0] <= trans29[1])
if (trans29[1] <= a29.length)
for (int i29 = 0; i29 < 1 && i29 < trans29[0]; i29++) {
if (trans30[0] <= trans30[1])
if (trans30[1] <= a30.length)
for (int i30 = 0; i30 < 1 && i30 < trans30[0]; i30++) {
if (trans31[0] <= trans31[1])
if (trans31[1] <= a31.length)
for (int i31 = 0; i31 < 1 && i31 < trans31[0]; i31++) {
if (trans32[0] <= trans32[1])
if (trans32[1] <= a32.length)
for (int i32 = 0; i32 < 1 && i32 < trans32[0]; i32++) {
if (trans33[1] <= a33.length)
if (trans33[0] <= trans33[1])
for (int i33 = 0; i33 < 1 && i33 < trans33[0]; i33++) {
if (trans34[1] <= a34.length)
if (trans34[0] <= trans34[1])
for (int i34 = 0; i34 < 1 && i34 < trans34[0]; i34++) {
if (trans35[1] <= a35.length)
if (trans35[0] <= trans35[1])
for (int i35 = 0; i35 < 1 && i35 < trans35[0]; i35++) {
if (trans36[1] <= a36.length)
if (trans36[0] <= trans36[1])
for (int i36 = 0; i36 < 1 && i36 < trans36[0]; i36++) {
if (trans37[0] <= trans37[1])
if (trans37[1] <= a37.length)
for (int i37 = 0; i37 < 1 && i37 < trans37[0]; i37++) {
if (trans38[1] <= a38.length)
if (trans38[0] <= trans38[1])
for (int i38 = 0; i38 < 1 && i38 < trans38[0]; i38++) {
if (trans39[0] <= trans39[1])
if (trans39[1] <= a39.length)
for (int i39 = 0; i39 < 1 && i39 < trans39[0]; i39++) {
if (trans40[0] <= trans40[1])
if (trans40[1] <= a40.length)
for (int i40 = 0; i40 < 1 && i40 < trans40[0]; i40++) {
if (trans41[1] <= a41.length)
if (trans41[0] <= trans41[1])
for (int i41 = 0; i41 < 1 && i41 < trans41[0]; i41++) {
if (trans42[0] <= trans42[1])
if (trans42[1] <= a42.length)
for (int i42 = 0; i42 < 1 && i42 < trans42[0]; i42++) {
if (trans43[1] <= a43.length)
if (trans43[0] <= trans43[1])
for (int i43 = 0; i43 < 1 && i43 < trans43[0]; i43++) {
if (trans44[0] <= trans44[1])
if (trans44[1] <= a44.length)
for (int i44 = 0; i44 < 1 && i44 < trans44[0]; i44++) {
if (trans45[0] <= trans45[1])
if (trans45[1] <= a45.length)
for (int i45 = 0; i45 < 1 && i45 < trans45[0]; i45++) {
if (trans46[1] <= a46.length)
if (trans46[0] <= trans46[1])
for (int i46 = 0; i46 < 1 && i46 < trans46[0]; i46++) {
if (trans47[1] <= a47.length)
if (trans47[0] <= trans47[1])
for (int i47 = 0; i47 < 1 && i47 < trans47[0]; i47++) {
if (trans48[1] <= a48.length)
if (trans48[0] <= trans48[1])
for (int i48 = 0; i48 < 1 && i48 < trans48[0]; i48++) {
if (trans49[0] <= trans49[1])
if (trans49[1] <= a49.length)
for (int i49 = 0; i49 < 1 && i49 < trans49[0]; i49++) {
if (trans50[1] <= a50.length)
if (trans50[0] <= trans50[1])
for (int i50 = 0; i50 < 1 && i50 < trans50[0]; i50++) {
if (trans51[0] <= trans51[1])
if (trans51[1] <= a51.length)
for (int i51 = 0; i51 < 1 && i51 < trans51[0]; i51++) {
if (trans52[1] <= a52.length)
if (trans52[0] <= trans52[1])
for (int i52 = 0; i52 < 1 && i52 < trans52[0]; i52++) {
if (trans53[0] <= trans53[1])
if (trans53[1] <= a53.length)
for (int i53 = 0; i53 < 1 && i53 < trans53[0]; i53++) {
if (trans54[0] <= trans54[1])
if (trans54[1] <= a54.length)
for (int i54 = 0; i54 < 1 && i54 < trans54[0]; i54++) {
if (trans55[1] <= a55.length)
if (trans55[0] <= trans55[1])
for (int i55 = 0; i55 < 1 && i55 < trans55[0]; i55++) {
if (trans56[0] <= trans56[1])
if (trans56[1] <= a56.length)
for (int i56 = 0; i56 < 1 && i56 < trans56[0]; i56++) {
if (trans57[0] <= trans57[1])
if (trans57[1] <= a57.length)
for (int i57 = 0; i57 < 1 && i57 < trans57[0]; i57++) {
if (trans58[0] <= trans58[1])
if (trans58[1] <= a58.length)
for (int i58 = 0; i58 < 1 && i58 < trans58[0]; i58++) {
if (trans59[0] <= trans59[1])
if (trans59[1] <= a59.length)
for (int i59 = 0; i59 < 1 && i59 < trans59[0]; i59++) {
if (trans60[0] <= trans60[1])
if (trans60[1] <= a60.length)
for (int i60 = 0; i60 < 1 && i60 < trans60[0]; i60++) {
if (trans61[0] <= trans61[1])
if (trans61[1] <= a61.length)
for (int i61 = 0; i61 < 1 && i61 < trans61[0]; i61++) {
if (trans62[1] <= a62.length)
if (trans62[0] <= trans62[1])
for (int i62 = 0; i62 < 1 && i62 < trans62[0]; i62++) {
if (trans63[1] <= a63.length)
if (trans63[0] <= trans63[1])
for (int i63 = 0; i63 < 1 && i63 < trans63[0]; i63++) {
if (trans64[1] <= a64.length)
if (trans64[0] <= trans64[1])
for (int i64 = 0; i64 < 1 && i64 < trans64[0]; i64++) {
if (trans65[0] <= trans65[1])
if (trans65[1] <= a65.length)
for (int i65 = 0; i65 < 1 && i65 < trans65[0]; i65++) {
if (trans66[1] <= a66.length)
if (trans66[0] <= trans66[1])
for (int i66 = 0; i66 < 1 && i66 < trans66[0]; i66++) {
if (trans67[0] <= trans67[1])
if (trans67[1] <= a67.length)
for (int i67 = 0; i67 < 1 && i67 < trans67[0]; i67++) {
if (trans68[0] <= trans68[1])
if (trans68[1] <= a68.length)
for (int i68 = 0; i68 < 1 && i68 < trans68[0]; i68++) {
if (trans69[1] <= a69.length)
if (trans69[0] <= trans69[1])
for (int i69 = 0; i69 < 1 && i69 < trans69[0]; i69++) {
if (trans70[1] <= a70.length)
if (trans70[0] <= trans70[1])
for (int i70 = 0; i70 < 1 && i70 < trans70[0]; i70++) {
if (trans71[1] <= a71.length)
if (trans71[0] <= trans71[1])
for (int i71 = 0; i71 < 1 && i71 < trans71[0]; i71++) {
if (trans72[0] <= trans72[1])
if (trans72[1] <= a72.length)
for (int i72 = 0; i72 < 1 && i72 < trans72[0]; i72++) {
if (trans73[1] <= a73.length)
if (trans73[0] <= trans73[1])
for (int i73 = 0; i73 < 1 && i73 < trans73[0]; i73++) {
if (trans74[1] <= a74.length)
if (trans74[0] <= trans74[1])
for (int i74 = 0; i74 < 1 && i74 < trans74[0]; i74++) {
if (trans75[0] <= trans75[1])
if (trans75[1] <= a75.length)
for (int i75 = 0; i75 < 1 && i75 < trans75[0]; i75++) {
if (trans76[0] <= trans76[1])
if (trans76[1] <= a76.length)
for (int i76 = 0; i76 < 1 && i76 < trans76[0]; i76++) {
if (trans77[0] <= trans77[1])
if (trans77[1] <= a77.length)
for (int i77 = 0; i77 < 1 && i77 < trans77[0]; i77++) {
if (trans78[0] <= trans78[1])
if (trans78[1] <= a78.length)
for (int i78 = 0; i78 < 1 && i78 < trans78[0]; i78++) {
if (trans79[1] <= a79.length)
if (trans79[0] <= trans79[1])
for (int i79 = 0; i79 < 1 && i79 < trans79[0]; i79++) {
if (trans80[1] <= a80.length)
if (trans80[0] <= trans80[1])
for (int i80 = 0; i80 < 1 && i80 < trans80[0]; i80++) {
if (trans81[0] <= trans81[1])
if (trans81[1] <= a81.length)
for (int i81 = 0; i81 < 1 && i81 < trans81[0]; i81++) {
if (trans82[0] <= trans82[1])
if (trans82[1] <= a82.length)
for (int i82 = 0; i82 < 1 && i82 < trans82[0]; i82++) {
if (trans83[0] <= trans83[1])
if (trans83[1] <= a83.length)
for (int i83 = 0; i83 < 1 && i83 < trans83[0]; i83++) {
if (trans84[1] <= a84.length)
if (trans84[0] <= trans84[1])
for (int i84 = 0; i84 < 1 && i84 < trans84[0]; i84++) {
if (trans85[1] <= a85.length)
if (trans85[0] <= trans85[1])
for (int i85 = 0; i85 < 1 && i85 < trans85[0]; i85++) {
if (trans86[1] <= a86.length)
if (trans86[0] <= trans86[1])
for (int i86 = 0; i86 < 1 && i86 < trans86[0]; i86++) {
if (trans87[1] <= a87.length)
if (trans87[0] <= trans87[1])
for (int i87 = 0; i87 < 1 && i87 < trans87[0]; i87++) {
if (trans88[0] <= trans88[1])
if (trans88[1] <= a88.length)
for (int i88 = 0; i88 < 1 && i88 < trans88[0]; i88++) {
if (trans89[0] <= trans89[1])
if (trans89[1] <= a89.length)
for (int i89 = 0; i89 < 1 && i89 < trans89[0]; i89++) {
if (trans90[1] <= a90.length)
if (trans90[0] <= trans90[1])
for (int i90 = 0; i90 < 1 && i90 < trans90[0]; i90++) {
if (trans91[0] <= trans91[1])
if (trans91[1] <= a91.length)
for (int i91 = 0; i91 < 1 && i91 < trans91[0]; i91++) {
if (trans92[0] <= trans92[1])
if (trans92[1] <= a92.length)
for (int i92 = 0; i92 < 1 && i92 < trans92[0]; i92++) {
if (trans93[0] <= trans93[1])
if (trans93[1] <= a93.length)
for (int i93 = 0; i93 < 1 && i93 < trans93[0]; i93++) {
if (trans94[0] <= trans94[1])
if (trans94[1] <= a94.length)
for (int i94 = 0; i94 < 1 && i94 < trans94[0]; i94++) {
if (trans95[1] <= a95.length)
if (trans95[0] <= trans95[1])
for (int i95 = 0; i95 < 1 && i95 < trans95[0]; i95++) {
if (trans96[0] <= trans96[1])
if (trans96[1] <= a96.length)
for (int i96 = 0; i96 < 1 && i96 < trans96[0]; i96++) {
if (trans97[0] <= trans97[1])
if (trans97[1] <= a97.length)
for (int i97 = 0; i97 < 1 && i97 < trans97[0]; i97++) {
if (trans98[1] <= a98.length)
if (trans98[0] <= trans98[1])
for (int i98 = 0; i98 < 1 && i98 < trans98[0]; i98++) {
if (trans99[1] <= a99.length)
if (trans99[0] <= trans99[1])
for (int i99 = 0; i99 < 1 && i99 < trans99[0]; i99++) {
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
if (!(trans1.length >= 2)) return -1;
if (!(trans2.length >= 2)) return -1;
if (!(trans3.length >= 2)) return -1;
if (!(trans4.length >= 2)) return -1;
if (!(trans5.length >= 2)) return -1;
if (!(trans6.length >= 2)) return -1;
if (!(trans7.length >= 2)) return -1;
if (!(trans8.length >= 2)) return -1;
if (!(trans9.length >= 2)) return -1;
if (!(trans10.length >= 2)) return -1;
if (!(trans11.length >= 2)) return -1;
if (!(trans12.length >= 2)) return -1;
if (!(trans13.length >= 2)) return -1;
if (!(trans14.length >= 2)) return -1;
if (!(trans15.length >= 2)) return -1;
if (!(trans16.length >= 2)) return -1;
if (!(trans17.length >= 2)) return -1;
if (!(trans18.length >= 2)) return -1;
if (!(trans19.length >= 2)) return -1;
if (!(trans20.length >= 2)) return -1;
if (!(trans21.length >= 2)) return -1;
if (!(trans22.length >= 2)) return -1;
if (!(trans23.length >= 2)) return -1;
if (!(trans24.length >= 2)) return -1;
if (!(trans25.length >= 2)) return -1;
if (!(trans26.length >= 2)) return -1;
if (!(trans27.length >= 2)) return -1;
if (!(trans28.length >= 2)) return -1;
if (!(trans29.length >= 2)) return -1;
if (!(trans30.length >= 2)) return -1;
if (!(trans31.length >= 2)) return -1;
if (!(trans32.length >= 2)) return -1;
if (!(trans33.length >= 2)) return -1;
if (!(trans34.length >= 2)) return -1;
if (!(trans35.length >= 2)) return -1;
if (!(trans36.length >= 2)) return -1;
if (!(trans37.length >= 2)) return -1;
if (!(trans38.length >= 2)) return -1;
if (!(trans39.length >= 2)) return -1;
if (!(trans40.length >= 2)) return -1;
if (!(trans41.length >= 2)) return -1;
if (!(trans42.length >= 2)) return -1;
if (!(trans43.length >= 2)) return -1;
if (!(trans44.length >= 2)) return -1;
if (!(trans45.length >= 2)) return -1;
if (!(trans46.length >= 2)) return -1;
if (!(trans47.length >= 2)) return -1;
if (!(trans48.length >= 2)) return -1;
if (!(trans49.length >= 2)) return -1;
if (!(trans50.length >= 2)) return -1;
if (!(trans51.length >= 2)) return -1;
if (!(trans52.length >= 2)) return -1;
if (!(trans53.length >= 2)) return -1;
if (!(trans54.length >= 2)) return -1;
if (!(trans55.length >= 2)) return -1;
if (!(trans56.length >= 2)) return -1;
if (!(trans57.length >= 2)) return -1;
if (!(trans58.length >= 2)) return -1;
if (!(trans59.length >= 2)) return -1;
if (!(trans60.length >= 2)) return -1;
if (!(trans61.length >= 2)) return -1;
if (!(trans62.length >= 2)) return -1;
if (!(trans63.length >= 2)) return -1;
if (!(trans64.length >= 2)) return -1;
if (!(trans65.length >= 2)) return -1;
if (!(trans66.length >= 2)) return -1;
if (!(trans67.length >= 2)) return -1;
if (!(trans68.length >= 2)) return -1;
if (!(trans69.length >= 2)) return -1;
if (!(trans70.length >= 2)) return -1;
if (!(trans71.length >= 2)) return -1;
if (!(trans72.length >= 2)) return -1;
if (!(trans73.length >= 2)) return -1;
if (!(trans74.length >= 2)) return -1;
if (!(trans75.length >= 2)) return -1;
if (!(trans76.length >= 2)) return -1;
if (!(trans77.length >= 2)) return -1;
if (!(trans78.length >= 2)) return -1;
if (!(trans79.length >= 2)) return -1;
if (!(trans80.length >= 2)) return -1;
if (!(trans81.length >= 2)) return -1;
if (!(trans82.length >= 2)) return -1;
if (!(trans83.length >= 2)) return -1;
if (!(trans84.length >= 2)) return -1;
if (!(trans85.length >= 2)) return -1;
if (!(trans86.length >= 2)) return -1;
if (!(trans87.length >= 2)) return -1;
if (!(trans88.length >= 2)) return -1;
if (!(trans89.length >= 2)) return -1;
if (!(trans90.length >= 2)) return -1;
if (!(trans91.length >= 2)) return -1;
if (!(trans92.length >= 2)) return -1;
if (!(trans93.length >= 2)) return -1;
if (!(trans94.length >= 2)) return -1;
if (!(trans95.length >= 2)) return -1;
if (!(trans96.length >= 2)) return -1;
if (!(trans97.length >= 2)) return -1;
if (!(trans98.length >= 2)) return -1;
if (!(trans99.length >= 2)) return -1;
if (!(trans100.length >= 2)) return -1;
if (!(trans101.length >= 2)) return -1;
if (!(trans102.length >= 2)) return -1;
if (!(trans103.length >= 2)) return -1;
if (!(trans104.length >= 2)) return -1;
if (!(trans105.length >= 2)) return -1;
if (!(trans106.length >= 2)) return -1;
if (!(trans107.length >= 2)) return -1;
if (!(trans108.length >= 2)) return -1;
if (!(trans109.length >= 2)) return -1;
if (!(trans110.length >= 2)) return -1;
if (!(trans111.length >= 2)) return -1;
if (!(trans112.length >= 2)) return -1;
if (!(trans113.length >= 2)) return -1;
if (!(trans114.length >= 2)) return -1;
if (!(trans115.length >= 2)) return -1;
if (!(trans116.length >= 2)) return -1;
if (!(trans117.length >= 2)) return -1;
if (!(trans118.length >= 2)) return -1;
if (!(trans119.length >= 2)) return -1;
if (!(trans120.length >= 2)) return -1;
if (!(trans121.length >= 2)) return -1;
if (!(trans122.length >= 2)) return -1;
if (!(trans123.length >= 2)) return -1;
if (!(trans124.length >= 2)) return -1;
if (!(trans125.length >= 2)) return -1;
if (!(trans126.length >= 2)) return -1;
if (!(trans127.length >= 2)) return -1;
if (!(trans128.length >= 2)) return -1;
if (!(trans129.length >= 2)) return -1;
if (!(trans130.length >= 2)) return -1;
if (!(trans131.length >= 2)) return -1;
if (!(trans132.length >= 2)) return -1;
if (!(trans133.length >= 2)) return -1;
if (!(trans134.length >= 2)) return -1;
if (!(trans135.length >= 2)) return -1;
if (!(trans136.length >= 2)) return -1;
if (!(trans137.length >= 2)) return -1;
if (!(trans138.length >= 2)) return -1;
if (!(trans139.length >= 2)) return -1;
if (!(trans140.length >= 2)) return -1;
if (!(trans141.length >= 2)) return -1;
if (!(trans142.length >= 2)) return -1;
if (!(trans143.length >= 2)) return -1;
if (!(trans144.length >= 2)) return -1;
if (!(trans145.length >= 2)) return -1;
if (!(trans146.length >= 2)) return -1;
if (!(trans147.length >= 2)) return -1;
if (!(trans148.length >= 2)) return -1;
if (!(trans149.length >= 2)) return -1;
if (!(trans150.length >= 2)) return -1;
if (!(trans151.length >= 2)) return -1;
if (!(trans152.length >= 2)) return -1;
if (!(trans153.length >= 2)) return -1;
if (!(trans154.length >= 2)) return -1;
if (!(trans155.length >= 2)) return -1;
if (!(trans156.length >= 2)) return -1;
if (!(trans157.length >= 2)) return -1;
if (!(trans158.length >= 2)) return -1;
if (!(trans159.length >= 2)) return -1;
if (!(trans160.length >= 2)) return -1;
if (!(trans161.length >= 2)) return -1;
if (!(trans162.length >= 2)) return -1;
if (!(trans163.length >= 2)) return -1;
if (!(trans164.length >= 2)) return -1;
if (!(trans165.length >= 2)) return -1;
if (!(trans166.length >= 2)) return -1;
if (!(trans167.length >= 2)) return -1;
if (!(trans168.length >= 2)) return -1;
if (!(trans169.length >= 2)) return -1;
if (!(trans170.length >= 2)) return -1;
if (!(trans171.length >= 2)) return -1;
if (!(trans172.length >= 2)) return -1;
if (!(trans173.length >= 2)) return -1;
if (!(trans174.length >= 2)) return -1;
if (!(trans175.length >= 2)) return -1;
if (!(trans176.length >= 2)) return -1;
if (!(trans177.length >= 2)) return -1;
if (!(trans178.length >= 2)) return -1;
if (!(trans179.length >= 2)) return -1;
if (!(trans180.length >= 2)) return -1;
if (!(trans181.length >= 2)) return -1;
if (!(trans182.length >= 2)) return -1;
if (!(trans183.length >= 2)) return -1;
if (!(trans184.length >= 2)) return -1;
if (!(trans185.length >= 2)) return -1;
if (!(trans186.length >= 2)) return -1;
if (!(trans187.length >= 2)) return -1;
if (!(trans188.length >= 2)) return -1;
if (!(trans189.length >= 2)) return -1;
if (!(trans190.length >= 2)) return -1;
if (!(trans191.length >= 2)) return -1;
if (!(trans192.length >= 2)) return -1;
if (!(trans193.length >= 2)) return -1;
if (!(trans194.length >= 2)) return -1;
if (!(trans195.length >= 2)) return -1;
if (!(trans196.length >= 2)) return -1;
if (!(trans197.length >= 2)) return -1;
if (!(trans198.length >= 2)) return -1;
if (!(trans199.length >= 2)) return -1;
if (trans0[1] <= a0.length)
if (trans0[0] <= trans0[1])
for (int i0 = 0; i0 < 1 && i0 < trans0[0]; i0++) {
if (trans1[0] <= trans1[1])
if (trans1[1] <= a1.length)
for (int i1 = 0; i1 < 1 && i1 < trans1[0]; i1++) {
if (trans2[1] <= a2.length)
if (trans2[0] <= trans2[1])
for (int i2 = 0; i2 < 1 && i2 < trans2[0]; i2++) {
if (trans3[1] <= a3.length)
if (trans3[0] <= trans3[1])
for (int i3 = 0; i3 < 1 && i3 < trans3[0]; i3++) {
if (trans4[1] <= a4.length)
if (trans4[0] <= trans4[1])
for (int i4 = 0; i4 < 1 && i4 < trans4[0]; i4++) {
if (trans5[0] <= trans5[1])
if (trans5[1] <= a5.length)
for (int i5 = 0; i5 < 1 && i5 < trans5[0]; i5++) {
if (trans6[1] <= a6.length)
if (trans6[0] <= trans6[1])
for (int i6 = 0; i6 < 1 && i6 < trans6[0]; i6++) {
if (trans7[0] <= trans7[1])
if (trans7[1] <= a7.length)
for (int i7 = 0; i7 < 1 && i7 < trans7[0]; i7++) {
if (trans8[0] <= trans8[1])
if (trans8[1] <= a8.length)
for (int i8 = 0; i8 < 1 && i8 < trans8[0]; i8++) {
if (trans9[0] <= trans9[1])
if (trans9[1] <= a9.length)
for (int i9 = 0; i9 < 1 && i9 < trans9[0]; i9++) {
if (trans10[0] <= trans10[1])
if (trans10[1] <= a10.length)
for (int i10 = 0; i10 < 1 && i10 < trans10[0]; i10++) {
if (trans11[0] <= trans11[1])
if (trans11[1] <= a11.length)
for (int i11 = 0; i11 < 1 && i11 < trans11[0]; i11++) {
if (trans12[1] <= a12.length)
if (trans12[0] <= trans12[1])
for (int i12 = 0; i12 < 1 && i12 < trans12[0]; i12++) {
if (trans13[0] <= trans13[1])
if (trans13[1] <= a13.length)
for (int i13 = 0; i13 < 1 && i13 < trans13[0]; i13++) {
if (trans14[0] <= trans14[1])
if (trans14[1] <= a14.length)
for (int i14 = 0; i14 < 1 && i14 < trans14[0]; i14++) {
if (trans15[0] <= trans15[1])
if (trans15[1] <= a15.length)
for (int i15 = 0; i15 < 1 && i15 < trans15[0]; i15++) {
if (trans16[1] <= a16.length)
if (trans16[0] <= trans16[1])
for (int i16 = 0; i16 < 1 && i16 < trans16[0]; i16++) {
if (trans17[0] <= trans17[1])
if (trans17[1] <= a17.length)
for (int i17 = 0; i17 < 1 && i17 < trans17[0]; i17++) {
if (trans18[1] <= a18.length)
if (trans18[0] <= trans18[1])
for (int i18 = 0; i18 < 1 && i18 < trans18[0]; i18++) {
if (trans19[1] <= a19.length)
if (trans19[0] <= trans19[1])
for (int i19 = 0; i19 < 1 && i19 < trans19[0]; i19++) {
if (trans20[0] <= trans20[1])
if (trans20[1] <= a20.length)
for (int i20 = 0; i20 < 1 && i20 < trans20[0]; i20++) {
if (trans21[0] <= trans21[1])
if (trans21[1] <= a21.length)
for (int i21 = 0; i21 < 1 && i21 < trans21[0]; i21++) {
if (trans22[0] <= trans22[1])
if (trans22[1] <= a22.length)
for (int i22 = 0; i22 < 1 && i22 < trans22[0]; i22++) {
if (trans23[0] <= trans23[1])
if (trans23[1] <= a23.length)
for (int i23 = 0; i23 < 1 && i23 < trans23[0]; i23++) {
if (trans24[0] <= trans24[1])
if (trans24[1] <= a24.length)
for (int i24 = 0; i24 < 1 && i24 < trans24[0]; i24++) {
if (trans25[1] <= a25.length)
if (trans25[0] <= trans25[1])
for (int i25 = 0; i25 < 1 && i25 < trans25[0]; i25++) {
if (trans26[0] <= trans26[1])
if (trans26[1] <= a26.length)
for (int i26 = 0; i26 < 1 && i26 < trans26[0]; i26++) {
if (trans27[1] <= a27.length)
if (trans27[0] <= trans27[1])
for (int i27 = 0; i27 < 1 && i27 < trans27[0]; i27++) {
if (trans28[1] <= a28.length)
if (trans28[0] <= trans28[1])
for (int i28 = 0; i28 < 1 && i28 < trans28[0]; i28++) {
if (trans29[0] <= trans29[1])
if (trans29[1] <= a29.length)
for (int i29 = 0; i29 < 1 && i29 < trans29[0]; i29++) {
if (trans30[0] <= trans30[1])
if (trans30[1] <= a30.length)
for (int i30 = 0; i30 < 1 && i30 < trans30[0]; i30++) {
if (trans31[0] <= trans31[1])
if (trans31[1] <= a31.length)
for (int i31 = 0; i31 < 1 && i31 < trans31[0]; i31++) {
if (trans32[0] <= trans32[1])
if (trans32[1] <= a32.length)
for (int i32 = 0; i32 < 1 && i32 < trans32[0]; i32++) {
if (trans33[1] <= a33.length)
if (trans33[0] <= trans33[1])
for (int i33 = 0; i33 < 1 && i33 < trans33[0]; i33++) {
if (trans34[1] <= a34.length)
if (trans34[0] <= trans34[1])
for (int i34 = 0; i34 < 1 && i34 < trans34[0]; i34++) {
if (trans35[1] <= a35.length)
if (trans35[0] <= trans35[1])
for (int i35 = 0; i35 < 1 && i35 < trans35[0]; i35++) {
if (trans36[1] <= a36.length)
if (trans36[0] <= trans36[1])
for (int i36 = 0; i36 < 1 && i36 < trans36[0]; i36++) {
if (trans37[0] <= trans37[1])
if (trans37[1] <= a37.length)
for (int i37 = 0; i37 < 1 && i37 < trans37[0]; i37++) {
if (trans38[1] <= a38.length)
if (trans38[0] <= trans38[1])
for (int i38 = 0; i38 < 1 && i38 < trans38[0]; i38++) {
if (trans39[0] <= trans39[1])
if (trans39[1] <= a39.length)
for (int i39 = 0; i39 < 1 && i39 < trans39[0]; i39++) {
if (trans40[0] <= trans40[1])
if (trans40[1] <= a40.length)
for (int i40 = 0; i40 < 1 && i40 < trans40[0]; i40++) {
if (trans41[1] <= a41.length)
if (trans41[0] <= trans41[1])
for (int i41 = 0; i41 < 1 && i41 < trans41[0]; i41++) {
if (trans42[0] <= trans42[1])
if (trans42[1] <= a42.length)
for (int i42 = 0; i42 < 1 && i42 < trans42[0]; i42++) {
if (trans43[1] <= a43.length)
if (trans43[0] <= trans43[1])
for (int i43 = 0; i43 < 1 && i43 < trans43[0]; i43++) {
if (trans44[0] <= trans44[1])
if (trans44[1] <= a44.length)
for (int i44 = 0; i44 < 1 && i44 < trans44[0]; i44++) {
if (trans45[0] <= trans45[1])
if (trans45[1] <= a45.length)
for (int i45 = 0; i45 < 1 && i45 < trans45[0]; i45++) {
if (trans46[1] <= a46.length)
if (trans46[0] <= trans46[1])
for (int i46 = 0; i46 < 1 && i46 < trans46[0]; i46++) {
if (trans47[1] <= a47.length)
if (trans47[0] <= trans47[1])
for (int i47 = 0; i47 < 1 && i47 < trans47[0]; i47++) {
if (trans48[1] <= a48.length)
if (trans48[0] <= trans48[1])
for (int i48 = 0; i48 < 1 && i48 < trans48[0]; i48++) {
if (trans49[0] <= trans49[1])
if (trans49[1] <= a49.length)
for (int i49 = 0; i49 < 1 && i49 < trans49[0]; i49++) {
if (trans50[1] <= a50.length)
if (trans50[0] <= trans50[1])
for (int i50 = 0; i50 < 1 && i50 < trans50[0]; i50++) {
if (trans51[0] <= trans51[1])
if (trans51[1] <= a51.length)
for (int i51 = 0; i51 < 1 && i51 < trans51[0]; i51++) {
if (trans52[1] <= a52.length)
if (trans52[0] <= trans52[1])
for (int i52 = 0; i52 < 1 && i52 < trans52[0]; i52++) {
if (trans53[0] <= trans53[1])
if (trans53[1] <= a53.length)
for (int i53 = 0; i53 < 1 && i53 < trans53[0]; i53++) {
if (trans54[0] <= trans54[1])
if (trans54[1] <= a54.length)
for (int i54 = 0; i54 < 1 && i54 < trans54[0]; i54++) {
if (trans55[1] <= a55.length)
if (trans55[0] <= trans55[1])
for (int i55 = 0; i55 < 1 && i55 < trans55[0]; i55++) {
if (trans56[0] <= trans56[1])
if (trans56[1] <= a56.length)
for (int i56 = 0; i56 < 1 && i56 < trans56[0]; i56++) {
if (trans57[0] <= trans57[1])
if (trans57[1] <= a57.length)
for (int i57 = 0; i57 < 1 && i57 < trans57[0]; i57++) {
if (trans58[0] <= trans58[1])
if (trans58[1] <= a58.length)
for (int i58 = 0; i58 < 1 && i58 < trans58[0]; i58++) {
if (trans59[0] <= trans59[1])
if (trans59[1] <= a59.length)
for (int i59 = 0; i59 < 1 && i59 < trans59[0]; i59++) {
if (trans60[0] <= trans60[1])
if (trans60[1] <= a60.length)
for (int i60 = 0; i60 < 1 && i60 < trans60[0]; i60++) {
if (trans61[0] <= trans61[1])
if (trans61[1] <= a61.length)
for (int i61 = 0; i61 < 1 && i61 < trans61[0]; i61++) {
if (trans62[1] <= a62.length)
if (trans62[0] <= trans62[1])
for (int i62 = 0; i62 < 1 && i62 < trans62[0]; i62++) {
if (trans63[1] <= a63.length)
if (trans63[0] <= trans63[1])
for (int i63 = 0; i63 < 1 && i63 < trans63[0]; i63++) {
if (trans64[1] <= a64.length)
if (trans64[0] <= trans64[1])
for (int i64 = 0; i64 < 1 && i64 < trans64[0]; i64++) {
if (trans65[0] <= trans65[1])
if (trans65[1] <= a65.length)
for (int i65 = 0; i65 < 1 && i65 < trans65[0]; i65++) {
if (trans66[1] <= a66.length)
if (trans66[0] <= trans66[1])
for (int i66 = 0; i66 < 1 && i66 < trans66[0]; i66++) {
if (trans67[0] <= trans67[1])
if (trans67[1] <= a67.length)
for (int i67 = 0; i67 < 1 && i67 < trans67[0]; i67++) {
if (trans68[0] <= trans68[1])
if (trans68[1] <= a68.length)
for (int i68 = 0; i68 < 1 && i68 < trans68[0]; i68++) {
if (trans69[1] <= a69.length)
if (trans69[0] <= trans69[1])
for (int i69 = 0; i69 < 1 && i69 < trans69[0]; i69++) {
if (trans70[1] <= a70.length)
if (trans70[0] <= trans70[1])
for (int i70 = 0; i70 < 1 && i70 < trans70[0]; i70++) {
if (trans71[1] <= a71.length)
if (trans71[0] <= trans71[1])
for (int i71 = 0; i71 < 1 && i71 < trans71[0]; i71++) {
if (trans72[0] <= trans72[1])
if (trans72[1] <= a72.length)
for (int i72 = 0; i72 < 1 && i72 < trans72[0]; i72++) {
if (trans73[1] <= a73.length)
if (trans73[0] <= trans73[1])
for (int i73 = 0; i73 < 1 && i73 < trans73[0]; i73++) {
if (trans74[1] <= a74.length)
if (trans74[0] <= trans74[1])
for (int i74 = 0; i74 < 1 && i74 < trans74[0]; i74++) {
if (trans75[0] <= trans75[1])
if (trans75[1] <= a75.length)
for (int i75 = 0; i75 < 1 && i75 < trans75[0]; i75++) {
if (trans76[0] <= trans76[1])
if (trans76[1] <= a76.length)
for (int i76 = 0; i76 < 1 && i76 < trans76[0]; i76++) {
if (trans77[0] <= trans77[1])
if (trans77[1] <= a77.length)
for (int i77 = 0; i77 < 1 && i77 < trans77[0]; i77++) {
if (trans78[0] <= trans78[1])
if (trans78[1] <= a78.length)
for (int i78 = 0; i78 < 1 && i78 < trans78[0]; i78++) {
if (trans79[1] <= a79.length)
if (trans79[0] <= trans79[1])
for (int i79 = 0; i79 < 1 && i79 < trans79[0]; i79++) {
if (trans80[1] <= a80.length)
if (trans80[0] <= trans80[1])
for (int i80 = 0; i80 < 1 && i80 < trans80[0]; i80++) {
if (trans81[0] <= trans81[1])
if (trans81[1] <= a81.length)
for (int i81 = 0; i81 < 1 && i81 < trans81[0]; i81++) {
if (trans82[0] <= trans82[1])
if (trans82[1] <= a82.length)
for (int i82 = 0; i82 < 1 && i82 < trans82[0]; i82++) {
if (trans83[0] <= trans83[1])
if (trans83[1] <= a83.length)
for (int i83 = 0; i83 < 1 && i83 < trans83[0]; i83++) {
if (trans84[1] <= a84.length)
if (trans84[0] <= trans84[1])
for (int i84 = 0; i84 < 1 && i84 < trans84[0]; i84++) {
if (trans85[1] <= a85.length)
if (trans85[0] <= trans85[1])
for (int i85 = 0; i85 < 1 && i85 < trans85[0]; i85++) {
if (trans86[1] <= a86.length)
if (trans86[0] <= trans86[1])
for (int i86 = 0; i86 < 1 && i86 < trans86[0]; i86++) {
if (trans87[1] <= a87.length)
if (trans87[0] <= trans87[1])
for (int i87 = 0; i87 < 1 && i87 < trans87[0]; i87++) {
if (trans88[0] <= trans88[1])
if (trans88[1] <= a88.length)
for (int i88 = 0; i88 < 1 && i88 < trans88[0]; i88++) {
if (trans89[0] <= trans89[1])
if (trans89[1] <= a89.length)
for (int i89 = 0; i89 < 1 && i89 < trans89[0]; i89++) {
if (trans90[1] <= a90.length)
if (trans90[0] <= trans90[1])
for (int i90 = 0; i90 < 1 && i90 < trans90[0]; i90++) {
if (trans91[0] <= trans91[1])
if (trans91[1] <= a91.length)
for (int i91 = 0; i91 < 1 && i91 < trans91[0]; i91++) {
if (trans92[0] <= trans92[1])
if (trans92[1] <= a92.length)
for (int i92 = 0; i92 < 1 && i92 < trans92[0]; i92++) {
if (trans93[0] <= trans93[1])
if (trans93[1] <= a93.length)
for (int i93 = 0; i93 < 1 && i93 < trans93[0]; i93++) {
if (trans94[0] <= trans94[1])
if (trans94[1] <= a94.length)
for (int i94 = 0; i94 < 1 && i94 < trans94[0]; i94++) {
if (trans95[1] <= a95.length)
if (trans95[0] <= trans95[1])
for (int i95 = 0; i95 < 1 && i95 < trans95[0]; i95++) {
if (trans96[0] <= trans96[1])
if (trans96[1] <= a96.length)
for (int i96 = 0; i96 < 1 && i96 < trans96[0]; i96++) {
if (trans97[0] <= trans97[1])
if (trans97[1] <= a97.length)
for (int i97 = 0; i97 < 1 && i97 < trans97[0]; i97++) {
if (trans98[1] <= a98.length)
if (trans98[0] <= trans98[1])
for (int i98 = 0; i98 < 1 && i98 < trans98[0]; i98++) {
if (trans99[1] <= a99.length)
if (trans99[0] <= trans99[1])
for (int i99 = 0; i99 < 1 && i99 < trans99[0]; i99++) {
if (trans100[0] <= trans100[1])
if (trans100[1] <= a100.length)
for (int i100 = 0; i100 < 1 && i100 < trans100[0]; i100++) {
if (trans101[0] <= trans101[1])
if (trans101[1] <= a101.length)
for (int i101 = 0; i101 < 1 && i101 < trans101[0]; i101++) {
if (trans102[0] <= trans102[1])
if (trans102[1] <= a102.length)
for (int i102 = 0; i102 < 1 && i102 < trans102[0]; i102++) {
if (trans103[1] <= a103.length)
if (trans103[0] <= trans103[1])
for (int i103 = 0; i103 < 1 && i103 < trans103[0]; i103++) {
if (trans104[0] <= trans104[1])
if (trans104[1] <= a104.length)
for (int i104 = 0; i104 < 1 && i104 < trans104[0]; i104++) {
if (trans105[0] <= trans105[1])
if (trans105[1] <= a105.length)
for (int i105 = 0; i105 < 1 && i105 < trans105[0]; i105++) {
if (trans106[0] <= trans106[1])
if (trans106[1] <= a106.length)
for (int i106 = 0; i106 < 1 && i106 < trans106[0]; i106++) {
if (trans107[0] <= trans107[1])
if (trans107[1] <= a107.length)
for (int i107 = 0; i107 < 1 && i107 < trans107[0]; i107++) {
if (trans108[1] <= a108.length)
if (trans108[0] <= trans108[1])
for (int i108 = 0; i108 < 1 && i108 < trans108[0]; i108++) {
if (trans109[0] <= trans109[1])
if (trans109[1] <= a109.length)
for (int i109 = 0; i109 < 1 && i109 < trans109[0]; i109++) {
if (trans110[0] <= trans110[1])
if (trans110[1] <= a110.length)
for (int i110 = 0; i110 < 1 && i110 < trans110[0]; i110++) {
if (trans111[0] <= trans111[1])
if (trans111[1] <= a111.length)
for (int i111 = 0; i111 < 1 && i111 < trans111[0]; i111++) {
if (trans112[0] <= trans112[1])
if (trans112[1] <= a112.length)
for (int i112 = 0; i112 < 1 && i112 < trans112[0]; i112++) {
if (trans113[0] <= trans113[1])
if (trans113[1] <= a113.length)
for (int i113 = 0; i113 < 1 && i113 < trans113[0]; i113++) {
if (trans114[0] <= trans114[1])
if (trans114[1] <= a114.length)
for (int i114 = 0; i114 < 1 && i114 < trans114[0]; i114++) {
if (trans115[1] <= a115.length)
if (trans115[0] <= trans115[1])
for (int i115 = 0; i115 < 1 && i115 < trans115[0]; i115++) {
if (trans116[0] <= trans116[1])
if (trans116[1] <= a116.length)
for (int i116 = 0; i116 < 1 && i116 < trans116[0]; i116++) {
if (trans117[1] <= a117.length)
if (trans117[0] <= trans117[1])
for (int i117 = 0; i117 < 1 && i117 < trans117[0]; i117++) {
if (trans118[1] <= a118.length)
if (trans118[0] <= trans118[1])
for (int i118 = 0; i118 < 1 && i118 < trans118[0]; i118++) {
if (trans119[1] <= a119.length)
if (trans119[0] <= trans119[1])
for (int i119 = 0; i119 < 1 && i119 < trans119[0]; i119++) {
if (trans120[1] <= a120.length)
if (trans120[0] <= trans120[1])
for (int i120 = 0; i120 < 1 && i120 < trans120[0]; i120++) {
if (trans121[0] <= trans121[1])
if (trans121[1] <= a121.length)
for (int i121 = 0; i121 < 1 && i121 < trans121[0]; i121++) {
if (trans122[1] <= a122.length)
if (trans122[0] <= trans122[1])
for (int i122 = 0; i122 < 1 && i122 < trans122[0]; i122++) {
if (trans123[0] <= trans123[1])
if (trans123[1] <= a123.length)
for (int i123 = 0; i123 < 1 && i123 < trans123[0]; i123++) {
if (trans124[1] <= a124.length)
if (trans124[0] <= trans124[1])
for (int i124 = 0; i124 < 1 && i124 < trans124[0]; i124++) {
if (trans125[0] <= trans125[1])
if (trans125[1] <= a125.length)
for (int i125 = 0; i125 < 1 && i125 < trans125[0]; i125++) {
if (trans126[1] <= a126.length)
if (trans126[0] <= trans126[1])
for (int i126 = 0; i126 < 1 && i126 < trans126[0]; i126++) {
if (trans127[0] <= trans127[1])
if (trans127[1] <= a127.length)
for (int i127 = 0; i127 < 1 && i127 < trans127[0]; i127++) {
if (trans128[1] <= a128.length)
if (trans128[0] <= trans128[1])
for (int i128 = 0; i128 < 1 && i128 < trans128[0]; i128++) {
if (trans129[1] <= a129.length)
if (trans129[0] <= trans129[1])
for (int i129 = 0; i129 < 1 && i129 < trans129[0]; i129++) {
if (trans130[0] <= trans130[1])
if (trans130[1] <= a130.length)
for (int i130 = 0; i130 < 1 && i130 < trans130[0]; i130++) {
if (trans131[1] <= a131.length)
if (trans131[0] <= trans131[1])
for (int i131 = 0; i131 < 1 && i131 < trans131[0]; i131++) {
if (trans132[1] <= a132.length)
if (trans132[0] <= trans132[1])
for (int i132 = 0; i132 < 1 && i132 < trans132[0]; i132++) {
if (trans133[0] <= trans133[1])
if (trans133[1] <= a133.length)
for (int i133 = 0; i133 < 1 && i133 < trans133[0]; i133++) {
if (trans134[0] <= trans134[1])
if (trans134[1] <= a134.length)
for (int i134 = 0; i134 < 1 && i134 < trans134[0]; i134++) {
if (trans135[1] <= a135.length)
if (trans135[0] <= trans135[1])
for (int i135 = 0; i135 < 1 && i135 < trans135[0]; i135++) {
if (trans136[1] <= a136.length)
if (trans136[0] <= trans136[1])
for (int i136 = 0; i136 < 1 && i136 < trans136[0]; i136++) {
if (trans137[1] <= a137.length)
if (trans137[0] <= trans137[1])
for (int i137 = 0; i137 < 1 && i137 < trans137[0]; i137++) {
if (trans138[1] <= a138.length)
if (trans138[0] <= trans138[1])
for (int i138 = 0; i138 < 1 && i138 < trans138[0]; i138++) {
if (trans139[0] <= trans139[1])
if (trans139[1] <= a139.length)
for (int i139 = 0; i139 < 1 && i139 < trans139[0]; i139++) {
if (trans140[0] <= trans140[1])
if (trans140[1] <= a140.length)
for (int i140 = 0; i140 < 1 && i140 < trans140[0]; i140++) {
if (trans141[1] <= a141.length)
if (trans141[0] <= trans141[1])
for (int i141 = 0; i141 < 1 && i141 < trans141[0]; i141++) {
if (trans142[1] <= a142.length)
if (trans142[0] <= trans142[1])
for (int i142 = 0; i142 < 1 && i142 < trans142[0]; i142++) {
if (trans143[1] <= a143.length)
if (trans143[0] <= trans143[1])
for (int i143 = 0; i143 < 1 && i143 < trans143[0]; i143++) {
if (trans144[0] <= trans144[1])
if (trans144[1] <= a144.length)
for (int i144 = 0; i144 < 1 && i144 < trans144[0]; i144++) {
if (trans145[1] <= a145.length)
if (trans145[0] <= trans145[1])
for (int i145 = 0; i145 < 1 && i145 < trans145[0]; i145++) {
if (trans146[0] <= trans146[1])
if (trans146[1] <= a146.length)
for (int i146 = 0; i146 < 1 && i146 < trans146[0]; i146++) {
if (trans147[0] <= trans147[1])
if (trans147[1] <= a147.length)
for (int i147 = 0; i147 < 1 && i147 < trans147[0]; i147++) {
if (trans148[1] <= a148.length)
if (trans148[0] <= trans148[1])
for (int i148 = 0; i148 < 1 && i148 < trans148[0]; i148++) {
if (trans149[1] <= a149.length)
if (trans149[0] <= trans149[1])
for (int i149 = 0; i149 < 1 && i149 < trans149[0]; i149++) {
if (trans150[1] <= a150.length)
if (trans150[0] <= trans150[1])
for (int i150 = 0; i150 < 1 && i150 < trans150[0]; i150++) {
if (trans151[1] <= a151.length)
if (trans151[0] <= trans151[1])
for (int i151 = 0; i151 < 1 && i151 < trans151[0]; i151++) {
if (trans152[1] <= a152.length)
if (trans152[0] <= trans152[1])
for (int i152 = 0; i152 < 1 && i152 < trans152[0]; i152++) {
if (trans153[0] <= trans153[1])
if (trans153[1] <= a153.length)
for (int i153 = 0; i153 < 1 && i153 < trans153[0]; i153++) {
if (trans154[0] <= trans154[1])
if (trans154[1] <= a154.length)
for (int i154 = 0; i154 < 1 && i154 < trans154[0]; i154++) {
if (trans155[1] <= a155.length)
if (trans155[0] <= trans155[1])
for (int i155 = 0; i155 < 1 && i155 < trans155[0]; i155++) {
if (trans156[1] <= a156.length)
if (trans156[0] <= trans156[1])
for (int i156 = 0; i156 < 1 && i156 < trans156[0]; i156++) {
if (trans157[1] <= a157.length)
if (trans157[0] <= trans157[1])
for (int i157 = 0; i157 < 1 && i157 < trans157[0]; i157++) {
if (trans158[1] <= a158.length)
if (trans158[0] <= trans158[1])
for (int i158 = 0; i158 < 1 && i158 < trans158[0]; i158++) {
if (trans159[1] <= a159.length)
if (trans159[0] <= trans159[1])
for (int i159 = 0; i159 < 1 && i159 < trans159[0]; i159++) {
if (trans160[1] <= a160.length)
if (trans160[0] <= trans160[1])
for (int i160 = 0; i160 < 1 && i160 < trans160[0]; i160++) {
if (trans161[0] <= trans161[1])
if (trans161[1] <= a161.length)
for (int i161 = 0; i161 < 1 && i161 < trans161[0]; i161++) {
if (trans162[1] <= a162.length)
if (trans162[0] <= trans162[1])
for (int i162 = 0; i162 < 1 && i162 < trans162[0]; i162++) {
if (trans163[1] <= a163.length)
if (trans163[0] <= trans163[1])
for (int i163 = 0; i163 < 1 && i163 < trans163[0]; i163++) {
if (trans164[1] <= a164.length)
if (trans164[0] <= trans164[1])
for (int i164 = 0; i164 < 1 && i164 < trans164[0]; i164++) {
if (trans165[1] <= a165.length)
if (trans165[0] <= trans165[1])
for (int i165 = 0; i165 < 1 && i165 < trans165[0]; i165++) {
if (trans166[1] <= a166.length)
if (trans166[0] <= trans166[1])
for (int i166 = 0; i166 < 1 && i166 < trans166[0]; i166++) {
if (trans167[1] <= a167.length)
if (trans167[0] <= trans167[1])
for (int i167 = 0; i167 < 1 && i167 < trans167[0]; i167++) {
if (trans168[1] <= a168.length)
if (trans168[0] <= trans168[1])
for (int i168 = 0; i168 < 1 && i168 < trans168[0]; i168++) {
if (trans169[0] <= trans169[1])
if (trans169[1] <= a169.length)
for (int i169 = 0; i169 < 1 && i169 < trans169[0]; i169++) {
if (trans170[1] <= a170.length)
if (trans170[0] <= trans170[1])
for (int i170 = 0; i170 < 1 && i170 < trans170[0]; i170++) {
if (trans171[0] <= trans171[1])
if (trans171[1] <= a171.length)
for (int i171 = 0; i171 < 1 && i171 < trans171[0]; i171++) {
if (trans172[1] <= a172.length)
if (trans172[0] <= trans172[1])
for (int i172 = 0; i172 < 1 && i172 < trans172[0]; i172++) {
if (trans173[0] <= trans173[1])
if (trans173[1] <= a173.length)
for (int i173 = 0; i173 < 1 && i173 < trans173[0]; i173++) {
if (trans174[1] <= a174.length)
if (trans174[0] <= trans174[1])
for (int i174 = 0; i174 < 1 && i174 < trans174[0]; i174++) {
if (trans175[0] <= trans175[1])
if (trans175[1] <= a175.length)
for (int i175 = 0; i175 < 1 && i175 < trans175[0]; i175++) {
if (trans176[1] <= a176.length)
if (trans176[0] <= trans176[1])
for (int i176 = 0; i176 < 1 && i176 < trans176[0]; i176++) {
if (trans177[0] <= trans177[1])
if (trans177[1] <= a177.length)
for (int i177 = 0; i177 < 1 && i177 < trans177[0]; i177++) {
if (trans178[0] <= trans178[1])
if (trans178[1] <= a178.length)
for (int i178 = 0; i178 < 1 && i178 < trans178[0]; i178++) {
if (trans179[1] <= a179.length)
if (trans179[0] <= trans179[1])
for (int i179 = 0; i179 < 1 && i179 < trans179[0]; i179++) {
if (trans180[1] <= a180.length)
if (trans180[0] <= trans180[1])
for (int i180 = 0; i180 < 1 && i180 < trans180[0]; i180++) {
if (trans181[0] <= trans181[1])
if (trans181[1] <= a181.length)
for (int i181 = 0; i181 < 1 && i181 < trans181[0]; i181++) {
if (trans182[0] <= trans182[1])
if (trans182[1] <= a182.length)
for (int i182 = 0; i182 < 1 && i182 < trans182[0]; i182++) {
if (trans183[0] <= trans183[1])
if (trans183[1] <= a183.length)
for (int i183 = 0; i183 < 1 && i183 < trans183[0]; i183++) {
if (trans184[1] <= a184.length)
if (trans184[0] <= trans184[1])
for (int i184 = 0; i184 < 1 && i184 < trans184[0]; i184++) {
if (trans185[0] <= trans185[1])
if (trans185[1] <= a185.length)
for (int i185 = 0; i185 < 1 && i185 < trans185[0]; i185++) {
if (trans186[1] <= a186.length)
if (trans186[0] <= trans186[1])
for (int i186 = 0; i186 < 1 && i186 < trans186[0]; i186++) {
if (trans187[0] <= trans187[1])
if (trans187[1] <= a187.length)
for (int i187 = 0; i187 < 1 && i187 < trans187[0]; i187++) {
if (trans188[0] <= trans188[1])
if (trans188[1] <= a188.length)
for (int i188 = 0; i188 < 1 && i188 < trans188[0]; i188++) {
if (trans189[1] <= a189.length)
if (trans189[0] <= trans189[1])
for (int i189 = 0; i189 < 1 && i189 < trans189[0]; i189++) {
if (trans190[1] <= a190.length)
if (trans190[0] <= trans190[1])
for (int i190 = 0; i190 < 1 && i190 < trans190[0]; i190++) {
if (trans191[0] <= trans191[1])
if (trans191[1] <= a191.length)
for (int i191 = 0; i191 < 1 && i191 < trans191[0]; i191++) {
if (trans192[0] <= trans192[1])
if (trans192[1] <= a192.length)
for (int i192 = 0; i192 < 1 && i192 < trans192[0]; i192++) {
if (trans193[0] <= trans193[1])
if (trans193[1] <= a193.length)
for (int i193 = 0; i193 < 1 && i193 < trans193[0]; i193++) {
if (trans194[1] <= a194.length)
if (trans194[0] <= trans194[1])
for (int i194 = 0; i194 < 1 && i194 < trans194[0]; i194++) {
if (trans195[0] <= trans195[1])
if (trans195[1] <= a195.length)
for (int i195 = 0; i195 < 1 && i195 < trans195[0]; i195++) {
if (trans196[1] <= a196.length)
if (trans196[0] <= trans196[1])
for (int i196 = 0; i196 < 1 && i196 < trans196[0]; i196++) {
if (trans197[0] <= trans197[1])
if (trans197[1] <= a197.length)
for (int i197 = 0; i197 < 1 && i197 < trans197[0]; i197++) {
if (trans198[1] <= a198.length)
if (trans198[0] <= trans198[1])
for (int i198 = 0; i198 < 1 && i198 < trans198[0]; i198++) {
if (trans199[0] <= trans199[1])
if (trans199[1] <= a199.length)
for (int i199 = 0; i199 < 1 && i199 < trans199[0]; i199++) {
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
if (!(trans1.length >= 1)) return -1;
if (!(trans2.length >= 1)) return -1;
if (!(trans3.length >= 1)) return -1;
if (!(trans4.length >= 1)) return -1;
if (!(trans5.length >= 1)) return -1;
if (!(trans6.length >= 1)) return -1;
if (!(trans7.length >= 1)) return -1;
if (!(trans8.length >= 1)) return -1;
if (!(trans9.length >= 1)) return -1;
if (!(trans10.length >= 1)) return -1;
if (!(trans11.length >= 1)) return -1;
if (!(trans12.length >= 1)) return -1;
if (!(trans13.length >= 1)) return -1;
if (!(trans14.length >= 1)) return -1;
if (!(trans15.length >= 1)) return -1;
if (!(trans16.length >= 1)) return -1;
if (!(trans17.length >= 1)) return -1;
if (!(trans18.length >= 1)) return -1;
if (!(trans19.length >= 1)) return -1;
if (!(trans20.length >= 1)) return -1;
if (!(trans21.length >= 1)) return -1;
if (!(trans22.length >= 1)) return -1;
if (!(trans23.length >= 1)) return -1;
if (!(trans24.length >= 1)) return -1;
if (!(trans25.length >= 1)) return -1;
if (!(trans26.length >= 1)) return -1;
if (!(trans27.length >= 1)) return -1;
if (!(trans28.length >= 1)) return -1;
if (!(trans29.length >= 1)) return -1;
if (!(trans30.length >= 1)) return -1;
if (!(trans31.length >= 1)) return -1;
if (!(trans32.length >= 1)) return -1;
if (!(trans33.length >= 1)) return -1;
if (!(trans34.length >= 1)) return -1;
if (!(trans35.length >= 1)) return -1;
if (!(trans36.length >= 1)) return -1;
if (!(trans37.length >= 1)) return -1;
if (!(trans38.length >= 1)) return -1;
if (!(trans39.length >= 1)) return -1;
if (!(trans40.length >= 1)) return -1;
if (!(trans41.length >= 1)) return -1;
if (!(trans42.length >= 1)) return -1;
if (!(trans43.length >= 1)) return -1;
if (!(trans44.length >= 1)) return -1;
if (!(trans45.length >= 1)) return -1;
if (!(trans46.length >= 1)) return -1;
if (!(trans47.length >= 1)) return -1;
if (!(trans48.length >= 1)) return -1;
if (!(trans49.length >= 1)) return -1;
if (!(trans50.length >= 1)) return -1;
if (!(trans51.length >= 1)) return -1;
if (!(trans52.length >= 1)) return -1;
if (!(trans53.length >= 1)) return -1;
if (!(trans54.length >= 1)) return -1;
if (!(trans55.length >= 1)) return -1;
if (!(trans56.length >= 1)) return -1;
if (!(trans57.length >= 1)) return -1;
if (!(trans58.length >= 1)) return -1;
if (!(trans59.length >= 1)) return -1;
if (!(trans60.length >= 1)) return -1;
if (!(trans61.length >= 1)) return -1;
if (!(trans62.length >= 1)) return -1;
if (!(trans63.length >= 1)) return -1;
if (!(trans64.length >= 1)) return -1;
if (!(trans65.length >= 1)) return -1;
if (!(trans66.length >= 1)) return -1;
if (!(trans67.length >= 1)) return -1;
if (!(trans68.length >= 1)) return -1;
if (!(trans69.length >= 1)) return -1;
if (!(trans70.length >= 1)) return -1;
if (!(trans71.length >= 1)) return -1;
if (!(trans72.length >= 1)) return -1;
if (!(trans73.length >= 1)) return -1;
if (!(trans74.length >= 1)) return -1;
if (!(trans75.length >= 1)) return -1;
if (!(trans76.length >= 1)) return -1;
if (!(trans77.length >= 1)) return -1;
if (!(trans78.length >= 1)) return -1;
if (!(trans79.length >= 1)) return -1;
if (!(trans80.length >= 1)) return -1;
if (!(trans81.length >= 1)) return -1;
if (!(trans82.length >= 1)) return -1;
if (!(trans83.length >= 1)) return -1;
if (!(trans84.length >= 1)) return -1;
if (!(trans85.length >= 1)) return -1;
if (!(trans86.length >= 1)) return -1;
if (!(trans87.length >= 1)) return -1;
if (!(trans88.length >= 1)) return -1;
if (!(trans89.length >= 1)) return -1;
if (!(trans90.length >= 1)) return -1;
if (!(trans91.length >= 1)) return -1;
if (!(trans92.length >= 1)) return -1;
if (!(trans93.length >= 1)) return -1;
if (!(trans94.length >= 1)) return -1;
if (!(trans95.length >= 1)) return -1;
if (!(trans96.length >= 1)) return -1;
if (!(trans97.length >= 1)) return -1;
if (!(trans98.length >= 1)) return -1;
if (!(trans99.length >= 1)) return -1;
if (!(trans100.length >= 1)) return -1;
if (!(trans101.length >= 1)) return -1;
if (!(trans102.length >= 1)) return -1;
if (!(trans103.length >= 1)) return -1;
if (!(trans104.length >= 1)) return -1;
if (!(trans105.length >= 1)) return -1;
if (!(trans106.length >= 1)) return -1;
if (!(trans107.length >= 1)) return -1;
if (!(trans108.length >= 1)) return -1;
if (!(trans109.length >= 1)) return -1;
if (!(trans110.length >= 1)) return -1;
if (!(trans111.length >= 1)) return -1;
if (!(trans112.length >= 1)) return -1;
if (!(trans113.length >= 1)) return -1;
if (!(trans114.length >= 1)) return -1;
if (!(trans115.length >= 1)) return -1;
if (!(trans116.length >= 1)) return -1;
if (!(trans117.length >= 1)) return -1;
if (!(trans118.length >= 1)) return -1;
if (!(trans119.length >= 1)) return -1;
if (!(trans120.length >= 1)) return -1;
if (!(trans121.length >= 1)) return -1;
if (!(trans122.length >= 1)) return -1;
if (!(trans123.length >= 1)) return -1;
if (!(trans124.length >= 1)) return -1;
if (!(trans125.length >= 1)) return -1;
if (!(trans126.length >= 1)) return -1;
if (!(trans127.length >= 1)) return -1;
if (!(trans128.length >= 1)) return -1;
if (!(trans129.length >= 1)) return -1;
if (!(trans130.length >= 1)) return -1;
if (!(trans131.length >= 1)) return -1;
if (!(trans132.length >= 1)) return -1;
if (!(trans133.length >= 1)) return -1;
if (!(trans134.length >= 1)) return -1;
if (!(trans135.length >= 1)) return -1;
if (!(trans136.length >= 1)) return -1;
if (!(trans137.length >= 1)) return -1;
if (!(trans138.length >= 1)) return -1;
if (!(trans139.length >= 1)) return -1;
if (!(trans140.length >= 1)) return -1;
if (!(trans141.length >= 1)) return -1;
if (!(trans142.length >= 1)) return -1;
if (!(trans143.length >= 1)) return -1;
if (!(trans144.length >= 1)) return -1;
if (!(trans145.length >= 1)) return -1;
if (!(trans146.length >= 1)) return -1;
if (!(trans147.length >= 1)) return -1;
if (!(trans148.length >= 1)) return -1;
if (!(trans149.length >= 1)) return -1;
if (!(trans150.length >= 1)) return -1;
if (!(trans151.length >= 1)) return -1;
if (!(trans152.length >= 1)) return -1;
if (!(trans153.length >= 1)) return -1;
if (!(trans154.length >= 1)) return -1;
if (!(trans155.length >= 1)) return -1;
if (!(trans156.length >= 1)) return -1;
if (!(trans157.length >= 1)) return -1;
if (!(trans158.length >= 1)) return -1;
if (!(trans159.length >= 1)) return -1;
if (!(trans160.length >= 1)) return -1;
if (!(trans161.length >= 1)) return -1;
if (!(trans162.length >= 1)) return -1;
if (!(trans163.length >= 1)) return -1;
if (!(trans164.length >= 1)) return -1;
if (!(trans165.length >= 1)) return -1;
if (!(trans166.length >= 1)) return -1;
if (!(trans167.length >= 1)) return -1;
if (!(trans168.length >= 1)) return -1;
if (!(trans169.length >= 1)) return -1;
if (!(trans170.length >= 1)) return -1;
if (!(trans171.length >= 1)) return -1;
if (!(trans172.length >= 1)) return -1;
if (!(trans173.length >= 1)) return -1;
if (!(trans174.length >= 1)) return -1;
if (!(trans175.length >= 1)) return -1;
if (!(trans176.length >= 1)) return -1;
if (!(trans177.length >= 1)) return -1;
if (!(trans178.length >= 1)) return -1;
if (!(trans179.length >= 1)) return -1;
if (!(trans180.length >= 1)) return -1;
if (!(trans181.length >= 1)) return -1;
if (!(trans182.length >= 1)) return -1;
if (!(trans183.length >= 1)) return -1;
if (!(trans184.length >= 1)) return -1;
if (!(trans185.length >= 1)) return -1;
if (!(trans186.length >= 1)) return -1;
if (!(trans187.length >= 1)) return -1;
if (!(trans188.length >= 1)) return -1;
if (!(trans189.length >= 1)) return -1;
if (!(trans190.length >= 1)) return -1;
if (!(trans191.length >= 1)) return -1;
if (!(trans192.length >= 1)) return -1;
if (!(trans193.length >= 1)) return -1;
if (!(trans194.length >= 1)) return -1;
if (!(trans195.length >= 1)) return -1;
if (!(trans196.length >= 1)) return -1;
if (!(trans197.length >= 1)) return -1;
if (!(trans198.length >= 1)) return -1;
if (!(trans199.length >= 1)) return -1;
if (trans0[0] <= a0.length)
for (int i0 = 0; i0 < 1 && i0 < trans0[0]; i0++) {
if (trans1[0] <= a1.length)
for (int i1 = 0; i1 < 1 && i1 < trans1[0]; i1++) {
if (trans2[0] <= a2.length)
for (int i2 = 0; i2 < 1 && i2 < trans2[0]; i2++) {
if (trans3[0] <= a3.length)
for (int i3 = 0; i3 < 1 && i3 < trans3[0]; i3++) {
if (trans4[0] <= a4.length)
for (int i4 = 0; i4 < 1 && i4 < trans4[0]; i4++) {
if (trans5[0] <= a5.length)
for (int i5 = 0; i5 < 1 && i5 < trans5[0]; i5++) {
if (trans6[0] <= a6.length)
for (int i6 = 0; i6 < 1 && i6 < trans6[0]; i6++) {
if (trans7[0] <= a7.length)
for (int i7 = 0; i7 < 1 && i7 < trans7[0]; i7++) {
if (trans8[0] <= a8.length)
for (int i8 = 0; i8 < 1 && i8 < trans8[0]; i8++) {
if (trans9[0] <= a9.length)
for (int i9 = 0; i9 < 1 && i9 < trans9[0]; i9++) {
if (trans10[0] <= a10.length)
for (int i10 = 0; i10 < 1 && i10 < trans10[0]; i10++) {
if (trans11[0] <= a11.length)
for (int i11 = 0; i11 < 1 && i11 < trans11[0]; i11++) {
if (trans12[0] <= a12.length)
for (int i12 = 0; i12 < 1 && i12 < trans12[0]; i12++) {
if (trans13[0] <= a13.length)
for (int i13 = 0; i13 < 1 && i13 < trans13[0]; i13++) {
if (trans14[0] <= a14.length)
for (int i14 = 0; i14 < 1 && i14 < trans14[0]; i14++) {
if (trans15[0] <= a15.length)
for (int i15 = 0; i15 < 1 && i15 < trans15[0]; i15++) {
if (trans16[0] <= a16.length)
for (int i16 = 0; i16 < 1 && i16 < trans16[0]; i16++) {
if (trans17[0] <= a17.length)
for (int i17 = 0; i17 < 1 && i17 < trans17[0]; i17++) {
if (trans18[0] <= a18.length)
for (int i18 = 0; i18 < 1 && i18 < trans18[0]; i18++) {
if (trans19[0] <= a19.length)
for (int i19 = 0; i19 < 1 && i19 < trans19[0]; i19++) {
if (trans20[0] <= a20.length)
for (int i20 = 0; i20 < 1 && i20 < trans20[0]; i20++) {
if (trans21[0] <= a21.length)
for (int i21 = 0; i21 < 1 && i21 < trans21[0]; i21++) {
if (trans22[0] <= a22.length)
for (int i22 = 0; i22 < 1 && i22 < trans22[0]; i22++) {
if (trans23[0] <= a23.length)
for (int i23 = 0; i23 < 1 && i23 < trans23[0]; i23++) {
if (trans24[0] <= a24.length)
for (int i24 = 0; i24 < 1 && i24 < trans24[0]; i24++) {
if (trans25[0] <= a25.length)
for (int i25 = 0; i25 < 1 && i25 < trans25[0]; i25++) {
if (trans26[0] <= a26.length)
for (int i26 = 0; i26 < 1 && i26 < trans26[0]; i26++) {
if (trans27[0] <= a27.length)
for (int i27 = 0; i27 < 1 && i27 < trans27[0]; i27++) {
if (trans28[0] <= a28.length)
for (int i28 = 0; i28 < 1 && i28 < trans28[0]; i28++) {
if (trans29[0] <= a29.length)
for (int i29 = 0; i29 < 1 && i29 < trans29[0]; i29++) {
if (trans30[0] <= a30.length)
for (int i30 = 0; i30 < 1 && i30 < trans30[0]; i30++) {
if (trans31[0] <= a31.length)
for (int i31 = 0; i31 < 1 && i31 < trans31[0]; i31++) {
if (trans32[0] <= a32.length)
for (int i32 = 0; i32 < 1 && i32 < trans32[0]; i32++) {
if (trans33[0] <= a33.length)
for (int i33 = 0; i33 < 1 && i33 < trans33[0]; i33++) {
if (trans34[0] <= a34.length)
for (int i34 = 0; i34 < 1 && i34 < trans34[0]; i34++) {
if (trans35[0] <= a35.length)
for (int i35 = 0; i35 < 1 && i35 < trans35[0]; i35++) {
if (trans36[0] <= a36.length)
for (int i36 = 0; i36 < 1 && i36 < trans36[0]; i36++) {
if (trans37[0] <= a37.length)
for (int i37 = 0; i37 < 1 && i37 < trans37[0]; i37++) {
if (trans38[0] <= a38.length)
for (int i38 = 0; i38 < 1 && i38 < trans38[0]; i38++) {
if (trans39[0] <= a39.length)
for (int i39 = 0; i39 < 1 && i39 < trans39[0]; i39++) {
if (trans40[0] <= a40.length)
for (int i40 = 0; i40 < 1 && i40 < trans40[0]; i40++) {
if (trans41[0] <= a41.length)
for (int i41 = 0; i41 < 1 && i41 < trans41[0]; i41++) {
if (trans42[0] <= a42.length)
for (int i42 = 0; i42 < 1 && i42 < trans42[0]; i42++) {
if (trans43[0] <= a43.length)
for (int i43 = 0; i43 < 1 && i43 < trans43[0]; i43++) {
if (trans44[0] <= a44.length)
for (int i44 = 0; i44 < 1 && i44 < trans44[0]; i44++) {
if (trans45[0] <= a45.length)
for (int i45 = 0; i45 < 1 && i45 < trans45[0]; i45++) {
if (trans46[0] <= a46.length)
for (int i46 = 0; i46 < 1 && i46 < trans46[0]; i46++) {
if (trans47[0] <= a47.length)
for (int i47 = 0; i47 < 1 && i47 < trans47[0]; i47++) {
if (trans48[0] <= a48.length)
for (int i48 = 0; i48 < 1 && i48 < trans48[0]; i48++) {
if (trans49[0] <= a49.length)
for (int i49 = 0; i49 < 1 && i49 < trans49[0]; i49++) {
if (trans50[0] <= a50.length)
for (int i50 = 0; i50 < 1 && i50 < trans50[0]; i50++) {
if (trans51[0] <= a51.length)
for (int i51 = 0; i51 < 1 && i51 < trans51[0]; i51++) {
if (trans52[0] <= a52.length)
for (int i52 = 0; i52 < 1 && i52 < trans52[0]; i52++) {
if (trans53[0] <= a53.length)
for (int i53 = 0; i53 < 1 && i53 < trans53[0]; i53++) {
if (trans54[0] <= a54.length)
for (int i54 = 0; i54 < 1 && i54 < trans54[0]; i54++) {
if (trans55[0] <= a55.length)
for (int i55 = 0; i55 < 1 && i55 < trans55[0]; i55++) {
if (trans56[0] <= a56.length)
for (int i56 = 0; i56 < 1 && i56 < trans56[0]; i56++) {
if (trans57[0] <= a57.length)
for (int i57 = 0; i57 < 1 && i57 < trans57[0]; i57++) {
if (trans58[0] <= a58.length)
for (int i58 = 0; i58 < 1 && i58 < trans58[0]; i58++) {
if (trans59[0] <= a59.length)
for (int i59 = 0; i59 < 1 && i59 < trans59[0]; i59++) {
if (trans60[0] <= a60.length)
for (int i60 = 0; i60 < 1 && i60 < trans60[0]; i60++) {
if (trans61[0] <= a61.length)
for (int i61 = 0; i61 < 1 && i61 < trans61[0]; i61++) {
if (trans62[0] <= a62.length)
for (int i62 = 0; i62 < 1 && i62 < trans62[0]; i62++) {
if (trans63[0] <= a63.length)
for (int i63 = 0; i63 < 1 && i63 < trans63[0]; i63++) {
if (trans64[0] <= a64.length)
for (int i64 = 0; i64 < 1 && i64 < trans64[0]; i64++) {
if (trans65[0] <= a65.length)
for (int i65 = 0; i65 < 1 && i65 < trans65[0]; i65++) {
if (trans66[0] <= a66.length)
for (int i66 = 0; i66 < 1 && i66 < trans66[0]; i66++) {
if (trans67[0] <= a67.length)
for (int i67 = 0; i67 < 1 && i67 < trans67[0]; i67++) {
if (trans68[0] <= a68.length)
for (int i68 = 0; i68 < 1 && i68 < trans68[0]; i68++) {
if (trans69[0] <= a69.length)
for (int i69 = 0; i69 < 1 && i69 < trans69[0]; i69++) {
if (trans70[0] <= a70.length)
for (int i70 = 0; i70 < 1 && i70 < trans70[0]; i70++) {
if (trans71[0] <= a71.length)
for (int i71 = 0; i71 < 1 && i71 < trans71[0]; i71++) {
if (trans72[0] <= a72.length)
for (int i72 = 0; i72 < 1 && i72 < trans72[0]; i72++) {
if (trans73[0] <= a73.length)
for (int i73 = 0; i73 < 1 && i73 < trans73[0]; i73++) {
if (trans74[0] <= a74.length)
for (int i74 = 0; i74 < 1 && i74 < trans74[0]; i74++) {
if (trans75[0] <= a75.length)
for (int i75 = 0; i75 < 1 && i75 < trans75[0]; i75++) {
if (trans76[0] <= a76.length)
for (int i76 = 0; i76 < 1 && i76 < trans76[0]; i76++) {
if (trans77[0] <= a77.length)
for (int i77 = 0; i77 < 1 && i77 < trans77[0]; i77++) {
if (trans78[0] <= a78.length)
for (int i78 = 0; i78 < 1 && i78 < trans78[0]; i78++) {
if (trans79[0] <= a79.length)
for (int i79 = 0; i79 < 1 && i79 < trans79[0]; i79++) {
if (trans80[0] <= a80.length)
for (int i80 = 0; i80 < 1 && i80 < trans80[0]; i80++) {
if (trans81[0] <= a81.length)
for (int i81 = 0; i81 < 1 && i81 < trans81[0]; i81++) {
if (trans82[0] <= a82.length)
for (int i82 = 0; i82 < 1 && i82 < trans82[0]; i82++) {
if (trans83[0] <= a83.length)
for (int i83 = 0; i83 < 1 && i83 < trans83[0]; i83++) {
if (trans84[0] <= a84.length)
for (int i84 = 0; i84 < 1 && i84 < trans84[0]; i84++) {
if (trans85[0] <= a85.length)
for (int i85 = 0; i85 < 1 && i85 < trans85[0]; i85++) {
if (trans86[0] <= a86.length)
for (int i86 = 0; i86 < 1 && i86 < trans86[0]; i86++) {
if (trans87[0] <= a87.length)
for (int i87 = 0; i87 < 1 && i87 < trans87[0]; i87++) {
if (trans88[0] <= a88.length)
for (int i88 = 0; i88 < 1 && i88 < trans88[0]; i88++) {
if (trans89[0] <= a89.length)
for (int i89 = 0; i89 < 1 && i89 < trans89[0]; i89++) {
if (trans90[0] <= a90.length)
for (int i90 = 0; i90 < 1 && i90 < trans90[0]; i90++) {
if (trans91[0] <= a91.length)
for (int i91 = 0; i91 < 1 && i91 < trans91[0]; i91++) {
if (trans92[0] <= a92.length)
for (int i92 = 0; i92 < 1 && i92 < trans92[0]; i92++) {
if (trans93[0] <= a93.length)
for (int i93 = 0; i93 < 1 && i93 < trans93[0]; i93++) {
if (trans94[0] <= a94.length)
for (int i94 = 0; i94 < 1 && i94 < trans94[0]; i94++) {
if (trans95[0] <= a95.length)
for (int i95 = 0; i95 < 1 && i95 < trans95[0]; i95++) {
if (trans96[0] <= a96.length)
for (int i96 = 0; i96 < 1 && i96 < trans96[0]; i96++) {
if (trans97[0] <= a97.length)
for (int i97 = 0; i97 < 1 && i97 < trans97[0]; i97++) {
if (trans98[0] <= a98.length)
for (int i98 = 0; i98 < 1 && i98 < trans98[0]; i98++) {
if (trans99[0] <= a99.length)
for (int i99 = 0; i99 < 1 && i99 < trans99[0]; i99++) {
if (trans100[0] <= a100.length)
for (int i100 = 0; i100 < 1 && i100 < trans100[0]; i100++) {
if (trans101[0] <= a101.length)
for (int i101 = 0; i101 < 1 && i101 < trans101[0]; i101++) {
if (trans102[0] <= a102.length)
for (int i102 = 0; i102 < 1 && i102 < trans102[0]; i102++) {
if (trans103[0] <= a103.length)
for (int i103 = 0; i103 < 1 && i103 < trans103[0]; i103++) {
if (trans104[0] <= a104.length)
for (int i104 = 0; i104 < 1 && i104 < trans104[0]; i104++) {
if (trans105[0] <= a105.length)
for (int i105 = 0; i105 < 1 && i105 < trans105[0]; i105++) {
if (trans106[0] <= a106.length)
for (int i106 = 0; i106 < 1 && i106 < trans106[0]; i106++) {
if (trans107[0] <= a107.length)
for (int i107 = 0; i107 < 1 && i107 < trans107[0]; i107++) {
if (trans108[0] <= a108.length)
for (int i108 = 0; i108 < 1 && i108 < trans108[0]; i108++) {
if (trans109[0] <= a109.length)
for (int i109 = 0; i109 < 1 && i109 < trans109[0]; i109++) {
if (trans110[0] <= a110.length)
for (int i110 = 0; i110 < 1 && i110 < trans110[0]; i110++) {
if (trans111[0] <= a111.length)
for (int i111 = 0; i111 < 1 && i111 < trans111[0]; i111++) {
if (trans112[0] <= a112.length)
for (int i112 = 0; i112 < 1 && i112 < trans112[0]; i112++) {
if (trans113[0] <= a113.length)
for (int i113 = 0; i113 < 1 && i113 < trans113[0]; i113++) {
if (trans114[0] <= a114.length)
for (int i114 = 0; i114 < 1 && i114 < trans114[0]; i114++) {
if (trans115[0] <= a115.length)
for (int i115 = 0; i115 < 1 && i115 < trans115[0]; i115++) {
if (trans116[0] <= a116.length)
for (int i116 = 0; i116 < 1 && i116 < trans116[0]; i116++) {
if (trans117[0] <= a117.length)
for (int i117 = 0; i117 < 1 && i117 < trans117[0]; i117++) {
if (trans118[0] <= a118.length)
for (int i118 = 0; i118 < 1 && i118 < trans118[0]; i118++) {
if (trans119[0] <= a119.length)
for (int i119 = 0; i119 < 1 && i119 < trans119[0]; i119++) {
if (trans120[0] <= a120.length)
for (int i120 = 0; i120 < 1 && i120 < trans120[0]; i120++) {
if (trans121[0] <= a121.length)
for (int i121 = 0; i121 < 1 && i121 < trans121[0]; i121++) {
if (trans122[0] <= a122.length)
for (int i122 = 0; i122 < 1 && i122 < trans122[0]; i122++) {
if (trans123[0] <= a123.length)
for (int i123 = 0; i123 < 1 && i123 < trans123[0]; i123++) {
if (trans124[0] <= a124.length)
for (int i124 = 0; i124 < 1 && i124 < trans124[0]; i124++) {
if (trans125[0] <= a125.length)
for (int i125 = 0; i125 < 1 && i125 < trans125[0]; i125++) {
if (trans126[0] <= a126.length)
for (int i126 = 0; i126 < 1 && i126 < trans126[0]; i126++) {
if (trans127[0] <= a127.length)
for (int i127 = 0; i127 < 1 && i127 < trans127[0]; i127++) {
if (trans128[0] <= a128.length)
for (int i128 = 0; i128 < 1 && i128 < trans128[0]; i128++) {
if (trans129[0] <= a129.length)
for (int i129 = 0; i129 < 1 && i129 < trans129[0]; i129++) {
if (trans130[0] <= a130.length)
for (int i130 = 0; i130 < 1 && i130 < trans130[0]; i130++) {
if (trans131[0] <= a131.length)
for (int i131 = 0; i131 < 1 && i131 < trans131[0]; i131++) {
if (trans132[0] <= a132.length)
for (int i132 = 0; i132 < 1 && i132 < trans132[0]; i132++) {
if (trans133[0] <= a133.length)
for (int i133 = 0; i133 < 1 && i133 < trans133[0]; i133++) {
if (trans134[0] <= a134.length)
for (int i134 = 0; i134 < 1 && i134 < trans134[0]; i134++) {
if (trans135[0] <= a135.length)
for (int i135 = 0; i135 < 1 && i135 < trans135[0]; i135++) {
if (trans136[0] <= a136.length)
for (int i136 = 0; i136 < 1 && i136 < trans136[0]; i136++) {
if (trans137[0] <= a137.length)
for (int i137 = 0; i137 < 1 && i137 < trans137[0]; i137++) {
if (trans138[0] <= a138.length)
for (int i138 = 0; i138 < 1 && i138 < trans138[0]; i138++) {
if (trans139[0] <= a139.length)
for (int i139 = 0; i139 < 1 && i139 < trans139[0]; i139++) {
if (trans140[0] <= a140.length)
for (int i140 = 0; i140 < 1 && i140 < trans140[0]; i140++) {
if (trans141[0] <= a141.length)
for (int i141 = 0; i141 < 1 && i141 < trans141[0]; i141++) {
if (trans142[0] <= a142.length)
for (int i142 = 0; i142 < 1 && i142 < trans142[0]; i142++) {
if (trans143[0] <= a143.length)
for (int i143 = 0; i143 < 1 && i143 < trans143[0]; i143++) {
if (trans144[0] <= a144.length)
for (int i144 = 0; i144 < 1 && i144 < trans144[0]; i144++) {
if (trans145[0] <= a145.length)
for (int i145 = 0; i145 < 1 && i145 < trans145[0]; i145++) {
if (trans146[0] <= a146.length)
for (int i146 = 0; i146 < 1 && i146 < trans146[0]; i146++) {
if (trans147[0] <= a147.length)
for (int i147 = 0; i147 < 1 && i147 < trans147[0]; i147++) {
if (trans148[0] <= a148.length)
for (int i148 = 0; i148 < 1 && i148 < trans148[0]; i148++) {
if (trans149[0] <= a149.length)
for (int i149 = 0; i149 < 1 && i149 < trans149[0]; i149++) {
if (trans150[0] <= a150.length)
for (int i150 = 0; i150 < 1 && i150 < trans150[0]; i150++) {
if (trans151[0] <= a151.length)
for (int i151 = 0; i151 < 1 && i151 < trans151[0]; i151++) {
if (trans152[0] <= a152.length)
for (int i152 = 0; i152 < 1 && i152 < trans152[0]; i152++) {
if (trans153[0] <= a153.length)
for (int i153 = 0; i153 < 1 && i153 < trans153[0]; i153++) {
if (trans154[0] <= a154.length)
for (int i154 = 0; i154 < 1 && i154 < trans154[0]; i154++) {
if (trans155[0] <= a155.length)
for (int i155 = 0; i155 < 1 && i155 < trans155[0]; i155++) {
if (trans156[0] <= a156.length)
for (int i156 = 0; i156 < 1 && i156 < trans156[0]; i156++) {
if (trans157[0] <= a157.length)
for (int i157 = 0; i157 < 1 && i157 < trans157[0]; i157++) {
if (trans158[0] <= a158.length)
for (int i158 = 0; i158 < 1 && i158 < trans158[0]; i158++) {
if (trans159[0] <= a159.length)
for (int i159 = 0; i159 < 1 && i159 < trans159[0]; i159++) {
if (trans160[0] <= a160.length)
for (int i160 = 0; i160 < 1 && i160 < trans160[0]; i160++) {
if (trans161[0] <= a161.length)
for (int i161 = 0; i161 < 1 && i161 < trans161[0]; i161++) {
if (trans162[0] <= a162.length)
for (int i162 = 0; i162 < 1 && i162 < trans162[0]; i162++) {
if (trans163[0] <= a163.length)
for (int i163 = 0; i163 < 1 && i163 < trans163[0]; i163++) {
if (trans164[0] <= a164.length)
for (int i164 = 0; i164 < 1 && i164 < trans164[0]; i164++) {
if (trans165[0] <= a165.length)
for (int i165 = 0; i165 < 1 && i165 < trans165[0]; i165++) {
if (trans166[0] <= a166.length)
for (int i166 = 0; i166 < 1 && i166 < trans166[0]; i166++) {
if (trans167[0] <= a167.length)
for (int i167 = 0; i167 < 1 && i167 < trans167[0]; i167++) {
if (trans168[0] <= a168.length)
for (int i168 = 0; i168 < 1 && i168 < trans168[0]; i168++) {
if (trans169[0] <= a169.length)
for (int i169 = 0; i169 < 1 && i169 < trans169[0]; i169++) {
if (trans170[0] <= a170.length)
for (int i170 = 0; i170 < 1 && i170 < trans170[0]; i170++) {
if (trans171[0] <= a171.length)
for (int i171 = 0; i171 < 1 && i171 < trans171[0]; i171++) {
if (trans172[0] <= a172.length)
for (int i172 = 0; i172 < 1 && i172 < trans172[0]; i172++) {
if (trans173[0] <= a173.length)
for (int i173 = 0; i173 < 1 && i173 < trans173[0]; i173++) {
if (trans174[0] <= a174.length)
for (int i174 = 0; i174 < 1 && i174 < trans174[0]; i174++) {
if (trans175[0] <= a175.length)
for (int i175 = 0; i175 < 1 && i175 < trans175[0]; i175++) {
if (trans176[0] <= a176.length)
for (int i176 = 0; i176 < 1 && i176 < trans176[0]; i176++) {
if (trans177[0] <= a177.length)
for (int i177 = 0; i177 < 1 && i177 < trans177[0]; i177++) {
if (trans178[0] <= a178.length)
for (int i178 = 0; i178 < 1 && i178 < trans178[0]; i178++) {
if (trans179[0] <= a179.length)
for (int i179 = 0; i179 < 1 && i179 < trans179[0]; i179++) {
if (trans180[0] <= a180.length)
for (int i180 = 0; i180 < 1 && i180 < trans180[0]; i180++) {
if (trans181[0] <= a181.length)
for (int i181 = 0; i181 < 1 && i181 < trans181[0]; i181++) {
if (trans182[0] <= a182.length)
for (int i182 = 0; i182 < 1 && i182 < trans182[0]; i182++) {
if (trans183[0] <= a183.length)
for (int i183 = 0; i183 < 1 && i183 < trans183[0]; i183++) {
if (trans184[0] <= a184.length)
for (int i184 = 0; i184 < 1 && i184 < trans184[0]; i184++) {
if (trans185[0] <= a185.length)
for (int i185 = 0; i185 < 1 && i185 < trans185[0]; i185++) {
if (trans186[0] <= a186.length)
for (int i186 = 0; i186 < 1 && i186 < trans186[0]; i186++) {
if (trans187[0] <= a187.length)
for (int i187 = 0; i187 < 1 && i187 < trans187[0]; i187++) {
if (trans188[0] <= a188.length)
for (int i188 = 0; i188 < 1 && i188 < trans188[0]; i188++) {
if (trans189[0] <= a189.length)
for (int i189 = 0; i189 < 1 && i189 < trans189[0]; i189++) {
if (trans190[0] <= a190.length)
for (int i190 = 0; i190 < 1 && i190 < trans190[0]; i190++) {
if (trans191[0] <= a191.length)
for (int i191 = 0; i191 < 1 && i191 < trans191[0]; i191++) {
if (trans192[0] <= a192.length)
for (int i192 = 0; i192 < 1 && i192 < trans192[0]; i192++) {
if (trans193[0] <= a193.length)
for (int i193 = 0; i193 < 1 && i193 < trans193[0]; i193++) {
if (trans194[0] <= a194.length)
for (int i194 = 0; i194 < 1 && i194 < trans194[0]; i194++) {
if (trans195[0] <= a195.length)
for (int i195 = 0; i195 < 1 && i195 < trans195[0]; i195++) {
if (trans196[0] <= a196.length)
for (int i196 = 0; i196 < 1 && i196 < trans196[0]; i196++) {
if (trans197[0] <= a197.length)
for (int i197 = 0; i197 < 1 && i197 < trans197[0]; i197++) {
if (trans198[0] <= a198.length)
for (int i198 = 0; i198 < 1 && i198 < trans198[0]; i198++) {
if (trans199[0] <= a199.length)
for (int i199 = 0; i199 < 1 && i199 < trans199[0]; i199++) {
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
if (!(trans1.length >= 5)) return -1;
if (!(trans2.length >= 5)) return -1;
if (!(trans3.length >= 5)) return -1;
if (!(trans4.length >= 5)) return -1;
if (!(trans5.length >= 5)) return -1;
if (!(trans6.length >= 5)) return -1;
if (!(trans7.length >= 5)) return -1;
if (!(trans8.length >= 5)) return -1;
if (!(trans9.length >= 5)) return -1;
if (!(trans10.length >= 5)) return -1;
if (!(trans11.length >= 5)) return -1;
if (!(trans12.length >= 5)) return -1;
if (!(trans13.length >= 5)) return -1;
if (!(trans14.length >= 5)) return -1;
if (!(trans15.length >= 5)) return -1;
if (!(trans16.length >= 5)) return -1;
if (!(trans17.length >= 5)) return -1;
if (!(trans18.length >= 5)) return -1;
if (!(trans19.length >= 5)) return -1;
if (!(trans20.length >= 5)) return -1;
if (!(trans21.length >= 5)) return -1;
if (!(trans22.length >= 5)) return -1;
if (!(trans23.length >= 5)) return -1;
if (!(trans24.length >= 5)) return -1;
if (!(trans25.length >= 5)) return -1;
if (!(trans26.length >= 5)) return -1;
if (!(trans27.length >= 5)) return -1;
if (!(trans28.length >= 5)) return -1;
if (!(trans29.length >= 5)) return -1;
if (!(trans30.length >= 5)) return -1;
if (!(trans31.length >= 5)) return -1;
if (!(trans32.length >= 5)) return -1;
if (!(trans33.length >= 5)) return -1;
if (!(trans34.length >= 5)) return -1;
if (!(trans35.length >= 5)) return -1;
if (!(trans36.length >= 5)) return -1;
if (!(trans37.length >= 5)) return -1;
if (!(trans38.length >= 5)) return -1;
if (!(trans39.length >= 5)) return -1;
if (!(trans40.length >= 5)) return -1;
if (!(trans41.length >= 5)) return -1;
if (!(trans42.length >= 5)) return -1;
if (!(trans43.length >= 5)) return -1;
if (!(trans44.length >= 5)) return -1;
if (!(trans45.length >= 5)) return -1;
if (!(trans46.length >= 5)) return -1;
if (!(trans47.length >= 5)) return -1;
if (!(trans48.length >= 5)) return -1;
if (!(trans49.length >= 5)) return -1;
if (!(trans50.length >= 5)) return -1;
if (!(trans51.length >= 5)) return -1;
if (!(trans52.length >= 5)) return -1;
if (!(trans53.length >= 5)) return -1;
if (!(trans54.length >= 5)) return -1;
if (!(trans55.length >= 5)) return -1;
if (!(trans56.length >= 5)) return -1;
if (!(trans57.length >= 5)) return -1;
if (!(trans58.length >= 5)) return -1;
if (!(trans59.length >= 5)) return -1;
if (!(trans60.length >= 5)) return -1;
if (!(trans61.length >= 5)) return -1;
if (!(trans62.length >= 5)) return -1;
if (!(trans63.length >= 5)) return -1;
if (!(trans64.length >= 5)) return -1;
if (!(trans65.length >= 5)) return -1;
if (!(trans66.length >= 5)) return -1;
if (!(trans67.length >= 5)) return -1;
if (!(trans68.length >= 5)) return -1;
if (!(trans69.length >= 5)) return -1;
if (!(trans70.length >= 5)) return -1;
if (!(trans71.length >= 5)) return -1;
if (!(trans72.length >= 5)) return -1;
if (!(trans73.length >= 5)) return -1;
if (!(trans74.length >= 5)) return -1;
if (!(trans75.length >= 5)) return -1;
if (!(trans76.length >= 5)) return -1;
if (!(trans77.length >= 5)) return -1;
if (!(trans78.length >= 5)) return -1;
if (!(trans79.length >= 5)) return -1;
if (!(trans80.length >= 5)) return -1;
if (!(trans81.length >= 5)) return -1;
if (!(trans82.length >= 5)) return -1;
if (!(trans83.length >= 5)) return -1;
if (!(trans84.length >= 5)) return -1;
if (!(trans85.length >= 5)) return -1;
if (!(trans86.length >= 5)) return -1;
if (!(trans87.length >= 5)) return -1;
if (!(trans88.length >= 5)) return -1;
if (!(trans89.length >= 5)) return -1;
if (!(trans90.length >= 5)) return -1;
if (!(trans91.length >= 5)) return -1;
if (!(trans92.length >= 5)) return -1;
if (!(trans93.length >= 5)) return -1;
if (!(trans94.length >= 5)) return -1;
if (!(trans95.length >= 5)) return -1;
if (!(trans96.length >= 5)) return -1;
if (!(trans97.length >= 5)) return -1;
if (!(trans98.length >= 5)) return -1;
if (!(trans99.length >= 5)) return -1;
if (!(trans100.length >= 5)) return -1;
if (!(trans101.length >= 5)) return -1;
if (!(trans102.length >= 5)) return -1;
if (!(trans103.length >= 5)) return -1;
if (!(trans104.length >= 5)) return -1;
if (!(trans105.length >= 5)) return -1;
if (!(trans106.length >= 5)) return -1;
if (!(trans107.length >= 5)) return -1;
if (!(trans108.length >= 5)) return -1;
if (!(trans109.length >= 5)) return -1;
if (!(trans110.length >= 5)) return -1;
if (!(trans111.length >= 5)) return -1;
if (!(trans112.length >= 5)) return -1;
if (!(trans113.length >= 5)) return -1;
if (!(trans114.length >= 5)) return -1;
if (!(trans115.length >= 5)) return -1;
if (!(trans116.length >= 5)) return -1;
if (!(trans117.length >= 5)) return -1;
if (!(trans118.length >= 5)) return -1;
if (!(trans119.length >= 5)) return -1;
if (!(trans120.length >= 5)) return -1;
if (!(trans121.length >= 5)) return -1;
if (!(trans122.length >= 5)) return -1;
if (!(trans123.length >= 5)) return -1;
if (!(trans124.length >= 5)) return -1;
if (!(trans125.length >= 5)) return -1;
if (!(trans126.length >= 5)) return -1;
if (!(trans127.length >= 5)) return -1;
if (!(trans128.length >= 5)) return -1;
if (!(trans129.length >= 5)) return -1;
if (!(trans130.length >= 5)) return -1;
if (!(trans131.length >= 5)) return -1;
if (!(trans132.length >= 5)) return -1;
if (!(trans133.length >= 5)) return -1;
if (!(trans134.length >= 5)) return -1;
if (!(trans135.length >= 5)) return -1;
if (!(trans136.length >= 5)) return -1;
if (!(trans137.length >= 5)) return -1;
if (!(trans138.length >= 5)) return -1;
if (!(trans139.length >= 5)) return -1;
if (!(trans140.length >= 5)) return -1;
if (!(trans141.length >= 5)) return -1;
if (!(trans142.length >= 5)) return -1;
if (!(trans143.length >= 5)) return -1;
if (!(trans144.length >= 5)) return -1;
if (!(trans145.length >= 5)) return -1;
if (!(trans146.length >= 5)) return -1;
if (!(trans147.length >= 5)) return -1;
if (!(trans148.length >= 5)) return -1;
if (!(trans149.length >= 5)) return -1;
if (!(trans150.length >= 5)) return -1;
if (!(trans151.length >= 5)) return -1;
if (!(trans152.length >= 5)) return -1;
if (!(trans153.length >= 5)) return -1;
if (!(trans154.length >= 5)) return -1;
if (!(trans155.length >= 5)) return -1;
if (!(trans156.length >= 5)) return -1;
if (!(trans157.length >= 5)) return -1;
if (!(trans158.length >= 5)) return -1;
if (!(trans159.length >= 5)) return -1;
if (!(trans160.length >= 5)) return -1;
if (!(trans161.length >= 5)) return -1;
if (!(trans162.length >= 5)) return -1;
if (!(trans163.length >= 5)) return -1;
if (!(trans164.length >= 5)) return -1;
if (!(trans165.length >= 5)) return -1;
if (!(trans166.length >= 5)) return -1;
if (!(trans167.length >= 5)) return -1;
if (!(trans168.length >= 5)) return -1;
if (!(trans169.length >= 5)) return -1;
if (!(trans170.length >= 5)) return -1;
if (!(trans171.length >= 5)) return -1;
if (!(trans172.length >= 5)) return -1;
if (!(trans173.length >= 5)) return -1;
if (!(trans174.length >= 5)) return -1;
if (!(trans175.length >= 5)) return -1;
if (!(trans176.length >= 5)) return -1;
if (!(trans177.length >= 5)) return -1;
if (!(trans178.length >= 5)) return -1;
if (!(trans179.length >= 5)) return -1;
if (!(trans180.length >= 5)) return -1;
if (!(trans181.length >= 5)) return -1;
if (!(trans182.length >= 5)) return -1;
if (!(trans183.length >= 5)) return -1;
if (!(trans184.length >= 5)) return -1;
if (!(trans185.length >= 5)) return -1;
if (!(trans186.length >= 5)) return -1;
if (!(trans187.length >= 5)) return -1;
if (!(trans188.length >= 5)) return -1;
if (!(trans189.length >= 5)) return -1;
if (!(trans190.length >= 5)) return -1;
if (!(trans191.length >= 5)) return -1;
if (!(trans192.length >= 5)) return -1;
if (!(trans193.length >= 5)) return -1;
if (!(trans194.length >= 5)) return -1;
if (!(trans195.length >= 5)) return -1;
if (!(trans196.length >= 5)) return -1;
if (!(trans197.length >= 5)) return -1;
if (!(trans198.length >= 5)) return -1;
if (!(trans199.length >= 5)) return -1;
if (trans0[1] <= trans0[2])
if (trans0[4] <= a0.length)
if (trans0[2] <= trans0[3])
if (trans0[3] <= trans0[4])
if (trans0[0] <= trans0[1])
for (int i0 = 0; i0 < 1 && i0 < trans0[0]; i0++) {
if (trans1[4] <= a1.length)
if (trans1[3] <= trans1[4])
if (trans1[2] <= trans1[3])
if (trans1[1] <= trans1[2])
if (trans1[0] <= trans1[1])
for (int i1 = 0; i1 < 1 && i1 < trans1[0]; i1++) {
if (trans2[4] <= a2.length)
if (trans2[3] <= trans2[4])
if (trans2[1] <= trans2[2])
if (trans2[2] <= trans2[3])
if (trans2[0] <= trans2[1])
for (int i2 = 0; i2 < 1 && i2 < trans2[0]; i2++) {
if (trans3[2] <= trans3[3])
if (trans3[1] <= trans3[2])
if (trans3[0] <= trans3[1])
if (trans3[4] <= a3.length)
if (trans3[3] <= trans3[4])
for (int i3 = 0; i3 < 1 && i3 < trans3[0]; i3++) {
if (trans4[3] <= trans4[4])
if (trans4[0] <= trans4[1])
if (trans4[1] <= trans4[2])
if (trans4[2] <= trans4[3])
if (trans4[4] <= a4.length)
for (int i4 = 0; i4 < 1 && i4 < trans4[0]; i4++) {
if (trans5[4] <= a5.length)
if (trans5[0] <= trans5[1])
if (trans5[2] <= trans5[3])
if (trans5[1] <= trans5[2])
if (trans5[3] <= trans5[4])
for (int i5 = 0; i5 < 1 && i5 < trans5[0]; i5++) {
if (trans6[0] <= trans6[1])
if (trans6[1] <= trans6[2])
if (trans6[3] <= trans6[4])
if (trans6[2] <= trans6[3])
if (trans6[4] <= a6.length)
for (int i6 = 0; i6 < 1 && i6 < trans6[0]; i6++) {
if (trans7[2] <= trans7[3])
if (trans7[0] <= trans7[1])
if (trans7[1] <= trans7[2])
if (trans7[4] <= a7.length)
if (trans7[3] <= trans7[4])
for (int i7 = 0; i7 < 1 && i7 < trans7[0]; i7++) {
if (trans8[2] <= trans8[3])
if (trans8[1] <= trans8[2])
if (trans8[4] <= a8.length)
if (trans8[0] <= trans8[1])
if (trans8[3] <= trans8[4])
for (int i8 = 0; i8 < 1 && i8 < trans8[0]; i8++) {
if (trans9[0] <= trans9[1])
if (trans9[1] <= trans9[2])
if (trans9[3] <= trans9[4])
if (trans9[4] <= a9.length)
if (trans9[2] <= trans9[3])
for (int i9 = 0; i9 < 1 && i9 < trans9[0]; i9++) {
if (trans10[1] <= trans10[2])
if (trans10[3] <= trans10[4])
if (trans10[2] <= trans10[3])
if (trans10[4] <= a10.length)
if (trans10[0] <= trans10[1])
for (int i10 = 0; i10 < 1 && i10 < trans10[0]; i10++) {
if (trans11[2] <= trans11[3])
if (trans11[1] <= trans11[2])
if (trans11[4] <= a11.length)
if (trans11[3] <= trans11[4])
if (trans11[0] <= trans11[1])
for (int i11 = 0; i11 < 1 && i11 < trans11[0]; i11++) {
if (trans12[2] <= trans12[3])
if (trans12[4] <= a12.length)
if (trans12[1] <= trans12[2])
if (trans12[0] <= trans12[1])
if (trans12[3] <= trans12[4])
for (int i12 = 0; i12 < 1 && i12 < trans12[0]; i12++) {
if (trans13[0] <= trans13[1])
if (trans13[1] <= trans13[2])
if (trans13[2] <= trans13[3])
if (trans13[3] <= trans13[4])
if (trans13[4] <= a13.length)
for (int i13 = 0; i13 < 1 && i13 < trans13[0]; i13++) {
if (trans14[2] <= trans14[3])
if (trans14[4] <= a14.length)
if (trans14[3] <= trans14[4])
if (trans14[0] <= trans14[1])
if (trans14[1] <= trans14[2])
for (int i14 = 0; i14 < 1 && i14 < trans14[0]; i14++) {
if (trans15[4] <= a15.length)
if (trans15[0] <= trans15[1])
if (trans15[2] <= trans15[3])
if (trans15[3] <= trans15[4])
if (trans15[1] <= trans15[2])
for (int i15 = 0; i15 < 1 && i15 < trans15[0]; i15++) {
if (trans16[0] <= trans16[1])
if (trans16[1] <= trans16[2])
if (trans16[2] <= trans16[3])
if (trans16[3] <= trans16[4])
if (trans16[4] <= a16.length)
for (int i16 = 0; i16 < 1 && i16 < trans16[0]; i16++) {
if (trans17[4] <= a17.length)
if (trans17[2] <= trans17[3])
if (trans17[1] <= trans17[2])
if (trans17[3] <= trans17[4])
if (trans17[0] <= trans17[1])
for (int i17 = 0; i17 < 1 && i17 < trans17[0]; i17++) {
if (trans18[4] <= a18.length)
if (trans18[0] <= trans18[1])
if (trans18[1] <= trans18[2])
if (trans18[2] <= trans18[3])
if (trans18[3] <= trans18[4])
for (int i18 = 0; i18 < 1 && i18 < trans18[0]; i18++) {
if (trans19[0] <= trans19[1])
if (trans19[3] <= trans19[4])
if (trans19[2] <= trans19[3])
if (trans19[4] <= a19.length)
if (trans19[1] <= trans19[2])
for (int i19 = 0; i19 < 1 && i19 < trans19[0]; i19++) {
if (trans20[3] <= trans20[4])
if (trans20[0] <= trans20[1])
if (trans20[4] <= a20.length)
if (trans20[2] <= trans20[3])
if (trans20[1] <= trans20[2])
for (int i20 = 0; i20 < 1 && i20 < trans20[0]; i20++) {
if (trans21[2] <= trans21[3])
if (trans21[3] <= trans21[4])
if (trans21[4] <= a21.length)
if (trans21[0] <= trans21[1])
if (trans21[1] <= trans21[2])
for (int i21 = 0; i21 < 1 && i21 < trans21[0]; i21++) {
if (trans22[0] <= trans22[1])
if (trans22[3] <= trans22[4])
if (trans22[4] <= a22.length)
if (trans22[2] <= trans22[3])
if (trans22[1] <= trans22[2])
for (int i22 = 0; i22 < 1 && i22 < trans22[0]; i22++) {
if (trans23[2] <= trans23[3])
if (trans23[1] <= trans23[2])
if (trans23[4] <= a23.length)
if (trans23[0] <= trans23[1])
if (trans23[3] <= trans23[4])
for (int i23 = 0; i23 < 1 && i23 < trans23[0]; i23++) {
if (trans24[0] <= trans24[1])
if (trans24[1] <= trans24[2])
if (trans24[3] <= trans24[4])
if (trans24[2] <= trans24[3])
if (trans24[4] <= a24.length)
for (int i24 = 0; i24 < 1 && i24 < trans24[0]; i24++) {
if (trans25[1] <= trans25[2])
if (trans25[2] <= trans25[3])
if (trans25[3] <= trans25[4])
if (trans25[0] <= trans25[1])
if (trans25[4] <= a25.length)
for (int i25 = 0; i25 < 1 && i25 < trans25[0]; i25++) {
if (trans26[3] <= trans26[4])
if (trans26[0] <= trans26[1])
if (trans26[4] <= a26.length)
if (trans26[2] <= trans26[3])
if (trans26[1] <= trans26[2])
for (int i26 = 0; i26 < 1 && i26 < trans26[0]; i26++) {
if (trans27[0] <= trans27[1])
if (trans27[4] <= a27.length)
if (trans27[1] <= trans27[2])
if (trans27[3] <= trans27[4])
if (trans27[2] <= trans27[3])
for (int i27 = 0; i27 < 1 && i27 < trans27[0]; i27++) {
if (trans28[3] <= trans28[4])
if (trans28[0] <= trans28[1])
if (trans28[4] <= a28.length)
if (trans28[2] <= trans28[3])
if (trans28[1] <= trans28[2])
for (int i28 = 0; i28 < 1 && i28 < trans28[0]; i28++) {
if (trans29[0] <= trans29[1])
if (trans29[4] <= a29.length)
if (trans29[3] <= trans29[4])
if (trans29[2] <= trans29[3])
if (trans29[1] <= trans29[2])
for (int i29 = 0; i29 < 1 && i29 < trans29[0]; i29++) {
if (trans30[0] <= trans30[1])
if (trans30[4] <= a30.length)
if (trans30[2] <= trans30[3])
if (trans30[1] <= trans30[2])
if (trans30[3] <= trans30[4])
for (int i30 = 0; i30 < 1 && i30 < trans30[0]; i30++) {
if (trans31[0] <= trans31[1])
if (trans31[1] <= trans31[2])
if (trans31[3] <= trans31[4])
if (trans31[4] <= a31.length)
if (trans31[2] <= trans31[3])
for (int i31 = 0; i31 < 1 && i31 < trans31[0]; i31++) {
if (trans32[4] <= a32.length)
if (trans32[2] <= trans32[3])
if (trans32[1] <= trans32[2])
if (trans32[3] <= trans32[4])
if (trans32[0] <= trans32[1])
for (int i32 = 0; i32 < 1 && i32 < trans32[0]; i32++) {
if (trans33[0] <= trans33[1])
if (trans33[1] <= trans33[2])
if (trans33[2] <= trans33[3])
if (trans33[4] <= a33.length)
if (trans33[3] <= trans33[4])
for (int i33 = 0; i33 < 1 && i33 < trans33[0]; i33++) {
if (trans34[4] <= a34.length)
if (trans34[0] <= trans34[1])
if (trans34[2] <= trans34[3])
if (trans34[3] <= trans34[4])
if (trans34[1] <= trans34[2])
for (int i34 = 0; i34 < 1 && i34 < trans34[0]; i34++) {
if (trans35[2] <= trans35[3])
if (trans35[4] <= a35.length)
if (trans35[3] <= trans35[4])
if (trans35[0] <= trans35[1])
if (trans35[1] <= trans35[2])
for (int i35 = 0; i35 < 1 && i35 < trans35[0]; i35++) {
if (trans36[4] <= a36.length)
if (trans36[0] <= trans36[1])
if (trans36[3] <= trans36[4])
if (trans36[2] <= trans36[3])
if (trans36[1] <= trans36[2])
for (int i36 = 0; i36 < 1 && i36 < trans36[0]; i36++) {
if (trans37[3] <= trans37[4])
if (trans37[1] <= trans37[2])
if (trans37[0] <= trans37[1])
if (trans37[2] <= trans37[3])
if (trans37[4] <= a37.length)
for (int i37 = 0; i37 < 1 && i37 < trans37[0]; i37++) {
if (trans38[2] <= trans38[3])
if (trans38[4] <= a38.length)
if (trans38[3] <= trans38[4])
if (trans38[1] <= trans38[2])
if (trans38[0] <= trans38[1])
for (int i38 = 0; i38 < 1 && i38 < trans38[0]; i38++) {
if (trans39[3] <= trans39[4])
if (trans39[1] <= trans39[2])
if (trans39[2] <= trans39[3])
if (trans39[0] <= trans39[1])
if (trans39[4] <= a39.length)
for (int i39 = 0; i39 < 1 && i39 < trans39[0]; i39++) {
if (trans40[4] <= a40.length)
if (trans40[0] <= trans40[1])
if (trans40[2] <= trans40[3])
if (trans40[1] <= trans40[2])
if (trans40[3] <= trans40[4])
for (int i40 = 0; i40 < 1 && i40 < trans40[0]; i40++) {
if (trans41[0] <= trans41[1])
if (trans41[3] <= trans41[4])
if (trans41[2] <= trans41[3])
if (trans41[4] <= a41.length)
if (trans41[1] <= trans41[2])
for (int i41 = 0; i41 < 1 && i41 < trans41[0]; i41++) {
if (trans42[1] <= trans42[2])
if (trans42[3] <= trans42[4])
if (trans42[0] <= trans42[1])
if (trans42[2] <= trans42[3])
if (trans42[4] <= a42.length)
for (int i42 = 0; i42 < 1 && i42 < trans42[0]; i42++) {
if (trans43[3] <= trans43[4])
if (trans43[1] <= trans43[2])
if (trans43[4] <= a43.length)
if (trans43[2] <= trans43[3])
if (trans43[0] <= trans43[1])
for (int i43 = 0; i43 < 1 && i43 < trans43[0]; i43++) {
if (trans44[3] <= trans44[4])
if (trans44[4] <= a44.length)
if (trans44[0] <= trans44[1])
if (trans44[1] <= trans44[2])
if (trans44[2] <= trans44[3])
for (int i44 = 0; i44 < 1 && i44 < trans44[0]; i44++) {
if (trans45[3] <= trans45[4])
if (trans45[2] <= trans45[3])
if (trans45[1] <= trans45[2])
if (trans45[4] <= a45.length)
if (trans45[0] <= trans45[1])
for (int i45 = 0; i45 < 1 && i45 < trans45[0]; i45++) {
if (trans46[3] <= trans46[4])
if (trans46[2] <= trans46[3])
if (trans46[0] <= trans46[1])
if (trans46[1] <= trans46[2])
if (trans46[4] <= a46.length)
for (int i46 = 0; i46 < 1 && i46 < trans46[0]; i46++) {
if (trans47[1] <= trans47[2])
if (trans47[2] <= trans47[3])
if (trans47[3] <= trans47[4])
if (trans47[0] <= trans47[1])
if (trans47[4] <= a47.length)
for (int i47 = 0; i47 < 1 && i47 < trans47[0]; i47++) {
if (trans48[1] <= trans48[2])
if (trans48[4] <= a48.length)
if (trans48[3] <= trans48[4])
if (trans48[0] <= trans48[1])
if (trans48[2] <= trans48[3])
for (int i48 = 0; i48 < 1 && i48 < trans48[0]; i48++) {
if (trans49[3] <= trans49[4])
if (trans49[2] <= trans49[3])
if (trans49[0] <= trans49[1])
if (trans49[4] <= a49.length)
if (trans49[1] <= trans49[2])
for (int i49 = 0; i49 < 1 && i49 < trans49[0]; i49++) {
if (trans50[2] <= trans50[3])
if (trans50[0] <= trans50[1])
if (trans50[4] <= a50.length)
if (trans50[1] <= trans50[2])
if (trans50[3] <= trans50[4])
for (int i50 = 0; i50 < 1 && i50 < trans50[0]; i50++) {
if (trans51[2] <= trans51[3])
if (trans51[4] <= a51.length)
if (trans51[1] <= trans51[2])
if (trans51[0] <= trans51[1])
if (trans51[3] <= trans51[4])
for (int i51 = 0; i51 < 1 && i51 < trans51[0]; i51++) {
if (trans52[1] <= trans52[2])
if (trans52[4] <= a52.length)
if (trans52[0] <= trans52[1])
if (trans52[3] <= trans52[4])
if (trans52[2] <= trans52[3])
for (int i52 = 0; i52 < 1 && i52 < trans52[0]; i52++) {
if (trans53[0] <= trans53[1])
if (trans53[1] <= trans53[2])
if (trans53[2] <= trans53[3])
if (trans53[4] <= a53.length)
if (trans53[3] <= trans53[4])
for (int i53 = 0; i53 < 1 && i53 < trans53[0]; i53++) {
if (trans54[2] <= trans54[3])
if (trans54[4] <= a54.length)
if (trans54[0] <= trans54[1])
if (trans54[3] <= trans54[4])
if (trans54[1] <= trans54[2])
for (int i54 = 0; i54 < 1 && i54 < trans54[0]; i54++) {
if (trans55[2] <= trans55[3])
if (trans55[4] <= a55.length)
if (trans55[0] <= trans55[1])
if (trans55[1] <= trans55[2])
if (trans55[3] <= trans55[4])
for (int i55 = 0; i55 < 1 && i55 < trans55[0]; i55++) {
if (trans56[1] <= trans56[2])
if (trans56[0] <= trans56[1])
if (trans56[3] <= trans56[4])
if (trans56[4] <= a56.length)
if (trans56[2] <= trans56[3])
for (int i56 = 0; i56 < 1 && i56 < trans56[0]; i56++) {
if (trans57[0] <= trans57[1])
if (trans57[4] <= a57.length)
if (trans57[2] <= trans57[3])
if (trans57[1] <= trans57[2])
if (trans57[3] <= trans57[4])
for (int i57 = 0; i57 < 1 && i57 < trans57[0]; i57++) {
if (trans58[3] <= trans58[4])
if (trans58[1] <= trans58[2])
if (trans58[4] <= a58.length)
if (trans58[2] <= trans58[3])
if (trans58[0] <= trans58[1])
for (int i58 = 0; i58 < 1 && i58 < trans58[0]; i58++) {
if (trans59[4] <= a59.length)
if (trans59[1] <= trans59[2])
if (trans59[0] <= trans59[1])
if (trans59[2] <= trans59[3])
if (trans59[3] <= trans59[4])
for (int i59 = 0; i59 < 1 && i59 < trans59[0]; i59++) {
if (trans60[4] <= a60.length)
if (trans60[1] <= trans60[2])
if (trans60[3] <= trans60[4])
if (trans60[2] <= trans60[3])
if (trans60[0] <= trans60[1])
for (int i60 = 0; i60 < 1 && i60 < trans60[0]; i60++) {
if (trans61[3] <= trans61[4])
if (trans61[2] <= trans61[3])
if (trans61[0] <= trans61[1])
if (trans61[4] <= a61.length)
if (trans61[1] <= trans61[2])
for (int i61 = 0; i61 < 1 && i61 < trans61[0]; i61++) {
if (trans62[2] <= trans62[3])
if (trans62[1] <= trans62[2])
if (trans62[3] <= trans62[4])
if (trans62[0] <= trans62[1])
if (trans62[4] <= a62.length)
for (int i62 = 0; i62 < 1 && i62 < trans62[0]; i62++) {
if (trans63[2] <= trans63[3])
if (trans63[1] <= trans63[2])
if (trans63[3] <= trans63[4])
if (trans63[4] <= a63.length)
if (trans63[0] <= trans63[1])
for (int i63 = 0; i63 < 1 && i63 < trans63[0]; i63++) {
if (trans64[4] <= a64.length)
if (trans64[0] <= trans64[1])
if (trans64[2] <= trans64[3])
if (trans64[3] <= trans64[4])
if (trans64[1] <= trans64[2])
for (int i64 = 0; i64 < 1 && i64 < trans64[0]; i64++) {
if (trans65[4] <= a65.length)
if (trans65[1] <= trans65[2])
if (trans65[0] <= trans65[1])
if (trans65[3] <= trans65[4])
if (trans65[2] <= trans65[3])
for (int i65 = 0; i65 < 1 && i65 < trans65[0]; i65++) {
if (trans66[4] <= a66.length)
if (trans66[1] <= trans66[2])
if (trans66[2] <= trans66[3])
if (trans66[0] <= trans66[1])
if (trans66[3] <= trans66[4])
for (int i66 = 0; i66 < 1 && i66 < trans66[0]; i66++) {
if (trans67[4] <= a67.length)
if (trans67[1] <= trans67[2])
if (trans67[0] <= trans67[1])
if (trans67[2] <= trans67[3])
if (trans67[3] <= trans67[4])
for (int i67 = 0; i67 < 1 && i67 < trans67[0]; i67++) {
if (trans68[1] <= trans68[2])
if (trans68[2] <= trans68[3])
if (trans68[3] <= trans68[4])
if (trans68[0] <= trans68[1])
if (trans68[4] <= a68.length)
for (int i68 = 0; i68 < 1 && i68 < trans68[0]; i68++) {
if (trans69[3] <= trans69[4])
if (trans69[2] <= trans69[3])
if (trans69[4] <= a69.length)
if (trans69[1] <= trans69[2])
if (trans69[0] <= trans69[1])
for (int i69 = 0; i69 < 1 && i69 < trans69[0]; i69++) {
if (trans70[2] <= trans70[3])
if (trans70[0] <= trans70[1])
if (trans70[4] <= a70.length)
if (trans70[3] <= trans70[4])
if (trans70[1] <= trans70[2])
for (int i70 = 0; i70 < 1 && i70 < trans70[0]; i70++) {
if (trans71[1] <= trans71[2])
if (trans71[0] <= trans71[1])
if (trans71[3] <= trans71[4])
if (trans71[4] <= a71.length)
if (trans71[2] <= trans71[3])
for (int i71 = 0; i71 < 1 && i71 < trans71[0]; i71++) {
if (trans72[2] <= trans72[3])
if (trans72[0] <= trans72[1])
if (trans72[1] <= trans72[2])
if (trans72[3] <= trans72[4])
if (trans72[4] <= a72.length)
for (int i72 = 0; i72 < 1 && i72 < trans72[0]; i72++) {
if (trans73[0] <= trans73[1])
if (trans73[1] <= trans73[2])
if (trans73[3] <= trans73[4])
if (trans73[2] <= trans73[3])
if (trans73[4] <= a73.length)
for (int i73 = 0; i73 < 1 && i73 < trans73[0]; i73++) {
if (trans74[1] <= trans74[2])
if (trans74[4] <= a74.length)
if (trans74[2] <= trans74[3])
if (trans74[0] <= trans74[1])
if (trans74[3] <= trans74[4])
for (int i74 = 0; i74 < 1 && i74 < trans74[0]; i74++) {
if (trans75[0] <= trans75[1])
if (trans75[4] <= a75.length)
if (trans75[2] <= trans75[3])
if (trans75[3] <= trans75[4])
if (trans75[1] <= trans75[2])
for (int i75 = 0; i75 < 1 && i75 < trans75[0]; i75++) {
if (trans76[3] <= trans76[4])
if (trans76[4] <= a76.length)
if (trans76[0] <= trans76[1])
if (trans76[2] <= trans76[3])
if (trans76[1] <= trans76[2])
for (int i76 = 0; i76 < 1 && i76 < trans76[0]; i76++) {
if (trans77[0] <= trans77[1])
if (trans77[2] <= trans77[3])
if (trans77[1] <= trans77[2])
if (trans77[3] <= trans77[4])
if (trans77[4] <= a77.length)
for (int i77 = 0; i77 < 1 && i77 < trans77[0]; i77++) {
if (trans78[2] <= trans78[3])
if (trans78[4] <= a78.length)
if (trans78[0] <= trans78[1])
if (trans78[3] <= trans78[4])
if (trans78[1] <= trans78[2])
for (int i78 = 0; i78 < 1 && i78 < trans78[0]; i78++) {
if (trans79[0] <= trans79[1])
if (trans79[4] <= a79.length)
if (trans79[2] <= trans79[3])
if (trans79[3] <= trans79[4])
if (trans79[1] <= trans79[2])
for (int i79 = 0; i79 < 1 && i79 < trans79[0]; i79++) {
if (trans80[1] <= trans80[2])
if (trans80[3] <= trans80[4])
if (trans80[0] <= trans80[1])
if (trans80[2] <= trans80[3])
if (trans80[4] <= a80.length)
for (int i80 = 0; i80 < 1 && i80 < trans80[0]; i80++) {
if (trans81[0] <= trans81[1])
if (trans81[2] <= trans81[3])
if (trans81[3] <= trans81[4])
if (trans81[4] <= a81.length)
if (trans81[1] <= trans81[2])
for (int i81 = 0; i81 < 1 && i81 < trans81[0]; i81++) {
if (trans82[4] <= a82.length)
if (trans82[2] <= trans82[3])
if (trans82[3] <= trans82[4])
if (trans82[0] <= trans82[1])
if (trans82[1] <= trans82[2])
for (int i82 = 0; i82 < 1 && i82 < trans82[0]; i82++) {
if (trans83[0] <= trans83[1])
if (trans83[4] <= a83.length)
if (trans83[2] <= trans83[3])
if (trans83[3] <= trans83[4])
if (trans83[1] <= trans83[2])
for (int i83 = 0; i83 < 1 && i83 < trans83[0]; i83++) {
if (trans84[2] <= trans84[3])
if (trans84[0] <= trans84[1])
if (trans84[1] <= trans84[2])
if (trans84[4] <= a84.length)
if (trans84[3] <= trans84[4])
for (int i84 = 0; i84 < 1 && i84 < trans84[0]; i84++) {
if (trans85[1] <= trans85[2])
if (trans85[2] <= trans85[3])
if (trans85[4] <= a85.length)
if (trans85[0] <= trans85[1])
if (trans85[3] <= trans85[4])
for (int i85 = 0; i85 < 1 && i85 < trans85[0]; i85++) {
if (trans86[1] <= trans86[2])
if (trans86[2] <= trans86[3])
if (trans86[3] <= trans86[4])
if (trans86[0] <= trans86[1])
if (trans86[4] <= a86.length)
for (int i86 = 0; i86 < 1 && i86 < trans86[0]; i86++) {
if (trans87[0] <= trans87[1])
if (trans87[1] <= trans87[2])
if (trans87[2] <= trans87[3])
if (trans87[4] <= a87.length)
if (trans87[3] <= trans87[4])
for (int i87 = 0; i87 < 1 && i87 < trans87[0]; i87++) {
if (trans88[0] <= trans88[1])
if (trans88[1] <= trans88[2])
if (trans88[4] <= a88.length)
if (trans88[2] <= trans88[3])
if (trans88[3] <= trans88[4])
for (int i88 = 0; i88 < 1 && i88 < trans88[0]; i88++) {
if (trans89[0] <= trans89[1])
if (trans89[3] <= trans89[4])
if (trans89[2] <= trans89[3])
if (trans89[1] <= trans89[2])
if (trans89[4] <= a89.length)
for (int i89 = 0; i89 < 1 && i89 < trans89[0]; i89++) {
if (trans90[3] <= trans90[4])
if (trans90[4] <= a90.length)
if (trans90[1] <= trans90[2])
if (trans90[0] <= trans90[1])
if (trans90[2] <= trans90[3])
for (int i90 = 0; i90 < 1 && i90 < trans90[0]; i90++) {
if (trans91[2] <= trans91[3])
if (trans91[3] <= trans91[4])
if (trans91[1] <= trans91[2])
if (trans91[4] <= a91.length)
if (trans91[0] <= trans91[1])
for (int i91 = 0; i91 < 1 && i91 < trans91[0]; i91++) {
if (trans92[1] <= trans92[2])
if (trans92[3] <= trans92[4])
if (trans92[4] <= a92.length)
if (trans92[0] <= trans92[1])
if (trans92[2] <= trans92[3])
for (int i92 = 0; i92 < 1 && i92 < trans92[0]; i92++) {
if (trans93[4] <= a93.length)
if (trans93[3] <= trans93[4])
if (trans93[2] <= trans93[3])
if (trans93[1] <= trans93[2])
if (trans93[0] <= trans93[1])
for (int i93 = 0; i93 < 1 && i93 < trans93[0]; i93++) {
if (trans94[0] <= trans94[1])
if (trans94[2] <= trans94[3])
if (trans94[3] <= trans94[4])
if (trans94[1] <= trans94[2])
if (trans94[4] <= a94.length)
for (int i94 = 0; i94 < 1 && i94 < trans94[0]; i94++) {
if (trans95[4] <= a95.length)
if (trans95[3] <= trans95[4])
if (trans95[0] <= trans95[1])
if (trans95[1] <= trans95[2])
if (trans95[2] <= trans95[3])
for (int i95 = 0; i95 < 1 && i95 < trans95[0]; i95++) {
if (trans96[1] <= trans96[2])
if (trans96[2] <= trans96[3])
if (trans96[0] <= trans96[1])
if (trans96[4] <= a96.length)
if (trans96[3] <= trans96[4])
for (int i96 = 0; i96 < 1 && i96 < trans96[0]; i96++) {
if (trans97[3] <= trans97[4])
if (trans97[0] <= trans97[1])
if (trans97[4] <= a97.length)
if (trans97[2] <= trans97[3])
if (trans97[1] <= trans97[2])
for (int i97 = 0; i97 < 1 && i97 < trans97[0]; i97++) {
if (trans98[2] <= trans98[3])
if (trans98[3] <= trans98[4])
if (trans98[0] <= trans98[1])
if (trans98[4] <= a98.length)
if (trans98[1] <= trans98[2])
for (int i98 = 0; i98 < 1 && i98 < trans98[0]; i98++) {
if (trans99[1] <= trans99[2])
if (trans99[3] <= trans99[4])
if (trans99[4] <= a99.length)
if (trans99[0] <= trans99[1])
if (trans99[2] <= trans99[3])
for (int i99 = 0; i99 < 1 && i99 < trans99[0]; i99++) {
if (trans100[3] <= trans100[4])
if (trans100[4] <= a100.length)
if (trans100[2] <= trans100[3])
if (trans100[1] <= trans100[2])
if (trans100[0] <= trans100[1])
for (int i100 = 0; i100 < 1 && i100 < trans100[0]; i100++) {
if (trans101[0] <= trans101[1])
if (trans101[1] <= trans101[2])
if (trans101[3] <= trans101[4])
if (trans101[2] <= trans101[3])
if (trans101[4] <= a101.length)
for (int i101 = 0; i101 < 1 && i101 < trans101[0]; i101++) {
if (trans102[2] <= trans102[3])
if (trans102[4] <= a102.length)
if (trans102[0] <= trans102[1])
if (trans102[3] <= trans102[4])
if (trans102[1] <= trans102[2])
for (int i102 = 0; i102 < 1 && i102 < trans102[0]; i102++) {
if (trans103[1] <= trans103[2])
if (trans103[4] <= a103.length)
if (trans103[3] <= trans103[4])
if (trans103[0] <= trans103[1])
if (trans103[2] <= trans103[3])
for (int i103 = 0; i103 < 1 && i103 < trans103[0]; i103++) {
if (trans104[0] <= trans104[1])
if (trans104[3] <= trans104[4])
if (trans104[4] <= a104.length)
if (trans104[1] <= trans104[2])
if (trans104[2] <= trans104[3])
for (int i104 = 0; i104 < 1 && i104 < trans104[0]; i104++) {
if (trans105[3] <= trans105[4])
if (trans105[0] <= trans105[1])
if (trans105[4] <= a105.length)
if (trans105[2] <= trans105[3])
if (trans105[1] <= trans105[2])
for (int i105 = 0; i105 < 1 && i105 < trans105[0]; i105++) {
if (trans106[1] <= trans106[2])
if (trans106[3] <= trans106[4])
if (trans106[0] <= trans106[1])
if (trans106[4] <= a106.length)
if (trans106[2] <= trans106[3])
for (int i106 = 0; i106 < 1 && i106 < trans106[0]; i106++) {
if (trans107[3] <= trans107[4])
if (trans107[0] <= trans107[1])
if (trans107[4] <= a107.length)
if (trans107[1] <= trans107[2])
if (trans107[2] <= trans107[3])
for (int i107 = 0; i107 < 1 && i107 < trans107[0]; i107++) {
if (trans108[2] <= trans108[3])
if (trans108[0] <= trans108[1])
if (trans108[3] <= trans108[4])
if (trans108[1] <= trans108[2])
if (trans108[4] <= a108.length)
for (int i108 = 0; i108 < 1 && i108 < trans108[0]; i108++) {
if (trans109[4] <= a109.length)
if (trans109[3] <= trans109[4])
if (trans109[0] <= trans109[1])
if (trans109[1] <= trans109[2])
if (trans109[2] <= trans109[3])
for (int i109 = 0; i109 < 1 && i109 < trans109[0]; i109++) {
if (trans110[3] <= trans110[4])
if (trans110[2] <= trans110[3])
if (trans110[0] <= trans110[1])
if (trans110[1] <= trans110[2])
if (trans110[4] <= a110.length)
for (int i110 = 0; i110 < 1 && i110 < trans110[0]; i110++) {
if (trans111[1] <= trans111[2])
if (trans111[0] <= trans111[1])
if (trans111[3] <= trans111[4])
if (trans111[2] <= trans111[3])
if (trans111[4] <= a111.length)
for (int i111 = 0; i111 < 1 && i111 < trans111[0]; i111++) {
if (trans112[4] <= a112.length)
if (trans112[0] <= trans112[1])
if (trans112[3] <= trans112[4])
if (trans112[2] <= trans112[3])
if (trans112[1] <= trans112[2])
for (int i112 = 0; i112 < 1 && i112 < trans112[0]; i112++) {
if (trans113[1] <= trans113[2])
if (trans113[3] <= trans113[4])
if (trans113[0] <= trans113[1])
if (trans113[4] <= a113.length)
if (trans113[2] <= trans113[3])
for (int i113 = 0; i113 < 1 && i113 < trans113[0]; i113++) {
if (trans114[3] <= trans114[4])
if (trans114[1] <= trans114[2])
if (trans114[2] <= trans114[3])
if (trans114[0] <= trans114[1])
if (trans114[4] <= a114.length)
for (int i114 = 0; i114 < 1 && i114 < trans114[0]; i114++) {
if (trans115[0] <= trans115[1])
if (trans115[3] <= trans115[4])
if (trans115[4] <= a115.length)
if (trans115[2] <= trans115[3])
if (trans115[1] <= trans115[2])
for (int i115 = 0; i115 < 1 && i115 < trans115[0]; i115++) {
if (trans116[2] <= trans116[3])
if (trans116[1] <= trans116[2])
if (trans116[0] <= trans116[1])
if (trans116[3] <= trans116[4])
if (trans116[4] <= a116.length)
for (int i116 = 0; i116 < 1 && i116 < trans116[0]; i116++) {
if (trans117[2] <= trans117[3])
if (trans117[0] <= trans117[1])
if (trans117[4] <= a117.length)
if (trans117[3] <= trans117[4])
if (trans117[1] <= trans117[2])
for (int i117 = 0; i117 < 1 && i117 < trans117[0]; i117++) {
if (trans118[1] <= trans118[2])
if (trans118[4] <= a118.length)
if (trans118[3] <= trans118[4])
if (trans118[0] <= trans118[1])
if (trans118[2] <= trans118[3])
for (int i118 = 0; i118 < 1 && i118 < trans118[0]; i118++) {
if (trans119[3] <= trans119[4])
if (trans119[4] <= a119.length)
if (trans119[2] <= trans119[3])
if (trans119[1] <= trans119[2])
if (trans119[0] <= trans119[1])
for (int i119 = 0; i119 < 1 && i119 < trans119[0]; i119++) {
if (trans120[1] <= trans120[2])
if (trans120[4] <= a120.length)
if (trans120[3] <= trans120[4])
if (trans120[2] <= trans120[3])
if (trans120[0] <= trans120[1])
for (int i120 = 0; i120 < 1 && i120 < trans120[0]; i120++) {
if (trans121[3] <= trans121[4])
if (trans121[1] <= trans121[2])
if (trans121[2] <= trans121[3])
if (trans121[0] <= trans121[1])
if (trans121[4] <= a121.length)
for (int i121 = 0; i121 < 1 && i121 < trans121[0]; i121++) {
if (trans122[4] <= a122.length)
if (trans122[2] <= trans122[3])
if (trans122[3] <= trans122[4])
if (trans122[1] <= trans122[2])
if (trans122[0] <= trans122[1])
for (int i122 = 0; i122 < 1 && i122 < trans122[0]; i122++) {
if (trans123[0] <= trans123[1])
if (trans123[1] <= trans123[2])
if (trans123[3] <= trans123[4])
if (trans123[4] <= a123.length)
if (trans123[2] <= trans123[3])
for (int i123 = 0; i123 < 1 && i123 < trans123[0]; i123++) {
if (trans124[1] <= trans124[2])
if (trans124[3] <= trans124[4])
if (trans124[2] <= trans124[3])
if (trans124[0] <= trans124[1])
if (trans124[4] <= a124.length)
for (int i124 = 0; i124 < 1 && i124 < trans124[0]; i124++) {
if (trans125[3] <= trans125[4])
if (trans125[4] <= a125.length)
if (trans125[1] <= trans125[2])
if (trans125[0] <= trans125[1])
if (trans125[2] <= trans125[3])
for (int i125 = 0; i125 < 1 && i125 < trans125[0]; i125++) {
if (trans126[3] <= trans126[4])
if (trans126[0] <= trans126[1])
if (trans126[2] <= trans126[3])
if (trans126[4] <= a126.length)
if (trans126[1] <= trans126[2])
for (int i126 = 0; i126 < 1 && i126 < trans126[0]; i126++) {
if (trans127[3] <= trans127[4])
if (trans127[0] <= trans127[1])
if (trans127[4] <= a127.length)
if (trans127[1] <= trans127[2])
if (trans127[2] <= trans127[3])
for (int i127 = 0; i127 < 1 && i127 < trans127[0]; i127++) {
if (trans128[3] <= trans128[4])
if (trans128[4] <= a128.length)
if (trans128[1] <= trans128[2])
if (trans128[2] <= trans128[3])
if (trans128[0] <= trans128[1])
for (int i128 = 0; i128 < 1 && i128 < trans128[0]; i128++) {
if (trans129[3] <= trans129[4])
if (trans129[0] <= trans129[1])
if (trans129[2] <= trans129[3])
if (trans129[4] <= a129.length)
if (trans129[1] <= trans129[2])
for (int i129 = 0; i129 < 1 && i129 < trans129[0]; i129++) {
if (trans130[4] <= a130.length)
if (trans130[2] <= trans130[3])
if (trans130[1] <= trans130[2])
if (trans130[3] <= trans130[4])
if (trans130[0] <= trans130[1])
for (int i130 = 0; i130 < 1 && i130 < trans130[0]; i130++) {
if (trans131[1] <= trans131[2])
if (trans131[2] <= trans131[3])
if (trans131[4] <= a131.length)
if (trans131[0] <= trans131[1])
if (trans131[3] <= trans131[4])
for (int i131 = 0; i131 < 1 && i131 < trans131[0]; i131++) {
if (trans132[3] <= trans132[4])
if (trans132[0] <= trans132[1])
if (trans132[2] <= trans132[3])
if (trans132[1] <= trans132[2])
if (trans132[4] <= a132.length)
for (int i132 = 0; i132 < 1 && i132 < trans132[0]; i132++) {
if (trans133[1] <= trans133[2])
if (trans133[2] <= trans133[3])
if (trans133[3] <= trans133[4])
if (trans133[4] <= a133.length)
if (trans133[0] <= trans133[1])
for (int i133 = 0; i133 < 1 && i133 < trans133[0]; i133++) {
if (trans134[3] <= trans134[4])
if (trans134[4] <= a134.length)
if (trans134[2] <= trans134[3])
if (trans134[0] <= trans134[1])
if (trans134[1] <= trans134[2])
for (int i134 = 0; i134 < 1 && i134 < trans134[0]; i134++) {
if (trans135[4] <= a135.length)
if (trans135[1] <= trans135[2])
if (trans135[3] <= trans135[4])
if (trans135[2] <= trans135[3])
if (trans135[0] <= trans135[1])
for (int i135 = 0; i135 < 1 && i135 < trans135[0]; i135++) {
if (trans136[3] <= trans136[4])
if (trans136[1] <= trans136[2])
if (trans136[0] <= trans136[1])
if (trans136[4] <= a136.length)
if (trans136[2] <= trans136[3])
for (int i136 = 0; i136 < 1 && i136 < trans136[0]; i136++) {
if (trans137[1] <= trans137[2])
if (trans137[3] <= trans137[4])
if (trans137[2] <= trans137[3])
if (trans137[0] <= trans137[1])
if (trans137[4] <= a137.length)
for (int i137 = 0; i137 < 1 && i137 < trans137[0]; i137++) {
if (trans138[4] <= a138.length)
if (trans138[2] <= trans138[3])
if (trans138[1] <= trans138[2])
if (trans138[0] <= trans138[1])
if (trans138[3] <= trans138[4])
for (int i138 = 0; i138 < 1 && i138 < trans138[0]; i138++) {
if (trans139[3] <= trans139[4])
if (trans139[2] <= trans139[3])
if (trans139[0] <= trans139[1])
if (trans139[4] <= a139.length)
if (trans139[1] <= trans139[2])
for (int i139 = 0; i139 < 1 && i139 < trans139[0]; i139++) {
if (trans140[2] <= trans140[3])
if (trans140[3] <= trans140[4])
if (trans140[1] <= trans140[2])
if (trans140[0] <= trans140[1])
if (trans140[4] <= a140.length)
for (int i140 = 0; i140 < 1 && i140 < trans140[0]; i140++) {
if (trans141[4] <= a141.length)
if (trans141[0] <= trans141[1])
if (trans141[1] <= trans141[2])
if (trans141[3] <= trans141[4])
if (trans141[2] <= trans141[3])
for (int i141 = 0; i141 < 1 && i141 < trans141[0]; i141++) {
if (trans142[1] <= trans142[2])
if (trans142[3] <= trans142[4])
if (trans142[0] <= trans142[1])
if (trans142[2] <= trans142[3])
if (trans142[4] <= a142.length)
for (int i142 = 0; i142 < 1 && i142 < trans142[0]; i142++) {
if (trans143[0] <= trans143[1])
if (trans143[1] <= trans143[2])
if (trans143[2] <= trans143[3])
if (trans143[3] <= trans143[4])
if (trans143[4] <= a143.length)
for (int i143 = 0; i143 < 1 && i143 < trans143[0]; i143++) {
if (trans144[3] <= trans144[4])
if (trans144[2] <= trans144[3])
if (trans144[4] <= a144.length)
if (trans144[0] <= trans144[1])
if (trans144[1] <= trans144[2])
for (int i144 = 0; i144 < 1 && i144 < trans144[0]; i144++) {
if (trans145[3] <= trans145[4])
if (trans145[1] <= trans145[2])
if (trans145[2] <= trans145[3])
if (trans145[4] <= a145.length)
if (trans145[0] <= trans145[1])
for (int i145 = 0; i145 < 1 && i145 < trans145[0]; i145++) {
if (trans146[1] <= trans146[2])
if (trans146[4] <= a146.length)
if (trans146[3] <= trans146[4])
if (trans146[2] <= trans146[3])
if (trans146[0] <= trans146[1])
for (int i146 = 0; i146 < 1 && i146 < trans146[0]; i146++) {
if (trans147[3] <= trans147[4])
if (trans147[4] <= a147.length)
if (trans147[0] <= trans147[1])
if (trans147[2] <= trans147[3])
if (trans147[1] <= trans147[2])
for (int i147 = 0; i147 < 1 && i147 < trans147[0]; i147++) {
if (trans148[1] <= trans148[2])
if (trans148[4] <= a148.length)
if (trans148[3] <= trans148[4])
if (trans148[0] <= trans148[1])
if (trans148[2] <= trans148[3])
for (int i148 = 0; i148 < 1 && i148 < trans148[0]; i148++) {
if (trans149[4] <= a149.length)
if (trans149[2] <= trans149[3])
if (trans149[1] <= trans149[2])
if (trans149[0] <= trans149[1])
if (trans149[3] <= trans149[4])
for (int i149 = 0; i149 < 1 && i149 < trans149[0]; i149++) {
if (trans150[0] <= trans150[1])
if (trans150[4] <= a150.length)
if (trans150[1] <= trans150[2])
if (trans150[2] <= trans150[3])
if (trans150[3] <= trans150[4])
for (int i150 = 0; i150 < 1 && i150 < trans150[0]; i150++) {
if (trans151[4] <= a151.length)
if (trans151[2] <= trans151[3])
if (trans151[3] <= trans151[4])
if (trans151[0] <= trans151[1])
if (trans151[1] <= trans151[2])
for (int i151 = 0; i151 < 1 && i151 < trans151[0]; i151++) {
if (trans152[4] <= a152.length)
if (trans152[2] <= trans152[3])
if (trans152[1] <= trans152[2])
if (trans152[3] <= trans152[4])
if (trans152[0] <= trans152[1])
for (int i152 = 0; i152 < 1 && i152 < trans152[0]; i152++) {
if (trans153[2] <= trans153[3])
if (trans153[3] <= trans153[4])
if (trans153[0] <= trans153[1])
if (trans153[1] <= trans153[2])
if (trans153[4] <= a153.length)
for (int i153 = 0; i153 < 1 && i153 < trans153[0]; i153++) {
if (trans154[4] <= a154.length)
if (trans154[1] <= trans154[2])
if (trans154[2] <= trans154[3])
if (trans154[0] <= trans154[1])
if (trans154[3] <= trans154[4])
for (int i154 = 0; i154 < 1 && i154 < trans154[0]; i154++) {
if (trans155[2] <= trans155[3])
if (trans155[3] <= trans155[4])
if (trans155[0] <= trans155[1])
if (trans155[1] <= trans155[2])
if (trans155[4] <= a155.length)
for (int i155 = 0; i155 < 1 && i155 < trans155[0]; i155++) {
if (trans156[3] <= trans156[4])
if (trans156[0] <= trans156[1])
if (trans156[1] <= trans156[2])
if (trans156[4] <= a156.length)
if (trans156[2] <= trans156[3])
for (int i156 = 0; i156 < 1 && i156 < trans156[0]; i156++) {
if (trans157[2] <= trans157[3])
if (trans157[4] <= a157.length)
if (trans157[0] <= trans157[1])
if (trans157[1] <= trans157[2])
if (trans157[3] <= trans157[4])
for (int i157 = 0; i157 < 1 && i157 < trans157[0]; i157++) {
if (trans158[1] <= trans158[2])
if (trans158[2] <= trans158[3])
if (trans158[0] <= trans158[1])
if (trans158[4] <= a158.length)
if (trans158[3] <= trans158[4])
for (int i158 = 0; i158 < 1 && i158 < trans158[0]; i158++) {
if (trans159[4] <= a159.length)
if (trans159[3] <= trans159[4])
if (trans159[1] <= trans159[2])
if (trans159[2] <= trans159[3])
if (trans159[0] <= trans159[1])
for (int i159 = 0; i159 < 1 && i159 < trans159[0]; i159++) {
if (trans160[3] <= trans160[4])
if (trans160[4] <= a160.length)
if (trans160[0] <= trans160[1])
if (trans160[2] <= trans160[3])
if (trans160[1] <= trans160[2])
for (int i160 = 0; i160 < 1 && i160 < trans160[0]; i160++) {
if (trans161[0] <= trans161[1])
if (trans161[3] <= trans161[4])
if (trans161[2] <= trans161[3])
if (trans161[4] <= a161.length)
if (trans161[1] <= trans161[2])
for (int i161 = 0; i161 < 1 && i161 < trans161[0]; i161++) {
if (trans162[4] <= a162.length)
if (trans162[3] <= trans162[4])
if (trans162[2] <= trans162[3])
if (trans162[1] <= trans162[2])
if (trans162[0] <= trans162[1])
for (int i162 = 0; i162 < 1 && i162 < trans162[0]; i162++) {
if (trans163[3] <= trans163[4])
if (trans163[4] <= a163.length)
if (trans163[1] <= trans163[2])
if (trans163[0] <= trans163[1])
if (trans163[2] <= trans163[3])
for (int i163 = 0; i163 < 1 && i163 < trans163[0]; i163++) {
if (trans164[3] <= trans164[4])
if (trans164[4] <= a164.length)
if (trans164[0] <= trans164[1])
if (trans164[1] <= trans164[2])
if (trans164[2] <= trans164[3])
for (int i164 = 0; i164 < 1 && i164 < trans164[0]; i164++) {
if (trans165[1] <= trans165[2])
if (trans165[4] <= a165.length)
if (trans165[0] <= trans165[1])
if (trans165[3] <= trans165[4])
if (trans165[2] <= trans165[3])
for (int i165 = 0; i165 < 1 && i165 < trans165[0]; i165++) {
if (trans166[1] <= trans166[2])
if (trans166[0] <= trans166[1])
if (trans166[4] <= a166.length)
if (trans166[3] <= trans166[4])
if (trans166[2] <= trans166[3])
for (int i166 = 0; i166 < 1 && i166 < trans166[0]; i166++) {
if (trans167[1] <= trans167[2])
if (trans167[4] <= a167.length)
if (trans167[0] <= trans167[1])
if (trans167[2] <= trans167[3])
if (trans167[3] <= trans167[4])
for (int i167 = 0; i167 < 1 && i167 < trans167[0]; i167++) {
if (trans168[1] <= trans168[2])
if (trans168[4] <= a168.length)
if (trans168[3] <= trans168[4])
if (trans168[2] <= trans168[3])
if (trans168[0] <= trans168[1])
for (int i168 = 0; i168 < 1 && i168 < trans168[0]; i168++) {
if (trans169[2] <= trans169[3])
if (trans169[3] <= trans169[4])
if (trans169[4] <= a169.length)
if (trans169[1] <= trans169[2])
if (trans169[0] <= trans169[1])
for (int i169 = 0; i169 < 1 && i169 < trans169[0]; i169++) {
if (trans170[4] <= a170.length)
if (trans170[0] <= trans170[1])
if (trans170[3] <= trans170[4])
if (trans170[1] <= trans170[2])
if (trans170[2] <= trans170[3])
for (int i170 = 0; i170 < 1 && i170 < trans170[0]; i170++) {
if (trans171[3] <= trans171[4])
if (trans171[4] <= a171.length)
if (trans171[1] <= trans171[2])
if (trans171[2] <= trans171[3])
if (trans171[0] <= trans171[1])
for (int i171 = 0; i171 < 1 && i171 < trans171[0]; i171++) {
if (trans172[1] <= trans172[2])
if (trans172[0] <= trans172[1])
if (trans172[2] <= trans172[3])
if (trans172[4] <= a172.length)
if (trans172[3] <= trans172[4])
for (int i172 = 0; i172 < 1 && i172 < trans172[0]; i172++) {
if (trans173[1] <= trans173[2])
if (trans173[4] <= a173.length)
if (trans173[3] <= trans173[4])
if (trans173[0] <= trans173[1])
if (trans173[2] <= trans173[3])
for (int i173 = 0; i173 < 1 && i173 < trans173[0]; i173++) {
if (trans174[3] <= trans174[4])
if (trans174[4] <= a174.length)
if (trans174[0] <= trans174[1])
if (trans174[2] <= trans174[3])
if (trans174[1] <= trans174[2])
for (int i174 = 0; i174 < 1 && i174 < trans174[0]; i174++) {
if (trans175[0] <= trans175[1])
if (trans175[1] <= trans175[2])
if (trans175[3] <= trans175[4])
if (trans175[4] <= a175.length)
if (trans175[2] <= trans175[3])
for (int i175 = 0; i175 < 1 && i175 < trans175[0]; i175++) {
if (trans176[4] <= a176.length)
if (trans176[0] <= trans176[1])
if (trans176[3] <= trans176[4])
if (trans176[1] <= trans176[2])
if (trans176[2] <= trans176[3])
for (int i176 = 0; i176 < 1 && i176 < trans176[0]; i176++) {
if (trans177[1] <= trans177[2])
if (trans177[4] <= a177.length)
if (trans177[2] <= trans177[3])
if (trans177[3] <= trans177[4])
if (trans177[0] <= trans177[1])
for (int i177 = 0; i177 < 1 && i177 < trans177[0]; i177++) {
if (trans178[3] <= trans178[4])
if (trans178[4] <= a178.length)
if (trans178[0] <= trans178[1])
if (trans178[2] <= trans178[3])
if (trans178[1] <= trans178[2])
for (int i178 = 0; i178 < 1 && i178 < trans178[0]; i178++) {
if (trans179[4] <= a179.length)
if (trans179[2] <= trans179[3])
if (trans179[0] <= trans179[1])
if (trans179[3] <= trans179[4])
if (trans179[1] <= trans179[2])
for (int i179 = 0; i179 < 1 && i179 < trans179[0]; i179++) {
if (trans180[2] <= trans180[3])
if (trans180[3] <= trans180[4])
if (trans180[1] <= trans180[2])
if (trans180[4] <= a180.length)
if (trans180[0] <= trans180[1])
for (int i180 = 0; i180 < 1 && i180 < trans180[0]; i180++) {
if (trans181[1] <= trans181[2])
if (trans181[4] <= a181.length)
if (trans181[2] <= trans181[3])
if (trans181[0] <= trans181[1])
if (trans181[3] <= trans181[4])
for (int i181 = 0; i181 < 1 && i181 < trans181[0]; i181++) {
if (trans182[3] <= trans182[4])
if (trans182[2] <= trans182[3])
if (trans182[1] <= trans182[2])
if (trans182[0] <= trans182[1])
if (trans182[4] <= a182.length)
for (int i182 = 0; i182 < 1 && i182 < trans182[0]; i182++) {
if (trans183[2] <= trans183[3])
if (trans183[0] <= trans183[1])
if (trans183[3] <= trans183[4])
if (trans183[4] <= a183.length)
if (trans183[1] <= trans183[2])
for (int i183 = 0; i183 < 1 && i183 < trans183[0]; i183++) {
if (trans184[1] <= trans184[2])
if (trans184[4] <= a184.length)
if (trans184[0] <= trans184[1])
if (trans184[3] <= trans184[4])
if (trans184[2] <= trans184[3])
for (int i184 = 0; i184 < 1 && i184 < trans184[0]; i184++) {
if (trans185[1] <= trans185[2])
if (trans185[3] <= trans185[4])
if (trans185[4] <= a185.length)
if (trans185[0] <= trans185[1])
if (trans185[2] <= trans185[3])
for (int i185 = 0; i185 < 1 && i185 < trans185[0]; i185++) {
if (trans186[1] <= trans186[2])
if (trans186[0] <= trans186[1])
if (trans186[2] <= trans186[3])
if (trans186[4] <= a186.length)
if (trans186[3] <= trans186[4])
for (int i186 = 0; i186 < 1 && i186 < trans186[0]; i186++) {
if (trans187[4] <= a187.length)
if (trans187[2] <= trans187[3])
if (trans187[3] <= trans187[4])
if (trans187[0] <= trans187[1])
if (trans187[1] <= trans187[2])
for (int i187 = 0; i187 < 1 && i187 < trans187[0]; i187++) {
if (trans188[1] <= trans188[2])
if (trans188[0] <= trans188[1])
if (trans188[4] <= a188.length)
if (trans188[2] <= trans188[3])
if (trans188[3] <= trans188[4])
for (int i188 = 0; i188 < 1 && i188 < trans188[0]; i188++) {
if (trans189[4] <= a189.length)
if (trans189[1] <= trans189[2])
if (trans189[3] <= trans189[4])
if (trans189[2] <= trans189[3])
if (trans189[0] <= trans189[1])
for (int i189 = 0; i189 < 1 && i189 < trans189[0]; i189++) {
if (trans190[4] <= a190.length)
if (trans190[1] <= trans190[2])
if (trans190[0] <= trans190[1])
if (trans190[3] <= trans190[4])
if (trans190[2] <= trans190[3])
for (int i190 = 0; i190 < 1 && i190 < trans190[0]; i190++) {
if (trans191[2] <= trans191[3])
if (trans191[4] <= a191.length)
if (trans191[0] <= trans191[1])
if (trans191[1] <= trans191[2])
if (trans191[3] <= trans191[4])
for (int i191 = 0; i191 < 1 && i191 < trans191[0]; i191++) {
if (trans192[0] <= trans192[1])
if (trans192[3] <= trans192[4])
if (trans192[4] <= a192.length)
if (trans192[1] <= trans192[2])
if (trans192[2] <= trans192[3])
for (int i192 = 0; i192 < 1 && i192 < trans192[0]; i192++) {
if (trans193[1] <= trans193[2])
if (trans193[3] <= trans193[4])
if (trans193[2] <= trans193[3])
if (trans193[4] <= a193.length)
if (trans193[0] <= trans193[1])
for (int i193 = 0; i193 < 1 && i193 < trans193[0]; i193++) {
if (trans194[0] <= trans194[1])
if (trans194[1] <= trans194[2])
if (trans194[2] <= trans194[3])
if (trans194[3] <= trans194[4])
if (trans194[4] <= a194.length)
for (int i194 = 0; i194 < 1 && i194 < trans194[0]; i194++) {
if (trans195[0] <= trans195[1])
if (trans195[1] <= trans195[2])
if (trans195[3] <= trans195[4])
if (trans195[4] <= a195.length)
if (trans195[2] <= trans195[3])
for (int i195 = 0; i195 < 1 && i195 < trans195[0]; i195++) {
if (trans196[0] <= trans196[1])
if (trans196[1] <= trans196[2])
if (trans196[2] <= trans196[3])
if (trans196[3] <= trans196[4])
if (trans196[4] <= a196.length)
for (int i196 = 0; i196 < 1 && i196 < trans196[0]; i196++) {
if (trans197[3] <= trans197[4])
if (trans197[2] <= trans197[3])
if (trans197[4] <= a197.length)
if (trans197[1] <= trans197[2])
if (trans197[0] <= trans197[1])
for (int i197 = 0; i197 < 1 && i197 < trans197[0]; i197++) {
if (trans198[2] <= trans198[3])
if (trans198[4] <= a198.length)
if (trans198[1] <= trans198[2])
if (trans198[3] <= trans198[4])
if (trans198[0] <= trans198[1])
for (int i198 = 0; i198 < 1 && i198 < trans198[0]; i198++) {
if (trans199[0] <= trans199[1])
if (trans199[3] <= trans199[4])
if (trans199[1] <= trans199[2])
if (trans199[4] <= a199.length)
if (trans199[2] <= trans199[3])
for (int i199 = 0; i199 < 1 && i199 < trans199[0]; i199++) {
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
if (!(trans1.length >= 10)) return -1;
if (!(trans2.length >= 10)) return -1;
if (!(trans3.length >= 10)) return -1;
if (!(trans4.length >= 10)) return -1;
if (!(trans5.length >= 10)) return -1;
if (!(trans6.length >= 10)) return -1;
if (!(trans7.length >= 10)) return -1;
if (!(trans8.length >= 10)) return -1;
if (!(trans9.length >= 10)) return -1;
if (!(trans10.length >= 10)) return -1;
if (!(trans11.length >= 10)) return -1;
if (!(trans12.length >= 10)) return -1;
if (!(trans13.length >= 10)) return -1;
if (!(trans14.length >= 10)) return -1;
if (!(trans15.length >= 10)) return -1;
if (!(trans16.length >= 10)) return -1;
if (!(trans17.length >= 10)) return -1;
if (!(trans18.length >= 10)) return -1;
if (!(trans19.length >= 10)) return -1;
if (!(trans20.length >= 10)) return -1;
if (!(trans21.length >= 10)) return -1;
if (!(trans22.length >= 10)) return -1;
if (!(trans23.length >= 10)) return -1;
if (!(trans24.length >= 10)) return -1;
if (!(trans25.length >= 10)) return -1;
if (!(trans26.length >= 10)) return -1;
if (!(trans27.length >= 10)) return -1;
if (!(trans28.length >= 10)) return -1;
if (!(trans29.length >= 10)) return -1;
if (!(trans30.length >= 10)) return -1;
if (!(trans31.length >= 10)) return -1;
if (!(trans32.length >= 10)) return -1;
if (!(trans33.length >= 10)) return -1;
if (!(trans34.length >= 10)) return -1;
if (!(trans35.length >= 10)) return -1;
if (!(trans36.length >= 10)) return -1;
if (!(trans37.length >= 10)) return -1;
if (!(trans38.length >= 10)) return -1;
if (!(trans39.length >= 10)) return -1;
if (!(trans40.length >= 10)) return -1;
if (!(trans41.length >= 10)) return -1;
if (!(trans42.length >= 10)) return -1;
if (!(trans43.length >= 10)) return -1;
if (!(trans44.length >= 10)) return -1;
if (!(trans45.length >= 10)) return -1;
if (!(trans46.length >= 10)) return -1;
if (!(trans47.length >= 10)) return -1;
if (!(trans48.length >= 10)) return -1;
if (!(trans49.length >= 10)) return -1;
if (!(trans50.length >= 10)) return -1;
if (!(trans51.length >= 10)) return -1;
if (!(trans52.length >= 10)) return -1;
if (!(trans53.length >= 10)) return -1;
if (!(trans54.length >= 10)) return -1;
if (!(trans55.length >= 10)) return -1;
if (!(trans56.length >= 10)) return -1;
if (!(trans57.length >= 10)) return -1;
if (!(trans58.length >= 10)) return -1;
if (!(trans59.length >= 10)) return -1;
if (!(trans60.length >= 10)) return -1;
if (!(trans61.length >= 10)) return -1;
if (!(trans62.length >= 10)) return -1;
if (!(trans63.length >= 10)) return -1;
if (!(trans64.length >= 10)) return -1;
if (!(trans65.length >= 10)) return -1;
if (!(trans66.length >= 10)) return -1;
if (!(trans67.length >= 10)) return -1;
if (!(trans68.length >= 10)) return -1;
if (!(trans69.length >= 10)) return -1;
if (!(trans70.length >= 10)) return -1;
if (!(trans71.length >= 10)) return -1;
if (!(trans72.length >= 10)) return -1;
if (!(trans73.length >= 10)) return -1;
if (!(trans74.length >= 10)) return -1;
if (!(trans75.length >= 10)) return -1;
if (!(trans76.length >= 10)) return -1;
if (!(trans77.length >= 10)) return -1;
if (!(trans78.length >= 10)) return -1;
if (!(trans79.length >= 10)) return -1;
if (!(trans80.length >= 10)) return -1;
if (!(trans81.length >= 10)) return -1;
if (!(trans82.length >= 10)) return -1;
if (!(trans83.length >= 10)) return -1;
if (!(trans84.length >= 10)) return -1;
if (!(trans85.length >= 10)) return -1;
if (!(trans86.length >= 10)) return -1;
if (!(trans87.length >= 10)) return -1;
if (!(trans88.length >= 10)) return -1;
if (!(trans89.length >= 10)) return -1;
if (!(trans90.length >= 10)) return -1;
if (!(trans91.length >= 10)) return -1;
if (!(trans92.length >= 10)) return -1;
if (!(trans93.length >= 10)) return -1;
if (!(trans94.length >= 10)) return -1;
if (!(trans95.length >= 10)) return -1;
if (!(trans96.length >= 10)) return -1;
if (!(trans97.length >= 10)) return -1;
if (!(trans98.length >= 10)) return -1;
if (!(trans99.length >= 10)) return -1;
if (!(trans100.length >= 10)) return -1;
if (!(trans101.length >= 10)) return -1;
if (!(trans102.length >= 10)) return -1;
if (!(trans103.length >= 10)) return -1;
if (!(trans104.length >= 10)) return -1;
if (!(trans105.length >= 10)) return -1;
if (!(trans106.length >= 10)) return -1;
if (!(trans107.length >= 10)) return -1;
if (!(trans108.length >= 10)) return -1;
if (!(trans109.length >= 10)) return -1;
if (!(trans110.length >= 10)) return -1;
if (!(trans111.length >= 10)) return -1;
if (!(trans112.length >= 10)) return -1;
if (!(trans113.length >= 10)) return -1;
if (!(trans114.length >= 10)) return -1;
if (!(trans115.length >= 10)) return -1;
if (!(trans116.length >= 10)) return -1;
if (!(trans117.length >= 10)) return -1;
if (!(trans118.length >= 10)) return -1;
if (!(trans119.length >= 10)) return -1;
if (!(trans120.length >= 10)) return -1;
if (!(trans121.length >= 10)) return -1;
if (!(trans122.length >= 10)) return -1;
if (!(trans123.length >= 10)) return -1;
if (!(trans124.length >= 10)) return -1;
if (!(trans125.length >= 10)) return -1;
if (!(trans126.length >= 10)) return -1;
if (!(trans127.length >= 10)) return -1;
if (!(trans128.length >= 10)) return -1;
if (!(trans129.length >= 10)) return -1;
if (!(trans130.length >= 10)) return -1;
if (!(trans131.length >= 10)) return -1;
if (!(trans132.length >= 10)) return -1;
if (!(trans133.length >= 10)) return -1;
if (!(trans134.length >= 10)) return -1;
if (!(trans135.length >= 10)) return -1;
if (!(trans136.length >= 10)) return -1;
if (!(trans137.length >= 10)) return -1;
if (!(trans138.length >= 10)) return -1;
if (!(trans139.length >= 10)) return -1;
if (!(trans140.length >= 10)) return -1;
if (!(trans141.length >= 10)) return -1;
if (!(trans142.length >= 10)) return -1;
if (!(trans143.length >= 10)) return -1;
if (!(trans144.length >= 10)) return -1;
if (!(trans145.length >= 10)) return -1;
if (!(trans146.length >= 10)) return -1;
if (!(trans147.length >= 10)) return -1;
if (!(trans148.length >= 10)) return -1;
if (!(trans149.length >= 10)) return -1;
if (!(trans150.length >= 10)) return -1;
if (!(trans151.length >= 10)) return -1;
if (!(trans152.length >= 10)) return -1;
if (!(trans153.length >= 10)) return -1;
if (!(trans154.length >= 10)) return -1;
if (!(trans155.length >= 10)) return -1;
if (!(trans156.length >= 10)) return -1;
if (!(trans157.length >= 10)) return -1;
if (!(trans158.length >= 10)) return -1;
if (!(trans159.length >= 10)) return -1;
if (!(trans160.length >= 10)) return -1;
if (!(trans161.length >= 10)) return -1;
if (!(trans162.length >= 10)) return -1;
if (!(trans163.length >= 10)) return -1;
if (!(trans164.length >= 10)) return -1;
if (!(trans165.length >= 10)) return -1;
if (!(trans166.length >= 10)) return -1;
if (!(trans167.length >= 10)) return -1;
if (!(trans168.length >= 10)) return -1;
if (!(trans169.length >= 10)) return -1;
if (!(trans170.length >= 10)) return -1;
if (!(trans171.length >= 10)) return -1;
if (!(trans172.length >= 10)) return -1;
if (!(trans173.length >= 10)) return -1;
if (!(trans174.length >= 10)) return -1;
if (!(trans175.length >= 10)) return -1;
if (!(trans176.length >= 10)) return -1;
if (!(trans177.length >= 10)) return -1;
if (!(trans178.length >= 10)) return -1;
if (!(trans179.length >= 10)) return -1;
if (!(trans180.length >= 10)) return -1;
if (!(trans181.length >= 10)) return -1;
if (!(trans182.length >= 10)) return -1;
if (!(trans183.length >= 10)) return -1;
if (!(trans184.length >= 10)) return -1;
if (!(trans185.length >= 10)) return -1;
if (!(trans186.length >= 10)) return -1;
if (!(trans187.length >= 10)) return -1;
if (!(trans188.length >= 10)) return -1;
if (!(trans189.length >= 10)) return -1;
if (!(trans190.length >= 10)) return -1;
if (!(trans191.length >= 10)) return -1;
if (!(trans192.length >= 10)) return -1;
if (!(trans193.length >= 10)) return -1;
if (!(trans194.length >= 10)) return -1;
if (!(trans195.length >= 10)) return -1;
if (!(trans196.length >= 10)) return -1;
if (!(trans197.length >= 10)) return -1;
if (!(trans198.length >= 10)) return -1;
if (!(trans199.length >= 10)) return -1;
if (trans0[2] <= trans0[3])
if (trans0[4] <= trans0[5])
if (trans0[5] <= trans0[6])
if (trans0[3] <= trans0[4])
if (trans0[1] <= trans0[2])
if (trans0[8] <= trans0[9])
if (trans0[6] <= trans0[7])
if (trans0[9] <= a0.length)
if (trans0[7] <= trans0[8])
if (trans0[0] <= trans0[1])
for (int i0 = 0; i0 < 1 && i0 < trans0[0]; i0++) {
if (trans1[9] <= a1.length)
if (trans1[5] <= trans1[6])
if (trans1[1] <= trans1[2])
if (trans1[4] <= trans1[5])
if (trans1[2] <= trans1[3])
if (trans1[0] <= trans1[1])
if (trans1[3] <= trans1[4])
if (trans1[8] <= trans1[9])
if (trans1[6] <= trans1[7])
if (trans1[7] <= trans1[8])
for (int i1 = 0; i1 < 1 && i1 < trans1[0]; i1++) {
if (trans2[0] <= trans2[1])
if (trans2[9] <= a2.length)
if (trans2[8] <= trans2[9])
if (trans2[2] <= trans2[3])
if (trans2[4] <= trans2[5])
if (trans2[5] <= trans2[6])
if (trans2[6] <= trans2[7])
if (trans2[1] <= trans2[2])
if (trans2[3] <= trans2[4])
if (trans2[7] <= trans2[8])
for (int i2 = 0; i2 < 1 && i2 < trans2[0]; i2++) {
if (trans3[2] <= trans3[3])
if (trans3[5] <= trans3[6])
if (trans3[4] <= trans3[5])
if (trans3[0] <= trans3[1])
if (trans3[6] <= trans3[7])
if (trans3[1] <= trans3[2])
if (trans3[3] <= trans3[4])
if (trans3[9] <= a3.length)
if (trans3[8] <= trans3[9])
if (trans3[7] <= trans3[8])
for (int i3 = 0; i3 < 1 && i3 < trans3[0]; i3++) {
if (trans4[2] <= trans4[3])
if (trans4[3] <= trans4[4])
if (trans4[8] <= trans4[9])
if (trans4[1] <= trans4[2])
if (trans4[6] <= trans4[7])
if (trans4[4] <= trans4[5])
if (trans4[0] <= trans4[1])
if (trans4[7] <= trans4[8])
if (trans4[9] <= a4.length)
if (trans4[5] <= trans4[6])
for (int i4 = 0; i4 < 1 && i4 < trans4[0]; i4++) {
if (trans5[4] <= trans5[5])
if (trans5[1] <= trans5[2])
if (trans5[2] <= trans5[3])
if (trans5[5] <= trans5[6])
if (trans5[9] <= a5.length)
if (trans5[0] <= trans5[1])
if (trans5[6] <= trans5[7])
if (trans5[8] <= trans5[9])
if (trans5[7] <= trans5[8])
if (trans5[3] <= trans5[4])
for (int i5 = 0; i5 < 1 && i5 < trans5[0]; i5++) {
if (trans6[9] <= a6.length)
if (trans6[0] <= trans6[1])
if (trans6[8] <= trans6[9])
if (trans6[5] <= trans6[6])
if (trans6[6] <= trans6[7])
if (trans6[3] <= trans6[4])
if (trans6[7] <= trans6[8])
if (trans6[1] <= trans6[2])
if (trans6[2] <= trans6[3])
if (trans6[4] <= trans6[5])
for (int i6 = 0; i6 < 1 && i6 < trans6[0]; i6++) {
if (trans7[7] <= trans7[8])
if (trans7[5] <= trans7[6])
if (trans7[1] <= trans7[2])
if (trans7[3] <= trans7[4])
if (trans7[0] <= trans7[1])
if (trans7[2] <= trans7[3])
if (trans7[4] <= trans7[5])
if (trans7[6] <= trans7[7])
if (trans7[8] <= trans7[9])
if (trans7[9] <= a7.length)
for (int i7 = 0; i7 < 1 && i7 < trans7[0]; i7++) {
if (trans8[2] <= trans8[3])
if (trans8[9] <= a8.length)
if (trans8[0] <= trans8[1])
if (trans8[3] <= trans8[4])
if (trans8[8] <= trans8[9])
if (trans8[6] <= trans8[7])
if (trans8[1] <= trans8[2])
if (trans8[4] <= trans8[5])
if (trans8[5] <= trans8[6])
if (trans8[7] <= trans8[8])
for (int i8 = 0; i8 < 1 && i8 < trans8[0]; i8++) {
if (trans9[9] <= a9.length)
if (trans9[5] <= trans9[6])
if (trans9[7] <= trans9[8])
if (trans9[1] <= trans9[2])
if (trans9[6] <= trans9[7])
if (trans9[2] <= trans9[3])
if (trans9[0] <= trans9[1])
if (trans9[8] <= trans9[9])
if (trans9[3] <= trans9[4])
if (trans9[4] <= trans9[5])
for (int i9 = 0; i9 < 1 && i9 < trans9[0]; i9++) {
if (trans10[0] <= trans10[1])
if (trans10[9] <= a10.length)
if (trans10[5] <= trans10[6])
if (trans10[2] <= trans10[3])
if (trans10[4] <= trans10[5])
if (trans10[3] <= trans10[4])
if (trans10[8] <= trans10[9])
if (trans10[1] <= trans10[2])
if (trans10[7] <= trans10[8])
if (trans10[6] <= trans10[7])
for (int i10 = 0; i10 < 1 && i10 < trans10[0]; i10++) {
if (trans11[4] <= trans11[5])
if (trans11[5] <= trans11[6])
if (trans11[8] <= trans11[9])
if (trans11[3] <= trans11[4])
if (trans11[7] <= trans11[8])
if (trans11[6] <= trans11[7])
if (trans11[1] <= trans11[2])
if (trans11[2] <= trans11[3])
if (trans11[0] <= trans11[1])
if (trans11[9] <= a11.length)
for (int i11 = 0; i11 < 1 && i11 < trans11[0]; i11++) {
if (trans12[3] <= trans12[4])
if (trans12[0] <= trans12[1])
if (trans12[4] <= trans12[5])
if (trans12[8] <= trans12[9])
if (trans12[5] <= trans12[6])
if (trans12[2] <= trans12[3])
if (trans12[1] <= trans12[2])
if (trans12[9] <= a12.length)
if (trans12[7] <= trans12[8])
if (trans12[6] <= trans12[7])
for (int i12 = 0; i12 < 1 && i12 < trans12[0]; i12++) {
if (trans13[0] <= trans13[1])
if (trans13[3] <= trans13[4])
if (trans13[5] <= trans13[6])
if (trans13[2] <= trans13[3])
if (trans13[8] <= trans13[9])
if (trans13[1] <= trans13[2])
if (trans13[9] <= a13.length)
if (trans13[7] <= trans13[8])
if (trans13[6] <= trans13[7])
if (trans13[4] <= trans13[5])
for (int i13 = 0; i13 < 1 && i13 < trans13[0]; i13++) {
if (trans14[8] <= trans14[9])
if (trans14[1] <= trans14[2])
if (trans14[2] <= trans14[3])
if (trans14[4] <= trans14[5])
if (trans14[5] <= trans14[6])
if (trans14[6] <= trans14[7])
if (trans14[3] <= trans14[4])
if (trans14[9] <= a14.length)
if (trans14[0] <= trans14[1])
if (trans14[7] <= trans14[8])
for (int i14 = 0; i14 < 1 && i14 < trans14[0]; i14++) {
if (trans15[5] <= trans15[6])
if (trans15[9] <= a15.length)
if (trans15[2] <= trans15[3])
if (trans15[8] <= trans15[9])
if (trans15[0] <= trans15[1])
if (trans15[4] <= trans15[5])
if (trans15[7] <= trans15[8])
if (trans15[1] <= trans15[2])
if (trans15[6] <= trans15[7])
if (trans15[3] <= trans15[4])
for (int i15 = 0; i15 < 1 && i15 < trans15[0]; i15++) {
if (trans16[6] <= trans16[7])
if (trans16[7] <= trans16[8])
if (trans16[0] <= trans16[1])
if (trans16[8] <= trans16[9])
if (trans16[1] <= trans16[2])
if (trans16[2] <= trans16[3])
if (trans16[4] <= trans16[5])
if (trans16[9] <= a16.length)
if (trans16[5] <= trans16[6])
if (trans16[3] <= trans16[4])
for (int i16 = 0; i16 < 1 && i16 < trans16[0]; i16++) {
if (trans17[2] <= trans17[3])
if (trans17[7] <= trans17[8])
if (trans17[1] <= trans17[2])
if (trans17[3] <= trans17[4])
if (trans17[9] <= a17.length)
if (trans17[5] <= trans17[6])
if (trans17[6] <= trans17[7])
if (trans17[8] <= trans17[9])
if (trans17[0] <= trans17[1])
if (trans17[4] <= trans17[5])
for (int i17 = 0; i17 < 1 && i17 < trans17[0]; i17++) {
if (trans18[6] <= trans18[7])
if (trans18[4] <= trans18[5])
if (trans18[0] <= trans18[1])
if (trans18[7] <= trans18[8])
if (trans18[8] <= trans18[9])
if (trans18[5] <= trans18[6])
if (trans18[1] <= trans18[2])
if (trans18[2] <= trans18[3])
if (trans18[3] <= trans18[4])
if (trans18[9] <= a18.length)
for (int i18 = 0; i18 < 1 && i18 < trans18[0]; i18++) {
if (trans19[6] <= trans19[7])
if (trans19[8] <= trans19[9])
if (trans19[7] <= trans19[8])
if (trans19[1] <= trans19[2])
if (trans19[2] <= trans19[3])
if (trans19[5] <= trans19[6])
if (trans19[3] <= trans19[4])
if (trans19[9] <= a19.length)
if (trans19[4] <= trans19[5])
if (trans19[0] <= trans19[1])
for (int i19 = 0; i19 < 1 && i19 < trans19[0]; i19++) {
if (trans20[1] <= trans20[2])
if (trans20[7] <= trans20[8])
if (trans20[6] <= trans20[7])
if (trans20[2] <= trans20[3])
if (trans20[4] <= trans20[5])
if (trans20[5] <= trans20[6])
if (trans20[3] <= trans20[4])
if (trans20[9] <= a20.length)
if (trans20[8] <= trans20[9])
if (trans20[0] <= trans20[1])
for (int i20 = 0; i20 < 1 && i20 < trans20[0]; i20++) {
if (trans21[5] <= trans21[6])
if (trans21[7] <= trans21[8])
if (trans21[8] <= trans21[9])
if (trans21[9] <= a21.length)
if (trans21[6] <= trans21[7])
if (trans21[4] <= trans21[5])
if (trans21[1] <= trans21[2])
if (trans21[0] <= trans21[1])
if (trans21[3] <= trans21[4])
if (trans21[2] <= trans21[3])
for (int i21 = 0; i21 < 1 && i21 < trans21[0]; i21++) {
if (trans22[7] <= trans22[8])
if (trans22[4] <= trans22[5])
if (trans22[0] <= trans22[1])
if (trans22[8] <= trans22[9])
if (trans22[5] <= trans22[6])
if (trans22[6] <= trans22[7])
if (trans22[1] <= trans22[2])
if (trans22[2] <= trans22[3])
if (trans22[9] <= a22.length)
if (trans22[3] <= trans22[4])
for (int i22 = 0; i22 < 1 && i22 < trans22[0]; i22++) {
if (trans23[5] <= trans23[6])
if (trans23[4] <= trans23[5])
if (trans23[8] <= trans23[9])
if (trans23[2] <= trans23[3])
if (trans23[7] <= trans23[8])
if (trans23[3] <= trans23[4])
if (trans23[0] <= trans23[1])
if (trans23[6] <= trans23[7])
if (trans23[1] <= trans23[2])
if (trans23[9] <= a23.length)
for (int i23 = 0; i23 < 1 && i23 < trans23[0]; i23++) {
if (trans24[9] <= a24.length)
if (trans24[1] <= trans24[2])
if (trans24[0] <= trans24[1])
if (trans24[2] <= trans24[3])
if (trans24[4] <= trans24[5])
if (trans24[5] <= trans24[6])
if (trans24[6] <= trans24[7])
if (trans24[8] <= trans24[9])
if (trans24[7] <= trans24[8])
if (trans24[3] <= trans24[4])
for (int i24 = 0; i24 < 1 && i24 < trans24[0]; i24++) {
if (trans25[3] <= trans25[4])
if (trans25[0] <= trans25[1])
if (trans25[8] <= trans25[9])
if (trans25[4] <= trans25[5])
if (trans25[2] <= trans25[3])
if (trans25[7] <= trans25[8])
if (trans25[9] <= a25.length)
if (trans25[6] <= trans25[7])
if (trans25[5] <= trans25[6])
if (trans25[1] <= trans25[2])
for (int i25 = 0; i25 < 1 && i25 < trans25[0]; i25++) {
if (trans26[8] <= trans26[9])
if (trans26[1] <= trans26[2])
if (trans26[7] <= trans26[8])
if (trans26[2] <= trans26[3])
if (trans26[4] <= trans26[5])
if (trans26[0] <= trans26[1])
if (trans26[9] <= a26.length)
if (trans26[5] <= trans26[6])
if (trans26[3] <= trans26[4])
if (trans26[6] <= trans26[7])
for (int i26 = 0; i26 < 1 && i26 < trans26[0]; i26++) {
if (trans27[1] <= trans27[2])
if (trans27[4] <= trans27[5])
if (trans27[8] <= trans27[9])
if (trans27[9] <= a27.length)
if (trans27[2] <= trans27[3])
if (trans27[0] <= trans27[1])
if (trans27[7] <= trans27[8])
if (trans27[3] <= trans27[4])
if (trans27[5] <= trans27[6])
if (trans27[6] <= trans27[7])
for (int i27 = 0; i27 < 1 && i27 < trans27[0]; i27++) {
if (trans28[6] <= trans28[7])
if (trans28[5] <= trans28[6])
if (trans28[3] <= trans28[4])
if (trans28[2] <= trans28[3])
if (trans28[1] <= trans28[2])
if (trans28[7] <= trans28[8])
if (trans28[4] <= trans28[5])
if (trans28[9] <= a28.length)
if (trans28[8] <= trans28[9])
if (trans28[0] <= trans28[1])
for (int i28 = 0; i28 < 1 && i28 < trans28[0]; i28++) {
if (trans29[4] <= trans29[5])
if (trans29[2] <= trans29[3])
if (trans29[7] <= trans29[8])
if (trans29[9] <= a29.length)
if (trans29[8] <= trans29[9])
if (trans29[1] <= trans29[2])
if (trans29[5] <= trans29[6])
if (trans29[6] <= trans29[7])
if (trans29[3] <= trans29[4])
if (trans29[0] <= trans29[1])
for (int i29 = 0; i29 < 1 && i29 < trans29[0]; i29++) {
if (trans30[2] <= trans30[3])
if (trans30[7] <= trans30[8])
if (trans30[9] <= a30.length)
if (trans30[5] <= trans30[6])
if (trans30[3] <= trans30[4])
if (trans30[8] <= trans30[9])
if (trans30[0] <= trans30[1])
if (trans30[6] <= trans30[7])
if (trans30[4] <= trans30[5])
if (trans30[1] <= trans30[2])
for (int i30 = 0; i30 < 1 && i30 < trans30[0]; i30++) {
if (trans31[3] <= trans31[4])
if (trans31[2] <= trans31[3])
if (trans31[9] <= a31.length)
if (trans31[5] <= trans31[6])
if (trans31[7] <= trans31[8])
if (trans31[8] <= trans31[9])
if (trans31[6] <= trans31[7])
if (trans31[0] <= trans31[1])
if (trans31[1] <= trans31[2])
if (trans31[4] <= trans31[5])
for (int i31 = 0; i31 < 1 && i31 < trans31[0]; i31++) {
if (trans32[0] <= trans32[1])
if (trans32[4] <= trans32[5])
if (trans32[9] <= a32.length)
if (trans32[5] <= trans32[6])
if (trans32[1] <= trans32[2])
if (trans32[2] <= trans32[3])
if (trans32[6] <= trans32[7])
if (trans32[7] <= trans32[8])
if (trans32[8] <= trans32[9])
if (trans32[3] <= trans32[4])
for (int i32 = 0; i32 < 1 && i32 < trans32[0]; i32++) {
if (trans33[0] <= trans33[1])
if (trans33[8] <= trans33[9])
if (trans33[9] <= a33.length)
if (trans33[2] <= trans33[3])
if (trans33[5] <= trans33[6])
if (trans33[7] <= trans33[8])
if (trans33[1] <= trans33[2])
if (trans33[4] <= trans33[5])
if (trans33[6] <= trans33[7])
if (trans33[3] <= trans33[4])
for (int i33 = 0; i33 < 1 && i33 < trans33[0]; i33++) {
if (trans34[4] <= trans34[5])
if (trans34[5] <= trans34[6])
if (trans34[9] <= a34.length)
if (trans34[2] <= trans34[3])
if (trans34[3] <= trans34[4])
if (trans34[1] <= trans34[2])
if (trans34[6] <= trans34[7])
if (trans34[8] <= trans34[9])
if (trans34[0] <= trans34[1])
if (trans34[7] <= trans34[8])
for (int i34 = 0; i34 < 1 && i34 < trans34[0]; i34++) {
if (trans35[5] <= trans35[6])
if (trans35[4] <= trans35[5])
if (trans35[0] <= trans35[1])
if (trans35[3] <= trans35[4])
if (trans35[1] <= trans35[2])
if (trans35[6] <= trans35[7])
if (trans35[9] <= a35.length)
if (trans35[8] <= trans35[9])
if (trans35[7] <= trans35[8])
if (trans35[2] <= trans35[3])
for (int i35 = 0; i35 < 1 && i35 < trans35[0]; i35++) {
if (trans36[1] <= trans36[2])
if (trans36[5] <= trans36[6])
if (trans36[9] <= a36.length)
if (trans36[0] <= trans36[1])
if (trans36[2] <= trans36[3])
if (trans36[8] <= trans36[9])
if (trans36[6] <= trans36[7])
if (trans36[4] <= trans36[5])
if (trans36[7] <= trans36[8])
if (trans36[3] <= trans36[4])
for (int i36 = 0; i36 < 1 && i36 < trans36[0]; i36++) {
if (trans37[9] <= a37.length)
if (trans37[2] <= trans37[3])
if (trans37[5] <= trans37[6])
if (trans37[8] <= trans37[9])
if (trans37[0] <= trans37[1])
if (trans37[4] <= trans37[5])
if (trans37[1] <= trans37[2])
if (trans37[6] <= trans37[7])
if (trans37[7] <= trans37[8])
if (trans37[3] <= trans37[4])
for (int i37 = 0; i37 < 1 && i37 < trans37[0]; i37++) {
if (trans38[2] <= trans38[3])
if (trans38[1] <= trans38[2])
if (trans38[0] <= trans38[1])
if (trans38[4] <= trans38[5])
if (trans38[8] <= trans38[9])
if (trans38[3] <= trans38[4])
if (trans38[5] <= trans38[6])
if (trans38[6] <= trans38[7])
if (trans38[7] <= trans38[8])
if (trans38[9] <= a38.length)
for (int i38 = 0; i38 < 1 && i38 < trans38[0]; i38++) {
if (trans39[3] <= trans39[4])
if (trans39[6] <= trans39[7])
if (trans39[8] <= trans39[9])
if (trans39[9] <= a39.length)
if (trans39[7] <= trans39[8])
if (trans39[5] <= trans39[6])
if (trans39[4] <= trans39[5])
if (trans39[0] <= trans39[1])
if (trans39[2] <= trans39[3])
if (trans39[1] <= trans39[2])
for (int i39 = 0; i39 < 1 && i39 < trans39[0]; i39++) {
if (trans40[1] <= trans40[2])
if (trans40[0] <= trans40[1])
if (trans40[8] <= trans40[9])
if (trans40[4] <= trans40[5])
if (trans40[2] <= trans40[3])
if (trans40[5] <= trans40[6])
if (trans40[3] <= trans40[4])
if (trans40[7] <= trans40[8])
if (trans40[9] <= a40.length)
if (trans40[6] <= trans40[7])
for (int i40 = 0; i40 < 1 && i40 < trans40[0]; i40++) {
if (trans41[1] <= trans41[2])
if (trans41[3] <= trans41[4])
if (trans41[7] <= trans41[8])
if (trans41[9] <= a41.length)
if (trans41[2] <= trans41[3])
if (trans41[0] <= trans41[1])
if (trans41[6] <= trans41[7])
if (trans41[5] <= trans41[6])
if (trans41[4] <= trans41[5])
if (trans41[8] <= trans41[9])
for (int i41 = 0; i41 < 1 && i41 < trans41[0]; i41++) {
if (trans42[2] <= trans42[3])
if (trans42[8] <= trans42[9])
if (trans42[3] <= trans42[4])
if (trans42[4] <= trans42[5])
if (trans42[9] <= a42.length)
if (trans42[7] <= trans42[8])
if (trans42[0] <= trans42[1])
if (trans42[5] <= trans42[6])
if (trans42[1] <= trans42[2])
if (trans42[6] <= trans42[7])
for (int i42 = 0; i42 < 1 && i42 < trans42[0]; i42++) {
if (trans43[7] <= trans43[8])
if (trans43[6] <= trans43[7])
if (trans43[0] <= trans43[1])
if (trans43[1] <= trans43[2])
if (trans43[9] <= a43.length)
if (trans43[3] <= trans43[4])
if (trans43[5] <= trans43[6])
if (trans43[4] <= trans43[5])
if (trans43[2] <= trans43[3])
if (trans43[8] <= trans43[9])
for (int i43 = 0; i43 < 1 && i43 < trans43[0]; i43++) {
if (trans44[5] <= trans44[6])
if (trans44[4] <= trans44[5])
if (trans44[7] <= trans44[8])
if (trans44[3] <= trans44[4])
if (trans44[2] <= trans44[3])
if (trans44[8] <= trans44[9])
if (trans44[1] <= trans44[2])
if (trans44[0] <= trans44[1])
if (trans44[9] <= a44.length)
if (trans44[6] <= trans44[7])
for (int i44 = 0; i44 < 1 && i44 < trans44[0]; i44++) {
if (trans45[1] <= trans45[2])
if (trans45[3] <= trans45[4])
if (trans45[6] <= trans45[7])
if (trans45[0] <= trans45[1])
if (trans45[5] <= trans45[6])
if (trans45[7] <= trans45[8])
if (trans45[8] <= trans45[9])
if (trans45[4] <= trans45[5])
if (trans45[9] <= a45.length)
if (trans45[2] <= trans45[3])
for (int i45 = 0; i45 < 1 && i45 < trans45[0]; i45++) {
if (trans46[5] <= trans46[6])
if (trans46[7] <= trans46[8])
if (trans46[0] <= trans46[1])
if (trans46[8] <= trans46[9])
if (trans46[6] <= trans46[7])
if (trans46[2] <= trans46[3])
if (trans46[4] <= trans46[5])
if (trans46[9] <= a46.length)
if (trans46[3] <= trans46[4])
if (trans46[1] <= trans46[2])
for (int i46 = 0; i46 < 1 && i46 < trans46[0]; i46++) {
if (trans47[3] <= trans47[4])
if (trans47[7] <= trans47[8])
if (trans47[5] <= trans47[6])
if (trans47[2] <= trans47[3])
if (trans47[9] <= a47.length)
if (trans47[8] <= trans47[9])
if (trans47[0] <= trans47[1])
if (trans47[4] <= trans47[5])
if (trans47[6] <= trans47[7])
if (trans47[1] <= trans47[2])
for (int i47 = 0; i47 < 1 && i47 < trans47[0]; i47++) {
if (trans48[1] <= trans48[2])
if (trans48[9] <= a48.length)
if (trans48[6] <= trans48[7])
if (trans48[7] <= trans48[8])
if (trans48[2] <= trans48[3])
if (trans48[0] <= trans48[1])
if (trans48[8] <= trans48[9])
if (trans48[4] <= trans48[5])
if (trans48[5] <= trans48[6])
if (trans48[3] <= trans48[4])
for (int i48 = 0; i48 < 1 && i48 < trans48[0]; i48++) {
if (trans49[2] <= trans49[3])
if (trans49[9] <= a49.length)
if (trans49[7] <= trans49[8])
if (trans49[1] <= trans49[2])
if (trans49[6] <= trans49[7])
if (trans49[0] <= trans49[1])
if (trans49[4] <= trans49[5])
if (trans49[3] <= trans49[4])
if (trans49[8] <= trans49[9])
if (trans49[5] <= trans49[6])
for (int i49 = 0; i49 < 1 && i49 < trans49[0]; i49++) {
if (trans50[6] <= trans50[7])
if (trans50[2] <= trans50[3])
if (trans50[0] <= trans50[1])
if (trans50[1] <= trans50[2])
if (trans50[9] <= a50.length)
if (trans50[5] <= trans50[6])
if (trans50[7] <= trans50[8])
if (trans50[8] <= trans50[9])
if (trans50[3] <= trans50[4])
if (trans50[4] <= trans50[5])
for (int i50 = 0; i50 < 1 && i50 < trans50[0]; i50++) {
if (trans51[3] <= trans51[4])
if (trans51[8] <= trans51[9])
if (trans51[6] <= trans51[7])
if (trans51[7] <= trans51[8])
if (trans51[2] <= trans51[3])
if (trans51[4] <= trans51[5])
if (trans51[1] <= trans51[2])
if (trans51[0] <= trans51[1])
if (trans51[5] <= trans51[6])
if (trans51[9] <= a51.length)
for (int i51 = 0; i51 < 1 && i51 < trans51[0]; i51++) {
if (trans52[7] <= trans52[8])
if (trans52[9] <= a52.length)
if (trans52[6] <= trans52[7])
if (trans52[5] <= trans52[6])
if (trans52[1] <= trans52[2])
if (trans52[8] <= trans52[9])
if (trans52[4] <= trans52[5])
if (trans52[0] <= trans52[1])
if (trans52[2] <= trans52[3])
if (trans52[3] <= trans52[4])
for (int i52 = 0; i52 < 1 && i52 < trans52[0]; i52++) {
if (trans53[5] <= trans53[6])
if (trans53[2] <= trans53[3])
if (trans53[4] <= trans53[5])
if (trans53[1] <= trans53[2])
if (trans53[3] <= trans53[4])
if (trans53[0] <= trans53[1])
if (trans53[6] <= trans53[7])
if (trans53[7] <= trans53[8])
if (trans53[9] <= a53.length)
if (trans53[8] <= trans53[9])
for (int i53 = 0; i53 < 1 && i53 < trans53[0]; i53++) {
if (trans54[9] <= a54.length)
if (trans54[3] <= trans54[4])
if (trans54[2] <= trans54[3])
if (trans54[8] <= trans54[9])
if (trans54[6] <= trans54[7])
if (trans54[4] <= trans54[5])
if (trans54[7] <= trans54[8])
if (trans54[0] <= trans54[1])
if (trans54[5] <= trans54[6])
if (trans54[1] <= trans54[2])
for (int i54 = 0; i54 < 1 && i54 < trans54[0]; i54++) {
if (trans55[3] <= trans55[4])
if (trans55[9] <= a55.length)
if (trans55[6] <= trans55[7])
if (trans55[5] <= trans55[6])
if (trans55[7] <= trans55[8])
if (trans55[4] <= trans55[5])
if (trans55[2] <= trans55[3])
if (trans55[0] <= trans55[1])
if (trans55[1] <= trans55[2])
if (trans55[8] <= trans55[9])
for (int i55 = 0; i55 < 1 && i55 < trans55[0]; i55++) {
if (trans56[9] <= a56.length)
if (trans56[1] <= trans56[2])
if (trans56[6] <= trans56[7])
if (trans56[5] <= trans56[6])
if (trans56[7] <= trans56[8])
if (trans56[8] <= trans56[9])
if (trans56[3] <= trans56[4])
if (trans56[4] <= trans56[5])
if (trans56[2] <= trans56[3])
if (trans56[0] <= trans56[1])
for (int i56 = 0; i56 < 1 && i56 < trans56[0]; i56++) {
if (trans57[1] <= trans57[2])
if (trans57[5] <= trans57[6])
if (trans57[4] <= trans57[5])
if (trans57[6] <= trans57[7])
if (trans57[3] <= trans57[4])
if (trans57[7] <= trans57[8])
if (trans57[2] <= trans57[3])
if (trans57[9] <= a57.length)
if (trans57[0] <= trans57[1])
if (trans57[8] <= trans57[9])
for (int i57 = 0; i57 < 1 && i57 < trans57[0]; i57++) {
if (trans58[8] <= trans58[9])
if (trans58[2] <= trans58[3])
if (trans58[7] <= trans58[8])
if (trans58[0] <= trans58[1])
if (trans58[6] <= trans58[7])
if (trans58[4] <= trans58[5])
if (trans58[1] <= trans58[2])
if (trans58[5] <= trans58[6])
if (trans58[9] <= a58.length)
if (trans58[3] <= trans58[4])
for (int i58 = 0; i58 < 1 && i58 < trans58[0]; i58++) {
if (trans59[6] <= trans59[7])
if (trans59[9] <= a59.length)
if (trans59[5] <= trans59[6])
if (trans59[7] <= trans59[8])
if (trans59[0] <= trans59[1])
if (trans59[1] <= trans59[2])
if (trans59[4] <= trans59[5])
if (trans59[8] <= trans59[9])
if (trans59[3] <= trans59[4])
if (trans59[2] <= trans59[3])
for (int i59 = 0; i59 < 1 && i59 < trans59[0]; i59++) {
if (trans60[7] <= trans60[8])
if (trans60[2] <= trans60[3])
if (trans60[9] <= a60.length)
if (trans60[5] <= trans60[6])
if (trans60[8] <= trans60[9])
if (trans60[4] <= trans60[5])
if (trans60[0] <= trans60[1])
if (trans60[3] <= trans60[4])
if (trans60[1] <= trans60[2])
if (trans60[6] <= trans60[7])
for (int i60 = 0; i60 < 1 && i60 < trans60[0]; i60++) {
if (trans61[3] <= trans61[4])
if (trans61[4] <= trans61[5])
if (trans61[6] <= trans61[7])
if (trans61[5] <= trans61[6])
if (trans61[9] <= a61.length)
if (trans61[0] <= trans61[1])
if (trans61[7] <= trans61[8])
if (trans61[1] <= trans61[2])
if (trans61[8] <= trans61[9])
if (trans61[2] <= trans61[3])
for (int i61 = 0; i61 < 1 && i61 < trans61[0]; i61++) {
if (trans62[6] <= trans62[7])
if (trans62[1] <= trans62[2])
if (trans62[2] <= trans62[3])
if (trans62[9] <= a62.length)
if (trans62[7] <= trans62[8])
if (trans62[8] <= trans62[9])
if (trans62[3] <= trans62[4])
if (trans62[0] <= trans62[1])
if (trans62[4] <= trans62[5])
if (trans62[5] <= trans62[6])
for (int i62 = 0; i62 < 1 && i62 < trans62[0]; i62++) {
if (trans63[4] <= trans63[5])
if (trans63[3] <= trans63[4])
if (trans63[2] <= trans63[3])
if (trans63[0] <= trans63[1])
if (trans63[8] <= trans63[9])
if (trans63[9] <= a63.length)
if (trans63[5] <= trans63[6])
if (trans63[6] <= trans63[7])
if (trans63[7] <= trans63[8])
if (trans63[1] <= trans63[2])
for (int i63 = 0; i63 < 1 && i63 < trans63[0]; i63++) {
if (trans64[4] <= trans64[5])
if (trans64[6] <= trans64[7])
if (trans64[1] <= trans64[2])
if (trans64[3] <= trans64[4])
if (trans64[2] <= trans64[3])
if (trans64[7] <= trans64[8])
if (trans64[9] <= a64.length)
if (trans64[5] <= trans64[6])
if (trans64[0] <= trans64[1])
if (trans64[8] <= trans64[9])
for (int i64 = 0; i64 < 1 && i64 < trans64[0]; i64++) {
if (trans65[0] <= trans65[1])
if (trans65[5] <= trans65[6])
if (trans65[2] <= trans65[3])
if (trans65[7] <= trans65[8])
if (trans65[6] <= trans65[7])
if (trans65[1] <= trans65[2])
if (trans65[9] <= a65.length)
if (trans65[3] <= trans65[4])
if (trans65[4] <= trans65[5])
if (trans65[8] <= trans65[9])
for (int i65 = 0; i65 < 1 && i65 < trans65[0]; i65++) {
if (trans66[6] <= trans66[7])
if (trans66[1] <= trans66[2])
if (trans66[7] <= trans66[8])
if (trans66[9] <= a66.length)
if (trans66[5] <= trans66[6])
if (trans66[8] <= trans66[9])
if (trans66[3] <= trans66[4])
if (trans66[4] <= trans66[5])
if (trans66[0] <= trans66[1])
if (trans66[2] <= trans66[3])
for (int i66 = 0; i66 < 1 && i66 < trans66[0]; i66++) {
if (trans67[5] <= trans67[6])
if (trans67[4] <= trans67[5])
if (trans67[0] <= trans67[1])
if (trans67[6] <= trans67[7])
if (trans67[7] <= trans67[8])
if (trans67[1] <= trans67[2])
if (trans67[2] <= trans67[3])
if (trans67[9] <= a67.length)
if (trans67[3] <= trans67[4])
if (trans67[8] <= trans67[9])
for (int i67 = 0; i67 < 1 && i67 < trans67[0]; i67++) {
if (trans68[8] <= trans68[9])
if (trans68[4] <= trans68[5])
if (trans68[1] <= trans68[2])
if (trans68[5] <= trans68[6])
if (trans68[6] <= trans68[7])
if (trans68[2] <= trans68[3])
if (trans68[3] <= trans68[4])
if (trans68[9] <= a68.length)
if (trans68[7] <= trans68[8])
if (trans68[0] <= trans68[1])
for (int i68 = 0; i68 < 1 && i68 < trans68[0]; i68++) {
if (trans69[4] <= trans69[5])
if (trans69[2] <= trans69[3])
if (trans69[6] <= trans69[7])
if (trans69[7] <= trans69[8])
if (trans69[0] <= trans69[1])
if (trans69[5] <= trans69[6])
if (trans69[8] <= trans69[9])
if (trans69[9] <= a69.length)
if (trans69[1] <= trans69[2])
if (trans69[3] <= trans69[4])
for (int i69 = 0; i69 < 1 && i69 < trans69[0]; i69++) {
if (trans70[5] <= trans70[6])
if (trans70[1] <= trans70[2])
if (trans70[6] <= trans70[7])
if (trans70[0] <= trans70[1])
if (trans70[4] <= trans70[5])
if (trans70[3] <= trans70[4])
if (trans70[7] <= trans70[8])
if (trans70[9] <= a70.length)
if (trans70[2] <= trans70[3])
if (trans70[8] <= trans70[9])
for (int i70 = 0; i70 < 1 && i70 < trans70[0]; i70++) {
if (trans71[6] <= trans71[7])
if (trans71[0] <= trans71[1])
if (trans71[1] <= trans71[2])
if (trans71[4] <= trans71[5])
if (trans71[7] <= trans71[8])
if (trans71[5] <= trans71[6])
if (trans71[8] <= trans71[9])
if (trans71[2] <= trans71[3])
if (trans71[3] <= trans71[4])
if (trans71[9] <= a71.length)
for (int i71 = 0; i71 < 1 && i71 < trans71[0]; i71++) {
if (trans72[1] <= trans72[2])
if (trans72[8] <= trans72[9])
if (trans72[9] <= a72.length)
if (trans72[4] <= trans72[5])
if (trans72[5] <= trans72[6])
if (trans72[3] <= trans72[4])
if (trans72[6] <= trans72[7])
if (trans72[0] <= trans72[1])
if (trans72[2] <= trans72[3])
if (trans72[7] <= trans72[8])
for (int i72 = 0; i72 < 1 && i72 < trans72[0]; i72++) {
if (trans73[8] <= trans73[9])
if (trans73[7] <= trans73[8])
if (trans73[9] <= a73.length)
if (trans73[2] <= trans73[3])
if (trans73[1] <= trans73[2])
if (trans73[3] <= trans73[4])
if (trans73[6] <= trans73[7])
if (trans73[4] <= trans73[5])
if (trans73[5] <= trans73[6])
if (trans73[0] <= trans73[1])
for (int i73 = 0; i73 < 1 && i73 < trans73[0]; i73++) {
if (trans74[8] <= trans74[9])
if (trans74[6] <= trans74[7])
if (trans74[7] <= trans74[8])
if (trans74[2] <= trans74[3])
if (trans74[1] <= trans74[2])
if (trans74[4] <= trans74[5])
if (trans74[0] <= trans74[1])
if (trans74[5] <= trans74[6])
if (trans74[9] <= a74.length)
if (trans74[3] <= trans74[4])
for (int i74 = 0; i74 < 1 && i74 < trans74[0]; i74++) {
if (trans75[3] <= trans75[4])
if (trans75[7] <= trans75[8])
if (trans75[6] <= trans75[7])
if (trans75[2] <= trans75[3])
if (trans75[5] <= trans75[6])
if (trans75[0] <= trans75[1])
if (trans75[1] <= trans75[2])
if (trans75[8] <= trans75[9])
if (trans75[9] <= a75.length)
if (trans75[4] <= trans75[5])
for (int i75 = 0; i75 < 1 && i75 < trans75[0]; i75++) {
if (trans76[3] <= trans76[4])
if (trans76[9] <= a76.length)
if (trans76[1] <= trans76[2])
if (trans76[0] <= trans76[1])
if (trans76[8] <= trans76[9])
if (trans76[6] <= trans76[7])
if (trans76[4] <= trans76[5])
if (trans76[7] <= trans76[8])
if (trans76[5] <= trans76[6])
if (trans76[2] <= trans76[3])
for (int i76 = 0; i76 < 1 && i76 < trans76[0]; i76++) {
if (trans77[3] <= trans77[4])
if (trans77[6] <= trans77[7])
if (trans77[8] <= trans77[9])
if (trans77[7] <= trans77[8])
if (trans77[5] <= trans77[6])
if (trans77[4] <= trans77[5])
if (trans77[9] <= a77.length)
if (trans77[1] <= trans77[2])
if (trans77[0] <= trans77[1])
if (trans77[2] <= trans77[3])
for (int i77 = 0; i77 < 1 && i77 < trans77[0]; i77++) {
if (trans78[7] <= trans78[8])
if (trans78[2] <= trans78[3])
if (trans78[0] <= trans78[1])
if (trans78[3] <= trans78[4])
if (trans78[9] <= a78.length)
if (trans78[4] <= trans78[5])
if (trans78[8] <= trans78[9])
if (trans78[5] <= trans78[6])
if (trans78[6] <= trans78[7])
if (trans78[1] <= trans78[2])
for (int i78 = 0; i78 < 1 && i78 < trans78[0]; i78++) {
if (trans79[1] <= trans79[2])
if (trans79[4] <= trans79[5])
if (trans79[9] <= a79.length)
if (trans79[2] <= trans79[3])
if (trans79[8] <= trans79[9])
if (trans79[6] <= trans79[7])
if (trans79[3] <= trans79[4])
if (trans79[0] <= trans79[1])
if (trans79[7] <= trans79[8])
if (trans79[5] <= trans79[6])
for (int i79 = 0; i79 < 1 && i79 < trans79[0]; i79++) {
if (trans80[5] <= trans80[6])
if (trans80[3] <= trans80[4])
if (trans80[1] <= trans80[2])
if (trans80[6] <= trans80[7])
if (trans80[4] <= trans80[5])
if (trans80[8] <= trans80[9])
if (trans80[7] <= trans80[8])
if (trans80[2] <= trans80[3])
if (trans80[9] <= a80.length)
if (trans80[0] <= trans80[1])
for (int i80 = 0; i80 < 1 && i80 < trans80[0]; i80++) {
if (trans81[5] <= trans81[6])
if (trans81[0] <= trans81[1])
if (trans81[3] <= trans81[4])
if (trans81[7] <= trans81[8])
if (trans81[1] <= trans81[2])
if (trans81[4] <= trans81[5])
if (trans81[2] <= trans81[3])
if (trans81[6] <= trans81[7])
if (trans81[8] <= trans81[9])
if (trans81[9] <= a81.length)
for (int i81 = 0; i81 < 1 && i81 < trans81[0]; i81++) {
if (trans82[4] <= trans82[5])
if (trans82[9] <= a82.length)
if (trans82[3] <= trans82[4])
if (trans82[6] <= trans82[7])
if (trans82[8] <= trans82[9])
if (trans82[1] <= trans82[2])
if (trans82[5] <= trans82[6])
if (trans82[2] <= trans82[3])
if (trans82[7] <= trans82[8])
if (trans82[0] <= trans82[1])
for (int i82 = 0; i82 < 1 && i82 < trans82[0]; i82++) {
if (trans83[2] <= trans83[3])
if (trans83[3] <= trans83[4])
if (trans83[5] <= trans83[6])
if (trans83[4] <= trans83[5])
if (trans83[7] <= trans83[8])
if (trans83[1] <= trans83[2])
if (trans83[0] <= trans83[1])
if (trans83[6] <= trans83[7])
if (trans83[8] <= trans83[9])
if (trans83[9] <= a83.length)
for (int i83 = 0; i83 < 1 && i83 < trans83[0]; i83++) {
if (trans84[3] <= trans84[4])
if (trans84[2] <= trans84[3])
if (trans84[9] <= a84.length)
if (trans84[8] <= trans84[9])
if (trans84[5] <= trans84[6])
if (trans84[6] <= trans84[7])
if (trans84[4] <= trans84[5])
if (trans84[1] <= trans84[2])
if (trans84[0] <= trans84[1])
if (trans84[7] <= trans84[8])
for (int i84 = 0; i84 < 1 && i84 < trans84[0]; i84++) {
if (trans85[1] <= trans85[2])
if (trans85[7] <= trans85[8])
if (trans85[5] <= trans85[6])
if (trans85[9] <= a85.length)
if (trans85[8] <= trans85[9])
if (trans85[0] <= trans85[1])
if (trans85[4] <= trans85[5])
if (trans85[6] <= trans85[7])
if (trans85[2] <= trans85[3])
if (trans85[3] <= trans85[4])
for (int i85 = 0; i85 < 1 && i85 < trans85[0]; i85++) {
if (trans86[2] <= trans86[3])
if (trans86[9] <= a86.length)
if (trans86[7] <= trans86[8])
if (trans86[3] <= trans86[4])
if (trans86[0] <= trans86[1])
if (trans86[6] <= trans86[7])
if (trans86[5] <= trans86[6])
if (trans86[1] <= trans86[2])
if (trans86[8] <= trans86[9])
if (trans86[4] <= trans86[5])
for (int i86 = 0; i86 < 1 && i86 < trans86[0]; i86++) {
if (trans87[5] <= trans87[6])
if (trans87[8] <= trans87[9])
if (trans87[6] <= trans87[7])
if (trans87[2] <= trans87[3])
if (trans87[7] <= trans87[8])
if (trans87[1] <= trans87[2])
if (trans87[4] <= trans87[5])
if (trans87[9] <= a87.length)
if (trans87[0] <= trans87[1])
if (trans87[3] <= trans87[4])
for (int i87 = 0; i87 < 1 && i87 < trans87[0]; i87++) {
if (trans88[5] <= trans88[6])
if (trans88[0] <= trans88[1])
if (trans88[8] <= trans88[9])
if (trans88[6] <= trans88[7])
if (trans88[9] <= a88.length)
if (trans88[3] <= trans88[4])
if (trans88[2] <= trans88[3])
if (trans88[7] <= trans88[8])
if (trans88[4] <= trans88[5])
if (trans88[1] <= trans88[2])
for (int i88 = 0; i88 < 1 && i88 < trans88[0]; i88++) {
if (trans89[6] <= trans89[7])
if (trans89[2] <= trans89[3])
if (trans89[8] <= trans89[9])
if (trans89[0] <= trans89[1])
if (trans89[3] <= trans89[4])
if (trans89[7] <= trans89[8])
if (trans89[9] <= a89.length)
if (trans89[4] <= trans89[5])
if (trans89[5] <= trans89[6])
if (trans89[1] <= trans89[2])
for (int i89 = 0; i89 < 1 && i89 < trans89[0]; i89++) {
if (trans90[0] <= trans90[1])
if (trans90[1] <= trans90[2])
if (trans90[5] <= trans90[6])
if (trans90[7] <= trans90[8])
if (trans90[2] <= trans90[3])
if (trans90[3] <= trans90[4])
if (trans90[4] <= trans90[5])
if (trans90[6] <= trans90[7])
if (trans90[9] <= a90.length)
if (trans90[8] <= trans90[9])
for (int i90 = 0; i90 < 1 && i90 < trans90[0]; i90++) {
if (trans91[3] <= trans91[4])
if (trans91[2] <= trans91[3])
if (trans91[8] <= trans91[9])
if (trans91[5] <= trans91[6])
if (trans91[1] <= trans91[2])
if (trans91[4] <= trans91[5])
if (trans91[0] <= trans91[1])
if (trans91[7] <= trans91[8])
if (trans91[6] <= trans91[7])
if (trans91[9] <= a91.length)
for (int i91 = 0; i91 < 1 && i91 < trans91[0]; i91++) {
if (trans92[0] <= trans92[1])
if (trans92[7] <= trans92[8])
if (trans92[1] <= trans92[2])
if (trans92[4] <= trans92[5])
if (trans92[8] <= trans92[9])
if (trans92[9] <= a92.length)
if (trans92[2] <= trans92[3])
if (trans92[3] <= trans92[4])
if (trans92[5] <= trans92[6])
if (trans92[6] <= trans92[7])
for (int i92 = 0; i92 < 1 && i92 < trans92[0]; i92++) {
if (trans93[4] <= trans93[5])
if (trans93[8] <= trans93[9])
if (trans93[5] <= trans93[6])
if (trans93[7] <= trans93[8])
if (trans93[3] <= trans93[4])
if (trans93[1] <= trans93[2])
if (trans93[2] <= trans93[3])
if (trans93[0] <= trans93[1])
if (trans93[9] <= a93.length)
if (trans93[6] <= trans93[7])
for (int i93 = 0; i93 < 1 && i93 < trans93[0]; i93++) {
if (trans94[2] <= trans94[3])
if (trans94[0] <= trans94[1])
if (trans94[5] <= trans94[6])
if (trans94[7] <= trans94[8])
if (trans94[1] <= trans94[2])
if (trans94[9] <= a94.length)
if (trans94[3] <= trans94[4])
if (trans94[8] <= trans94[9])
if (trans94[6] <= trans94[7])
if (trans94[4] <= trans94[5])
for (int i94 = 0; i94 < 1 && i94 < trans94[0]; i94++) {
if (trans95[1] <= trans95[2])
if (trans95[8] <= trans95[9])
if (trans95[2] <= trans95[3])
if (trans95[5] <= trans95[6])
if (trans95[3] <= trans95[4])
if (trans95[9] <= a95.length)
if (trans95[0] <= trans95[1])
if (trans95[7] <= trans95[8])
if (trans95[6] <= trans95[7])
if (trans95[4] <= trans95[5])
for (int i95 = 0; i95 < 1 && i95 < trans95[0]; i95++) {
if (trans96[9] <= a96.length)
if (trans96[6] <= trans96[7])
if (trans96[0] <= trans96[1])
if (trans96[2] <= trans96[3])
if (trans96[1] <= trans96[2])
if (trans96[3] <= trans96[4])
if (trans96[8] <= trans96[9])
if (trans96[5] <= trans96[6])
if (trans96[4] <= trans96[5])
if (trans96[7] <= trans96[8])
for (int i96 = 0; i96 < 1 && i96 < trans96[0]; i96++) {
if (trans97[3] <= trans97[4])
if (trans97[8] <= trans97[9])
if (trans97[2] <= trans97[3])
if (trans97[0] <= trans97[1])
if (trans97[9] <= a97.length)
if (trans97[4] <= trans97[5])
if (trans97[5] <= trans97[6])
if (trans97[1] <= trans97[2])
if (trans97[7] <= trans97[8])
if (trans97[6] <= trans97[7])
for (int i97 = 0; i97 < 1 && i97 < trans97[0]; i97++) {
if (trans98[6] <= trans98[7])
if (trans98[1] <= trans98[2])
if (trans98[4] <= trans98[5])
if (trans98[5] <= trans98[6])
if (trans98[9] <= a98.length)
if (trans98[7] <= trans98[8])
if (trans98[0] <= trans98[1])
if (trans98[8] <= trans98[9])
if (trans98[3] <= trans98[4])
if (trans98[2] <= trans98[3])
for (int i98 = 0; i98 < 1 && i98 < trans98[0]; i98++) {
if (trans99[1] <= trans99[2])
if (trans99[2] <= trans99[3])
if (trans99[8] <= trans99[9])
if (trans99[4] <= trans99[5])
if (trans99[9] <= a99.length)
if (trans99[5] <= trans99[6])
if (trans99[3] <= trans99[4])
if (trans99[7] <= trans99[8])
if (trans99[6] <= trans99[7])
if (trans99[0] <= trans99[1])
for (int i99 = 0; i99 < 1 && i99 < trans99[0]; i99++) {
if (trans100[5] <= trans100[6])
if (trans100[8] <= trans100[9])
if (trans100[6] <= trans100[7])
if (trans100[0] <= trans100[1])
if (trans100[4] <= trans100[5])
if (trans100[9] <= a100.length)
if (trans100[1] <= trans100[2])
if (trans100[3] <= trans100[4])
if (trans100[2] <= trans100[3])
if (trans100[7] <= trans100[8])
for (int i100 = 0; i100 < 1 && i100 < trans100[0]; i100++) {
if (trans101[2] <= trans101[3])
if (trans101[8] <= trans101[9])
if (trans101[0] <= trans101[1])
if (trans101[3] <= trans101[4])
if (trans101[5] <= trans101[6])
if (trans101[6] <= trans101[7])
if (trans101[7] <= trans101[8])
if (trans101[1] <= trans101[2])
if (trans101[4] <= trans101[5])
if (trans101[9] <= a101.length)
for (int i101 = 0; i101 < 1 && i101 < trans101[0]; i101++) {
if (trans102[5] <= trans102[6])
if (trans102[6] <= trans102[7])
if (trans102[2] <= trans102[3])
if (trans102[8] <= trans102[9])
if (trans102[3] <= trans102[4])
if (trans102[7] <= trans102[8])
if (trans102[9] <= a102.length)
if (trans102[1] <= trans102[2])
if (trans102[0] <= trans102[1])
if (trans102[4] <= trans102[5])
for (int i102 = 0; i102 < 1 && i102 < trans102[0]; i102++) {
if (trans103[9] <= a103.length)
if (trans103[0] <= trans103[1])
if (trans103[1] <= trans103[2])
if (trans103[6] <= trans103[7])
if (trans103[4] <= trans103[5])
if (trans103[2] <= trans103[3])
if (trans103[8] <= trans103[9])
if (trans103[7] <= trans103[8])
if (trans103[5] <= trans103[6])
if (trans103[3] <= trans103[4])
for (int i103 = 0; i103 < 1 && i103 < trans103[0]; i103++) {
if (trans104[6] <= trans104[7])
if (trans104[3] <= trans104[4])
if (trans104[5] <= trans104[6])
if (trans104[9] <= a104.length)
if (trans104[7] <= trans104[8])
if (trans104[8] <= trans104[9])
if (trans104[2] <= trans104[3])
if (trans104[0] <= trans104[1])
if (trans104[1] <= trans104[2])
if (trans104[4] <= trans104[5])
for (int i104 = 0; i104 < 1 && i104 < trans104[0]; i104++) {
if (trans105[4] <= trans105[5])
if (trans105[1] <= trans105[2])
if (trans105[8] <= trans105[9])
if (trans105[6] <= trans105[7])
if (trans105[2] <= trans105[3])
if (trans105[0] <= trans105[1])
if (trans105[9] <= a105.length)
if (trans105[5] <= trans105[6])
if (trans105[7] <= trans105[8])
if (trans105[3] <= trans105[4])
for (int i105 = 0; i105 < 1 && i105 < trans105[0]; i105++) {
if (trans106[5] <= trans106[6])
if (trans106[1] <= trans106[2])
if (trans106[8] <= trans106[9])
if (trans106[0] <= trans106[1])
if (trans106[9] <= a106.length)
if (trans106[2] <= trans106[3])
if (trans106[4] <= trans106[5])
if (trans106[6] <= trans106[7])
if (trans106[7] <= trans106[8])
if (trans106[3] <= trans106[4])
for (int i106 = 0; i106 < 1 && i106 < trans106[0]; i106++) {
if (trans107[6] <= trans107[7])
if (trans107[9] <= a107.length)
if (trans107[3] <= trans107[4])
if (trans107[1] <= trans107[2])
if (trans107[4] <= trans107[5])
if (trans107[8] <= trans107[9])
if (trans107[0] <= trans107[1])
if (trans107[7] <= trans107[8])
if (trans107[2] <= trans107[3])
if (trans107[5] <= trans107[6])
for (int i107 = 0; i107 < 1 && i107 < trans107[0]; i107++) {
if (trans108[9] <= a108.length)
if (trans108[3] <= trans108[4])
if (trans108[1] <= trans108[2])
if (trans108[4] <= trans108[5])
if (trans108[2] <= trans108[3])
if (trans108[5] <= trans108[6])
if (trans108[7] <= trans108[8])
if (trans108[0] <= trans108[1])
if (trans108[8] <= trans108[9])
if (trans108[6] <= trans108[7])
for (int i108 = 0; i108 < 1 && i108 < trans108[0]; i108++) {
if (trans109[0] <= trans109[1])
if (trans109[8] <= trans109[9])
if (trans109[4] <= trans109[5])
if (trans109[6] <= trans109[7])
if (trans109[7] <= trans109[8])
if (trans109[5] <= trans109[6])
if (trans109[1] <= trans109[2])
if (trans109[9] <= a109.length)
if (trans109[2] <= trans109[3])
if (trans109[3] <= trans109[4])
for (int i109 = 0; i109 < 1 && i109 < trans109[0]; i109++) {
if (trans110[8] <= trans110[9])
if (trans110[6] <= trans110[7])
if (trans110[5] <= trans110[6])
if (trans110[3] <= trans110[4])
if (trans110[0] <= trans110[1])
if (trans110[9] <= a110.length)
if (trans110[2] <= trans110[3])
if (trans110[1] <= trans110[2])
if (trans110[4] <= trans110[5])
if (trans110[7] <= trans110[8])
for (int i110 = 0; i110 < 1 && i110 < trans110[0]; i110++) {
if (trans111[7] <= trans111[8])
if (trans111[9] <= a111.length)
if (trans111[0] <= trans111[1])
if (trans111[5] <= trans111[6])
if (trans111[3] <= trans111[4])
if (trans111[6] <= trans111[7])
if (trans111[2] <= trans111[3])
if (trans111[4] <= trans111[5])
if (trans111[1] <= trans111[2])
if (trans111[8] <= trans111[9])
for (int i111 = 0; i111 < 1 && i111 < trans111[0]; i111++) {
if (trans112[3] <= trans112[4])
if (trans112[2] <= trans112[3])
if (trans112[8] <= trans112[9])
if (trans112[6] <= trans112[7])
if (trans112[4] <= trans112[5])
if (trans112[9] <= a112.length)
if (trans112[7] <= trans112[8])
if (trans112[1] <= trans112[2])
if (trans112[0] <= trans112[1])
if (trans112[5] <= trans112[6])
for (int i112 = 0; i112 < 1 && i112 < trans112[0]; i112++) {
if (trans113[4] <= trans113[5])
if (trans113[1] <= trans113[2])
if (trans113[0] <= trans113[1])
if (trans113[8] <= trans113[9])
if (trans113[5] <= trans113[6])
if (trans113[9] <= a113.length)
if (trans113[6] <= trans113[7])
if (trans113[2] <= trans113[3])
if (trans113[7] <= trans113[8])
if (trans113[3] <= trans113[4])
for (int i113 = 0; i113 < 1 && i113 < trans113[0]; i113++) {
if (trans114[2] <= trans114[3])
if (trans114[5] <= trans114[6])
if (trans114[6] <= trans114[7])
if (trans114[3] <= trans114[4])
if (trans114[7] <= trans114[8])
if (trans114[1] <= trans114[2])
if (trans114[0] <= trans114[1])
if (trans114[9] <= a114.length)
if (trans114[4] <= trans114[5])
if (trans114[8] <= trans114[9])
for (int i114 = 0; i114 < 1 && i114 < trans114[0]; i114++) {
if (trans115[4] <= trans115[5])
if (trans115[0] <= trans115[1])
if (trans115[3] <= trans115[4])
if (trans115[9] <= a115.length)
if (trans115[5] <= trans115[6])
if (trans115[1] <= trans115[2])
if (trans115[6] <= trans115[7])
if (trans115[7] <= trans115[8])
if (trans115[2] <= trans115[3])
if (trans115[8] <= trans115[9])
for (int i115 = 0; i115 < 1 && i115 < trans115[0]; i115++) {
if (trans116[8] <= trans116[9])
if (trans116[3] <= trans116[4])
if (trans116[2] <= trans116[3])
if (trans116[4] <= trans116[5])
if (trans116[9] <= a116.length)
if (trans116[6] <= trans116[7])
if (trans116[0] <= trans116[1])
if (trans116[5] <= trans116[6])
if (trans116[1] <= trans116[2])
if (trans116[7] <= trans116[8])
for (int i116 = 0; i116 < 1 && i116 < trans116[0]; i116++) {
if (trans117[2] <= trans117[3])
if (trans117[4] <= trans117[5])
if (trans117[5] <= trans117[6])
if (trans117[9] <= a117.length)
if (trans117[8] <= trans117[9])
if (trans117[7] <= trans117[8])
if (trans117[0] <= trans117[1])
if (trans117[6] <= trans117[7])
if (trans117[1] <= trans117[2])
if (trans117[3] <= trans117[4])
for (int i117 = 0; i117 < 1 && i117 < trans117[0]; i117++) {
if (trans118[2] <= trans118[3])
if (trans118[8] <= trans118[9])
if (trans118[5] <= trans118[6])
if (trans118[9] <= a118.length)
if (trans118[1] <= trans118[2])
if (trans118[3] <= trans118[4])
if (trans118[4] <= trans118[5])
if (trans118[6] <= trans118[7])
if (trans118[7] <= trans118[8])
if (trans118[0] <= trans118[1])
for (int i118 = 0; i118 < 1 && i118 < trans118[0]; i118++) {
if (trans119[7] <= trans119[8])
if (trans119[1] <= trans119[2])
if (trans119[3] <= trans119[4])
if (trans119[0] <= trans119[1])
if (trans119[4] <= trans119[5])
if (trans119[2] <= trans119[3])
if (trans119[5] <= trans119[6])
if (trans119[9] <= a119.length)
if (trans119[8] <= trans119[9])
if (trans119[6] <= trans119[7])
for (int i119 = 0; i119 < 1 && i119 < trans119[0]; i119++) {
if (trans120[2] <= trans120[3])
if (trans120[5] <= trans120[6])
if (trans120[4] <= trans120[5])
if (trans120[1] <= trans120[2])
if (trans120[6] <= trans120[7])
if (trans120[9] <= a120.length)
if (trans120[7] <= trans120[8])
if (trans120[3] <= trans120[4])
if (trans120[8] <= trans120[9])
if (trans120[0] <= trans120[1])
for (int i120 = 0; i120 < 1 && i120 < trans120[0]; i120++) {
if (trans121[5] <= trans121[6])
if (trans121[8] <= trans121[9])
if (trans121[6] <= trans121[7])
if (trans121[4] <= trans121[5])
if (trans121[9] <= a121.length)
if (trans121[0] <= trans121[1])
if (trans121[1] <= trans121[2])
if (trans121[3] <= trans121[4])
if (trans121[2] <= trans121[3])
if (trans121[7] <= trans121[8])
for (int i121 = 0; i121 < 1 && i121 < trans121[0]; i121++) {
if (trans122[8] <= trans122[9])
if (trans122[1] <= trans122[2])
if (trans122[0] <= trans122[1])
if (trans122[2] <= trans122[3])
if (trans122[9] <= a122.length)
if (trans122[7] <= trans122[8])
if (trans122[5] <= trans122[6])
if (trans122[3] <= trans122[4])
if (trans122[4] <= trans122[5])
if (trans122[6] <= trans122[7])
for (int i122 = 0; i122 < 1 && i122 < trans122[0]; i122++) {
if (trans123[4] <= trans123[5])
if (trans123[0] <= trans123[1])
if (trans123[2] <= trans123[3])
if (trans123[7] <= trans123[8])
if (trans123[8] <= trans123[9])
if (trans123[5] <= trans123[6])
if (trans123[3] <= trans123[4])
if (trans123[9] <= a123.length)
if (trans123[6] <= trans123[7])
if (trans123[1] <= trans123[2])
for (int i123 = 0; i123 < 1 && i123 < trans123[0]; i123++) {
if (trans124[0] <= trans124[1])
if (trans124[9] <= a124.length)
if (trans124[6] <= trans124[7])
if (trans124[8] <= trans124[9])
if (trans124[7] <= trans124[8])
if (trans124[2] <= trans124[3])
if (trans124[3] <= trans124[4])
if (trans124[4] <= trans124[5])
if (trans124[1] <= trans124[2])
if (trans124[5] <= trans124[6])
for (int i124 = 0; i124 < 1 && i124 < trans124[0]; i124++) {
if (trans125[2] <= trans125[3])
if (trans125[1] <= trans125[2])
if (trans125[0] <= trans125[1])
if (trans125[6] <= trans125[7])
if (trans125[4] <= trans125[5])
if (trans125[3] <= trans125[4])
if (trans125[9] <= a125.length)
if (trans125[7] <= trans125[8])
if (trans125[5] <= trans125[6])
if (trans125[8] <= trans125[9])
for (int i125 = 0; i125 < 1 && i125 < trans125[0]; i125++) {
if (trans126[7] <= trans126[8])
if (trans126[3] <= trans126[4])
if (trans126[1] <= trans126[2])
if (trans126[4] <= trans126[5])
if (trans126[6] <= trans126[7])
if (trans126[8] <= trans126[9])
if (trans126[2] <= trans126[3])
if (trans126[5] <= trans126[6])
if (trans126[9] <= a126.length)
if (trans126[0] <= trans126[1])
for (int i126 = 0; i126 < 1 && i126 < trans126[0]; i126++) {
if (trans127[0] <= trans127[1])
if (trans127[5] <= trans127[6])
if (trans127[9] <= a127.length)
if (trans127[4] <= trans127[5])
if (trans127[1] <= trans127[2])
if (trans127[3] <= trans127[4])
if (trans127[8] <= trans127[9])
if (trans127[2] <= trans127[3])
if (trans127[7] <= trans127[8])
if (trans127[6] <= trans127[7])
for (int i127 = 0; i127 < 1 && i127 < trans127[0]; i127++) {
if (trans128[9] <= a128.length)
if (trans128[8] <= trans128[9])
if (trans128[6] <= trans128[7])
if (trans128[7] <= trans128[8])
if (trans128[3] <= trans128[4])
if (trans128[0] <= trans128[1])
if (trans128[5] <= trans128[6])
if (trans128[2] <= trans128[3])
if (trans128[1] <= trans128[2])
if (trans128[4] <= trans128[5])
for (int i128 = 0; i128 < 1 && i128 < trans128[0]; i128++) {
if (trans129[9] <= a129.length)
if (trans129[8] <= trans129[9])
if (trans129[0] <= trans129[1])
if (trans129[3] <= trans129[4])
if (trans129[4] <= trans129[5])
if (trans129[6] <= trans129[7])
if (trans129[7] <= trans129[8])
if (trans129[2] <= trans129[3])
if (trans129[1] <= trans129[2])
if (trans129[5] <= trans129[6])
for (int i129 = 0; i129 < 1 && i129 < trans129[0]; i129++) {
if (trans130[1] <= trans130[2])
if (trans130[6] <= trans130[7])
if (trans130[0] <= trans130[1])
if (trans130[4] <= trans130[5])
if (trans130[2] <= trans130[3])
if (trans130[8] <= trans130[9])
if (trans130[5] <= trans130[6])
if (trans130[3] <= trans130[4])
if (trans130[7] <= trans130[8])
if (trans130[9] <= a130.length)
for (int i130 = 0; i130 < 1 && i130 < trans130[0]; i130++) {
if (trans131[3] <= trans131[4])
if (trans131[7] <= trans131[8])
if (trans131[9] <= a131.length)
if (trans131[1] <= trans131[2])
if (trans131[4] <= trans131[5])
if (trans131[8] <= trans131[9])
if (trans131[6] <= trans131[7])
if (trans131[5] <= trans131[6])
if (trans131[2] <= trans131[3])
if (trans131[0] <= trans131[1])
for (int i131 = 0; i131 < 1 && i131 < trans131[0]; i131++) {
if (trans132[6] <= trans132[7])
if (trans132[5] <= trans132[6])
if (trans132[1] <= trans132[2])
if (trans132[2] <= trans132[3])
if (trans132[7] <= trans132[8])
if (trans132[9] <= a132.length)
if (trans132[8] <= trans132[9])
if (trans132[4] <= trans132[5])
if (trans132[3] <= trans132[4])
if (trans132[0] <= trans132[1])
for (int i132 = 0; i132 < 1 && i132 < trans132[0]; i132++) {
if (trans133[8] <= trans133[9])
if (trans133[4] <= trans133[5])
if (trans133[3] <= trans133[4])
if (trans133[1] <= trans133[2])
if (trans133[0] <= trans133[1])
if (trans133[9] <= a133.length)
if (trans133[6] <= trans133[7])
if (trans133[2] <= trans133[3])
if (trans133[5] <= trans133[6])
if (trans133[7] <= trans133[8])
for (int i133 = 0; i133 < 1 && i133 < trans133[0]; i133++) {
if (trans134[7] <= trans134[8])
if (trans134[2] <= trans134[3])
if (trans134[8] <= trans134[9])
if (trans134[9] <= a134.length)
if (trans134[1] <= trans134[2])
if (trans134[5] <= trans134[6])
if (trans134[6] <= trans134[7])
if (trans134[3] <= trans134[4])
if (trans134[0] <= trans134[1])
if (trans134[4] <= trans134[5])
for (int i134 = 0; i134 < 1 && i134 < trans134[0]; i134++) {
if (trans135[7] <= trans135[8])
if (trans135[1] <= trans135[2])
if (trans135[4] <= trans135[5])
if (trans135[8] <= trans135[9])
if (trans135[3] <= trans135[4])
if (trans135[0] <= trans135[1])
if (trans135[2] <= trans135[3])
if (trans135[5] <= trans135[6])
if (trans135[6] <= trans135[7])
if (trans135[9] <= a135.length)
for (int i135 = 0; i135 < 1 && i135 < trans135[0]; i135++) {
if (trans136[4] <= trans136[5])
if (trans136[5] <= trans136[6])
if (trans136[7] <= trans136[8])
if (trans136[2] <= trans136[3])
if (trans136[6] <= trans136[7])
if (trans136[1] <= trans136[2])
if (trans136[0] <= trans136[1])
if (trans136[8] <= trans136[9])
if (trans136[3] <= trans136[4])
if (trans136[9] <= a136.length)
for (int i136 = 0; i136 < 1 && i136 < trans136[0]; i136++) {
if (trans137[3] <= trans137[4])
if (trans137[1] <= trans137[2])
if (trans137[6] <= trans137[7])
if (trans137[8] <= trans137[9])
if (trans137[9] <= a137.length)
if (trans137[5] <= trans137[6])
if (trans137[2] <= trans137[3])
if (trans137[0] <= trans137[1])
if (trans137[4] <= trans137[5])
if (trans137[7] <= trans137[8])
for (int i137 = 0; i137 < 1 && i137 < trans137[0]; i137++) {
if (trans138[8] <= trans138[9])
if (trans138[4] <= trans138[5])
if (trans138[0] <= trans138[1])
if (trans138[3] <= trans138[4])
if (trans138[7] <= trans138[8])
if (trans138[9] <= a138.length)
if (trans138[2] <= trans138[3])
if (trans138[5] <= trans138[6])
if (trans138[1] <= trans138[2])
if (trans138[6] <= trans138[7])
for (int i138 = 0; i138 < 1 && i138 < trans138[0]; i138++) {
if (trans139[7] <= trans139[8])
if (trans139[1] <= trans139[2])
if (trans139[6] <= trans139[7])
if (trans139[4] <= trans139[5])
if (trans139[5] <= trans139[6])
if (trans139[0] <= trans139[1])
if (trans139[8] <= trans139[9])
if (trans139[3] <= trans139[4])
if (trans139[2] <= trans139[3])
if (trans139[9] <= a139.length)
for (int i139 = 0; i139 < 1 && i139 < trans139[0]; i139++) {
if (trans140[2] <= trans140[3])
if (trans140[7] <= trans140[8])
if (trans140[5] <= trans140[6])
if (trans140[4] <= trans140[5])
if (trans140[0] <= trans140[1])
if (trans140[9] <= a140.length)
if (trans140[3] <= trans140[4])
if (trans140[1] <= trans140[2])
if (trans140[6] <= trans140[7])
if (trans140[8] <= trans140[9])
for (int i140 = 0; i140 < 1 && i140 < trans140[0]; i140++) {
if (trans141[0] <= trans141[1])
if (trans141[4] <= trans141[5])
if (trans141[9] <= a141.length)
if (trans141[1] <= trans141[2])
if (trans141[5] <= trans141[6])
if (trans141[7] <= trans141[8])
if (trans141[2] <= trans141[3])
if (trans141[8] <= trans141[9])
if (trans141[6] <= trans141[7])
if (trans141[3] <= trans141[4])
for (int i141 = 0; i141 < 1 && i141 < trans141[0]; i141++) {
if (trans142[8] <= trans142[9])
if (trans142[2] <= trans142[3])
if (trans142[7] <= trans142[8])
if (trans142[4] <= trans142[5])
if (trans142[5] <= trans142[6])
if (trans142[3] <= trans142[4])
if (trans142[1] <= trans142[2])
if (trans142[9] <= a142.length)
if (trans142[0] <= trans142[1])
if (trans142[6] <= trans142[7])
for (int i142 = 0; i142 < 1 && i142 < trans142[0]; i142++) {
if (trans143[4] <= trans143[5])
if (trans143[5] <= trans143[6])
if (trans143[9] <= a143.length)
if (trans143[1] <= trans143[2])
if (trans143[2] <= trans143[3])
if (trans143[6] <= trans143[7])
if (trans143[3] <= trans143[4])
if (trans143[8] <= trans143[9])
if (trans143[7] <= trans143[8])
if (trans143[0] <= trans143[1])
for (int i143 = 0; i143 < 1 && i143 < trans143[0]; i143++) {
if (trans144[4] <= trans144[5])
if (trans144[2] <= trans144[3])
if (trans144[0] <= trans144[1])
if (trans144[7] <= trans144[8])
if (trans144[9] <= a144.length)
if (trans144[1] <= trans144[2])
if (trans144[8] <= trans144[9])
if (trans144[5] <= trans144[6])
if (trans144[3] <= trans144[4])
if (trans144[6] <= trans144[7])
for (int i144 = 0; i144 < 1 && i144 < trans144[0]; i144++) {
if (trans145[7] <= trans145[8])
if (trans145[5] <= trans145[6])
if (trans145[0] <= trans145[1])
if (trans145[9] <= a145.length)
if (trans145[3] <= trans145[4])
if (trans145[2] <= trans145[3])
if (trans145[4] <= trans145[5])
if (trans145[8] <= trans145[9])
if (trans145[1] <= trans145[2])
if (trans145[6] <= trans145[7])
for (int i145 = 0; i145 < 1 && i145 < trans145[0]; i145++) {
if (trans146[3] <= trans146[4])
if (trans146[7] <= trans146[8])
if (trans146[5] <= trans146[6])
if (trans146[8] <= trans146[9])
if (trans146[2] <= trans146[3])
if (trans146[9] <= a146.length)
if (trans146[0] <= trans146[1])
if (trans146[1] <= trans146[2])
if (trans146[6] <= trans146[7])
if (trans146[4] <= trans146[5])
for (int i146 = 0; i146 < 1 && i146 < trans146[0]; i146++) {
if (trans147[7] <= trans147[8])
if (trans147[9] <= a147.length)
if (trans147[8] <= trans147[9])
if (trans147[5] <= trans147[6])
if (trans147[2] <= trans147[3])
if (trans147[0] <= trans147[1])
if (trans147[4] <= trans147[5])
if (trans147[1] <= trans147[2])
if (trans147[3] <= trans147[4])
if (trans147[6] <= trans147[7])
for (int i147 = 0; i147 < 1 && i147 < trans147[0]; i147++) {
if (trans148[7] <= trans148[8])
if (trans148[6] <= trans148[7])
if (trans148[2] <= trans148[3])
if (trans148[1] <= trans148[2])
if (trans148[3] <= trans148[4])
if (trans148[8] <= trans148[9])
if (trans148[0] <= trans148[1])
if (trans148[4] <= trans148[5])
if (trans148[5] <= trans148[6])
if (trans148[9] <= a148.length)
for (int i148 = 0; i148 < 1 && i148 < trans148[0]; i148++) {
if (trans149[0] <= trans149[1])
if (trans149[2] <= trans149[3])
if (trans149[8] <= trans149[9])
if (trans149[7] <= trans149[8])
if (trans149[3] <= trans149[4])
if (trans149[9] <= a149.length)
if (trans149[1] <= trans149[2])
if (trans149[6] <= trans149[7])
if (trans149[5] <= trans149[6])
if (trans149[4] <= trans149[5])
for (int i149 = 0; i149 < 1 && i149 < trans149[0]; i149++) {
if (trans150[3] <= trans150[4])
if (trans150[4] <= trans150[5])
if (trans150[8] <= trans150[9])
if (trans150[5] <= trans150[6])
if (trans150[9] <= a150.length)
if (trans150[2] <= trans150[3])
if (trans150[7] <= trans150[8])
if (trans150[0] <= trans150[1])
if (trans150[1] <= trans150[2])
if (trans150[6] <= trans150[7])
for (int i150 = 0; i150 < 1 && i150 < trans150[0]; i150++) {
if (trans151[5] <= trans151[6])
if (trans151[3] <= trans151[4])
if (trans151[9] <= a151.length)
if (trans151[4] <= trans151[5])
if (trans151[7] <= trans151[8])
if (trans151[1] <= trans151[2])
if (trans151[6] <= trans151[7])
if (trans151[0] <= trans151[1])
if (trans151[2] <= trans151[3])
if (trans151[8] <= trans151[9])
for (int i151 = 0; i151 < 1 && i151 < trans151[0]; i151++) {
if (trans152[4] <= trans152[5])
if (trans152[8] <= trans152[9])
if (trans152[9] <= a152.length)
if (trans152[5] <= trans152[6])
if (trans152[2] <= trans152[3])
if (trans152[6] <= trans152[7])
if (trans152[3] <= trans152[4])
if (trans152[1] <= trans152[2])
if (trans152[0] <= trans152[1])
if (trans152[7] <= trans152[8])
for (int i152 = 0; i152 < 1 && i152 < trans152[0]; i152++) {
if (trans153[6] <= trans153[7])
if (trans153[9] <= a153.length)
if (trans153[4] <= trans153[5])
if (trans153[2] <= trans153[3])
if (trans153[8] <= trans153[9])
if (trans153[0] <= trans153[1])
if (trans153[7] <= trans153[8])
if (trans153[3] <= trans153[4])
if (trans153[5] <= trans153[6])
if (trans153[1] <= trans153[2])
for (int i153 = 0; i153 < 1 && i153 < trans153[0]; i153++) {
if (trans154[2] <= trans154[3])
if (trans154[5] <= trans154[6])
if (trans154[4] <= trans154[5])
if (trans154[6] <= trans154[7])
if (trans154[1] <= trans154[2])
if (trans154[3] <= trans154[4])
if (trans154[0] <= trans154[1])
if (trans154[9] <= a154.length)
if (trans154[8] <= trans154[9])
if (trans154[7] <= trans154[8])
for (int i154 = 0; i154 < 1 && i154 < trans154[0]; i154++) {
if (trans155[5] <= trans155[6])
if (trans155[1] <= trans155[2])
if (trans155[8] <= trans155[9])
if (trans155[0] <= trans155[1])
if (trans155[9] <= a155.length)
if (trans155[2] <= trans155[3])
if (trans155[6] <= trans155[7])
if (trans155[4] <= trans155[5])
if (trans155[7] <= trans155[8])
if (trans155[3] <= trans155[4])
for (int i155 = 0; i155 < 1 && i155 < trans155[0]; i155++) {
if (trans156[7] <= trans156[8])
if (trans156[9] <= a156.length)
if (trans156[3] <= trans156[4])
if (trans156[0] <= trans156[1])
if (trans156[5] <= trans156[6])
if (trans156[6] <= trans156[7])
if (trans156[4] <= trans156[5])
if (trans156[1] <= trans156[2])
if (trans156[8] <= trans156[9])
if (trans156[2] <= trans156[3])
for (int i156 = 0; i156 < 1 && i156 < trans156[0]; i156++) {
if (trans157[9] <= a157.length)
if (trans157[0] <= trans157[1])
if (trans157[2] <= trans157[3])
if (trans157[5] <= trans157[6])
if (trans157[4] <= trans157[5])
if (trans157[3] <= trans157[4])
if (trans157[1] <= trans157[2])
if (trans157[6] <= trans157[7])
if (trans157[7] <= trans157[8])
if (trans157[8] <= trans157[9])
for (int i157 = 0; i157 < 1 && i157 < trans157[0]; i157++) {
if (trans158[9] <= a158.length)
if (trans158[5] <= trans158[6])
if (trans158[8] <= trans158[9])
if (trans158[1] <= trans158[2])
if (trans158[7] <= trans158[8])
if (trans158[0] <= trans158[1])
if (trans158[4] <= trans158[5])
if (trans158[6] <= trans158[7])
if (trans158[3] <= trans158[4])
if (trans158[2] <= trans158[3])
for (int i158 = 0; i158 < 1 && i158 < trans158[0]; i158++) {
if (trans159[4] <= trans159[5])
if (trans159[0] <= trans159[1])
if (trans159[2] <= trans159[3])
if (trans159[8] <= trans159[9])
if (trans159[5] <= trans159[6])
if (trans159[6] <= trans159[7])
if (trans159[9] <= a159.length)
if (trans159[7] <= trans159[8])
if (trans159[3] <= trans159[4])
if (trans159[1] <= trans159[2])
for (int i159 = 0; i159 < 1 && i159 < trans159[0]; i159++) {
if (trans160[7] <= trans160[8])
if (trans160[4] <= trans160[5])
if (trans160[9] <= a160.length)
if (trans160[8] <= trans160[9])
if (trans160[6] <= trans160[7])
if (trans160[1] <= trans160[2])
if (trans160[3] <= trans160[4])
if (trans160[2] <= trans160[3])
if (trans160[5] <= trans160[6])
if (trans160[0] <= trans160[1])
for (int i160 = 0; i160 < 1 && i160 < trans160[0]; i160++) {
if (trans161[6] <= trans161[7])
if (trans161[3] <= trans161[4])
if (trans161[9] <= a161.length)
if (trans161[1] <= trans161[2])
if (trans161[7] <= trans161[8])
if (trans161[2] <= trans161[3])
if (trans161[5] <= trans161[6])
if (trans161[0] <= trans161[1])
if (trans161[8] <= trans161[9])
if (trans161[4] <= trans161[5])
for (int i161 = 0; i161 < 1 && i161 < trans161[0]; i161++) {
if (trans162[6] <= trans162[7])
if (trans162[7] <= trans162[8])
if (trans162[1] <= trans162[2])
if (trans162[8] <= trans162[9])
if (trans162[9] <= a162.length)
if (trans162[0] <= trans162[1])
if (trans162[5] <= trans162[6])
if (trans162[4] <= trans162[5])
if (trans162[2] <= trans162[3])
if (trans162[3] <= trans162[4])
for (int i162 = 0; i162 < 1 && i162 < trans162[0]; i162++) {
if (trans163[4] <= trans163[5])
if (trans163[2] <= trans163[3])
if (trans163[7] <= trans163[8])
if (trans163[6] <= trans163[7])
if (trans163[9] <= a163.length)
if (trans163[8] <= trans163[9])
if (trans163[1] <= trans163[2])
if (trans163[0] <= trans163[1])
if (trans163[5] <= trans163[6])
if (trans163[3] <= trans163[4])
for (int i163 = 0; i163 < 1 && i163 < trans163[0]; i163++) {
if (trans164[9] <= a164.length)
if (trans164[2] <= trans164[3])
if (trans164[4] <= trans164[5])
if (trans164[6] <= trans164[7])
if (trans164[7] <= trans164[8])
if (trans164[3] <= trans164[4])
if (trans164[0] <= trans164[1])
if (trans164[1] <= trans164[2])
if (trans164[5] <= trans164[6])
if (trans164[8] <= trans164[9])
for (int i164 = 0; i164 < 1 && i164 < trans164[0]; i164++) {
if (trans165[4] <= trans165[5])
if (trans165[7] <= trans165[8])
if (trans165[9] <= a165.length)
if (trans165[0] <= trans165[1])
if (trans165[8] <= trans165[9])
if (trans165[3] <= trans165[4])
if (trans165[2] <= trans165[3])
if (trans165[1] <= trans165[2])
if (trans165[5] <= trans165[6])
if (trans165[6] <= trans165[7])
for (int i165 = 0; i165 < 1 && i165 < trans165[0]; i165++) {
if (trans166[3] <= trans166[4])
if (trans166[0] <= trans166[1])
if (trans166[1] <= trans166[2])
if (trans166[8] <= trans166[9])
if (trans166[2] <= trans166[3])
if (trans166[6] <= trans166[7])
if (trans166[4] <= trans166[5])
if (trans166[7] <= trans166[8])
if (trans166[5] <= trans166[6])
if (trans166[9] <= a166.length)
for (int i166 = 0; i166 < 1 && i166 < trans166[0]; i166++) {
if (trans167[9] <= a167.length)
if (trans167[0] <= trans167[1])
if (trans167[2] <= trans167[3])
if (trans167[8] <= trans167[9])
if (trans167[5] <= trans167[6])
if (trans167[7] <= trans167[8])
if (trans167[1] <= trans167[2])
if (trans167[4] <= trans167[5])
if (trans167[6] <= trans167[7])
if (trans167[3] <= trans167[4])
for (int i167 = 0; i167 < 1 && i167 < trans167[0]; i167++) {
if (trans168[3] <= trans168[4])
if (trans168[4] <= trans168[5])
if (trans168[2] <= trans168[3])
if (trans168[1] <= trans168[2])
if (trans168[8] <= trans168[9])
if (trans168[0] <= trans168[1])
if (trans168[6] <= trans168[7])
if (trans168[9] <= a168.length)
if (trans168[5] <= trans168[6])
if (trans168[7] <= trans168[8])
for (int i168 = 0; i168 < 1 && i168 < trans168[0]; i168++) {
if (trans169[2] <= trans169[3])
if (trans169[3] <= trans169[4])
if (trans169[7] <= trans169[8])
if (trans169[8] <= trans169[9])
if (trans169[1] <= trans169[2])
if (trans169[6] <= trans169[7])
if (trans169[4] <= trans169[5])
if (trans169[9] <= a169.length)
if (trans169[0] <= trans169[1])
if (trans169[5] <= trans169[6])
for (int i169 = 0; i169 < 1 && i169 < trans169[0]; i169++) {
if (trans170[2] <= trans170[3])
if (trans170[4] <= trans170[5])
if (trans170[9] <= a170.length)
if (trans170[8] <= trans170[9])
if (trans170[6] <= trans170[7])
if (trans170[5] <= trans170[6])
if (trans170[7] <= trans170[8])
if (trans170[3] <= trans170[4])
if (trans170[1] <= trans170[2])
if (trans170[0] <= trans170[1])
for (int i170 = 0; i170 < 1 && i170 < trans170[0]; i170++) {
if (trans171[5] <= trans171[6])
if (trans171[7] <= trans171[8])
if (trans171[9] <= a171.length)
if (trans171[2] <= trans171[3])
if (trans171[6] <= trans171[7])
if (trans171[8] <= trans171[9])
if (trans171[4] <= trans171[5])
if (trans171[0] <= trans171[1])
if (trans171[3] <= trans171[4])
if (trans171[1] <= trans171[2])
for (int i171 = 0; i171 < 1 && i171 < trans171[0]; i171++) {
if (trans172[4] <= trans172[5])
if (trans172[1] <= trans172[2])
if (trans172[6] <= trans172[7])
if (trans172[2] <= trans172[3])
if (trans172[8] <= trans172[9])
if (trans172[0] <= trans172[1])
if (trans172[3] <= trans172[4])
if (trans172[7] <= trans172[8])
if (trans172[9] <= a172.length)
if (trans172[5] <= trans172[6])
for (int i172 = 0; i172 < 1 && i172 < trans172[0]; i172++) {
if (trans173[1] <= trans173[2])
if (trans173[2] <= trans173[3])
if (trans173[5] <= trans173[6])
if (trans173[7] <= trans173[8])
if (trans173[6] <= trans173[7])
if (trans173[8] <= trans173[9])
if (trans173[4] <= trans173[5])
if (trans173[3] <= trans173[4])
if (trans173[9] <= a173.length)
if (trans173[0] <= trans173[1])
for (int i173 = 0; i173 < 1 && i173 < trans173[0]; i173++) {
if (trans174[0] <= trans174[1])
if (trans174[2] <= trans174[3])
if (trans174[3] <= trans174[4])
if (trans174[6] <= trans174[7])
if (trans174[7] <= trans174[8])
if (trans174[1] <= trans174[2])
if (trans174[8] <= trans174[9])
if (trans174[4] <= trans174[5])
if (trans174[9] <= a174.length)
if (trans174[5] <= trans174[6])
for (int i174 = 0; i174 < 1 && i174 < trans174[0]; i174++) {
if (trans175[9] <= a175.length)
if (trans175[4] <= trans175[5])
if (trans175[3] <= trans175[4])
if (trans175[7] <= trans175[8])
if (trans175[8] <= trans175[9])
if (trans175[6] <= trans175[7])
if (trans175[2] <= trans175[3])
if (trans175[0] <= trans175[1])
if (trans175[5] <= trans175[6])
if (trans175[1] <= trans175[2])
for (int i175 = 0; i175 < 1 && i175 < trans175[0]; i175++) {
if (trans176[1] <= trans176[2])
if (trans176[6] <= trans176[7])
if (trans176[4] <= trans176[5])
if (trans176[9] <= a176.length)
if (trans176[0] <= trans176[1])
if (trans176[3] <= trans176[4])
if (trans176[7] <= trans176[8])
if (trans176[2] <= trans176[3])
if (trans176[8] <= trans176[9])
if (trans176[5] <= trans176[6])
for (int i176 = 0; i176 < 1 && i176 < trans176[0]; i176++) {
if (trans177[5] <= trans177[6])
if (trans177[2] <= trans177[3])
if (trans177[9] <= a177.length)
if (trans177[0] <= trans177[1])
if (trans177[1] <= trans177[2])
if (trans177[4] <= trans177[5])
if (trans177[7] <= trans177[8])
if (trans177[6] <= trans177[7])
if (trans177[8] <= trans177[9])
if (trans177[3] <= trans177[4])
for (int i177 = 0; i177 < 1 && i177 < trans177[0]; i177++) {
if (trans178[6] <= trans178[7])
if (trans178[3] <= trans178[4])
if (trans178[1] <= trans178[2])
if (trans178[5] <= trans178[6])
if (trans178[8] <= trans178[9])
if (trans178[0] <= trans178[1])
if (trans178[7] <= trans178[8])
if (trans178[2] <= trans178[3])
if (trans178[9] <= a178.length)
if (trans178[4] <= trans178[5])
for (int i178 = 0; i178 < 1 && i178 < trans178[0]; i178++) {
if (trans179[5] <= trans179[6])
if (trans179[1] <= trans179[2])
if (trans179[2] <= trans179[3])
if (trans179[8] <= trans179[9])
if (trans179[3] <= trans179[4])
if (trans179[7] <= trans179[8])
if (trans179[6] <= trans179[7])
if (trans179[9] <= a179.length)
if (trans179[4] <= trans179[5])
if (trans179[0] <= trans179[1])
for (int i179 = 0; i179 < 1 && i179 < trans179[0]; i179++) {
if (trans180[1] <= trans180[2])
if (trans180[8] <= trans180[9])
if (trans180[7] <= trans180[8])
if (trans180[2] <= trans180[3])
if (trans180[3] <= trans180[4])
if (trans180[5] <= trans180[6])
if (trans180[9] <= a180.length)
if (trans180[0] <= trans180[1])
if (trans180[4] <= trans180[5])
if (trans180[6] <= trans180[7])
for (int i180 = 0; i180 < 1 && i180 < trans180[0]; i180++) {
if (trans181[0] <= trans181[1])
if (trans181[8] <= trans181[9])
if (trans181[2] <= trans181[3])
if (trans181[4] <= trans181[5])
if (trans181[5] <= trans181[6])
if (trans181[9] <= a181.length)
if (trans181[7] <= trans181[8])
if (trans181[1] <= trans181[2])
if (trans181[6] <= trans181[7])
if (trans181[3] <= trans181[4])
for (int i181 = 0; i181 < 1 && i181 < trans181[0]; i181++) {
if (trans182[6] <= trans182[7])
if (trans182[5] <= trans182[6])
if (trans182[9] <= a182.length)
if (trans182[0] <= trans182[1])
if (trans182[4] <= trans182[5])
if (trans182[7] <= trans182[8])
if (trans182[1] <= trans182[2])
if (trans182[2] <= trans182[3])
if (trans182[8] <= trans182[9])
if (trans182[3] <= trans182[4])
for (int i182 = 0; i182 < 1 && i182 < trans182[0]; i182++) {
if (trans183[8] <= trans183[9])
if (trans183[9] <= a183.length)
if (trans183[6] <= trans183[7])
if (trans183[7] <= trans183[8])
if (trans183[0] <= trans183[1])
if (trans183[4] <= trans183[5])
if (trans183[5] <= trans183[6])
if (trans183[3] <= trans183[4])
if (trans183[1] <= trans183[2])
if (trans183[2] <= trans183[3])
for (int i183 = 0; i183 < 1 && i183 < trans183[0]; i183++) {
if (trans184[7] <= trans184[8])
if (trans184[4] <= trans184[5])
if (trans184[0] <= trans184[1])
if (trans184[6] <= trans184[7])
if (trans184[9] <= a184.length)
if (trans184[8] <= trans184[9])
if (trans184[1] <= trans184[2])
if (trans184[3] <= trans184[4])
if (trans184[2] <= trans184[3])
if (trans184[5] <= trans184[6])
for (int i184 = 0; i184 < 1 && i184 < trans184[0]; i184++) {
if (trans185[5] <= trans185[6])
if (trans185[9] <= a185.length)
if (trans185[8] <= trans185[9])
if (trans185[6] <= trans185[7])
if (trans185[2] <= trans185[3])
if (trans185[7] <= trans185[8])
if (trans185[1] <= trans185[2])
if (trans185[3] <= trans185[4])
if (trans185[0] <= trans185[1])
if (trans185[4] <= trans185[5])
for (int i185 = 0; i185 < 1 && i185 < trans185[0]; i185++) {
if (trans186[0] <= trans186[1])
if (trans186[5] <= trans186[6])
if (trans186[9] <= a186.length)
if (trans186[7] <= trans186[8])
if (trans186[2] <= trans186[3])
if (trans186[4] <= trans186[5])
if (trans186[3] <= trans186[4])
if (trans186[8] <= trans186[9])
if (trans186[1] <= trans186[2])
if (trans186[6] <= trans186[7])
for (int i186 = 0; i186 < 1 && i186 < trans186[0]; i186++) {
if (trans187[9] <= a187.length)
if (trans187[7] <= trans187[8])
if (trans187[6] <= trans187[7])
if (trans187[5] <= trans187[6])
if (trans187[8] <= trans187[9])
if (trans187[4] <= trans187[5])
if (trans187[2] <= trans187[3])
if (trans187[0] <= trans187[1])
if (trans187[3] <= trans187[4])
if (trans187[1] <= trans187[2])
for (int i187 = 0; i187 < 1 && i187 < trans187[0]; i187++) {
if (trans188[9] <= a188.length)
if (trans188[4] <= trans188[5])
if (trans188[0] <= trans188[1])
if (trans188[5] <= trans188[6])
if (trans188[8] <= trans188[9])
if (trans188[1] <= trans188[2])
if (trans188[6] <= trans188[7])
if (trans188[3] <= trans188[4])
if (trans188[7] <= trans188[8])
if (trans188[2] <= trans188[3])
for (int i188 = 0; i188 < 1 && i188 < trans188[0]; i188++) {
if (trans189[6] <= trans189[7])
if (trans189[2] <= trans189[3])
if (trans189[5] <= trans189[6])
if (trans189[1] <= trans189[2])
if (trans189[0] <= trans189[1])
if (trans189[9] <= a189.length)
if (trans189[4] <= trans189[5])
if (trans189[7] <= trans189[8])
if (trans189[3] <= trans189[4])
if (trans189[8] <= trans189[9])
for (int i189 = 0; i189 < 1 && i189 < trans189[0]; i189++) {
if (trans190[0] <= trans190[1])
if (trans190[8] <= trans190[9])
if (trans190[5] <= trans190[6])
if (trans190[6] <= trans190[7])
if (trans190[2] <= trans190[3])
if (trans190[7] <= trans190[8])
if (trans190[9] <= a190.length)
if (trans190[1] <= trans190[2])
if (trans190[3] <= trans190[4])
if (trans190[4] <= trans190[5])
for (int i190 = 0; i190 < 1 && i190 < trans190[0]; i190++) {
if (trans191[3] <= trans191[4])
if (trans191[1] <= trans191[2])
if (trans191[6] <= trans191[7])
if (trans191[0] <= trans191[1])
if (trans191[8] <= trans191[9])
if (trans191[4] <= trans191[5])
if (trans191[2] <= trans191[3])
if (trans191[5] <= trans191[6])
if (trans191[9] <= a191.length)
if (trans191[7] <= trans191[8])
for (int i191 = 0; i191 < 1 && i191 < trans191[0]; i191++) {
if (trans192[1] <= trans192[2])
if (trans192[5] <= trans192[6])
if (trans192[3] <= trans192[4])
if (trans192[7] <= trans192[8])
if (trans192[6] <= trans192[7])
if (trans192[0] <= trans192[1])
if (trans192[9] <= a192.length)
if (trans192[4] <= trans192[5])
if (trans192[8] <= trans192[9])
if (trans192[2] <= trans192[3])
for (int i192 = 0; i192 < 1 && i192 < trans192[0]; i192++) {
if (trans193[7] <= trans193[8])
if (trans193[4] <= trans193[5])
if (trans193[9] <= a193.length)
if (trans193[8] <= trans193[9])
if (trans193[3] <= trans193[4])
if (trans193[1] <= trans193[2])
if (trans193[2] <= trans193[3])
if (trans193[6] <= trans193[7])
if (trans193[0] <= trans193[1])
if (trans193[5] <= trans193[6])
for (int i193 = 0; i193 < 1 && i193 < trans193[0]; i193++) {
if (trans194[8] <= trans194[9])
if (trans194[7] <= trans194[8])
if (trans194[5] <= trans194[6])
if (trans194[3] <= trans194[4])
if (trans194[9] <= a194.length)
if (trans194[0] <= trans194[1])
if (trans194[2] <= trans194[3])
if (trans194[1] <= trans194[2])
if (trans194[6] <= trans194[7])
if (trans194[4] <= trans194[5])
for (int i194 = 0; i194 < 1 && i194 < trans194[0]; i194++) {
if (trans195[1] <= trans195[2])
if (trans195[0] <= trans195[1])
if (trans195[5] <= trans195[6])
if (trans195[7] <= trans195[8])
if (trans195[6] <= trans195[7])
if (trans195[3] <= trans195[4])
if (trans195[2] <= trans195[3])
if (trans195[8] <= trans195[9])
if (trans195[4] <= trans195[5])
if (trans195[9] <= a195.length)
for (int i195 = 0; i195 < 1 && i195 < trans195[0]; i195++) {
if (trans196[9] <= a196.length)
if (trans196[5] <= trans196[6])
if (trans196[2] <= trans196[3])
if (trans196[1] <= trans196[2])
if (trans196[7] <= trans196[8])
if (trans196[0] <= trans196[1])
if (trans196[3] <= trans196[4])
if (trans196[8] <= trans196[9])
if (trans196[4] <= trans196[5])
if (trans196[6] <= trans196[7])
for (int i196 = 0; i196 < 1 && i196 < trans196[0]; i196++) {
if (trans197[9] <= a197.length)
if (trans197[3] <= trans197[4])
if (trans197[7] <= trans197[8])
if (trans197[5] <= trans197[6])
if (trans197[1] <= trans197[2])
if (trans197[6] <= trans197[7])
if (trans197[4] <= trans197[5])
if (trans197[0] <= trans197[1])
if (trans197[2] <= trans197[3])
if (trans197[8] <= trans197[9])
for (int i197 = 0; i197 < 1 && i197 < trans197[0]; i197++) {
if (trans198[2] <= trans198[3])
if (trans198[4] <= trans198[5])
if (trans198[0] <= trans198[1])
if (trans198[5] <= trans198[6])
if (trans198[7] <= trans198[8])
if (trans198[9] <= a198.length)
if (trans198[6] <= trans198[7])
if (trans198[1] <= trans198[2])
if (trans198[8] <= trans198[9])
if (trans198[3] <= trans198[4])
for (int i198 = 0; i198 < 1 && i198 < trans198[0]; i198++) {
if (trans199[4] <= trans199[5])
if (trans199[3] <= trans199[4])
if (trans199[7] <= trans199[8])
if (trans199[6] <= trans199[7])
if (trans199[2] <= trans199[3])
if (trans199[8] <= trans199[9])
if (trans199[0] <= trans199[1])
if (trans199[1] <= trans199[2])
if (trans199[9] <= a199.length)
if (trans199[5] <= trans199[6])
for (int i199 = 0; i199 < 1 && i199 < trans199[0]; i199++) {
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
