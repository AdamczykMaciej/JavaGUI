package zad2;

public class StringTask implements Runnable {
	private String str = "";
	private int number = 0;
	private volatile String result = "";
	public Thread thread;
	private  volatile TaskState taskstate;

	public StringTask(String str, int number) {
		this.str = str;
		this.number = number;
		this.taskstate = TaskState.CREATED;
		this.thread = new Thread(this);
	}

	public String getResult() {
		return this.result;
	}

	public TaskState getState() {
		return this.taskstate;
	}

	public void start() {
		this.thread.start();
	}

	public void abort() {
		
		this.taskstate = TaskState.ABORTED;

	}

	public boolean isDone() {
		if (this.getState() == (TaskState.READY) || this.getState() == (TaskState.ABORTED))
			return true;
		return false;

	}

	@Override
	public void run() {
		this.taskstate = TaskState.RUNNING;
		for(int i = 0; i < number; i++){
			result += str;
			if(Thread.currentThread().isInterrupted())
				this.taskstate = TaskState.ABORTED;
			if(this.getState() == TaskState.ABORTED) return;
		}
		this.taskstate = TaskState.READY;
	}
}
