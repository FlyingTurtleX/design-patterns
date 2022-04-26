package prototype;

import org.junit.jupiter.api.Test;

class ReplicaTest {

    Replica replica = new Replica();

    @Test
    void copyResume() {
        replica.copyResume(initResume());
    }

    private Resume initResume() {
        Resume resume = new Resume();
        resume.setName("Anna");
        resume.setAge(24);

        Experience experience = new Experience();
        experience.setStartTime(202002);
        experience.setEndTime("till now");
        experience.setFirm("Universal Bang");
        experience.setTitle("engineer");
        resume.setExperience(experience);
        return resume;
    }
}