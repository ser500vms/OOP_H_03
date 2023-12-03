import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {
    private final StreamComparator streamComparator;
    public StreamService(StreamComparator streamComparator) {
        this.streamComparator = streamComparator;
    }
    public List<Stream> getSort(){
        List<Stream> studentList = new ArrayList<>(streamComparator.getStreamList());
        Collections.sort(studentList);
        return studentList;
    }
}
