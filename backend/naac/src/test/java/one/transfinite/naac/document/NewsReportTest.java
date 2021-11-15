package one.transfinite.naac.document;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NewsReportTest {
    @Test
    void testConstructor() {
        NewsReport actualNewsReport = new NewsReport();
        actualNewsReport.setId(123L);
        actualNewsReport.setNews("News");
        assertEquals(123L, actualNewsReport.getId().longValue());
        assertEquals("News", actualNewsReport.getNews());
        assertEquals("NewsReport(id=123, news=News)", actualNewsReport.toString());
    }

    @Test
    void testConstructor2() {
        NewsReport actualNewsReport = new NewsReport(123L, "News");
        actualNewsReport.setId(123L);
        actualNewsReport.setNews("News");
        assertEquals(123L, actualNewsReport.getId().longValue());
        assertEquals("News", actualNewsReport.getNews());
        assertEquals("NewsReport(id=123, news=News)", actualNewsReport.toString());
    }
}

