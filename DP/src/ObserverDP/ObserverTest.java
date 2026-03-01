package ObserverDP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//it is behavioural Design pattern.
//In this when subject changes the state all its dependent objects notified the changes
//one to many relation.
public class ObserverTest {
    public static void main(String[] args) {

        YoutubeChannel channel = new YoutubeChannel();
        Subscriber aman = new Subscriber("Aman");
        Subscriber raman = new Subscriber("Raman");
        channel.Subscribe(aman);
        channel.Subscribe(raman);
        channel.newVideoUploaded("learn Design pattern ");
        channel.newVideoUploaded("New Angular Course ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                System.out.println("Press 1 to upload video ");
                System.out.println("Press 2 to create new subscriber ");
                System.out.println("Press 3 to exit ");
                int c = Integer.parseInt(br.readLine());
            if (c==1){
                //upload new video
                System.out.println("Enter video title");
                String videoTitle = br.readLine();
                channel.newVideoUploaded(videoTitle);
            } else if (c==2) {
                //create new subscribe
                System.out.println("Enter name of subscriber: ");
                String subName = br.readLine();
                Subscriber subscriber3 = new Subscriber(subName);
                channel.Subscribe(subscriber3);
            } else if (c==3) {
                //exit
                System.out.println("thank you for using app ");
                break;
            } else {
                //exit due to wrong input
                System.out.println("wrong input ");
            }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
