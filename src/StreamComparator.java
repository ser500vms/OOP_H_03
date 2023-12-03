import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StreamComparator implements Iterable<Stream> {
    private List<Stream> streamList;
    private int counter;

    public StreamComparator() {
        this.streamList = new ArrayList<>();
    }

    public List<Stream> getStreamList() {
        return streamList;
    }

    public void addStream(Stream stream) {
        streamList.add(stream);
    }

    @Override
    public String toString() {
        return "Main stream:" + '\n' +
                "streamList=" + streamList;
    }

    @Override
    public Iterator<Stream> iterator() {
        return new Iterator<Stream>() {
            @Override
            public boolean hasNext() {
                return counter < streamList.size();
            }

            @Override
            public Stream next() {
                if (hasNext()) {
                    return streamList.get(counter++);
                }
                return null;
            }
        };
    }
}
