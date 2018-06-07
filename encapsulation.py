class Container:
    def getLiquid(self):
        return self.liquid 
    
    def setLiquid(self,liq):
        self.liquid = liq
    
    def __init__(self):
        self.liquid = None
    

c = Container()
m = Container()

c.setLiquid("Water")
m.setLiquid("Milk")

liqd = c.getLiquid()
print(liqd)
print(m.getLiquid())



