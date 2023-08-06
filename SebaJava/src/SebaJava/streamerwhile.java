package SebaJava;

public class streamerwhile {

	public static void main(String args[]) throws InterruptedException {
		int seguidores = 0;

		while (seguidores <= 100) {
			System.out.println(seguidores);
			if (seguidores == 80) {
				System.out.println("\nEstás llegando!");
				Thread.sleep(1000);
			}
			seguidores++;
			Thread.sleep(20);

		}
		System.out.println("Felicidades!");
	}
}
