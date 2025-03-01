function calculateCommission (Lock, Stock, Barrel){
    if(Lock <= 70 && Lock >=1 && Stock <= 80 && Stock >=1 && Barrel <= 90 && Barrel >=1){
        let total = (Lock * 45) + (Stock * 30) + (Barrel * 25);
        let commission = 0;
        
        if (total <= 1000) {
            commission = total * 0.1;
        } else if (total <= 1800) {
            commission = 1000 * 0.1 + (total - 1000) * 0.15;
        } else {
            commission = 1000 * 0.1 + 800 * 0.15 + (total - 1800) * 0.2;
        }

        return commission
    }else {
        return "Invalid input";
    }
}

module.exports = calculateCommission;