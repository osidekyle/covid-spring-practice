package com.kyle.hawkins.coronavirustracker.services;

@Service
public class CoronavirusDataService{
    private static String VIRUS_DATA_URL = "https://github.com/CSSEGISandData/COVID-19/blob/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv";

    @PostConstruct
    public void fetchVirusData() throws IOException, InterruptedException{
        HttpClient client = HttpClient.newHttpClient();
        HttpRequests request = HttpRequest.newBuilder()
                .uri(URI.create(VIRUS_DATA_URL))
                .build();
        HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandler.ofString());
        System.out.println(httpResponse.body());
    }
}