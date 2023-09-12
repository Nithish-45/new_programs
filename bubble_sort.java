public class bubblesort {
	void sort(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if (a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("after sorting the array will be the answer ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
	}
	public static void main(String[] args) {
		bubblesort b=new bubblesort();
		int a[]= {5,6,8,2,3,1,4,4,3};
		b.sort(a);

	}
}