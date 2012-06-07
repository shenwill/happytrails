package happytrails

import grails.test.mixin.*

@TestFor(HomeController)
@Mock(Region)
class HomeControllerTests {

    void testIndex() {
        def model = controller.index()

        assert model.regions.size() == 0
        assert model.total == 0
    }
}
