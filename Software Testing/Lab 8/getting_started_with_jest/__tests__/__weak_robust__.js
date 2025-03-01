const calculateCommission = require('../function.js');
describe('weak robust tests', ()=>{
    it('TC01', ()=>{
        
        expect(calculateCommission(65, 0, 75)).toBe("Invalid input");
    });
    it('is TC02', ()=>{
        
        expect(calculateCommission(0, 65, 75)).toBe("Invalid input");
    });
    it('is TC03', ()=>{
        
        expect(calculateCommission(65, 75, 0)).toBe("Invalid input");
    });
    it('is TC04', ()=>{
        
        expect(calculateCommission(65, 60, 95)).toBe("Invalid input");
    });
    it('is TC05', ()=>{
        
        expect(calculateCommission(65, 85, 85)).toBe("Invalid input");
    });
    it('is TC06', ()=>{
        
        expect(calculateCommission(100, 75, 85)).toBe("Invalid input");
    });
    it('is TC07', ()=>{
        
        expect(calculateCommission(10, 10, 10)).toBe(100);
    });
    
})