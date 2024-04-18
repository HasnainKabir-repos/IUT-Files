const calculateCommission = require('../function.js');
describe('strong robust tests', ()=>{
    it('TC01', ()=>{
        
        expect(calculateCommission(65, 75, 85)).toBe(1320);
    });
    it('is TC02', ()=>{
        
        expect(calculateCommission(65, 100, 75)).toBe("Invalid input");
    });
    it('is TC03', ()=>{
        
        expect(calculateCommission(0, 0, 75)).toBe("Invalid input");
    });
    it('is TC04', ()=>{
        
        expect(calculateCommission(65, 75, 95)).toBe("Invalid input");
    });
    it('is TC05', ()=>{
        
        expect(calculateCommission(65, 0, 0)).toBe("Invalid input");
    });
    it('is TC06', ()=>{
        
        expect(calculateCommission(0, 65, 0)).toBe("Invalid input");
    });
    it('is TC07', ()=>{
        
        expect(calculateCommission(750, 850, 950)).toBe("Invalid input");
    });
    
})