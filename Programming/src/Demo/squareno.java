package Demo;

	import java.util.ArrayList;

class squareno {
		public static int squrNo(int num)
		{
			int squ=num*num;
			return squ;
		}

		public static void main(String[] args) {
			ArrayList<Integer> al=new ArrayList<>();
			al.add(5);
			al.add(56);
			al.add(12);
			al.add(18);
			al.add(4);
			for(int i=0;i<al.size();i++)
			{
			
			int x=squrNo(al.get(i));
			System.out.println(x);
			}

		}

	}


