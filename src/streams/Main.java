package streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int sum = Arrays.stream(arr).filter(n -> n % 2 ==0).sum();

        List<String>list = Arrays.asList("Vishnu", " Priya", "Isha","vanshika");
        String[] array ={ "Vishnu", " Priya", "Isha","vanshika"};
        Stream<String> stream=list.stream();
        Stream<String> mystream = Arrays.stream(array);
        Stream<Integer> s = Stream.of(1,2,3,5);

        //we can use distinct(), sorted().......
        List<Integer> list1= Arrays.asList(1,34,576,23,3,6,8,3,5,8,89);
        List<Integer> Filteredlist= list1.stream()
                .filter(n -> n % 2==0)
                .map(n->n/2)
                .distinct()
                .sorted((a,b)-> (b-a))
                .limit(2)
                .skip(1)
                .collect(Collectors.toList());
        System.out.println(Filteredlist);
        List<Integer> Maplist = list1.stream().map(n->n/2).collect(Collectors.toList());
        System.out.println(Maplist);

        List<Integer> collect = Stream.iterate(0,x->x+1)
                .limit(100)
                .skip(1)
                .filter(n->n%2==0)
                .map(x->x/10)
                .peek(x-> System.out.println(x))
                .collect(Collectors.toList());

        //System.out.println(collect);

        Long integer = Stream.iterate(0,x->x+1)
                .limit(100)
               // .peek(x -> System.out.println(x))
                .map(x->x/20)
                .distinct()
                .count();
        System.out.println(integer);


    }

}
