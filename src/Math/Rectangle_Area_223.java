package Math;

public class Rectangle_Area_223 {
	
	public class Solution {
		private int A,B,C,D,E,F,G,H;
		private int standalone() {
			return (C-A) * (D-B) + (G-E) * (H-F);
		}
		private int overlap(int I, int J, int K, int L) {
			return standalone() - (K-I) * (L-J);
		}
	    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
	    	this.A=A;this.B=B;this.C=C;this.D=D;this.E=E;this.F=F;this.G=G;this.H=H;
	        // case by case
	    	if (E<A) {
	    		if (F<B) {
	    			if (G<A) {
	    				return standalone();
	    			} else if (G>C) {
						if (H<B) {
							return standalone();
						} else if (H>D) {
							return overlap(A, B, C, D);
						} else {
							return overlap(A, B, C, H);
						}
					} else {
						if (H<B) {
							return standalone();
						} else if (H>D) {
							return overlap(A, B, G, D);
						} else {
							return overlap(A, B, G, H);
						}
					}
	    		} else if (F>D) {
					return standalone();
				} else {
					if (G<A) {
						return standalone();
					} else if (G>C) {
						if (H>D) {
							return overlap(A, F, C, D);
						} else {
							return overlap(A, F, C, H);
						}
	    			}  else {
						if (H>D) {
							return overlap(A, F, G, D);
						} else {
							return overlap(A, F, G, H);
						}
					}
				}
	    	} else if (E>C) {
	    		return standalone();
			} else {
				if (F<B) {
					if (G>C) {
						if (H<B) {
							return standalone();
						} else if (H>D) {
							return overlap(E, B, C, D);
						} else {
							return overlap(E, B, C, H);
						}
					} else {
						if (H<B) {
							return standalone();
						} else if (H>D) {
							return overlap(E, B, G, D);
						} else {
							return overlap(E, B, G, H);
						}
					}
	    		} else if (F>D) {
					return standalone();
				} else {
					if (G>C) {
						if (H>D) {
							return overlap(E, F, C, D);
						} else {
							return overlap(E, F, C, H);
						}
					} else {
						if (H>D) {
							return overlap(E, F, G, D);
						} else {
							return overlap(E, F, G, H);
						}
					}
				}
			}
	    }
	}

	public static void main(String[] args) {
	}

}
