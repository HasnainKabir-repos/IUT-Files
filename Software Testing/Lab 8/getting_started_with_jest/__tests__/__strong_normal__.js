const calculateCommission = require('../function.js');
describe('strong normal tests', ()=>{
    it('TC01', ()=>{
        
        expect(calculateCommission(65, 70, 80)).toBe(1265);
    });
    it('TC02', ()=>{
        
        expect(calculateCommission(10, 70, 85)).toBe(795);
    });
    it('TC03', ()=>{
        
        expect(calculateCommission(60, 70, 80)).toBe(1220);
    });
    
})