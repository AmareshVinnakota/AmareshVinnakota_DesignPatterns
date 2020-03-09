
public class BuilderFactory {

	public String weight;
	public int screen_size;
	public int  cam_front,cam_back;
	public String os;
	int battery;
	int storage;
	int processor;
		public BuilderFactory setWeight(String weight) {
		this.weight = weight;
		return(this);
	}
	public BuilderFactory setScreen_size(int screen_size) {
		this.screen_size = screen_size;
		return(this);
	}
	public BuilderFactory setCam_front(int cam_front) {
		this.cam_front = cam_front;
		return(this);
	}
	public BuilderFactory setCam_back(int cam_back) {
		this.cam_back = cam_back;
		return(this);
	}
	public BuilderFactory setOs(String os) {
		this.os = os;
		return(this);
	}
	public BuilderFactory setBattery(int battery) {
		this.battery = battery;
		return(this);
	}
	
	public BuilderFactory setStorage(int storage) {
		this.storage = storage;
		return(this);
	}
		public BuilderFactory setProcessor(int processor) {
		this.processor = processor;
		return(this);
	}
		public Feautures getall()
		{
			return  new Feautures(weight, screen_size,cam_front,cam_back,os,battery,storage,processor);
			
		}
}
