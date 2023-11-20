package io.datajek.spring.basics.movierecommendersystem.lesson2;

public class RecommenderImplementation {

    //use filter interface to select filter
    private Filter filter;

    public RecommenderImplementation(){
        super();
        this.filter=filter;
    }


    public String [] recommendMovies (String movie){

        //print  the name of interface implementation being used
        System.out.println("name of the filter in use :" + filter +"\n");

        String[] results = filter.getRecommendations("Finding Dory");

        return  results;
    }
}
