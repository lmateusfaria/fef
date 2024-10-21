import os
def fix_double_java_extension(root_directory):
    # Percorre todos os diretórios e subdiretórios
    for directory, subdirs, files in os.walk(root_directory):
        for filename in files:
            # Verifica se o arquivo tem extensão .java.java
            if filename.endswith(".java.java"):
                incorrect_file_path = os.path.join(directory, filename)
                
                # Define o novo nome corrigindo a extensão para apenas .java
                corrected_file_path = os.path.join(directory, filename[:-5])
                
                # Renomeia o arquivo para corrigir a extensão
                os.rename(incorrect_file_path, corrected_file_path)
                print(f"Corrigido: {incorrect_file_path} para {corrected_file_path}")

if __name__ == "__main__":
    # Caminho da pasta onde estão os arquivos .txt
    pasta_dos_arquivos = r'./'
    fix_double_java_extension(pasta_dos_arquivos)
