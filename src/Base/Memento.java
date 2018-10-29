package Base;

public class Memento {
	private String state;
	public Memento(String newstate) {this.state = newstate;}
	public String getstate() {return state;}
	public void setstate(String newstate) {this.state = newstate;}
}
