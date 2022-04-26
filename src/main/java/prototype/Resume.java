package prototype;

import lombok.Getter;
import lombok.Setter;

/**
 * Prototype.
 */
@Getter
@Setter
public class Resume {

    private String name;

    private int age;

    private Experience experience;

    public Resume clone() {
        Resume copyResume = new Resume();
        copyResume.name = this.name;
        copyResume.age = this.age;
        Experience copyExperience = new Experience();
        copyExperience.setStartTime(this.experience.getStartTime());
        copyExperience.setEndTime(this.experience.getEndTime());
        copyExperience.setFirm(this.experience.getFirm());
        copyExperience.setTitle(this.experience.getTitle());
        return copyResume;
    }
}
