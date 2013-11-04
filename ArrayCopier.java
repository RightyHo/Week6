public class ArrayCopier {
	public int[] copy(int[] src,int[] dst){
		if(dst.length <= src.length){
			for(int i=0;i<dst.length;i++){
				dst[i] = src[i];
			}
		} else {
			for(int i=0;i<dst.length;i++){
				dst[i] = 0;
			}
		}
		return dst;
	}
}