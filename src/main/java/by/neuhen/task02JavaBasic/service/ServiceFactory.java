package by.neuhen.task02JavaBasic.service;

public class ServiceFactory {

    private static final ServiceFactory instance = new ServiceFactory();

    private final ArrayService arrayService = new ArrayServiceImpl();
    private final LibraryService libraryService = new LibraryServiceImpl();

    public static ServiceFactory getInstance(){
        return instance;
    }

    public ArrayService getArrayService(){
        return arrayService;
    }

    public LibraryService getLibraryService(){
        return libraryService;
    }

}
