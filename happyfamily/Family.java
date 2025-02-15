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
    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother.gettingName() + " " + mother.gettingSurname() +
                ", father=" + father.gettingName() + " " + father.gettingSurname() +
                ", children=" + Arrays.toString(children) +
                ", pet=" + (pet != null ? pet.toString() : "No pet") + '}';
    }
}