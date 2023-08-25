
public class StubServerMain {

    public static Stubs stubs = new Stubs();

    public static void main(String[] args) {
        stubs.setUp()
            .stubForCreateCart("CreateCartSuccessResponse.json")
            .stubForCreateCartError("CreateCartErrorResponse.json")
            .stubForGetCartSingle("CreateCartSuccessResponse.json")
            .stubForGetCartDouble("GetCartDoubleResponse.json")
            .stubForAddProduct("AddProductRequest.json","AddProductResponse.json")
            .stubForPutProduct("PutProductRequest.json","PutProductResponse.json")
            .stubForDeleteProduct()
            .stubForDeleteCart()
                .stubFor503ServiceUnavailable()
                .stubFor500InternalServerError()
                .stubForFaultError()
            .status();
    }
}