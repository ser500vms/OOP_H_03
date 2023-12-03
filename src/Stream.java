import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>, Comparable<Stream>{
    private List<StudentGroup> studentGroupList;
    private int streamId;
    private int counter;

    private int size;

    public int getSize() {
        return studentGroupList.size();
    }

    public Stream(int streamId) {
        this.studentGroupList = new ArrayList<>();
        this.streamId = streamId;
        counter = 0;
    }

    @Override
    public String toString() {
        return "streamId = " + streamId + '\n' +
                "studentGroupList = " + studentGroupList;
    }

    public void addStudentGroup(StudentGroup studentGroup){
        studentGroupList.add(studentGroup);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            @Override
            public boolean hasNext() {
                return counter < studentGroupList.size();
            }

            @Override
            public StudentGroup next() {
                if(hasNext()){
                    return studentGroupList.get(counter++);
                }
                return null;
            }
        };
    }

    @Override
    public int compareTo(Stream that) {
        if (this.size > that.getSize()){
            return 1;
        }
        if (this.size < that.getSize()){
            return -1;
        }
            return 0;
    }
}
