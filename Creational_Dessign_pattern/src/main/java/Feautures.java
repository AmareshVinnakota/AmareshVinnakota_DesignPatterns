
public class Feautures {

	public String weight;
	public int screen_size;
	public int  cam_front,cam_back;
	public String os;
	int battery;
	int storage;
	int processor;
	
	Feautures(String weight,int screen_size,int cam_front,int cam_back,String os,int battery,int storage,int processor)
	{
		this.weight=weight;
		this.screen_size=screen_size;
		this.cam_front=cam_front;
		this.os=os;
		this.battery=battery;
		this.storage=storage;
		this.processor=processor;
		
		
		
		
	}

	@Override
	public String toString() {
		return "Feautures [weight=" + weight + ", screen_size=" + screen_size + ", cam_front=" + cam_front
				+ ", cam_back=" + cam_back + ", os=" + os + ", battery=" + battery + ", storage=" + storage
				+ ", processor=" + processor + "]";
	}

	
}
