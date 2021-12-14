public class PC {
    private Monitor monitor;
    private Case caseDetails;

    public PC(Monitor monitor,Case caseDetails){
        this.monitor=monitor;
        this.caseDetails=caseDetails;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Case getCaseDetails() {
        return caseDetails;
    }

    public void powerUp(){
        getCaseDetails().loadProgram("Startup");
        drawLogo();
    }

    private void drawLogo(){
        monitor.drawPixel(12,87,"Blue");
    }
}
