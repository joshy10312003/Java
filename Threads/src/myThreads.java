class myThreads implements Runnable  {
	
	int s = 0;
	
	myThreads(){
		System.out.println("Threads is running");
	}
	
	public void run() {
		
		while (true) {
			try {
				s++;
				System.out.println(s);
				Thread.sleep(1000);
		
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		
		myThreads threads = new myThreads();
        Thread thread = new Thread(threads);
        thread.start();
	}
}
