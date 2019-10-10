package slipp.controller;

import nextstep.mvc.tobe.core.RequestHandlers;
import nextstep.mvc.tobe.view.ModelAndView;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import slipp.ManualLegacyHandlerMapping;

class ListUserControllerTest {
    private RequestHandlers mappings;

    @BeforeEach
    void setUp() {
        mappings = new RequestHandlers(new ManualLegacyHandlerMapping(), "slipp.controller");
        mappings.initialize();
    }

    @Test
    @DisplayName("레거시 컨트롤러를 바꾸었을때 정상 동작 - 리다이렉트인 경우")
    void listUserController() throws Exception {
        MockHttpServletRequest request = new MockHttpServletRequest("GET", "/users");
        MockHttpServletResponse response = new MockHttpServletResponse();

        ModelAndView modelAndView = mappings.handle(request, response);


    }
}