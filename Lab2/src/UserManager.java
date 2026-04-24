public class UserManager {
   private List<Subscriber> subscribers = new ArrayList<>();

   public addSubscriber(Subscriber subscriber) {
	   subscribers.add(subscriber);
   }

   public removeSubscriber(Subscriber subscriber) {
	   subscribers.remove(subscriber);
   }

   public Subscriber findSubscriberById(String id) {
	   for (Subscriber s : subscribers) {
		   if (s.getId().equals(id)) {
			   return s;
		   }
	   }
	   return null;
   }
}
