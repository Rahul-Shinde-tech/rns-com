class Empo {
	private String eAdd;
	private String eName;
	private int eId;
	
	public String geteAdd() {
		return eAdd;
	}
	public void seteAdd(String eAdd) {
		this.eAdd = eAdd;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	@Override
	public String toString() {
		return "Empo [eAdd=" + eAdd + ", eName=" + eName + ", eId=" + eId + "]";
	}
	public Empo(String eAdd, String eName, int eId) {
		super();
		this.eAdd = eAdd;
		this.eName = eName;
		this.eId = eId;
	}
	
		
}
