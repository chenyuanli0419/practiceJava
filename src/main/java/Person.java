
/*public class Person //implements Comparable<Person> {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Person p) {
        int temp = this.age - p.age;
        return temp == 0 ? this.name.compareTo(p.name) : temp;
    }

    public int hashCode() {
        int prime = true;
        int result = 1;
        int result = 31 * result + this.age;
        result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            Person other = (Person)obj;
            if (this.age != other.age) {
                return false;
            } else {
                if (this.name == null) {
                    if (other.name != null) {
                        return false;
                    }
                } else if (!this.name.equals(other.name)) {
                    return false;
                }

                return true;
            }
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Person:" + this.getName() + ":" + this.getAge();
    }
}
*/