
public class Person {
	 private int id;
	    private String name;

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
	    
	    @Override
	    public boolean equals(Object obj) {

	            if (obj == null) {
	                return false;
	            }

	            if (this.getClass() != obj.getClass()) {
	                return false;
	            }

	            if (this == obj) {
	                return true;
	            }

	            Person that = (Person) obj;

	            if (this.name == null && that.name != null) {
	                return false;
	            }

	            if (this.id == that.id && this.name.equals(that.name)) {
	                return true;
	            }

	            return false;
	        }
}
