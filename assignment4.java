package ass1;
import java.util.*;
class Quotes{
	String[] morning={ 
			//	"Good Morning...",
				"Success is going from failure to failure without losing your enthusiasm. - Winston Churchill",
				"If you can dream it, you can achieve it. - Zig Ziglar",
				"The only way to do great work is to love what you do. - Steve Jobs",
				"Talk is cheap. Show me the code. - Linus Torvalds",
				"When everything seems to be going against you, remember that the airplane takes off against the wind, not with it. – Henry Ford",
				"Life is what we make it, always has been, always will be. - Grandma Moses",
				"I would rather die of passion than of boredom. - Vincent van Gogh",
				"I didn’t fail the test. I just found 100 ways to do it wrong. - Benjamin Franklin",
				"Limitations live only in our minds. But if we use our imaginations, our possibilities become limitless. - Jamie Paolinetti"
			};

String[] noon={
			//"Good Afternoon...",
			"It’s just pathetic to give up on something before you even give it a shot. - Reiko Mikami",
			"If nobody cares to accept you and wants you in this world, accept yourself and you will see that you don’t need them and their selfish ideas. – Alibaba Saluja",
			"Life is not a game of luck. If you wanna win, work hard. - Sora",
			"If you just submit yourself to fate, then that’s the end of it. - Keiichi Maebara",
			"Whatever you do, enjoy it to the fullest. That is the secret of life. - Rider",
			"ometimes I do feel like I’m a failure. Like there’s no hope for me. But even so, I’m not gonna give up. Ever! - Izuku Midoriya",
			"Power comes in response to a need, not a desire. You have to create that need. - Goku",
			"If you don’t like your destiny, don’t accept it. Instead, have the courage to change it the way you want it to be. - Naruto Uzumaki",
			"We can’t waste time worrying about the what if’s. - Ichigo Kurosaki"
		};
String[] evening={
			"No matter how hard or impossible it is, never lose sight of your goal. – Monkey D Luffy",
			"Do exactly as you like. That is the true meaning of pleasure. Pleasure leads to joy and joy leads to happiness. – Gilgamesh",
			"If you can’t do something, then don’t. Focus on what you can do. – Shiroe",
			"The moment you think of giving up, think of the reason why you held on so long. – Natsu Dragneel",
			"If you wanna make people dream, you’ve gotta start by believing in that dream yourself! – Seiya Kanie",
			"People with talent often have the wrong impression that things will go as they think. - Karma Akabane",
			"Everything has beauty, but not everyone can see. – Confucius",
			"The best revenge is massive success. – Frank Sinatra",
			"Always be a first-rate version of yourself, instead of a second-rate version of somebody else. – Judy Garland"
		};

String[] night={
			//"Good night...",
			"The darker the night, the brighter the stars, The deeper the grief, the closer is God! - Fyodor Dostoevsky",
			"Each night, when I go to sleep, I die. And the next morning, when I wake up, I am reborn. - Mahatma Gandhi",
			"Melancholy were the sounds on a winter's night. - Virginia Woolf",
			"Object-oriented programming offers a sustainable way to write spaghetti code. It lets you accrete programs as a series of patches. - Paul Graham,",
			"Take positive care of your mind, and it would surely take positive care of your life. - Edmond Mbiaka",
			"Everyday life is like programming, I guess. If you love something you can put beauty into it.  - Donald Knuth",
			"User interface is the process of shifting from chaotic complexity to elegant simplicity. - Akshat Paul",
			"An obstacle is often a stepping stone. - William Prescott",
			"Make each day your masterpiece. - John Wooden"
		};
}
public class java2 {
	
	public static void main(String []args)
	{
		int i=0;
		Random rand=new Random();
		Quotes q[]=new Quotes[5];
		while(true)
		{
			Scanner p=new Scanner(System.in);
			System.out.println("Enter 1 for morning quotes 2 for noon 3 for evening 4 for night");
			int n=p.nextInt();
			switch(n)
			{
			case 1:
				q[i]=new Quotes();
				 rand=new Random();
			
				System.out.println(q[i].morning[rand.nextInt(9)]);
				break;
			case 2:
				q[i]=new Quotes();
				 rand=new Random();
			
				System.out.println(q[i].noon[rand.nextInt(9)]);
				break;
			case 3:
				q[i]=new Quotes();
				 rand=new Random();
			
				System.out.println(q[i].evening[rand.nextInt(9)]);
				break;
			case 4:
				q[i]=new Quotes();
				 rand=new Random();
			
				System.out.println(q[i].night[rand.nextInt(9)]);
				break;
			}
		}
	}
}
