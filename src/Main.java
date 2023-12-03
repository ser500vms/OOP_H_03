import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        StudentGroup studentGroup1 = new StudentGroup(1);
        StudentGroup studentGroup2 = new StudentGroup(2);
        StudentGroup studentGroup3 = new StudentGroup(3);

        Stream stream1 = new Stream(1);
        Stream stream2 = new Stream(2);

        stream1.addStudentGroup(studentGroup1);
        stream1.addStudentGroup(studentGroup2);
        stream2.addStudentGroup(studentGroup3);

        for (StudentGroup studentGroup : stream1) {
            System.out.println(studentGroup);
        }

        System.out.println();

        StreamComparator streamComparator = new StreamComparator();
        streamComparator.addStream(stream1);
        streamComparator.addStream(stream2);

        for (Stream stream : streamComparator) {
            System.out.println(stream);
        }

        System.out.println();

        StreamService service = new StreamService(streamComparator);

        List<Stream> sortStream = service.getSort();

        for (Stream stream : sortStream) {
            System.out.println(stream);
        }

    }

}

