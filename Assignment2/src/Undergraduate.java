public class Undergraduate extends Student {

private boolean honour;

    public Undergraduate(String name, String id, boolean honour) {
                super(name, id);
                this.honour = honour;
            }

            public boolean isHonour() {
                return honour;
            }

            public void setHonour(boolean honour) {
                this.honour = honour;
            }

            public String getCourses() {
            	return courses.toString();
            }
            
            @Override
            public String toString() {
                return super.toString() + ", Honour Student: " + honour;
            }


    }