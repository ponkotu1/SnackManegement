package dto;

public class Snack{
	private int id;
	private String name;
	private String syousai;
	private String nedan;
	public Snack(int id, String name, String syousai, String nedan) {
		super();
		this.id = id;
		this.name = name;
		this.syousai = syousai;
		this.nedan = nedan;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSyousai() {
		return syousai;
	}
	public void setSyousai(String syousai) {
		this.syousai = syousai;
	}
	public String getNedan() {
		return nedan;
	}
	public void setNedan(String nedan) {
		this.nedan = nedan;
	}
	
}