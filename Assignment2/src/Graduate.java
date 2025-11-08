public class Graduate extends Student implements Research {

            private String type;

            public Graduate(String name, String id, String type) {
                super(name, id);
                this.type = type;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
            
            public String getCourses() {
            	return courses.toString();
            }

            @Override
            public void research(String researchSubject) {
                System.out.println(getName() + " is doing research on " + researchSubject);
            }

            @Override
            public String toString() {
                return super.toString() + ", Graduate Type: " + type;
            }

}