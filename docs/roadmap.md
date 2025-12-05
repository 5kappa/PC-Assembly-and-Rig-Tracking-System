[ PARTS Roadmap ]

1. Get a console application to work with Kaggle CSV datasets.

    WORKFLOW

        (1) App starts -> app loads CSV datasets into Java memory
        (2) App shows already made builds, if any. Also gives user the option to update already existing builds. If not, then (2.5)
            (2.5) Create build

        (3) App shows menu:

            CPU: None
            RAM: None
            SSD: None
            HDD: None
            Motherboard: None
            PSU: None
            GPU: None
            CPU Cooler: None
            Case: None

        [ SELECTION ]
        (4) App then asks to select CPU -> mobo -> RAM. Then, user is free to select in any order

            Initially, the program should ask whether to [1] Filter parts or [2] Browse all parts.
            It should show [id], [partname], and important specifications. Only show the full specification if the user would like to inspect the part.
            
            The dataset has thousands of parts, so the list'll be paginated.
            The user can:
                * go to next page
                * go to previous page
                * inspect a part by selecting the ID

            If user inspects, program shows 10 parts per page. User can sort by asc/desc for columns like ID, price and part specifications
            After inspecting, program should give the option to [1] go back to the page they were browsing or [2] select the part and go back to the menu.

            After selecting, program shows the menu at (3). Program also gives the option to remove and replace each part.
            Every time selection is finished, (5).

            Note to self: each build can have multiple:
                * RAM
                * SSD
                * HDD

        [ COMPATIBILITY CHECKS ]
        (5) App checks for compatibility:

            cpu.socket -> motherboard.socket

            ram.ram_type -> motherboard.ram_type
            ram.modules -> motherboard.ram_slot_count

            motherboard.sata_ports <= hdd.count + ssd.count
                hdd.count (if any) -> motherboard.sata_ports
                ssd.count, ssd.interface (if SATA) -> motherboard.sata_ports        [‼️ Kaggle datasets don't have [interface] listed. Webscraping is needed for this ‼️]
                ssd.count, ssd.interface (if NVMe) -> motherboard.m2_ports

            psu.output_wattage >= safe_wattage
                total_draw = cpu.wattage + gpu.wattage + 75W
                safe_wattage = total_draw * 1.2

            gpu.length_mm -> case.max_gpu_length_mm

            cpu_cooler.height_mm -> case.supported_cooler_height
            cpu_cooler.supported_sockets -> motherboard.socket

            case.supported_form_factors -> motherboard.form_factor

        (6) App calculates total price
        (7) User saves build.
            (7.1) If compatible: ask for user to name the build
            (7.2) If incompatible: prevent save, show error

2. [Maybe] Implement SQL after a working console prototype is done, if time allows.
3. [Maybe] Learn how to use APIs. Prices are volatile. Just using one set of datasets will not suffice because prices change.
4. Turn PARTS into a web app.