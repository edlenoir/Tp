
public class AgencePresseWithImage extends AgencePresse {
		private String imageLocation;

		    public AgencePresseWithImage() {
		        super();
		    }
		    @Override
		    public String getLatestNews(){
		        return this.getNouvelles().getLast()+" "+this.imageLocation;
		    }

		    public void addNews(String news, String nomImage){
		        if (this.getNouvelles().size() == 100)
		            this.getNouvelles().removeFirst();
		        this.getNouvelles().addLast(news);
		        this.imageLocation = nomImage;
		        this.notifyObservers();
		    }

		}

