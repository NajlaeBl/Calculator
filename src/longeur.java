

	public class longeur {


		public longeur() {
			
		}
		public int longuerliste( double[] l) {
			int i=0;
			int position=0;
			
			while (i<l.length) {
				if (l[i]==0 && l[i+1]==0 && l[i+2]==0) {
					break;
				}
				i++;
			}
			return i;
			
			
		}
		public int loguerlistespeciale(double[]l) {
			int i=0;
			while(i<l.length) {
				if(l[i]==108) {
					break;
				}
				i++;
				
			}
			return i;
		}
		


	}

