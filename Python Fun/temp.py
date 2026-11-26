def temperature_looker(temperature, measurement):
    measurement = measurement.lower()

    if "f" in measurement:
        celsius = (temperature - 32) * 5 / 9
        return f"{temperature}°F is {celsius:.1f}°C"
    elif "c" in measurement:
        fahrenheit = (temperature * 9 / 5) + 32
        return f"{temperature}°C is {fahrenheit:.1f}°F"
    else:
        return "Please use 'f' for Fahrenheit or 'c' for Celsius."


print(temperature_looker(98.6, "f"))
print(temperature_looker(100, "c"))