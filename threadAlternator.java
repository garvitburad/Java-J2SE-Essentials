package threadsDemo;

class even extends Thread
{
	
		public synchronized void run() 
		{	
			for(int i=0;i<3000;i=i+2)
			{
				System.out.println(Thread.currentThread().getName()+":"+i);
				
				
				
				/*try {
					Thread.currentThread().sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
				
			}
		}
	
}

class odd extends Thread
{
	
	public void run()
	{
		for(int j=1;j<3000;j=j+2)
		{
			System.out.println(Thread.currentThread().getName()+":"+j);
			
			
			
			
			/*try {
				Thread.currentThread().sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
	}
}



public class threadAlternator {

	public static void main(String[] args) 
	{
		odd o1=new odd();
		even e1=new even();
		
		o1.start();
		e1.start();
	}

}
