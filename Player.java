
public class Player {
	private String name;
	private int height;
	private int weight;
	private double fourty;
	private int draftCap;
	private int yards;
	private int TDs;
	private double speedScore;
	private double grade;
	
	public Player(String name, int height, int weight, double fourty, int draftCap, int yards, int TDs) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.fourty = fourty;
		this.draftCap = draftCap;
		this.yards = yards;
		this.TDs = TDs;
		this.speedScore = getSpeedScore(weight, fourty);
		this.grade = getGrade();
	}
	
	public String getName() {
		return name;
	}
	public int getHeight() {
		return height;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public double getFourty() {
		return fourty;
	}
	
	public int getDraftCap() {
		return draftCap;
	}
	
	public int getYards() {
		return yards;
	}
	
	public int getTDs() {
		return TDs;
	}
	
	public double getSpeedScore (int weight, double fourty) {
		double speedScore = (double) (weight*200)/(fourty*fourty*fourty*fourty);
	
		return speedScore;
	}
	
	public double getGrade() {
		double grade = 0;
		if(weight>=220) {
			grade += grade +.1;
		}
		if(fourty<4.6) {
			grade += .3;
		}
		grade += (speedScore/100);
		if((weight/(height*height))*703>=30) {
			grade +=.25;
		}
		grade += (double)(1/draftCap)*80;
		
		if(TDs>=10) {
			grade += .2;
		}
		if(yards >= 1000) {
			grade += .2;
		}
		return grade;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "\nHeight: " + height + ", Weight: " + weight + "\nYards: " + yards + ", TDs: " + TDs + "\n40 Time: " + fourty + "\nProspect Grade: " + grade;
	}
}

