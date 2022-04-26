package prototype;

public class Replica {

    public void copyResume(Resume resume) {
        Resume copy = resume.clone();
        System.out.println(resume);
        System.out.println(copy);
    }
}
