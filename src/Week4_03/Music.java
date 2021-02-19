package Week4_03;

public class Music {
	String name,artist;
	int duration;
	public Music(String name,String artist,int duration) {
		this.name=name;
		this.artist=artist;
		this.duration=duration;
	}public String toString() {
		return name+" "+artist;
	}
}
