import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children = new Human[0];
    private Pet pet;

    static {
        System.out.println("Family class loaded.");
    }
    {
        System.out.println("A new Family object is created.");
    }
    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        mother.SettingFamily(this);
        father.SettingFamily(this);
    }
    public Human GettingMother() {
        return mother;
    }
    public void SettingMother(Human mother) {
        this.mother = mother;
    }
    public Human GettingFather() {
        return father;
    }
    public void SettingFather(Human father) {
        this.father = father;
    }
    public Human[] GettingChildren() {
        return children;
    }
    public void SettingChildren(Human[] children) {
        this.children = children;
    }
    public Pet GettingPet() {
        return pet;
    }
    public void SettingPet(Pet pet) {
        this.pet = pet;
    }
    public void AddingChild(Human child) {
        Human[] newChildren = Arrays.copyOf(children, children.length + 1);
        newChildren[children.length] = child;child.SettingFamily(this);children = newChildren;
    }
    public boolean deleteChild(int index) {
        if (index < 0 || index >= children.length) return false;
        Human[] newChildren = new Human[children.length - 1];
        for (int i = 0, j = 0; i < children.length; i++) {
            if (i != index) {
                newChildren[j++] = children[i];
            }
        }
        children = newChildren;
        return true;
    }

    public int countFamily() {
        return 2 + children.length; // Parents + Children
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Family family = (Family) object;
        return mother.equals(family.mother) && father.equals(family.father);
    }
    @Override
    public int hashCode() {
        return Objects.hash(mother, father);
    }
    public boolean deleteChild(Human delChild) {
        boolean deleted = false;
        Human[] children1 = new Human[0];
        for(Human child : children) {
            if(child.equals(delChild)) {
                deleted = true;
                continue;
            }
            children1 = Arrays.copyOf(children1, children1.length + 1);
            children1[children1.length - 1] = child;
        }

        children = children1;
        return deleted;
    }

    public boolean deleteChildrenWithIndex(int index) {
        boolean deleted = false;
        Human[] children1 = new Human[0];
        for (int i = 0; i < children.length; i++) {
            if (i == index) {
                deleted = true;
                continue;
            }
            children1 = Arrays.copyOf(children1, children1.length + 1);
            children1[children1.length - 1] = children[i];
        }

        children = children1;
        return deleted;
    }

    /*

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + (mother != null ? mother.toString() : "No mother") +
                ", father=" + (father != null ? father.toString() : "No father") +
                ", children=" + Arrays.toString(children) +
                ", pet=" + (pet != null ? pet.toString() : "No pet") + '}';
    }

    @SuppressWarnings("removal")
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Human object is removed.");

    }
    */

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Family Details:\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n\n");
        ///System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        sb.append("Mother: ").append((mother != null ? mother.gettingName() + " " + mother.gettingSurname()  + mother.toString() : "No mother")).append("\n");
        sb.append("Father: ").append((father != null ? father.gettingName() + " " + father.gettingSurname() + father.toString(): "No father")).append("\n");

        // Children
        sb.append("Childrens:\n");
        if (children.length > 0) {
            for (int i = 0; i < children.length; i++) {
                /*
                //sb.append(children[i].gettingName()).append(" ").append(children[i].gettingSurname());
                sb.append("Children[i]" + children[i].toString());
                if (i < children.length - 1) sb.append("");
*/              sb.append("Children").append(i + 1).append(": ");  // Add Children1, Children2, etc.
                //sb.append(children[i].gettingName()).append(" ").append(children[i].gettingSurname());
                sb.append(children[i].toString());  // Add child's full details here
                if (i < children.length - 1) ;

            }
        } else {
            sb.append("No children");
        }
        sb.append("\n");

        // Pet
        sb.append("Pet: ").append((pet != null ? pet.toString() : "No pet")).append("\n");

        return sb.toString();

    }

    @SuppressWarnings("removal")
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Family object is being garbage collected.");
    }

}