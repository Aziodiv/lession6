package data;

//AGRIGACIJA
public class JSCompany {
    private Worker[] workers;

    public JSCompany(Worker[] workers) {
        this.workers = workers;
    }

    public Worker[] getWorkers() {
        return workers;
    }

    public Worker getYoungestWorker() {
        Worker youngest = workers[0];
        int index = 1;
        while (index < workers.length) {
            if (workers[index].getAge() < youngest.getAge()) {
                youngest = workers[index];
            }
            index++;
        }
        return youngest;
    }

    public void salaryRecalculate() {
        int i = 0;
        do {
            workers[i].salaryReview();
            i++;
        } while (i < workers.length);
    }

    public void companyReport() {
        for (int i = 0; i < workers.length; i++) {
            Worker worker = workers[i];
            ///+professija
            String format = String.format("Name %s, Lastname %s, Salary %d Age %d Position ",
                    workers[i].getFirstName(), worker.getLastName(), worker.getSalary(), worker.getAge());
            System.out.println(format);

        }
        System.out.println();
    }

    /////////////MAKSIMALNAJA POLUCKA
    public Worker maxSalary() {
        Worker biggestSalary = workers[0];
        int index = 1;
        while (index < workers.length) {
            if (workers[index].getSalary() > biggestSalary.getSalary()) {
                biggestSalary = workers[index];
            }
            index++;
        }
        return biggestSalary;
    }

    /////////////MINIMALNAJA POLUCKA
    public Worker minSalary() {
        Worker minimumSalary = workers[0];
        int index = 1;
        while (index < workers.length) {
            if (workers[index].getSalary() < minimumSalary.getSalary()) {
                minimumSalary = workers[index];
            }
            index++;
        }
        return minimumSalary;
    }

// STARII RABOTNIK
    public Worker getOldesttWorker() {
        Worker oldest = workers[0];
        int index = 1;
        while (index < workers.length) {
            if (workers[index].getAge() > oldest.getAge()) {
                oldest = workers[index];
            }
            index++;
        }
        return oldest;
    }


}