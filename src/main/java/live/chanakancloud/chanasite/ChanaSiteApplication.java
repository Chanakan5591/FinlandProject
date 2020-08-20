package live.chanakancloud.chanasite;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.omg.CORBA.NameValuePair;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.net.www.http.HttpClient;

@SpringBootApplication
@Controller
public class ChanaSiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChanaSiteApplication.class, args);
    }

    @RequestMapping("/")
    public String MainPage() {
        return "welcome";
    }
    @RequestMapping("/finland-biome")
    public String BiomePage() {
        return "biome";
    }
    @RequestMapping("/taiga-and-tundra")
    public String TAT() {
        return "taiga-and-tundra";
    }
    @RequestMapping("/about-us")
    public String AboutUs() {
        return "about-us";
    }
}
