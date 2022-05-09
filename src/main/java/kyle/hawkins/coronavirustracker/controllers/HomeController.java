package kyle.hawkins.coronavirustracker.controllers;

import kyle.hawkins.coronavirustracker.models.LocationStats;
import kyle.hawkins.coronavirustracker.services.CoronavirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Locale;

@Controller
public class HomeController {

    @Autowired
    CoronavirusDataService coronavirusDataService;

    @GetMapping("/")
    public String home(Model model){
        List<LocationStats> allStats = coronavirusDataService.getAllStats();
        int totalCases = allStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
        int totalNewCases = allStats.stream().mapToInt(stat -> stat.getDiffFromPrevDay()).sum();
        model.addAttribute("locationStats", allStats);
        model.addAttribute("totalReportedCases", String.format("%,d",totalCases));
        model.addAttribute("totalNewReportedCases", String.format("%,d",totalNewCases));
        return "home";
    }
}
